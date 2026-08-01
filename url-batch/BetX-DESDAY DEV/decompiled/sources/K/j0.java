package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0006d f458a;

    /* renamed from: b, reason: collision with root package name */
    public B0 f459b;

    public j0(View view, C0006d c0006d) {
        B0 b02;
        this.f458a = c0006d;
        WeakHashMap weakHashMap = X.f419a;
        B0 a2 = M.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            b02 = (i >= 30 ? new s0(a2) : i >= 29 ? new r0(a2) : new q0(a2)).b();
        } else {
            b02 = null;
        }
        this.f459b = b02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 z0Var;
        if (!view.isLaidOut()) {
            this.f459b = B0.g(view, windowInsets);
            return k0.i(view, windowInsets);
        }
        B0 g2 = B0.g(view, windowInsets);
        if (this.f459b == null) {
            WeakHashMap weakHashMap = X.f419a;
            this.f459b = M.a(view);
        }
        if (this.f459b == null) {
            this.f459b = g2;
            return k0.i(view, windowInsets);
        }
        C0006d j2 = k0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f432b, windowInsets)) {
            return k0.i(view, windowInsets);
        }
        B0 b02 = this.f459b;
        int i = 1;
        int i2 = 0;
        while (true) {
            z0Var = g2.f396a;
            if (i > 256) {
                break;
            }
            if (!z0Var.f(i).equals(b02.f396a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return k0.i(view, windowInsets);
        }
        B0 b03 = this.f459b;
        o0 o0Var = new o0(i2, (i2 & 8) != 0 ? z0Var.f(8).f160d > b03.f396a.f(8).f160d ? k0.f460e : k0.f461f : k0.f462g, 160L);
        o0Var.f483a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o0Var.f483a.a());
        C.d f2 = z0Var.f(i2);
        C.d f3 = b03.f396a.f(i2);
        int min = Math.min(f2.f157a, f3.f157a);
        int i3 = f2.f158b;
        int i4 = f3.f158b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f159c;
        int i6 = f3.f159c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.f160d;
        int i8 = i2;
        int i9 = f3.f160d;
        B.j jVar = new B.j(C.d.b(min, min2, min3, Math.min(i7, i9)), 3, C.d.b(Math.max(f2.f157a, f3.f157a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        k0.f(view, windowInsets, false);
        duration.addUpdateListener(new h0(o0Var, g2, b03, i8, view));
        duration.addListener(new i0(o0Var, view));
        ViewTreeObserverOnPreDrawListenerC0028y.a(view, new H.n(view, o0Var, jVar, duration));
        this.f459b = g2;
        return k0.i(view, windowInsets);
    }
}
