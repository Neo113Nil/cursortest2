package U;

import android.graphics.Rect;
import w.S;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1022a;

    /* renamed from: b, reason: collision with root package name */
    public final S f1023b;

    public l(R.b bVar, S s2) {
        F0.i.e(s2, "_windowInsetsCompat");
        this.f1022a = bVar;
        this.f1023b = s2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        F0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return F0.i.a(this.f1022a, lVar.f1022a) && F0.i.a(this.f1023b, lVar.f1023b);
    }

    public final int hashCode() {
        return this.f1023b.hashCode() + (this.f1022a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1022a + ", windowInsetsCompat=" + this.f1023b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, S s2) {
        this(new R.b(rect), s2);
        F0.i.e(s2, "insets");
    }
}
