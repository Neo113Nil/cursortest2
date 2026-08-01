package a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c0 f12a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13b;

    public d0(androidx.fragment.app.c0 c0Var, androidx.lifecycle.r rVar) {
        i3.d.e(c0Var, "callback");
        this.f12a = c0Var;
        this.f13b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return i3.d.a(this.f12a, d0Var.f12a) && this.f13b.equals(d0Var.f13b);
    }

    public final int hashCode() {
        return this.f13b.hashCode() + (this.f12a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f12a + ", owner=" + this.f13b + ')';
    }
}
