package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f730a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f731b;

    public b0(View view, C0008d c0008d) {
        t0 t0Var;
        this.f730a = c0008d;
        WeakHashMap weakHashMap = P.f711a;
        t0 a2 = F.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            t0Var = (i >= 30 ? new k0(a2) : i >= 29 ? new j0(a2) : new i0(a2)).b();
        } else {
            t0Var = null;
        }
        this.f731b = t0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r0 r0Var;
        if (!view.isLaidOut()) {
            this.f731b = t0.g(view, windowInsets);
            return c0.i(view, windowInsets);
        }
        t0 g2 = t0.g(view, windowInsets);
        if (this.f731b == null) {
            WeakHashMap weakHashMap = P.f711a;
            this.f731b = F.a(view);
        }
        if (this.f731b == null) {
            this.f731b = g2;
            return c0.i(view, windowInsets);
        }
        C0008d j = c0.j(view);
        if (j != null && Objects.equals((WindowInsets) j.f735b, windowInsets)) {
            return c0.i(view, windowInsets);
        }
        t0 t0Var = this.f731b;
        int i = 1;
        int i2 = 0;
        while (true) {
            r0Var = g2.f794a;
            if (i > 256) {
                break;
            }
            if (!r0Var.f(i).equals(t0Var.f794a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return c0.i(view, windowInsets);
        }
        t0 t0Var2 = this.f731b;
        g0 g0Var = new g0(i2, (i2 & 8) != 0 ? r0Var.f(8).f282d > t0Var2.f794a.f(8).f282d ? c0.e : c0.f732f : c0.f733g, 160L);
        g0Var.f755a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g0Var.f755a.a());
        E.c f2 = r0Var.f(i2);
        E.c f3 = t0Var2.f794a.f(i2);
        int min = Math.min(f2.f279a, f3.f279a);
        int i3 = f2.f280b;
        int i4 = f3.f280b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f281c;
        int i6 = f3.f281c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.f282d;
        int i8 = i2;
        int i9 = f3.f282d;
        B1.c cVar = new B1.c(E.c.b(min, min2, min3, Math.min(i7, i9)), 4, E.c.b(Math.max(f2.f279a, f3.f279a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        c0.f(view, windowInsets, false);
        duration.addUpdateListener(new Z(g0Var, g2, t0Var2, i8, view));
        duration.addListener(new a0(g0Var, view));
        ViewTreeObserverOnPreDrawListenerC0022s.a(view, new J.l(view, g0Var, cVar, duration));
        this.f731b = g2;
        return c0.i(view, windowInsets);
    }
}
