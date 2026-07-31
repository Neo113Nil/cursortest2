package O0;

import android.text.TextUtils;
import com.ironsource.cc;
import com.ironsource.jn;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public abstract class k0 {

    private static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    public static O a(String str, byte[] bArr, Map map) {
        return b(str, bArr, map, jn.f16865b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static O b(String str, byte[] bArr, Map map, String str2) {
        HttpURLConnection httpURLConnection;
        ?? r9;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        HttpURLConnection httpURLConnection5;
        HttpURLConnection httpURLConnection6;
        HttpURLConnection httpURLConnection7;
        HttpURLConnection httpURLConnection8;
        if (TextUtils.isEmpty(str)) {
            return new O(-100, "");
        }
        String str3 = null;
        int i4 = -102;
        try {
            try {
                httpURLConnection = c(str, bArr.length, map, str2);
                try {
                    if (httpURLConnection == null) {
                        O o4 = new O(-101, "");
                        H.c(null);
                        H.c(null);
                        if (httpURLConnection != null) {
                            H.f(httpURLConnection);
                        }
                        return o4;
                    }
                    map = httpURLConnection.getOutputStream();
                    try {
                        r9 = new BufferedOutputStream(map);
                        try {
                            r9.write(bArr);
                            r9.flush();
                            i4 = httpURLConnection.getResponseCode();
                            O o5 = new O(i4, e(httpURLConnection));
                            H.c(r9);
                            H.c(map);
                            H.f(httpURLConnection);
                            return o5;
                        } catch (a unused) {
                            httpURLConnection8 = httpURLConnection;
                            j0.m("hmsSdk", "PostRequest(byte[]): No ssl socket factory set!");
                            O o6 = new O(-101, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection8 != null) {
                                H.f(httpURLConnection8);
                            }
                            return o6;
                        } catch (SecurityException unused2) {
                            httpURLConnection7 = httpURLConnection;
                            j0.m("hmsSdk", "SecurityException with HttpClient. Please check INTERNET permission.");
                            O o7 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection7 != null) {
                                H.f(httpURLConnection7);
                            }
                            return o7;
                        } catch (ConnectException unused3) {
                            httpURLConnection6 = httpURLConnection;
                            j0.m("hmsSdk", "Network is unreachable or Connection refused");
                            O o8 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection6 != null) {
                                H.f(httpURLConnection6);
                            }
                            return o8;
                        } catch (UnknownHostException unused4) {
                            httpURLConnection5 = httpURLConnection;
                            j0.m("hmsSdk", "No address associated with hostname or No network");
                            O o9 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection5 != null) {
                                H.f(httpURLConnection5);
                            }
                            return o9;
                        } catch (SSLHandshakeException unused5) {
                            httpURLConnection4 = httpURLConnection;
                            j0.m("hmsSdk", "Chain validation failed,Certificate expired");
                            O o10 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection4 != null) {
                                H.f(httpURLConnection4);
                            }
                            return o10;
                        } catch (SSLPeerUnverifiedException unused6) {
                            httpURLConnection3 = httpURLConnection;
                            j0.m("hmsSdk", "Certificate has not been verified,Request is restricted!");
                            O o11 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection3 != null) {
                                H.f(httpURLConnection3);
                            }
                            return o11;
                        } catch (IOException unused7) {
                            httpURLConnection2 = httpURLConnection;
                            j0.m("hmsSdk", "events PostRequest(byte[]): IOException occurred.");
                            O o12 = new O(i4, "");
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection2 != null) {
                                H.f(httpURLConnection2);
                            }
                            return o12;
                        } catch (Throwable th) {
                            th = th;
                            H.c(r9);
                            H.c(map);
                            if (httpURLConnection != null) {
                                H.f(httpURLConnection);
                            }
                            throw th;
                        }
                    } catch (a unused8) {
                        r9 = 0;
                        httpURLConnection8 = httpURLConnection;
                        j0.m("hmsSdk", "PostRequest(byte[]): No ssl socket factory set!");
                        O o62 = new O(-101, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection8 != null) {
                        }
                        return o62;
                    } catch (SecurityException unused9) {
                        r9 = 0;
                        httpURLConnection7 = httpURLConnection;
                        j0.m("hmsSdk", "SecurityException with HttpClient. Please check INTERNET permission.");
                        O o72 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection7 != null) {
                        }
                        return o72;
                    } catch (ConnectException unused10) {
                        r9 = 0;
                        httpURLConnection6 = httpURLConnection;
                        j0.m("hmsSdk", "Network is unreachable or Connection refused");
                        O o82 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection6 != null) {
                        }
                        return o82;
                    } catch (UnknownHostException unused11) {
                        r9 = 0;
                        httpURLConnection5 = httpURLConnection;
                        j0.m("hmsSdk", "No address associated with hostname or No network");
                        O o92 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection5 != null) {
                        }
                        return o92;
                    } catch (SSLHandshakeException unused12) {
                        r9 = 0;
                        httpURLConnection4 = httpURLConnection;
                        j0.m("hmsSdk", "Chain validation failed,Certificate expired");
                        O o102 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection4 != null) {
                        }
                        return o102;
                    } catch (SSLPeerUnverifiedException unused13) {
                        r9 = 0;
                        httpURLConnection3 = httpURLConnection;
                        j0.m("hmsSdk", "Certificate has not been verified,Request is restricted!");
                        O o112 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection3 != null) {
                        }
                        return o112;
                    } catch (IOException unused14) {
                        r9 = 0;
                        httpURLConnection2 = httpURLConnection;
                        j0.m("hmsSdk", "events PostRequest(byte[]): IOException occurred.");
                        O o122 = new O(i4, "");
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection2 != null) {
                        }
                        return o122;
                    } catch (Throwable th2) {
                        th = th2;
                        r9 = str3;
                        H.c(r9);
                        H.c(map);
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (a unused15) {
                    map = 0;
                } catch (SecurityException unused16) {
                    map = 0;
                } catch (ConnectException unused17) {
                    map = 0;
                } catch (UnknownHostException unused18) {
                    map = 0;
                } catch (SSLHandshakeException unused19) {
                    map = 0;
                } catch (SSLPeerUnverifiedException unused20) {
                    map = 0;
                } catch (IOException unused21) {
                    map = 0;
                } catch (Throwable th3) {
                    th = th3;
                    map = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                str3 = str2;
            }
        } catch (a unused22) {
            httpURLConnection = null;
            map = 0;
        } catch (SecurityException unused23) {
            httpURLConnection = null;
            map = 0;
        } catch (ConnectException unused24) {
            httpURLConnection = null;
            map = 0;
        } catch (UnknownHostException unused25) {
            httpURLConnection = null;
            map = 0;
        } catch (SSLHandshakeException unused26) {
            httpURLConnection = null;
            map = 0;
        } catch (SSLPeerUnverifiedException unused27) {
            httpURLConnection = null;
            map = 0;
        } catch (IOException unused28) {
            httpURLConnection = null;
            map = 0;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            map = 0;
        }
    }

    private static HttpURLConnection c(String str, int i4, Map map, String str2) {
        if (TextUtils.isEmpty(str)) {
            j0.e("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        d(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(cc.f15718K, "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i4));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    httpURLConnection.setRequestProperty(str3, (String) entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(HttpURLConnection httpURLConnection) {
        String str;
        T0.b bVar;
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                bVar = T0.b.b(Y.q());
            } catch (IOException unused) {
                str = "getSocketFactory(): IO Exception!";
                j0.m("hmsSdk", str);
                bVar = null;
                if (bVar != null) {
                }
            } catch (IllegalAccessException unused2) {
                str = "getSocketFactory(): Illegal Access Exception ";
                j0.m("hmsSdk", str);
                bVar = null;
                if (bVar != null) {
                }
            } catch (KeyStoreException unused3) {
                str = "getSocketFactory(): Key Store exception";
                j0.m("hmsSdk", str);
                bVar = null;
                if (bVar != null) {
                }
            } catch (NoSuchAlgorithmException unused4) {
                str = "getSocketFactory(): Algorithm Exception!";
                j0.m("hmsSdk", str);
                bVar = null;
                if (bVar != null) {
                }
            } catch (GeneralSecurityException unused5) {
                str = "getSocketFactory(): General Security Exception";
                j0.m("hmsSdk", str);
                bVar = null;
                if (bVar != null) {
                }
            }
            if (bVar != null) {
                throw new a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory(bVar);
            httpsURLConnection.setHostnameVerifier(new U0.a());
        }
    }

    private static String e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return H.b(inputStream);
            } catch (IOException unused) {
                j0.m("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                H.c(inputStream);
                return "";
            }
        } finally {
            H.c(inputStream);
        }
    }
}
