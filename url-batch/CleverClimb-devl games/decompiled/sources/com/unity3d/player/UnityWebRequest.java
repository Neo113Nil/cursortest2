package com.unity3d.player;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.cert.CertPathValidatorException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
class UnityWebRequest implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private long f9342a;

    /* renamed from: b, reason: collision with root package name */
    private String f9343b;

    /* renamed from: c, reason: collision with root package name */
    private String f9344c;

    /* renamed from: d, reason: collision with root package name */
    private Map f9345d;
    private int e;
    private long f;

    static {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    UnityWebRequest(long j, String str, Map map, String str2, int i) {
        this.f9342a = j;
        this.f9343b = str2;
        this.f9344c = str;
        this.f9345d = map;
        this.e = i;
    }

    private static native void contentLengthCallback(long j, int i);

    private static native boolean downloadCallback(long j, ByteBuffer byteBuffer, int i);

    private static native void errorCallback(long j, int i, String str);

    private boolean hasTimedOut() {
        return this.e > 0 && System.currentTimeMillis() - this.f >= ((long) this.e);
    }

    private static native void headerCallback(long j, String str, String str2);

    private static native void responseCodeCallback(long j, int i);

    private void runSafe() {
        SSLSocketFactory a2;
        this.f = System.currentTimeMillis();
        try {
            URL url = new URL(this.f9343b);
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(this.e);
            openConnection.setReadTimeout(this.e);
            if ((openConnection instanceof HttpsURLConnection) && (a2 = a.a()) != null) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(a2);
            }
            if (url.getProtocol().equalsIgnoreCase("file") && !url.getHost().isEmpty()) {
                malformattedUrlCallback("file:// must use an absolute path");
                return;
            }
            boolean z = openConnection instanceof HttpURLConnection;
            if (z) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setRequestMethod(this.f9344c);
                    httpURLConnection.setInstanceFollowRedirects(false);
                } catch (ProtocolException e) {
                    badProtocolCallback(e.toString());
                    return;
                }
            }
            if (this.f9345d != null) {
                for (Map.Entry entry : this.f9345d.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(131072);
            InputStream inputStream = null;
            if (uploadCallback(null) > 0) {
                openConnection.setDoOutput(true);
                try {
                    OutputStream outputStream = openConnection.getOutputStream();
                    while (true) {
                        int uploadCallback = uploadCallback(allocateDirect);
                        if (uploadCallback <= 0) {
                            break;
                        }
                        if (hasTimedOut()) {
                            outputStream.close();
                            errorCallback(this.f9342a, 14, "WebRequest timed out.");
                            return;
                        }
                        outputStream.write(allocateDirect.array(), allocateDirect.arrayOffset(), uploadCallback);
                    }
                } catch (Exception e2) {
                    errorCallback(e2.toString());
                    return;
                }
            }
            if (z) {
                try {
                    responseCodeCallback(((HttpURLConnection) openConnection).getResponseCode());
                } catch (SocketTimeoutException e3) {
                    errorCallback(this.f9342a, 14, e3.toString());
                    return;
                } catch (UnknownHostException e4) {
                    unknownHostCallback(e4.toString());
                    return;
                } catch (SSLException e5) {
                    sslCannotConnectCallback(e5);
                    return;
                } catch (IOException e6) {
                    errorCallback(e6.toString());
                    return;
                }
            }
            Map<String, List<String>> headerFields = openConnection.getHeaderFields();
            headerCallback(headerFields);
            if ((headerFields == null || !headerFields.containsKey("content-length")) && openConnection.getContentLength() != -1) {
                headerCallback("content-length", String.valueOf(openConnection.getContentLength()));
            }
            if ((headerFields == null || !headerFields.containsKey("content-type")) && openConnection.getContentType() != null) {
                headerCallback("content-type", openConnection.getContentType());
            }
            contentLengthCallback(openConnection.getContentLength());
            try {
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                    responseCodeCallback(httpURLConnection2.getResponseCode());
                    inputStream = httpURLConnection2.getErrorStream();
                }
                if (inputStream == null) {
                    inputStream = openConnection.getInputStream();
                }
                ReadableByteChannel newChannel = Channels.newChannel(inputStream);
                while (true) {
                    int read = newChannel.read(allocateDirect);
                    if (read == -1) {
                        break;
                    }
                    if (hasTimedOut()) {
                        newChannel.close();
                        errorCallback(this.f9342a, 14, "WebRequest timed out.");
                        return;
                    } else if (!downloadCallback(allocateDirect, read)) {
                        break;
                    } else {
                        allocateDirect.clear();
                    }
                }
                newChannel.close();
            } catch (SocketTimeoutException e7) {
                errorCallback(this.f9342a, 14, e7.toString());
            } catch (UnknownHostException e8) {
                unknownHostCallback(e8.toString());
            } catch (SSLException e9) {
                sslCannotConnectCallback(e9);
            } catch (IOException e10) {
                errorCallback(this.f9342a, 14, e10.toString());
            } catch (Exception e11) {
                errorCallback(e11.toString());
            }
        } catch (MalformedURLException e12) {
            malformattedUrlCallback(e12.toString());
        } catch (IOException e13) {
            errorCallback(e13.toString());
        }
    }

    private static native int uploadCallback(long j, ByteBuffer byteBuffer);

    protected void badProtocolCallback(String str) {
        errorCallback(this.f9342a, 4, str);
    }

    protected void contentLengthCallback(int i) {
        contentLengthCallback(this.f9342a, i);
    }

    protected boolean downloadCallback(ByteBuffer byteBuffer, int i) {
        return downloadCallback(this.f9342a, byteBuffer, i);
    }

    protected void errorCallback(String str) {
        errorCallback(this.f9342a, 2, str);
    }

    protected void headerCallback(String str, String str2) {
        headerCallback(this.f9342a, str, str2);
    }

    protected void headerCallback(Map map) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                str = "Status";
            }
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                headerCallback(str, (String) it.next());
            }
        }
    }

    protected void malformattedUrlCallback(String str) {
        errorCallback(this.f9342a, 5, str);
    }

    protected void responseCodeCallback(int i) {
        responseCodeCallback(this.f9342a, i);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafe();
        } catch (Exception e) {
            errorCallback(e.toString());
        }
    }

    protected void sslCannotConnectCallback(SSLException sSLException) {
        int i;
        String sSLException2 = sSLException.toString();
        SSLException sSLException3 = sSLException;
        while (true) {
            if (sSLException3 == null) {
                i = 16;
                break;
            } else if (sSLException3 instanceof SSLKeyException) {
                i = 23;
                break;
            } else if ((sSLException3 instanceof SSLPeerUnverifiedException) || (sSLException3 instanceof CertPathValidatorException)) {
                break;
            } else {
                sSLException3 = sSLException3.getCause();
            }
        }
        i = 25;
        errorCallback(this.f9342a, i, sSLException2);
    }

    protected void unknownHostCallback(String str) {
        errorCallback(this.f9342a, 7, str);
    }

    protected int uploadCallback(ByteBuffer byteBuffer) {
        return uploadCallback(this.f9342a, byteBuffer);
    }
}
