package F0;

import E.AbstractC0005f;
import G0.c;
import S0.s;
import T.C0096n;
import T.E;
import T.r;
import U.i;
import V0.j;
import W.u;
import y0.F;
import y0.k;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public p f744b;

    /* renamed from: c, reason: collision with root package name */
    public o f745c;

    /* renamed from: d, reason: collision with root package name */
    public c f746d;

    /* renamed from: e, reason: collision with root package name */
    public s f747e;

    /* renamed from: g, reason: collision with root package name */
    public int f749g;

    /* renamed from: h, reason: collision with root package name */
    public long f750h;

    /* renamed from: i, reason: collision with root package name */
    public int f751i;

    /* renamed from: a, reason: collision with root package name */
    public final u f743a = new u(16);

    /* renamed from: j, reason: collision with root package name */
    public long f752j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f748f = 0;

    @Override // y0.n
    public final void a(long j4, long j5) {
        if (j4 != 0) {
            if (this.f748f == 3) {
                s sVar = this.f747e;
                sVar.getClass();
                sVar.a(j4, j5);
                return;
            }
            return;
        }
        this.f748f = 0;
        this.f751i = 0;
        this.f752j = -1L;
        if (this.f747e != null) {
            this.f747e = null;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        return i.B((k) oVar, true);
    }

    @Override // y0.n
    public final int c(o oVar, r rVar) {
        while (true) {
            int i4 = this.f748f;
            if (i4 == 0) {
                int i5 = this.f751i;
                u uVar = this.f743a;
                if (i5 == 0) {
                    if (!oVar.d(uVar.f3351a, 0, 8, true)) {
                        p pVar = this.f744b;
                        pVar.getClass();
                        pVar.r();
                        this.f744b.x(new A0.b(-9223372036854775807L));
                        this.f748f = 4;
                        return -1;
                    }
                    this.f751i = 8;
                    uVar.M(0);
                    this.f750h = uVar.B();
                    this.f749g = uVar.m();
                }
                if (this.f750h == 1) {
                    oVar.readFully(uVar.f3351a, 8, 8);
                    this.f751i += 8;
                    this.f750h = uVar.F();
                }
                if (this.f749g == 1836086884) {
                    long position = oVar.getPosition();
                    this.f752j = position;
                    long j4 = this.f751i;
                    H0.b bVar = new H0.b(0L, position - j4, -9223372036854775807L, position, this.f750h - j4);
                    p pVar2 = this.f744b;
                    pVar2.getClass();
                    F z = pVar2.z(1024, 4);
                    C0096n c0096n = new C0096n();
                    c0096n.f2830l = T.F.n("image/heic");
                    c0096n.f2829k = new E(bVar);
                    AbstractC0005f.w(c0096n, z);
                    this.f748f = 2;
                } else {
                    this.f748f = 1;
                }
            } else if (i4 == 1) {
                oVar.v((int) (this.f750h - this.f751i));
                this.f751i = 0;
                this.f748f = 0;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f746d == null || oVar != this.f745c) {
                        this.f745c = oVar;
                        this.f746d = new c(oVar, this.f752j);
                    }
                    s sVar = this.f747e;
                    sVar.getClass();
                    int c4 = sVar.c(this.f746d, rVar);
                    if (c4 == 1) {
                        rVar.f2881a += this.f752j;
                    }
                    return c4;
                }
                if (this.f747e == null) {
                    this.f747e = new s(j.f3206v0, 8);
                }
                c cVar = new c(oVar, this.f752j);
                this.f746d = cVar;
                if (this.f747e.b(cVar)) {
                    s sVar2 = this.f747e;
                    long j5 = this.f752j;
                    p pVar3 = this.f744b;
                    pVar3.getClass();
                    sVar2.e(new c(j5, pVar3, 6));
                    this.f748f = 3;
                } else {
                    p pVar4 = this.f744b;
                    pVar4.getClass();
                    pVar4.r();
                    this.f744b.x(new A0.b(-9223372036854775807L));
                    this.f748f = 4;
                }
            }
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f744b = pVar;
    }

    @Override // y0.n
    public final void release() {
        s sVar = this.f747e;
        if (sVar != null) {
            sVar.getClass();
            this.f747e = null;
        }
    }
}
