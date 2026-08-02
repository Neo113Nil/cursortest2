package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcr implements fcv {
    public final hvi a;
    public final Executor b;
    public final gzp c;
    public final iyi f;
    private final String g;
    private final gth h;
    private final fcz j;
    public final Object d = new Object();
    private final hum i = new hum();
    public hvi e = null;

    public fcr(String str, hvi hviVar, fcz fczVar, Executor executor, iyi iyiVar, gzp gzpVar, gth gthVar) {
        this.g = str;
        this.a = hnu.aK(hviVar);
        this.j = fczVar;
        this.b = new hvv(executor);
        this.f = iyiVar;
        this.c = gzpVar;
        this.h = gthVar;
    }

    private final hvi e() {
        hvi hviVar;
        synchronized (this.d) {
            hvi hviVar2 = this.e;
            if (hviVar2 != null && hviVar2.isDone()) {
                try {
                    hnu.aR(this.e);
                } catch (ExecutionException unused) {
                    this.e = null;
                }
            }
            hviVar = this.e;
            if (hviVar == null) {
                hviVar = hnu.aK(this.i.a(gvx.b(new cbc(this, 13)), this.b));
                this.e = hviVar;
            }
        }
        return hviVar;
    }

    @Override // defpackage.fcv
    public final htq a() {
        return new cbc(this, 12);
    }

    public final Object b(Uri uri) {
        try {
            try {
                gty b = this.h.b("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.f.r(uri, new fbq(0));
                    try {
                        jll a = this.j.a(inputStream);
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
                throw exf.r(this.f, uri, e, this.g);
            }
        } catch (FileNotFoundException e2) {
            if (this.f.u(uri)) {
                throw e2;
            }
            return this.j.a;
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri l = exf.l(uri, ".tmp");
        try {
            gty b = this.h.b("Write " + this.g);
            try {
                fem femVar = new fem();
                try {
                    iyi iyiVar = this.f;
                    fbr fbrVar = new fbr();
                    fbrVar.a = new fem[]{femVar};
                    OutputStream outputStream = (OutputStream) iyiVar.r(l, fbrVar);
                    try {
                        ((jll) obj).e(outputStream);
                        femVar.a();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        b.close();
                        this.f.t(l, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw exf.r(this.f, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            iyi iyiVar2 = this.f;
            if (iyiVar2.u(l)) {
                try {
                    iyiVar2.s(l);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.fcv
    public final String d() {
        return this.g;
    }

    @Override // defpackage.fcv
    public final hvi g(htr htrVar, Executor executor) {
        return this.i.a(gvx.b(new fca(this, e(), htrVar, executor, 2)), huf.a);
    }

    @Override // defpackage.fcv
    public final hvi h() {
        return e();
    }
}
