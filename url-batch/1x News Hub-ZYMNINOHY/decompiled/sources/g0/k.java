package g0;

import E.W;
import d0.C0295b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0295b f5033a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5034b;

    public k(C0295b c0295b, W _windowInsetsCompat) {
        kotlin.jvm.internal.j.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f5033a = c0295b;
        this.f5034b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return kotlin.jvm.internal.j.a(this.f5033a, kVar.f5033a) && kotlin.jvm.internal.j.a(this.f5034b, kVar.f5034b);
    }

    public final int hashCode() {
        return this.f5034b.hashCode() + (this.f5033a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f5033a + ", windowInsetsCompat=" + this.f5034b + ')';
    }
}
