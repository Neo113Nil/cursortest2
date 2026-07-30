package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qj implements pn2 {
    public final /* synthetic */ int m = 1;
    public final Object n;
    public final Object o;

    public qj(InputStream inputStream, rx2 rx2Var) {
        inputStream.getClass();
        this.n = inputStream;
        this.o = rx2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                jn2 jn2Var = (jn2) obj;
                qj qjVar = (qj) this.o;
                jn2Var.h();
                try {
                    qjVar.close();
                    Unit unit = Unit.a;
                    if (jn2Var.i()) {
                        throw jn2Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!jn2Var.i()) {
                        throw e;
                    }
                    throw jn2Var.k(e);
                } finally {
                    jn2Var.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        switch (this.m) {
            case 0:
                return (jn2) this.n;
            default:
                return (rx2) this.o;
        }
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        int i = this.m;
        Object obj = this.n;
        Object obj2 = this.o;
        fqVar.getClass();
        switch (i) {
            case 0:
                jn2 jn2Var = (jn2) obj;
                qj qjVar = (qj) obj2;
                jn2Var.h();
                try {
                    long h = qjVar.h(j, fqVar);
                    if (jn2Var.i()) {
                        throw jn2Var.k(null);
                    }
                    return h;
                } catch (IOException e) {
                    if (jn2Var.i()) {
                        throw jn2Var.k(e);
                    }
                    throw e;
                } finally {
                    jn2Var.i();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    lh.c(q40.i(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((rx2) obj2).f();
                    ug2 B = fqVar.B(1);
                    int read = ((InputStream) obj).read(B.a, B.c, (int) Math.min(j, 8192 - B.c));
                    if (read == -1) {
                        if (B.b == B.c) {
                            fqVar.m = B.a();
                            xg2.a(B);
                        }
                        return -1L;
                    }
                    B.c += read;
                    long j2 = read;
                    fqVar.n += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (o70.B(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.m) {
            case 0:
                return "AsyncTimeout.source(" + ((qj) this.o) + ')';
            default:
                return "source(" + ((InputStream) this.n) + ')';
        }
    }

    public qj(jn2 jn2Var, qj qjVar) {
        this.n = jn2Var;
        this.o = qjVar;
    }
}
