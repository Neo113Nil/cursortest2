package F0;

import T.r;
import U.i;
import y0.C1568A;
import y0.k;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f754b;

    public b(int i4) {
        boolean z = (i4 & 1) != 0;
        this.f754b = z;
        if (z) {
            this.f753a = new C1568A(-1, -1, "image/heif");
        } else {
            this.f753a = new a();
        }
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f753a.a(j4, j5);
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        return this.f754b ? i.B((k) oVar, false) : this.f753a.b(oVar);
    }

    @Override // y0.n
    public final int c(o oVar, r rVar) {
        return this.f753a.c(oVar, rVar);
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f753a.e(pVar);
    }

    @Override // y0.n
    public final void release() {
        this.f753a.release();
    }
}
