package com.mopub.common;

import android.net.Uri;
import android.os.AsyncTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@VisibleForTesting
/* loaded from: classes2.dex */
public class UrlResolutionTask extends AsyncTask<String, Void, String> {
    private static final int REDIRECT_LIMIT = 10;
    private final UrlResolutionListener mListener;

    interface UrlResolutionListener {
        void onFailure(String str, Throwable th);

        void onSuccess(String str);
    }

    public static void getResolvedUrl(String str, UrlResolutionListener urlResolutionListener) {
        try {
            AsyncTasks.safeExecuteOnExecutor(new UrlResolutionTask(urlResolutionListener), str);
        } catch (Exception e) {
            urlResolutionListener.onFailure("Failed to resolve url", e);
        }
    }

    UrlResolutionTask(UrlResolutionListener urlResolutionListener) {
        this.mListener = urlResolutionListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public String doInBackground(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i = 0;
        try {
            String str = strArr[0];
            String str2 = null;
            while (str != null && i < 10) {
                if (!UrlAction.OPEN_IN_APP_BROWSER.shouldTryHandlingUrl(Uri.parse(str)) || UrlAction.OPEN_NATIVE_BROWSER.shouldTryHandlingUrl(Uri.parse(str))) {
                    return str;
                }
                i++;
                str2 = str;
                str = getRedirectLocation(str);
            }
            return str2;
        } catch (IOException unused) {
            return null;
        } catch (NullPointerException unused2) {
            return null;
        } catch (URISyntaxException unused3) {
            return null;
        }
    }

    private String getRedirectLocation(String str) throws IOException, URISyntaxException {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                String resolveRedirectLocation = resolveRedirectLocation(str, httpURLConnection);
                if (httpURLConnection != null) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            MoPubLog.d("IOException when closing httpUrlConnection. Ignoring.");
                        }
                    }
                    httpURLConnection.disconnect();
                }
                return resolveRedirectLocation;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection != null) {
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused2) {
                            MoPubLog.d("IOException when closing httpUrlConnection. Ignoring.");
                        }
                    }
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    @VisibleForTesting
    static String resolveRedirectLocation(String str, HttpURLConnection httpURLConnection) throws IOException, URISyntaxException {
        URI uri = new URI(str);
        int responseCode = httpURLConnection.getResponseCode();
        String headerField = httpURLConnection.getHeaderField(com.aiming.mdt.utils.Constants.KEY_LOCATION);
        if (responseCode < 300 || responseCode >= 400) {
            return null;
        }
        try {
            return uri.resolve(headerField).toString();
        } catch (IllegalArgumentException unused) {
            MoPubLog.e("Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw new URISyntaxException(headerField, "Unable to parse invalid URL");
        } catch (NullPointerException e) {
            MoPubLog.e("Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        super.onPostExecute((UrlResolutionTask) str);
        if (isCancelled() || str == null) {
            onCancelled();
        } else {
            this.mListener.onSuccess(str);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        this.mListener.onFailure("Task for resolving url was cancelled", null);
    }
}
