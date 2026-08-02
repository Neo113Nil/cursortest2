package y1;

import E.e0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final v1.b f16256a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f16257b;

    public l(v1.b bVar, e0 _windowInsetsCompat) {
        kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f16256a = bVar;
        this.f16257b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f16256a, lVar.f16256a) && kotlin.jvm.internal.i.a(this.f16257b, lVar.f16257b);
    }

    public final int hashCode() {
        return this.f16257b.hashCode() + (this.f16256a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f16256a + ", windowInsetsCompat=" + this.f16257b + ')';
    }
}
