package A0;

import I.v0;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import x0.C0995b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0995b f81a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f82b;

    public m(C0995b _bounds, v0 _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.f81a = _bounds;
        this.f82b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        return Intrinsics.a(this.f81a, mVar.f81a) && Intrinsics.a(this.f82b, mVar.f82b);
    }

    public final int hashCode() {
        return this.f82b.hashCode() + (this.f81a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f81a + ", windowInsetsCompat=" + this.f82b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Rect bounds, v0 insets) {
        this(new C0995b(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
