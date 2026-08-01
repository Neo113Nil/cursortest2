package u;

import android.graphics.Rect;
import l.q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f1288a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1289b;

    public l(r.b bVar, q qVar) {
        e0.h.e(qVar, "_windowInsetsCompat");
        this.f1288a = bVar;
        this.f1289b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return e0.h.a(this.f1288a, lVar.f1288a) && e0.h.a(this.f1289b, lVar.f1289b);
    }

    public final int hashCode() {
        return this.f1289b.hashCode() + (this.f1288a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1288a + ", windowInsetsCompat=" + this.f1289b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, q qVar) {
        this(new r.b(rect), qVar);
        e0.h.e(qVar, "insets");
    }
}
