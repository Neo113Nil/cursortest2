package com.chartboost.sdk.impl;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.safedk.android.internal.partials.ChartboostFilesBridge;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class td implements Runnable, Comparable {
    public final Executor b;
    public final ud c;
    public final j3 d;
    public final vh e;
    public final yi f;
    public final e3 g;
    public final p7 h;
    public g3 i;
    public h3 j;
    public boolean k = true;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e3.b.values().length];
            a = iArr;
            try {
                iArr[e3.b.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e3.b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean b(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    public td(Executor executor, ud udVar, j3 j3Var, vh vhVar, yi yiVar, e3 e3Var, p7 p7Var) {
        this.b = executor;
        this.c = udVar;
        this.d = j3Var;
        this.e = vhVar;
        this.f = yiVar;
        this.g = e3Var;
        this.h = p7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:53:0x00a4, B:55:0x00ac, B:56:0x00bc, B:63:0x00b6, B:34:0x00ec, B:36:0x00f4, B:37:0x0101, B:44:0x00fb, B:9:0x0039, B:11:0x0041, B:13:0x004f, B:22:0x0068, B:23:0x0075), top: B:8:0x0039, inners: #3, #6, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:53:0x00a4, B:55:0x00ac, B:56:0x00bc, B:63:0x00b6, B:34:0x00ec, B:36:0x00f4, B:37:0x0101, B:44:0x00fb, B:9:0x0039, B:11:0x0041, B:13:0x004f, B:22:0x0068, B:23:0x0075), top: B:8:0x0039, inners: #3, #6, #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i;
        int i2;
        g3 g3Var = this.i;
        if (g3Var != null) {
            try {
                CBError cBError = g3Var.b;
                if (cBError == null) {
                    this.g.a(g3Var.a, this.j);
                } else {
                    this.g.a(cBError, this.j);
                }
                return;
            } catch (Exception e) {
                xb.b("deliver result: ", e);
                return;
            }
        }
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.g.e, e3.d.c, e3.d.d)) {
            long b = this.e.b();
            try {
                try {
                    if (this.d.e()) {
                        h3 a2 = a(this.g);
                        this.j = a2;
                        if (a2.c()) {
                            this.i = this.g.a(this.j);
                        } else {
                            this.i = a(this.j.b());
                        }
                    } else {
                        this.i = a();
                    }
                    this.g.f = this.e.b() - b;
                    i2 = a.a[this.g.i.ordinal()];
                } catch (Throwable th) {
                    this.g.f = this.e.b() - b;
                    int i3 = a.a[this.g.i.ordinal()];
                    if (i3 == 1) {
                        this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.td$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                return td.this.b();
                            }
                        });
                    } else if (i3 == 2) {
                        this.b.execute(this);
                    }
                    throw th;
                }
            } catch (InterruptedIOException e2) {
                e = e2;
                if (!this.d.e()) {
                    this.i = a(e);
                } else {
                    this.i = a();
                }
                a(si.h.f, e.toString());
                this.g.f = this.e.b() - b;
                i = a.a[this.g.i.ordinal()];
                if (i != 1) {
                    this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.td$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return td.this.b();
                        }
                    });
                    return;
                } else if (i != 2) {
                    return;
                }
            } catch (SocketException e3) {
                e = e3;
                if (!this.d.e()) {
                }
                a(si.h.f, e.toString());
                this.g.f = this.e.b() - b;
                i = a.a[this.g.i.ordinal()];
                if (i != 1) {
                }
            } catch (UnknownHostException e4) {
                e = e4;
                if (!this.d.e()) {
                }
                a(si.h.f, e.toString());
                this.g.f = this.e.b() - b;
                i = a.a[this.g.i.ordinal()];
                if (i != 1) {
                }
            } catch (SSLException e5) {
                e = e5;
                if (!this.d.e()) {
                }
                a(si.h.f, e.toString());
                this.g.f = this.e.b() - b;
                i = a.a[this.g.i.ordinal()];
                if (i != 1) {
                }
            } catch (Throwable th2) {
                if (this.d.e()) {
                    this.i = a(th2);
                } else {
                    this.i = a();
                }
                a(si.h.c, th2.toString());
                this.g.f = this.e.b() - b;
                int i4 = a.a[this.g.i.ordinal()];
                if (i4 == 1) {
                    this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.td$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return td.this.b();
                        }
                    });
                    return;
                } else if (i4 != 2) {
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.b.execute(this);
                return;
            }
            this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.td$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return td.this.b();
                }
            });
        }
    }

    public final /* synthetic */ Unit b() {
        run();
        return Unit.INSTANCE;
    }

    public final void a(Map map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
    }

    public final void c(HttpsURLConnection httpsURLConnection) {
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (this.g instanceof al) {
            if (file.exists()) {
                return;
            }
            if (!file.createNewFile()) {
                throw new IOException("Video temp file was not created and doesn't exist");
            }
        }
        e3 e3Var = this.g;
        if (e3Var instanceof al) {
            a(e3Var.e(), a(httpsURLConnection));
        }
        InputStream urlConnectionGetInputStream = ChartboostNetworkBridge.urlConnectionGetInputStream(httpsURLConnection);
        try {
            FileOutputStream fileOutputStreamCtor = ChartboostFilesBridge.fileOutputStreamCtor(file);
            try {
                if (this.g instanceof al) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = urlConnectionGetInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else if (file.exists()) {
                            fileOutputStreamCtor.write(bArr, 0, read);
                        } else {
                            throw new IOException("Temp file was deleted during download");
                        }
                    }
                } else {
                    w4.a.a(urlConnectionGetInputStream, fileOutputStreamCtor);
                }
                fileOutputStreamCtor.close();
                if (urlConnectionGetInputStream != null) {
                    urlConnectionGetInputStream.close();
                }
                if (file.renameTo(this.g.d)) {
                    return;
                }
                if (!file.delete()) {
                    String str = "Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + this.g.d.getAbsolutePath();
                    a(str);
                    throw new IOException(str);
                }
                String str2 = "Unable to move " + file.getAbsolutePath() + " to " + this.g.d.getAbsolutePath();
                a(str2);
                throw new IOException(str2);
            } finally {
            }
        } catch (Throwable th) {
            if (urlConnectionGetInputStream != null) {
                try {
                    urlConnectionGetInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final byte[] b(HttpsURLConnection httpsURLConnection) {
        InputStream errorStream;
        byte[] bArr;
        InputStream inputStream = null;
        try {
            try {
                errorStream = ChartboostNetworkBridge.urlConnectionGetInputStream(httpsURLConnection);
            } catch (IOException unused) {
                errorStream = httpsURLConnection.getErrorStream();
            }
            InputStream inputStream2 = errorStream;
            if (inputStream2 != null) {
                bArr = w4.a.a(new BufferedInputStream(inputStream2));
            } else {
                bArr = new byte[0];
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return bArr;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public final void c() {
        e3 e3Var = this.g;
        if (e3Var == null || e3Var.d == null || !(e3Var instanceof al)) {
            return;
        }
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(td tdVar) {
        return this.g.d().b() - tdVar.g.d().b();
    }

    public final void a(String str, long j) {
        if (this.k) {
            this.k = false;
            this.g.a(str, j);
        }
    }

    public final byte[] a(HttpsURLConnection httpsURLConnection, int i, long j) {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        try {
            if (b(i)) {
                if (this.g.d != null) {
                    c(httpsURLConnection);
                    return bArr2;
                }
                bArr = b(httpsURLConnection);
            } else {
                bArr = new byte[0];
            }
            bArr2 = bArr;
            return bArr2;
        } finally {
            this.g.h = this.e.b() - j;
        }
    }

    public final h3 a(e3 e3Var, int i) {
        this.k = true;
        f3 a2 = e3Var.a();
        Map map = a2.a;
        HttpsURLConnection a3 = this.c.a(e3Var);
        a3.setSSLSocketFactory(m3.a());
        a3.setConnectTimeout(i);
        a3.setReadTimeout(i);
        a3.setUseCaches(false);
        a3.setDoInput(true);
        try {
            a(map, a3);
            a3.setRequestMethod(e3Var.c().name());
            a(a2, a3);
            long b = this.e.b();
            try {
                int httpUrlConnectionGetResponseCode = ChartboostNetworkBridge.httpUrlConnectionGetResponseCode(a3);
                long b2 = this.e.b();
                e3Var.g = b2 - b;
                if (httpUrlConnectionGetResponseCode != -1) {
                    return new h3(httpUrlConnectionGetResponseCode, a(a3, httpUrlConnectionGetResponseCode, b2));
                }
                throw new IOException("Could not retrieve response code from HttpsURLConnection.");
            } catch (Throwable th) {
                e3Var.g = this.e.b() - b;
                throw th;
            }
        } finally {
            ChartboostNetworkBridge.httpUrlConnectionDisconnect(a3);
        }
    }

    public final h3 a(e3 e3Var) {
        int i = 10000;
        int i2 = 0;
        while (true) {
            try {
                return a(e3Var, i);
            } catch (SocketTimeoutException e) {
                if (i2 >= 1) {
                    throw e;
                }
                i *= 2;
                i2++;
            }
        }
    }

    public final void a(si siVar, String str) {
        try {
            c();
            this.h.mo3222track(s5.a(siVar, str));
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        this.h.mo3222track(s5.a(si.h.e, str));
    }

    public final g3 a(int i) {
        return g3.a(new CBError(CBError.Internal.NETWORK_FAILURE, "Failure due to HTTP status code " + i));
    }

    public final g3 a() {
        return g3.a(new CBError(CBError.Internal.INTERNET_UNAVAILABLE, "Internet Unavailable"));
    }

    public final g3 a(IOException iOException) {
        return g3.a(new CBError(CBError.Internal.NETWORK_FAILURE, iOException.toString()));
    }

    public final g3 a(Throwable th) {
        return g3.a(new CBError(CBError.Internal.MISCELLANEOUS, th.toString()));
    }

    public final void a(f3 f3Var, HttpsURLConnection httpsURLConnection) {
        if (!e3.c.c.equals(this.g.c()) || f3Var.b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(f3Var.b.length);
        if (f3Var.a() != null) {
            httpsURLConnection.addRequestProperty("Content-Type", f3Var.a());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(ChartboostNetworkBridge.urlConnectionGetOutputStream(httpsURLConnection));
        try {
            dataOutputStream.write(f3Var.b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long a(HttpsURLConnection httpsURLConnection) {
        return httpsURLConnection.getContentLengthLong();
    }
}
