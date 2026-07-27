package a1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: a1.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383T {

    /* renamed from: b, reason: collision with root package name */
    public static final C0383T f4870b;

    /* renamed from: a, reason: collision with root package name */
    public final C0380P f4871a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4870b = C0379O.f4867q;
        } else {
            f4870b = C0380P.f4868b;
        }
    }

    public C0383T(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f4871a = new C0379O(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f4871a = new C0378N(this, windowInsets);
        } else if (i2 >= 28) {
            this.f4871a = new C0377M(this, windowInsets);
        } else {
            this.f4871a = new C0376L(this, windowInsets);
        }
    }

    public static C0383T b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0383T c0383t = new C0383T(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = AbstractC0404s.f4892a;
            C0383T a4 = AbstractC0398m.a(view);
            C0380P c0380p = c0383t.f4871a;
            c0380p.q(a4);
            c0380p.d(view.getRootView());
        }
        return c0383t;
    }

    public final WindowInsets a() {
        C0380P c0380p = this.f4871a;
        if (c0380p instanceof AbstractC0375K) {
            return ((AbstractC0375K) c0380p).f4858c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383T)) {
            return false;
        }
        return Objects.equals(this.f4871a, ((C0383T) obj).f4871a);
    }

    public final int hashCode() {
        C0380P c0380p = this.f4871a;
        if (c0380p == null) {
            return 0;
        }
        return c0380p.hashCode();
    }

    public C0383T() {
        this.f4871a = new C0380P(this);
    }
}
