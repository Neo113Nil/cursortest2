package a;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f7a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8b;

    /* renamed from: c, reason: collision with root package name */
    public a0.j f9c;
    public final androidx.fragment.app.c0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10e;

    public c0(androidx.fragment.app.c0 c0Var, d0 d0Var) {
        f3.d.e(c0Var, "onBackPressedCallback");
        boolean z3 = c0Var.f412b;
        this.f7a = d0Var;
        this.f8b = z3;
        this.d = c0Var;
        this.f10e = true;
    }

    public final void a() {
        a0.j jVar = this.f9c;
        if (jVar == null || !((LinkedHashSet) jVar.f102h).remove(this)) {
            return;
        }
        c1.e eVar = (c1.e) jVar.f101g;
        eVar.getClass();
        if (equals(eVar.f769f)) {
            if (eVar.f770g == -1) {
                this.d.getClass();
            }
            eVar.f769f = null;
            eVar.f770g = 0;
            eVar.f771h = null;
        }
        eVar.d.remove(this);
        eVar.f768e.remove(this);
        this.f9c = null;
        eVar.b();
    }

    public final void b(boolean z3) {
        c1.e eVar;
        this.f10e = z3;
        boolean z4 = z3 && this.d.f412b;
        if (this.f8b == z4) {
            return;
        }
        this.f8b = z4;
        a0.j jVar = this.f9c;
        if (jVar == null || (eVar = (c1.e) jVar.f101g) == null) {
            return;
        }
        eVar.b();
    }
}
