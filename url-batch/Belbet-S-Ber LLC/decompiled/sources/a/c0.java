package a;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7b;

    /* renamed from: c, reason: collision with root package name */
    public a0.k f8c;
    public final androidx.fragment.app.c0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9e;

    public c0(androidx.fragment.app.c0 c0Var, d0 d0Var) {
        i3.d.e(c0Var, "onBackPressedCallback");
        boolean z4 = c0Var.f526b;
        this.f6a = d0Var;
        this.f7b = z4;
        this.d = c0Var;
        this.f9e = true;
    }

    public final void a() {
        a0.k kVar = this.f8c;
        if (kVar == null || !((LinkedHashSet) kVar.h).remove(this)) {
            return;
        }
        d1.e eVar = (d1.e) kVar.f98g;
        eVar.getClass();
        if (equals(eVar.f1291f)) {
            if (eVar.f1292g == -1) {
                this.d.getClass();
            }
            eVar.f1291f = null;
            eVar.f1292g = 0;
            eVar.h = null;
        }
        eVar.d.remove(this);
        eVar.f1290e.remove(this);
        this.f8c = null;
        eVar.b();
    }

    public final void b(boolean z4) {
        d1.e eVar;
        this.f9e = z4;
        boolean z5 = z4 && this.d.f526b;
        if (this.f7b == z5) {
            return;
        }
        this.f7b = z5;
        a0.k kVar = this.f8c;
        if (kVar == null || (eVar = (d1.e) kVar.f98g) == null) {
            return;
        }
        eVar.b();
    }
}
