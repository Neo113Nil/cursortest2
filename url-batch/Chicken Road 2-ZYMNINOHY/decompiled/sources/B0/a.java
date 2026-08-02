package B0;

import T.r;
import W.u;
import y0.C1568A;
import y0.k;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189a;

    /* renamed from: b, reason: collision with root package name */
    public final u f190b;

    /* renamed from: c, reason: collision with root package name */
    public final C1568A f191c;

    public a(int i4) {
        this.f189a = i4;
        switch (i4) {
            case 1:
                this.f190b = new u(4);
                this.f191c = new C1568A(-1, -1, "image/webp");
                break;
            default:
                this.f190b = new u(4);
                this.f191c = new C1568A(-1, -1, "image/avif");
                break;
        }
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        switch (this.f189a) {
            case 0:
                this.f191c.a(j4, j5);
                break;
            default:
                this.f191c.a(j4, j5);
                break;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        switch (this.f189a) {
            case 0:
                k kVar = (k) oVar;
                kVar.a(4, false);
                u uVar = this.f190b;
                uVar.J(4);
                kVar.l(uVar.f3351a, 0, 4, false);
                if (uVar.B() == 1718909296) {
                    uVar.J(4);
                    kVar.l(uVar.f3351a, 0, 4, false);
                    if (uVar.B() == 1635150182) {
                    }
                }
                break;
            default:
                u uVar2 = this.f190b;
                uVar2.J(4);
                k kVar2 = (k) oVar;
                kVar2.l(uVar2.f3351a, 0, 4, false);
                if (uVar2.B() == 1380533830) {
                    kVar2.a(4, false);
                    uVar2.J(4);
                    kVar2.l(uVar2.f3351a, 0, 4, false);
                    if (uVar2.B() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // y0.n
    public final int c(o oVar, r rVar) {
        switch (this.f189a) {
        }
        return this.f191c.c(oVar, rVar);
    }

    @Override // y0.n
    public final void e(p pVar) {
        switch (this.f189a) {
            case 0:
                this.f191c.e(pVar);
                break;
            default:
                this.f191c.e(pVar);
                break;
        }
    }

    @Override // y0.n
    public final void release() {
        int i4 = this.f189a;
    }

    private final void f() {
    }

    private final void g() {
    }
}
