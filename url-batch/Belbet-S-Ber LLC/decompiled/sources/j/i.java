package j;

import l.a3;
import n0.u0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2120o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2121p;

    /* renamed from: q, reason: collision with root package name */
    public int f2122q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2123r;

    public i(j jVar) {
        this.f2120o = 0;
        this.f2123r = jVar;
        this.f2121p = false;
        this.f2122q = 0;
    }

    @Override // n0.u0
    public final void b() {
        switch (this.f2120o) {
            case 0:
                int i = this.f2122q + 1;
                this.f2122q = i;
                j jVar = (j) this.f2123r;
                if (i == jVar.f2124a.size()) {
                    u0 u0Var = jVar.d;
                    if (u0Var != null) {
                        u0Var.b();
                    }
                    this.f2122q = 0;
                    this.f2121p = false;
                    jVar.f2127e = false;
                    break;
                }
                break;
            default:
                if (!this.f2121p) {
                    ((a3) this.f2123r).f2391a.setVisibility(this.f2122q);
                    break;
                }
                break;
        }
    }

    @Override // b4.d, n0.u0
    public void c() {
        switch (this.f2120o) {
            case 1:
                this.f2121p = true;
                break;
        }
    }

    @Override // b4.d, n0.u0
    public final void g() {
        switch (this.f2120o) {
            case 0:
                if (!this.f2121p) {
                    this.f2121p = true;
                    u0 u0Var = ((j) this.f2123r).d;
                    if (u0Var != null) {
                        u0Var.g();
                        break;
                    }
                }
                break;
            default:
                ((a3) this.f2123r).f2391a.setVisibility(0);
                break;
        }
    }

    public i(a3 a3Var, int i) {
        this.f2120o = 1;
        this.f2123r = a3Var;
        this.f2122q = i;
        this.f2121p = false;
    }
}
