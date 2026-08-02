package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bea implements bcw, bcv {
    public final bcx a;
    public final bcv b;
    public volatile Object c;
    public volatile bcu d;
    private volatile int e;
    private volatile bct f;
    private volatile bvw g;

    public bea(bcx bcxVar, bcv bcvVar) {
        this.a = bcxVar;
        this.b = bcvVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcw
    public final void a() {
        bvw bvwVar = this.g;
        if (bvwVar != null) {
            bvwVar.b.bo();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcv
    public final void b(bbh bbhVar, Exception exc, bbu bbuVar, int i) {
        this.b.b(bbhVar, exc, bbuVar, this.g.b.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [bbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [bbh, java.lang.Object] */
    @Override // defpackage.bcw
    public final boolean c() {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                double d = bmd.a;
                SystemClock.elapsedRealtimeNanos();
                try {
                    bcx bcxVar = this.a;
                    bbw a = bcxVar.c.a().a(obj);
                    Object a2 = a.a();
                    bax f = bcxVar.c.a().d.f(a2.getClass());
                    if (f == null) {
                        throw new bab(a2.getClass());
                    }
                    bvw bvwVar = new bvw(f, a2, bcxVar.h);
                    bcu bcuVar = new bcu(this.g.c, bcxVar.m);
                    bes c = bcxVar.c();
                    c.c(bcuVar, bvwVar);
                    if (c.a(bcuVar) == null) {
                        try {
                            this.b.d(this.g.c, a.a(), this.g.b, this.g.b.g(), this.g.c);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.g.b.d();
                            }
                            throw th;
                        }
                    }
                    this.d = bcuVar;
                    this.f = new bct(Collections.singletonList(this.g.c), bcxVar, this);
                    this.g.b.d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2) {
            int i = this.e;
            bcx bcxVar2 = this.a;
            if (i >= bcxVar2.e().size()) {
                break;
            }
            List e = bcxVar2.e();
            int i2 = this.e;
            this.e = i2 + 1;
            this.g = (bvw) e.get(i2);
            if (this.g != null && (bcxVar2.o.c(this.g.b.g()) || bcxVar2.g(this.g.b.a()))) {
                this.g.b.f(bcxVar2.n, new bdz(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcv
    public final void d(bbh bbhVar, Object obj, bbu bbuVar, int i, bbh bbhVar2) {
        this.b.d(bbhVar, obj, bbuVar, this.g.b.g(), bbhVar);
    }

    final boolean e(bvw bvwVar) {
        bvw bvwVar2 = this.g;
        return bvwVar2 != null && bvwVar2 == bvwVar;
    }
}
