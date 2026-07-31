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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final pa f520a;
    public final l3 b;
    public final pa c;
    public final pa d;
    public final pa e;
    public final pa f;

    public z7(pa paVar, l3 l3Var, pa paVar2, pa paVar3, pa paVar4, pa paVar5) {
        this.f520a = paVar;
        this.b = l3Var;
        this.c = paVar2;
        this.d = paVar3;
        this.e = paVar4;
        this.f = paVar5;
    }

    public final TimeoutConfig a(int i) {
        return ((HttpClientConfig) this.f.a()).a(i);
    }

    public final boolean b(int i) {
        ComponentInfoEventConfig b = ((HttpClientConfig) this.f.a()).b();
        return b != null && b.a((long) i);
    }

    public final c8 a(y7 y7Var) {
        HashMap a2 = a();
        System.currentTimeMillis();
        zh.b();
        try {
            TimeoutConfig timeoutConfig = y7Var.d;
            if (timeoutConfig == null && (timeoutConfig = ((HttpClientConfig) this.f.a()).c()) == null) {
                timeoutConfig = TimeoutConfig.f156a;
            }
            ((w6) this.d.a()).c(y7Var, mh.o);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.e.a()).schedule(a(atomicReference), timeoutConfig.c(), TimeUnit.MILLISECONDS);
            c8 a3 = a(y7Var.b, a2, atomicReference, timeoutConfig);
            ((w6) this.d.a()).c(y7Var, mh.p);
            ((w6) this.d.a()).a(y7Var, a8.a(200, a3.d, (HttpClientConfig) this.f.a()));
            zh.b();
            return a3;
        } catch (SDKException e) {
            ((w6) this.d.a()).c(y7Var, mh.q);
            ((w6) this.d.a()).a(y7Var, a8.a(e.a(), null, (HttpClientConfig) this.f.a()));
            a7 a7Var = y7Var.e;
            if (a7Var != null) {
                try {
                    a7Var.a(e);
                } catch (Throwable th) {
                    if (b(32)) {
                        n8.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final c8 b(y7 y7Var) {
        HashMap a2 = a();
        try {
            TimeoutConfig timeoutConfig = y7Var.d;
            if (timeoutConfig == null && (timeoutConfig = ((HttpClientConfig) this.f.a()).c()) == null) {
                timeoutConfig = TimeoutConfig.f156a;
            }
            ((w6) this.d.a()).c(y7Var, mh.r);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.e.a()).schedule(a(atomicReference), timeoutConfig.c(), TimeUnit.MILLISECONDS);
            c8 a3 = a(y7Var.b, a2, y7Var.c, atomicReference, timeoutConfig);
            ((w6) this.d.a()).c(y7Var, mh.s);
            ((w6) this.d.a()).a(y7Var, a8.a(200, null, (HttpClientConfig) this.f.a()));
            return a3;
        } catch (SDKException e) {
            ((w6) this.d.a()).c(y7Var, mh.t);
            ((w6) this.d.a()).a(y7Var, a8.a(e.a(), null, (HttpClientConfig) this.f.a()));
            a7 a7Var = y7Var.e;
            if (a7Var != null) {
                try {
                    a7Var.a(e);
                } catch (Throwable th) {
                    if (b(32)) {
                        n8.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (!((HttpClientConfig) this.f.a()).f()) {
            String str = null;
            try {
                str = URLEncoder.encode(((com.startapp.sdk.common.advertisingid.b) this.f520a.a()).a().f255a, CharEncoding.UTF_8);
            } catch (Throwable th) {
                if (b(64)) {
                    n8.a(th);
                }
            }
            hashMap.put("device-id", str);
        }
        try {
            hashMap.put("Accept-Language", ((gb) ((hb) this.c.a()).b()).c);
        } catch (Throwable th2) {
            if (b(128)) {
                n8.a(th2);
            }
        }
        try {
            String str2 = (String) this.b.call();
            if (str2 != null) {
                hashMap.put("User-Agent", str2);
            }
        } catch (Throwable th3) {
            if (b(256)) {
                n8.a(th3);
            }
        }
        return hashMap;
    }

    public static HttpURLConnection a(String str, HashMap hashMap, b8 b8Var, TimeoutConfig timeoutConfig) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        z5.a(httpURLConnection, str);
        httpURLConnection.setReadTimeout((int) timeoutConfig.b());
        httpURLConnection.setConnectTimeout((int) timeoutConfig.a());
        if (b8Var == null) {
            httpURLConnection.setRequestMethod("GET");
        } else {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(b8Var.f180a.length);
            httpURLConnection.setRequestProperty("Content-Type", b8Var.b);
            String str2 = b8Var.c;
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

    public static c8 a(String str, HashMap hashMap, AtomicReference atomicReference, TimeoutConfig timeoutConfig) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        int i;
        int responseCode;
        try {
            httpURLConnection = a(str, hashMap, (b8) null, timeoutConfig);
            try {
                try {
                    atomicReference.set(new z7$$ExternalSyntheticLambda0(httpURLConnection));
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e) {
                    iOException = e;
                    i = 0;
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i, false, iOException);
                }
                try {
                    if (responseCode == 200) {
                        CookieManager cookieManager = z5.f519a;
                        if (cookieManager != null) {
                            cookieManager.put(URI.create(str), httpURLConnection.getHeaderFields());
                        }
                        c8 c8Var = new c8();
                        c8Var.f196a = str;
                        c8Var.c = httpURLConnection.getContentType();
                        c8Var.d = httpURLConnection.getHeaderFields();
                        c8Var.b = a(httpURLConnection);
                        httpURLConnection.disconnect();
                        atomicReference.set(null);
                        return c8Var;
                    }
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), responseCode, true, null);
                } catch (IOException e2) {
                    iOException = e2;
                    i = responseCode;
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i, false, iOException);
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    atomicReference.set(null);
                    throw th;
                }
                throw th;
            }
        } catch (IOException e3) {
            iOException = e3;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    public static c8 a(String str, HashMap hashMap, b8 b8Var, AtomicReference atomicReference, TimeoutConfig timeoutConfig) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        int i;
        Throwable th2;
        OutputStream outputStream;
        try {
            httpURLConnection = a(str, hashMap, b8Var, timeoutConfig);
            try {
                try {
                    atomicReference.set(new z7$$ExternalSyntheticLambda0(httpURLConnection));
                    if (b8Var.f180a.length > 0) {
                        try {
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(b8Var.f180a);
                                outputStream.flush();
                                int i2 = m0.f327a;
                                try {
                                    outputStream.close();
                                } catch (Exception unused) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                int i3 = m0.f327a;
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
                            c8 c8Var = new c8();
                            c8Var.f196a = str;
                            c8Var.c = httpURLConnection.getContentType();
                            c8Var.d = httpURLConnection.getHeaderFields();
                            c8Var.b = a(httpURLConnection);
                            httpURLConnection.disconnect();
                            atomicReference.set(null);
                            return c8Var;
                        }
                        throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), responseCode, false, null);
                    } catch (IOException e) {
                        iOException = e;
                        i = responseCode;
                        throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), i, false, iOException);
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
            } catch (IOException e2) {
                iOException = e2;
                i = 0;
                throw new SDKException("POST", Uri.parse(str).buildUpon().query(null).build(), i, false, iOException);
            }
        } catch (IOException e3) {
            iOException = e3;
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

    public static Runnable a(final AtomicReference atomicReference) {
        final String str = null;
        return new Runnable() { // from class: com.startapp.sdk.internal.z7$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                z7.a(atomicReference, str);
            }
        };
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
