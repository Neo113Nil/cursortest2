package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0003d f377a;

    /* renamed from: b, reason: collision with root package name */
    public w0 f378b;

    public e0(View view, C0003d c0003d) {
        w0 w0Var;
        this.f377a = c0003d;
        WeakHashMap weakHashMap = S.f351a;
        w0 a2 = H.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            w0Var = (i >= 30 ? new n0(a2) : i >= 29 ? new m0(a2) : new l0(a2)).b();
        } else {
            w0Var = null;
        }
        this.f378b = w0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 u0Var;
        if (!view.isLaidOut()) {
            this.f378b = w0.g(view, windowInsets);
            return f0.i(view, windowInsets);
        }
        w0 g2 = w0.g(view, windowInsets);
        if (this.f378b == null) {
            WeakHashMap weakHashMap = S.f351a;
            this.f378b = H.a(view);
        }
        if (this.f378b == null) {
            this.f378b = g2;
            return f0.i(view, windowInsets);
        }
        C0003d j2 = f0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f370b, windowInsets)) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var = this.f378b;
        int i = 1;
        int i2 = 0;
        while (true) {
            u0Var = g2.f438a;
            if (i > 256) {
                break;
            }
            if (!u0Var.f(i).equals(w0Var.f438a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var2 = this.f378b;
        j0 j0Var = new j0(i2, (i2 & 8) != 0 ? u0Var.f(8).d > w0Var2.f438a.f(8).d ? f0.f380e : f0.f381f : f0.f382g, 160L);
        j0Var.f398a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j0Var.f398a.a());
        C.d f2 = u0Var.f(i2);
        C.d f3 = w0Var2.f438a.f(i2);
        int min = Math.min(f2.f142a, f3.f142a);
        int i3 = f2.f143b;
        int i4 = f3.f143b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f144c;
        int i6 = f3.f144c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        B.j jVar = new B.j(C.d.b(min, min2, min3, Math.min(i7, i9)), 3, C.d.b(Math.max(f2.f142a, f3.f142a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        f0.f(view, windowInsets, false);
        duration.addUpdateListener(new c0(j0Var, g2, w0Var2, i8, view));
        duration.addListener(new d0(j0Var, view));
        ViewTreeObserverOnPreDrawListenerC0019u.a(view, new H.n(view, j0Var, jVar, duration));
        this.f378b = g2;
        return f0.i(view, windowInsets);
    }
}
