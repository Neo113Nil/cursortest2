package a0;

import A.T;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final X.b f1283a;

    /* renamed from: b, reason: collision with root package name */
    public final T f1284b;

    public l(X.b bVar, T t2) {
        Q0.h.e(t2, "_windowInsetsCompat");
        this.f1283a = bVar;
        this.f1284b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Q0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return Q0.h.a(this.f1283a, lVar.f1283a) && Q0.h.a(this.f1284b, lVar.f1284b);
    }

    public final int hashCode() {
        return this.f1284b.hashCode() + (this.f1283a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1283a + ", windowInsetsCompat=" + this.f1284b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, T t2) {
        this(new X.b(rect), t2);
        Q0.h.e(t2, "insets");
    }
}
