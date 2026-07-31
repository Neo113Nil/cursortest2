package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFe1rSDK {
    private final int values;

    public AFe1rSDK(int i) {
        this.values = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1pSDK<String> values(AFe1nSDK aFe1nSDK) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception exc;
        byte[] AFInAppEventType;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AFInAppEventType = aFe1nSDK.AFInAppEventType();
            StringBuilder sb = new StringBuilder(new StringBuilder().append(aFe1nSDK.AFInAppEventParameterName).append(":").append(aFe1nSDK.valueOf).toString());
            byte[] AFInAppEventType2 = aFe1nSDK.AFInAppEventType();
            if (aFe1nSDK.AFInAppEventParameterName() && AFInAppEventType2 != null) {
                try {
                    sb.append("\n payload: ").append(aFe1nSDK.valueOf() ? "<encrypted>" : new String(AFInAppEventType2, Charset.defaultCharset()));
                } catch (Exception e) {
                    exc = e;
                    httpURLConnection = null;
                    try {
                        AFe1tSDK aFe1tSDK = new AFe1tSDK(System.currentTimeMillis() - currentTimeMillis);
                        AFLogger.INSTANCE.e(AFg1jSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(exc).append("\n took ").append(aFe1tSDK.AFInAppEventType).append("ms").toString()).toString(), exc, false, false, false);
                        throw new HttpException(exc, aFe1tSDK);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
            for (Map.Entry<String, String> entry : aFe1nSDK.values.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
            AFLogger.INSTANCE.d(AFg1jSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append((Object) sb).toString());
            httpURLConnection2 = (HttpURLConnection) new URL(aFe1nSDK.valueOf).openConnection();
        } catch (Exception e2) {
            exc = e2;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection2.setRequestMethod(aFe1nSDK.AFInAppEventParameterName);
            if (aFe1nSDK.AFKeystoreWrapper()) {
                httpURLConnection2.setUseCaches(false);
            }
            if (!aFe1nSDK.d()) {
                httpURLConnection2.setInstanceFollowRedirects(false);
            }
            int i = this.values;
            int i2 = aFe1nSDK.d;
            if (i2 != -1) {
                i = i2;
            }
            httpURLConnection2.setConnectTimeout(i);
            httpURLConnection2.setReadTimeout(i);
            httpURLConnection2.addRequestProperty("Content-Type", aFe1nSDK.valueOf() ? "application/octet-stream" : "application/json");
            for (Map.Entry<String, String> entry2 : aFe1nSDK.values.entrySet()) {
                httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (AFInAppEventType != null) {
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, new StringBuilder().append(AFInAppEventType.length).toString());
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                }
                try {
                    bufferedOutputStream2.write(AFInAppEventType);
                    bufferedOutputStream2.close();
                } catch (Throwable th5) {
                    th = th5;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            }
            boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
            String str = "";
            if (aFe1nSDK.values()) {
                str = AFKeystoreWrapper(httpURLConnection2, z);
            }
            String str2 = str;
            AFe1tSDK aFe1tSDK2 = new AFe1tSDK(System.currentTimeMillis() - currentTimeMillis);
            AFLogger.INSTANCE.d(AFg1jSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(" ").append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str2).append("\n took ").append(aFe1tSDK2.AFInAppEventType).append("ms").toString()).toString());
            HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
            hashMap.remove(null);
            AFe1pSDK<String> aFe1pSDK = new AFe1pSDK<>(str2, httpURLConnection2.getResponseCode(), z, hashMap, aFe1tSDK2);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return aFe1pSDK;
        } catch (Exception e3) {
            exc = e3;
            httpURLConnection = httpURLConnection2;
            AFe1tSDK aFe1tSDK3 = new AFe1tSDK(System.currentTimeMillis() - currentTimeMillis);
            AFLogger.INSTANCE.e(AFg1jSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(exc).append("\n took ").append(aFe1tSDK3.AFInAppEventType).append("ms").toString()).toString(), exc, false, false, false);
            throw new HttpException(exc, aFe1tSDK3);
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    private static String AFKeystoreWrapper(HttpURLConnection httpURLConnection, boolean z) throws IOException {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z2) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z2 = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th) {
                        bufferedReader = bufferedReader2;
                        th = th;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
