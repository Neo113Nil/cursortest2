package y0;

import E.AbstractC0005f;
import T.C0096n;
import a.AbstractC0124a;

/* renamed from: y0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568A implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f16075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16077c;

    /* renamed from: d, reason: collision with root package name */
    public int f16078d;

    /* renamed from: e, reason: collision with root package name */
    public int f16079e;

    /* renamed from: f, reason: collision with root package name */
    public p f16080f;

    /* renamed from: g, reason: collision with root package name */
    public F f16081g;

    public C1568A(int i4, int i5, String str) {
        this.f16075a = i4;
        this.f16076b = i5;
        this.f16077c = str;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        if (j4 == 0 || this.f16079e == 1) {
            this.f16079e = 1;
            this.f16078d = 0;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        int i4 = this.f16076b;
        int i5 = this.f16075a;
        AbstractC0124a.t((i5 == -1 || i4 == -1) ? false : true);
        W.u uVar = new W.u(i4);
        ((k) oVar).l(uVar.f3351a, 0, i4, false);
        return uVar.G() == i5;
    }

    @Override // y0.n
    public final int c(o oVar, T.r rVar) {
        int i4 = this.f16079e;
        if (i4 != 1) {
            if (i4 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        F f4 = this.f16081g;
        f4.getClass();
        int g4 = f4.g(oVar, 1024, true);
        if (g4 != -1) {
            this.f16078d += g4;
            return 0;
        }
        this.f16079e = 2;
        this.f16081g.e(0L, 1, this.f16078d, 0, null);
        this.f16078d = 0;
        return 0;
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f16080f = pVar;
        F z = pVar.z(1024, 4);
        this.f16081g = z;
        C0096n c0096n = new C0096n();
        String str = this.f16077c;
        c0096n.f2830l = T.F.n(str);
        c0096n.f2831m = T.F.n(str);
        AbstractC0005f.w(c0096n, z);
        this.f16080f.r();
        this.f16080f.x(new B());
        this.f16079e = 1;
    }

    @Override // y0.n
    public final void release() {
    }
}
