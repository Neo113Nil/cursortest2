package c1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    public static final U f5588b;

    /* renamed from: a, reason: collision with root package name */
    public final Q f5589a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5588b = P.f5585q;
        } else {
            f5588b = Q.f5586b;
        }
    }

    public U(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f5589a = new P(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f5589a = new O(this, windowInsets);
        } else if (i3 >= 28) {
            this.f5589a = new N(this, windowInsets);
        } else {
            this.f5589a = new M(this, windowInsets);
        }
    }

    public static U b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        U u3 = new U(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i3 = AbstractC0394s.f5610a;
            U a3 = AbstractC0389m.a(view);
            Q q3 = u3.f5589a;
            q3.q(a3);
            q3.d(view.getRootView());
        }
        return u3;
    }

    public final WindowInsets a() {
        Q q3 = this.f5589a;
        if (q3 instanceof L) {
            return ((L) q3).f5576c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        return Objects.equals(this.f5589a, ((U) obj).f5589a);
    }

    public final int hashCode() {
        Q q3 = this.f5589a;
        if (q3 == null) {
            return 0;
        }
        return q3.hashCode();
    }

    public U() {
        this.f5589a = new Q(this);
    }
}
