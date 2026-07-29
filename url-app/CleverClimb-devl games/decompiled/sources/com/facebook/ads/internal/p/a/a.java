package com.facebook.ads.internal.p.a;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class a {
    private static int[] f = new int[20];
    private static final String g = a.class.getSimpleName();
    private boolean j;
    private Set<String> k;
    private Set<String> l;

    /* renamed from: b, reason: collision with root package name */
    protected final d f5287b = new e();

    /* renamed from: c, reason: collision with root package name */
    protected r f5288c = new g();

    /* renamed from: d, reason: collision with root package name */
    protected int f5289d = 2000;
    protected int e = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    private int h = 3;
    private Map<String, String> i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    protected final q f5286a = new f() { // from class: com.facebook.ads.internal.p.a.a.1
    };

    static {
        c();
        if (Build.VERSION.SDK_INT > 8) {
            a();
        }
    }

    public static void a() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private static void c() {
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    private void c(HttpURLConnection httpURLConnection) {
        for (String str : this.i.keySet()) {
            httpURLConnection.setRequestProperty(str, this.i.get(str));
        }
    }

    protected int a(int i) {
        return f[i + 2] * 1000;
    }

    protected int a(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream;
        try {
            outputStream = this.f5286a.a(httpURLConnection);
            if (outputStream != null) {
                try {
                    this.f5286a.a(outputStream, bArr);
                } catch (Throwable th) {
                    th = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            return responseCode;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public a a(String str, String str2) {
        this.i.put(str, str2);
        return this;
    }

    public n a(l lVar) {
        long currentTimeMillis;
        n a2;
        long currentTimeMillis2 = System.currentTimeMillis();
        for (int i = 0; i < this.h; i++) {
            try {
                c(a(i));
                if (this.f5288c.a()) {
                    this.f5288c.a((i + 1) + "of" + this.h + ", trying " + lVar.a());
                }
                currentTimeMillis = System.currentTimeMillis();
                try {
                    a2 = a(lVar.a(), lVar.b(), lVar.c(), lVar.d());
                } catch (m e) {
                    e = e;
                    currentTimeMillis2 = currentTimeMillis;
                    if (a(e, currentTimeMillis2) && i < this.h - 1) {
                        continue;
                    } else {
                        if (!this.f5286a.a(e) || i >= this.h - 1) {
                            throw e;
                        }
                        try {
                            Thread.sleep(this.f5289d);
                        } catch (InterruptedException unused) {
                            throw e;
                        }
                    }
                }
            } catch (m e2) {
                e = e2;
            }
            if (a2 != null) {
                return a2;
            }
            currentTimeMillis2 = currentTimeMillis;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.internal.p.a.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.facebook.ads.internal.p.a.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected n a(String str, j jVar, String str2, byte[] bArr) {
        n nVar = null;
        try {
            try {
                this.j = false;
                str = a(str);
                try {
                    a(str, jVar, str2);
                    c(str);
                    if (this.f5288c.a()) {
                        this.f5288c.a(str, bArr);
                    }
                    str.connect();
                    boolean z = true;
                    this.j = true;
                    boolean z2 = (this.l == null || this.l.isEmpty()) ? false : true;
                    if (this.k == null || this.k.isEmpty()) {
                        z = false;
                    }
                    if ((str instanceof HttpsURLConnection) && (z2 || z)) {
                        try {
                            o.a((HttpsURLConnection) str, this.l, this.k);
                        } catch (Exception e) {
                            Log.e(g, "Unable to validate SSL certificates.", e);
                        }
                    }
                    if (str.getDoOutput() && bArr != null) {
                        a(str, bArr);
                    }
                    n a2 = str.getDoInput() ? a(str) : new n(str, null);
                    if (this.f5288c.a()) {
                        this.f5288c.a(a2);
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    return a2;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        n b2 = b(str);
                        if (b2 != null) {
                            try {
                                if (b2.a() > 0) {
                                    if (this.f5288c.a()) {
                                        this.f5288c.a(b2);
                                    }
                                    if (str != 0) {
                                        str.disconnect();
                                    }
                                    return b2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                nVar = b2;
                                if (this.f5288c.a()) {
                                    this.f5288c.a(nVar);
                                }
                                if (str != 0) {
                                    str.disconnect();
                                }
                                throw th;
                            }
                        }
                        throw new m(e, b2);
                    } catch (Exception unused) {
                        e.printStackTrace();
                        throw new m(e, null);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            str = 0;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (this.f5288c.a()) {
            }
            if (str != 0) {
            }
            throw th;
        }
    }

    public n a(String str, p pVar) {
        return b(new i(str, pVar));
    }

    public n a(String str, String str2, byte[] bArr) {
        return b(new k(str, null, str2, bArr));
    }

    protected n a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        byte[] bArr = null;
        try {
            inputStream = this.f5286a.b(httpURLConnection);
            if (inputStream != null) {
                try {
                    bArr = this.f5286a.a(inputStream);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            n nVar = new n(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            return nVar;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    protected HttpURLConnection a(String str) {
        try {
            new URL(str);
            return this.f5286a.a(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + " is not a valid URL", e);
        }
    }

    protected void a(l lVar, b bVar) {
        this.f5287b.a(this, bVar).a(lVar);
    }

    public void a(String str, p pVar, b bVar) {
        a(new k(str, pVar), bVar);
    }

    protected void a(HttpURLConnection httpURLConnection, j jVar, String str) {
        httpURLConnection.setConnectTimeout(this.f5289d);
        httpURLConnection.setReadTimeout(this.e);
        this.f5286a.a(httpURLConnection, jVar, str);
    }

    public void a(Set<String> set) {
        this.l = set;
    }

    protected boolean a(Throwable th, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.f5288c.a()) {
            this.f5288c.a("ELAPSED TIME = " + currentTimeMillis + ", CT = " + this.f5289d + ", RT = " + this.e);
        }
        return this.j ? currentTimeMillis >= ((long) this.e) : currentTimeMillis >= ((long) this.f5289d);
    }

    public n b(l lVar) {
        try {
            return a(lVar.a(), lVar.b(), lVar.c(), lVar.d());
        } catch (m e) {
            this.f5286a.a(e);
            return null;
        } catch (Exception e2) {
            this.f5286a.a(new m(e2, null));
            return null;
        }
    }

    public n b(String str, p pVar) {
        return b(new k(str, pVar));
    }

    protected n b(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        byte[] bArr = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                try {
                    bArr = this.f5286a.a(inputStream);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            n nVar = new n(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            return nVar;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public p b() {
        return new p();
    }

    public void b(int i) {
        if (i < 1 || i > 18) {
            throw new IllegalArgumentException("Maximum retries must be between 1 and 18");
        }
        this.h = i;
    }

    public void b(Set<String> set) {
        this.k = set;
    }

    public void c(int i) {
        this.f5289d = i;
    }
}
