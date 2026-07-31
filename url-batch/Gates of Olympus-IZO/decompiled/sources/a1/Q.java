package a1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f3541b;

    /* renamed from: a, reason: collision with root package name */
    public final O f3542a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3541b = N.f3538q;
        } else {
            f3541b = O.f3539b;
        }
    }

    public Q(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f3542a = new N(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f3542a = new M(this, windowInsets);
        } else if (i3 >= 28) {
            this.f3542a = new L(this, windowInsets);
        } else {
            this.f3542a = new K(this, windowInsets);
        }
    }

    public static Q b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        Q q2 = new Q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i3 = AbstractC0179q.f3561a;
            Q a3 = AbstractC0173k.a(view);
            O o3 = q2.f3542a;
            o3.q(a3);
            o3.d(view.getRootView());
        }
        return q2;
    }

    public final WindowInsets a() {
        O o3 = this.f3542a;
        if (o3 instanceof J) {
            return ((J) o3).f3530c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        return Objects.equals(this.f3542a, ((Q) obj).f3542a);
    }

    public final int hashCode() {
        O o3 = this.f3542a;
        if (o3 == null) {
            return 0;
        }
        return o3.hashCode();
    }

    public Q() {
        this.f3542a = new O(this);
    }
}
