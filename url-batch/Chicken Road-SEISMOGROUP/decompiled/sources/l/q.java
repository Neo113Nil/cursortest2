package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final o f977a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = n.f974q;
        } else {
            int i3 = o.f975b;
        }
    }

    public q(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f977a = new n(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f977a = new m(this, windowInsets);
        } else if (i2 >= 28) {
            this.f977a = new k(this, windowInsets);
        } else {
            this.f977a = new j(this, windowInsets);
        }
    }

    public static q a(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        q qVar = new q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = d.f953a;
            q a2 = c.a(view);
            o oVar = qVar.f977a;
            oVar.o(a2);
            oVar.d(view.getRootView());
        }
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return Objects.equals(this.f977a, ((q) obj).f977a);
    }

    public final int hashCode() {
        o oVar = this.f977a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public q() {
        this.f977a = new o(this);
    }
}
