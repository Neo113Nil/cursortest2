package a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c0 f13a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14b;

    public d0(androidx.fragment.app.c0 c0Var, androidx.lifecycle.r rVar) {
        f3.d.e(c0Var, "callback");
        this.f13a = c0Var;
        this.f14b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return f3.d.a(this.f13a, d0Var.f13a) && this.f14b.equals(d0Var.f14b);
    }

    public final int hashCode() {
        return this.f14b.hashCode() + (this.f13a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f13a + ", owner=" + this.f14b + ')';
    }
}
