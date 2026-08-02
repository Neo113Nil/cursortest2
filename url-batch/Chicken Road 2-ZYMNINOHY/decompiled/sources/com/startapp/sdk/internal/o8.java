package com.startapp.sdk.internal;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;
import com.startapp.sdk.common.SDKException;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f7369a;

    /* renamed from: b, reason: collision with root package name */
    public final t3 f7370b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7371c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f7372d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f7373e;

    /* renamed from: f, reason: collision with root package name */
    public final ib f7374f;

    public o8(ib ibVar, t3 t3Var, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5) {
        this.f7369a = ibVar;
        this.f7370b = t3Var;
        this.f7371c = ibVar2;
        this.f7372d = ibVar3;
        this.f7373e = ibVar4;
        this.f7374f = ibVar5;
    }

    public final boolean a(int i4) {
        ComponentInfoEventConfig b4 = ((HttpClientConfig) this.f7374f.a()).b();
        return b4 != null && b4.a((long) i4);
    }

    public final r8 b(n8 n8Var) {
        HashMap a3 = a();
        try {
            TimeoutConfig timeoutConfig = n8Var.f7328d;
            if (timeoutConfig == null && (timeoutConfig = ((HttpClientConfig) this.f7374f.a()).c()) == null) {
                timeoutConfig = TimeoutConfig.f6528a;
            }
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.f6944r);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f7373e.a()).schedule(a(atomicReference), timeoutConfig.c(), TimeUnit.MILLISECONDS);
            r8 a4 = a(n8Var.f7326b, a3, n8Var.f7327c, atomicReference, timeoutConfig);
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.f6945s);
            ((y6) ((x6) this.f7372d.a())).a(n8Var, p8.a(200, null, (HttpClientConfig) this.f7374f.a()));
            return a4;
        } catch (SDKException e4) {
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.f6946t);
            ((y6) ((x6) this.f7372d.a())).a(n8Var, p8.a(e4.a(), null, (HttpClientConfig) this.f7374f.a()));
            g7 g7Var = n8Var.f7329e;
            if (g7Var != null) {
                try {
                    g7Var.a(e4);
                } catch (Throwable th) {
                    if (a(32)) {
                        d9.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final r8 a(n8 n8Var) {
        HashMap a3 = a();
        System.currentTimeMillis();
        si.b();
        try {
            TimeoutConfig timeoutConfig = n8Var.f7328d;
            if (timeoutConfig == null && (timeoutConfig = ((HttpClientConfig) this.f7374f.a()).c()) == null) {
                timeoutConfig = TimeoutConfig.f6528a;
            }
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.o);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f7373e.a()).schedule(a(atomicReference), timeoutConfig.c(), TimeUnit.MILLISECONDS);
            r8 a4 = a(n8Var.f7326b, a3, atomicReference, timeoutConfig);
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.f6942p);
            ((y6) ((x6) this.f7372d.a())).a(n8Var, p8.a(200, a4.f7525d, (HttpClientConfig) this.f7374f.a()));
            si.b();
            return a4;
        } catch (SDKException e4) {
            ((y6) ((x6) this.f7372d.a())).c(n8Var, fi.f6943q);
            ((y6) ((x6) this.f7372d.a())).a(n8Var, p8.a(e4.a(), null, (HttpClientConfig) this.f7374f.a()));
            g7 g7Var = n8Var.f7329e;
            if (g7Var != null) {
                try {
                    g7Var.a(e4);
                } catch (Throwable th) {
                    if (a(32)) {
                        d9.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (!((HttpClientConfig) this.f7374f.a()).f()) {
            String str = null;
            try {
                str = URLEncoder.encode(((com.startapp.sdk.common.advertisingid.b) this.f7369a.a()).a().f7169a, CharEncoding.UTF_8);
            } catch (Throwable th) {
                if (a(64)) {
                    d9.a(th);
                }
            }
            hashMap.put("device-id", str);
        }
        try {
            hashMap.put("Accept-Language", ((zb) ((ac) this.f7371c.a()).b()).f8034c);
        } catch (Throwable th2) {
            if (a(128)) {
                d9.a(th2);
            }
        }
        try {
            String str2 = (String) this.f7370b.a();
            if (str2 != null) {
                hashMap.put("User-Agent", str2);
            }
        } catch (Throwable th3) {
            if (a(256)) {
                d9.a(th3);
            }
        }
        return hashMap;
    }

    public static HttpURLConnection a(String str, HashMap hashMap, q8 q8Var, TimeoutConfig timeoutConfig) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        i6.a(httpURLConnection, str);
        httpURLConnection.setReadTimeout((int) timeoutConfig.b());
        httpURLConnection.setConnectTimeout((int) timeoutConfig.a());
        if (q8Var == null) {
            httpURLConnection.setRequestMethod("GET");
        } else {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(q8Var.f7486a.length);
            httpURLConnection.setRequestProperty("Content-Type", q8Var.f7487b);
            String str2 = q8Var.f7488c;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", str2);
            }
        }
        httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null && str4 != null) {
                httpURLConnection.setRequestProperty(str3, str4);
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r8 a(String str, HashMap hashMap, AtomicReference atomicReference, TimeoutConfig timeoutConfig) {
        Throwable th;
        ?? r10;
        IOException iOException;
        int i4;
        int responseCode;
        try {
            try {
                HttpURLConnection a3 = a(str, hashMap, (q8) null, timeoutConfig);
                try {
                    atomicReference.set(new R1.n(21, a3));
                    responseCode = a3.getResponseCode();
                } catch (IOException e4) {
                    iOException = e4;
                    i4 = 0;
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i4, false, iOException);
                }
                try {
                    if (responseCode == 200) {
                        CookieManager cookieManager = i6.f7084a;
                        if (cookieManager != null) {
                            cookieManager.put(URI.create(str), a3.getHeaderFields());
                        }
                        r8 r8Var = new r8();
                        r8Var.f7522a = str;
                        r8Var.f7524c = a3.getContentType();
                        r8Var.f7525d = a3.getHeaderFields();
                        r8Var.f7523b = a(a3);
                        a3.disconnect();
                        atomicReference.set(null);
                        return r8Var;
                    }
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), responseCode, true, null);
                } catch (IOException e5) {
                    iOException = e5;
                    i4 = responseCode;
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i4, false, iOException);
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = hashMap;
                if (r10 == 0) {
                    r10.disconnect();
                    atomicReference.set(null);
                    throw th;
                }
                throw th;
            }
        } catch (IOException e6) {
            iOException = e6;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
            if (r10 == 0) {
            }
        }
    }

    public static r8 a(String str, HashMap hashMap, q8 q8Var, AtomicReference atomicReference, TimeoutConfig timeoutConfig) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        int i4;
        Throwable th2;
        OutputStream outputStream;
        try {
            httpURLConnection = a(str, hashMap, q8Var, timeoutConfig);
            try {
                try {
                    atomicReference.set(new R1.n(21, httpURLConnection));
                    if (q8Var.f7486a.length > 0) {
                        try {
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(q8Var.f7486a);
                                outputStream.flush();
                                int i5 = p0.f7428a;
                                try {
                                    outputStream.close();
                                } catch (Exception unused) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                int i6 = p0.f7428a;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                        throw th2;
                                    } catch (Exception unused2) {
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            outputStream = null;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode == 200) {
                            r8 r8Var = new r8();
                            r8Var.f7522a = str;
                            r8Var.f7524c = httpURLConnection.getContentType();
                            r8Var.f7525d = httpURLConnection.getHeaderFields();
                            r8Var.f7523b = a(httpURLConnection);
                            httpURLConnection.disconnect();
                            atomicReference.set(null);
                            return r8Var;
                        }
                        throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), responseCode, false, null);
                    } catch (IOException e4) {
                        iOException = e4;
                        i4 = responseCode;
                        throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), i4, false, iOException);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        atomicReference.set(null);
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e5) {
                iOException = e5;
                i4 = 0;
                throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), i4, false, iOException);
            }
        } catch (IOException e6) {
            iOException = e6;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
        }
    }

    public static String a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        if (inputStream != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream, CharEncoding.UTF_8));
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read != -1) {
                        stringWriter.write(cArr, 0, read);
                    } else {
                        String obj = stringWriter.toString();
                        inputStream.close();
                        return obj;
                    }
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnection.getResponseCode() == 200) {
                return "";
            }
            return null;
        }
    }

    public static Runnable a(AtomicReference atomicReference) {
        return new R1.n(22, atomicReference);
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, String str) {
        try {
            Runnable runnable = (Runnable) atomicReference.get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable unused) {
        }
    }
}
