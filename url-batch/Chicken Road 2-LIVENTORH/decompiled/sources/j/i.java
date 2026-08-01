package j;

import l.d3;
import n0.q0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1877k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1878l;

    /* renamed from: m, reason: collision with root package name */
    public int f1879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1880n;

    public i(j jVar) {
        this.f1877k = 0;
        this.f1880n = jVar;
        this.f1878l = false;
        this.f1879m = 0;
    }

    @Override // n0.q0
    public final void a() {
        switch (this.f1877k) {
            case 0:
                int i = this.f1879m + 1;
                this.f1879m = i;
                j jVar = (j) this.f1880n;
                if (i == jVar.f1881a.size()) {
                    q0 q0Var = jVar.d;
                    if (q0Var != null) {
                        q0Var.a();
                    }
                    this.f1879m = 0;
                    this.f1878l = false;
                    jVar.f1884e = false;
                    break;
                }
                break;
            default:
                if (!this.f1878l) {
                    ((d3) this.f1880n).f2269a.setVisibility(this.f1879m);
                    break;
                }
                break;
        }
    }

    @Override // h.a, n0.q0
    public void b() {
        switch (this.f1877k) {
            case 1:
                this.f1878l = true;
                break;
        }
    }

    @Override // h.a, n0.q0
    public final void c() {
        switch (this.f1877k) {
            case 0:
                if (!this.f1878l) {
                    this.f1878l = true;
                    q0 q0Var = ((j) this.f1880n).d;
                    if (q0Var != null) {
                        q0Var.c();
                        break;
                    }
                }
                break;
            default:
                ((d3) this.f1880n).f2269a.setVisibility(0);
                break;
        }
    }

    public i(d3 d3Var, int i) {
        this.f1877k = 1;
        this.f1880n = d3Var;
        this.f1879m = i;
        this.f1878l = false;
    }
}
