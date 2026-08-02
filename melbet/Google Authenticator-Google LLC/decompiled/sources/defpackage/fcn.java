package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcn implements fcv {
    public final String a;
    public final hvi b;
    public final Executor c;
    public final gzp d;
    public final gth f;
    public Object i;
    public boolean j;
    public final fcf k;
    public final fcz l;
    public final iyi m;
    public final fbz e = new fcq(this, 1);
    public final Object g = new Object();
    public final hum h = new hum();
    private final hum n = new hum();

    public fcn(String str, hvi hviVar, fcz fczVar, Executor executor, iyi iyiVar, fcf fcfVar, gzp gzpVar, gth gthVar) {
        new hum();
        this.i = null;
        this.a = str;
        this.b = hnu.aK(hviVar);
        this.l = fczVar;
        this.c = executor;
        this.m = iyiVar;
        this.k = fcfVar;
        this.d = gzpVar;
        this.f = gthVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static hvi b(hvi hviVar, Closeable closeable, Executor executor) {
        return hnu.aW(hviVar).a(new bsp(closeable, hviVar, 11, null), executor);
    }

    public static boolean e(IOException iOException) {
        return (iOException instanceof faz) || (iOException.getCause() instanceof faz);
    }

    private final Closeable j(Uri uri) {
        try {
            iyi iyiVar = this.m;
            fbo fboVar = new fbo(true, true);
            fboVar.a = true;
            return (Closeable) iyiVar.r(uri, fboVar);
        } catch (fbg unused) {
            return null;
        }
    }

    @Override // defpackage.fcv
    public final htq a() {
        return new cbc(this, 10);
    }

    public final Object c(Uri uri) {
        InputStream inputStream;
        try {
            try {
                gty b = this.f.b("Read " + this.a);
                try {
                    inputStream = (InputStream) this.m.r(uri, new fbq(0));
                    try {
                        jll a = this.l.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        b.close();
                        return a;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw exf.r(this.m, uri, e, this.a);
            }
        } catch (FileNotFoundException unused) {
            iyi iyiVar = this.m;
            if (!iyiVar.u(uri)) {
                return this.l.a;
            }
            inputStream = (InputStream) iyiVar.r(uri, new fbq(0));
            try {
                jll a2 = this.l.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return a2;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
        }
    }

    @Override // defpackage.fcv
    public final String d() {
        return this.a;
    }

    public final hvi f(hvi hviVar) {
        hvi b;
        fcf fcfVar = this.k;
        Integer num = (Integer) ((haf) fcfVar.f).a;
        if (num.intValue() < 0) {
            b = hve.a;
        } else {
            hvi hviVar2 = this.b;
            htr htrVar = fcfVar.c;
            huf hufVar = huf.a;
            hvi g = hti.g(hviVar2, htrVar, hufVar);
            b = hnu.aY(hviVar2, g).b(new fca(fcfVar, hviVar2, g, num, 0), hufVar);
        }
        return hti.g(b, gvx.c(new egl(this, hviVar, 7)), huf.a);
    }

    @Override // defpackage.fcv
    public final hvi g(htr htrVar, Executor executor) {
        return this.h.a(gvx.b(new cap(this, htrVar, executor, 7)), this.c);
    }

    @Override // defpackage.fcv
    public final hvi h() {
        synchronized (this.g) {
            Object obj = this.i;
            if (obj == null) {
                return hnu.aK(this.n.a(gvx.b(new cbc(this, 11)), this.c));
            }
            return hnu.aJ(obj);
        }
    }

    public final Object i(Uri uri) {
        Closeable j;
        synchronized (this.g) {
            Object obj = this.i;
            if (obj != null) {
                return obj;
            }
            try {
                j = j(uri);
            } catch (FileNotFoundException unused) {
                Object c = c(uri);
                synchronized (this.g) {
                    if (this.j) {
                        c = null;
                    } else {
                        this.i = c;
                    }
                    if (c != null) {
                        return c;
                    }
                    j = j(uri);
                }
            }
            try {
                Object c2 = c(uri);
                synchronized (this.g) {
                    if (j != null) {
                        this.i = c2;
                        j.close();
                    }
                }
                return c2;
            } catch (Throwable th) {
                if (j != null) {
                    try {
                        j.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }
}
