package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0004d f408a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f409b;

    public f0(View view, C0004d c0004d) {
        x0 x0Var;
        this.f408a = c0004d;
        WeakHashMap weakHashMap = T.f381a;
        x0 a2 = I.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            x0Var = (i >= 30 ? new o0(a2) : i >= 29 ? new n0(a2) : new m0(a2)).b();
        } else {
            x0Var = null;
        }
        this.f409b = x0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v0 v0Var;
        if (!view.isLaidOut()) {
            this.f409b = x0.g(view, windowInsets);
            return g0.i(view, windowInsets);
        }
        x0 g2 = x0.g(view, windowInsets);
        if (this.f409b == null) {
            WeakHashMap weakHashMap = T.f381a;
            this.f409b = I.a(view);
        }
        if (this.f409b == null) {
            this.f409b = g2;
            return g0.i(view, windowInsets);
        }
        C0004d j2 = g0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f396b, windowInsets)) {
            return g0.i(view, windowInsets);
        }
        x0 x0Var = this.f409b;
        int i = 1;
        int i2 = 0;
        while (true) {
            v0Var = g2.f468a;
            if (i > 256) {
                break;
            }
            if (!v0Var.f(i).equals(x0Var.f468a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return g0.i(view, windowInsets);
        }
        x0 x0Var2 = this.f409b;
        k0 k0Var = new k0(i2, (i2 & 8) != 0 ? v0Var.f(8).d > x0Var2.f468a.f(8).d ? g0.f411e : g0.f412f : g0.f413g, 160L);
        k0Var.f428a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(k0Var.f428a.a());
        C.d f2 = v0Var.f(i2);
        C.d f3 = x0Var2.f468a.f(i2);
        int min = Math.min(f2.f148a, f3.f148a);
        int i3 = f2.f149b;
        int i4 = f3.f149b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f150c;
        int i6 = f3.f150c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        B.j jVar = new B.j(C.d.b(min, min2, min3, Math.min(i7, i9)), 3, C.d.b(Math.max(f2.f148a, f3.f148a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        g0.f(view, windowInsets, false);
        duration.addUpdateListener(new d0(k0Var, g2, x0Var2, i8, view));
        duration.addListener(new e0(k0Var, view));
        ViewTreeObserverOnPreDrawListenerC0020u.a(view, new H.n(view, k0Var, jVar, duration));
        this.f409b = g2;
        return g0.i(view, windowInsets);
    }
}
