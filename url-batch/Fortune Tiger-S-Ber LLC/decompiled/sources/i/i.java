package i;

import k.z2;
import k0.m0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2071k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2072l;

    /* renamed from: m, reason: collision with root package name */
    public int f2073m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2074n;

    public i(j jVar) {
        this.f2071k = 0;
        this.f2074n = jVar;
        this.f2072l = false;
        this.f2073m = 0;
    }

    @Override // k0.m0
    public final void b() {
        switch (this.f2071k) {
            case 0:
                int i4 = this.f2073m + 1;
                this.f2073m = i4;
                j jVar = (j) this.f2074n;
                if (i4 == jVar.f2075a.size()) {
                    m0 m0Var = jVar.f2077d;
                    if (m0Var != null) {
                        m0Var.b();
                    }
                    this.f2073m = 0;
                    this.f2072l = false;
                    jVar.f2078e = false;
                    break;
                }
                break;
            default:
                if (!this.f2072l) {
                    ((z2) this.f2074n).f2699a.setVisibility(this.f2073m);
                    break;
                }
                break;
        }
    }

    @Override // k3.m, k0.m0
    public void c() {
        switch (this.f2071k) {
            case 1:
                this.f2072l = true;
                break;
        }
    }

    @Override // k3.m, k0.m0
    public final void g() {
        switch (this.f2071k) {
            case 0:
                if (!this.f2072l) {
                    this.f2072l = true;
                    m0 m0Var = ((j) this.f2074n).f2077d;
                    if (m0Var != null) {
                        m0Var.g();
                        break;
                    }
                }
                break;
            default:
                ((z2) this.f2074n).f2699a.setVisibility(0);
                break;
        }
    }

    public i(z2 z2Var, int i4) {
        this.f2071k = 1;
        this.f2074n = z2Var;
        this.f2073m = i4;
        this.f2072l = false;
    }
}
