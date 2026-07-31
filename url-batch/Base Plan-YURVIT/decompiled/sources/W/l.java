package W;

import y.Q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final T.b f900a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f901b;

    public l(T.b bVar, Q q2) {
        P0.h.e(q2, "_windowInsetsCompat");
        this.f900a = bVar;
        this.f901b = q2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        P0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return P0.h.a(this.f900a, lVar.f900a) && P0.h.a(this.f901b, lVar.f901b);
    }

    public final int hashCode() {
        return this.f901b.hashCode() + (this.f900a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f900a + ", windowInsetsCompat=" + this.f901b + ')';
    }
}
