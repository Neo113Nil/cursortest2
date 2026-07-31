package f0;

import D.Y;
import c0.C0269b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0269b f4194a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f4195b;

    public k(C0269b c0269b, Y _windowInsetsCompat) {
        kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f4194a = c0269b;
        this.f4195b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return kotlin.jvm.internal.i.a(this.f4194a, kVar.f4194a) && kotlin.jvm.internal.i.a(this.f4195b, kVar.f4195b);
    }

    public final int hashCode() {
        return this.f4195b.hashCode() + (this.f4194a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f4194a + ", windowInsetsCompat=" + this.f4195b + ')';
    }
}
