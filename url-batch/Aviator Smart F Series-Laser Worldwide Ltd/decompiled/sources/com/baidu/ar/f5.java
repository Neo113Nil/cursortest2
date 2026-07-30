package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public class f5 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public j5 f2214a;

    /* renamed from: b, reason: collision with root package name */
    public c6 f2215b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f2216c;

    /* renamed from: d, reason: collision with root package name */
    public l5 f2217d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2218e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2219f;

    /* renamed from: g, reason: collision with root package name */
    public IProgressCallback f2220g;

    public f5(j5 j5Var) {
        this(j5Var, null);
    }

    @Override // com.baidu.ar.b6
    public l5 a() {
        return this.f2217d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l5 b() {
        InputStream[] inputStreamArr;
        r5 r5Var;
        synchronized (this.f2218e) {
            try {
                ?? r22 = 0;
                r22 = 0;
                r22 = 0;
                if (this.f2219f) {
                    return null;
                }
                int i8 = 0;
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f2214a.f2527a.openConnection();
                        this.f2216c = httpURLConnection;
                        httpURLConnection.setConnectTimeout(this.f2214a.f2530d.f2643a);
                        this.f2216c.setReadTimeout(this.f2214a.f2530d.f2644b);
                        this.f2216c.setUseCaches(this.f2214a.f2530d.f2645c);
                        this.f2216c.setRequestMethod(this.f2214a.f2528b);
                        Map<String, String> map = this.f2214a.f2531e;
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                this.f2216c.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!HttpManager.HTTP_POST.equals(this.f2214a.f2528b) || (r5Var = this.f2214a.f2532f) == null) {
                            inputStreamArr = null;
                        } else {
                            int c8 = r5Var.c();
                            inputStreamArr = this.f2214a.f2532f.a();
                            if (inputStreamArr != null) {
                                try {
                                    if (inputStreamArr.length > 0) {
                                        this.f2216c.setDoOutput(true);
                                        OutputStream outputStream = this.f2216c.getOutputStream();
                                        byte[] bArr = new byte[1024];
                                        int i9 = 0;
                                        for (InputStream inputStream : inputStreamArr) {
                                            while (true) {
                                                int read = inputStream.read(bArr);
                                                if (read != -1) {
                                                    outputStream.write(bArr, 0, read);
                                                    IProgressCallback iProgressCallback = this.f2220g;
                                                    if (iProgressCallback != null) {
                                                        i9 += read;
                                                        iProgressCallback.onProgress(i9, c8);
                                                    }
                                                }
                                            }
                                        }
                                        outputStream.flush();
                                        r22 = outputStream;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    HttpURLConnection httpURLConnection2 = this.f2216c;
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    throw new HttpException(e);
                                }
                            }
                        }
                        l5 l5Var = new l5(this.f2216c, this.f2214a.f2529c);
                        this.f2217d = l5Var;
                        if (r22 != 0) {
                            m5.a((Closeable) r22);
                        }
                        if (inputStreamArr != null) {
                            int length = inputStreamArr.length;
                            while (i8 < length) {
                                m5.a(inputStreamArr[i8]);
                                i8++;
                            }
                        }
                        return l5Var;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            m5.a((Closeable) null);
                        }
                        if (0 != 0) {
                            int length2 = r22.length;
                            while (i8 < length2) {
                                m5.a((Closeable) r22[i8]);
                                i8++;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e9) {
                    e = e9;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                    }
                    if (0 != 0) {
                    }
                    throw th;
                }
            } finally {
            }
        }
    }

    @Override // com.baidu.ar.b6
    public void cancel() {
        if (this.f2219f) {
            return;
        }
        this.f2215b = null;
        this.f2220g = null;
        synchronized (this.f2218e) {
            this.f2219f = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        HttpException e8;
        boolean z7;
        boolean z8;
        c6 c6Var;
        l5 b8;
        c6 c6Var2;
        try {
            try {
                b8 = b();
                try {
                    try {
                    } catch (HttpException e9) {
                        e8 = e9;
                        z7 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (HttpException e10) {
                e8 = e10;
                z7 = false;
                z8 = false;
            }
            synchronized (this.f2218e) {
                try {
                    z8 = this.f2219f;
                    if (!z8 && (c6Var2 = this.f2215b) != null) {
                        try {
                            c6Var2.a(b8);
                        } catch (HttpException e11) {
                            e8 = e11;
                            z7 = true;
                            if (!z8 && !z7 && (c6Var = this.f2215b) != null) {
                                c6Var.a(e8);
                            }
                            if (httpURLConnection == null) {
                                return;
                            }
                        }
                    }
                    HttpURLConnection httpURLConnection2 = this.f2216c;
                    if (httpURLConnection2 == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } finally {
            httpURLConnection = this.f2216c;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    public f5(j5 j5Var, c6 c6Var) {
        this.f2218e = new Object();
        this.f2219f = false;
        this.f2214a = j5Var;
        this.f2215b = c6Var;
        this.f2216c = null;
        this.f2217d = null;
    }

    public void a(IProgressCallback iProgressCallback) {
        this.f2220g = iProgressCallback;
    }
}
