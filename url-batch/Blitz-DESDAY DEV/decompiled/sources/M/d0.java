package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0003d f539a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f540b;

    public d0(View view, C0003d c0003d) {
        v0 v0Var;
        this.f539a = c0003d;
        WeakHashMap weakHashMap = Q.f513a;
        v0 a2 = G.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            v0Var = (i >= 30 ? new m0(a2) : i >= 29 ? new l0(a2) : new k0(a2)).b();
        } else {
            v0Var = null;
        }
        this.f540b = v0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 t0Var;
        if (!view.isLaidOut()) {
            this.f540b = v0.g(view, windowInsets);
            return e0.i(view, windowInsets);
        }
        v0 g2 = v0.g(view, windowInsets);
        if (this.f540b == null) {
            WeakHashMap weakHashMap = Q.f513a;
            this.f540b = G.a(view);
        }
        if (this.f540b == null) {
            this.f540b = g2;
            return e0.i(view, windowInsets);
        }
        C0003d j2 = e0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f535b, windowInsets)) {
            return e0.i(view, windowInsets);
        }
        v0 v0Var = this.f540b;
        int i = 1;
        int i2 = 0;
        while (true) {
            t0Var = g2.f596a;
            if (i > 256) {
                break;
            }
            if (!t0Var.f(i).equals(v0Var.f596a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return e0.i(view, windowInsets);
        }
        v0 v0Var2 = this.f540b;
        i0 i0Var = new i0(i2, (i2 & 8) != 0 ? t0Var.f(8).d > v0Var2.f596a.f(8).d ? e0.f541e : e0.f542f : e0.f543g, 160L);
        i0Var.f559a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i0Var.f559a.a());
        E.c f2 = t0Var.f(i2);
        E.c f3 = v0Var2.f596a.f(i2);
        int min = Math.min(f2.f162a, f3.f162a);
        int i3 = f2.f163b;
        int i4 = f3.f163b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f164c;
        int i6 = f3.f164c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        D.j jVar = new D.j(E.c.b(min, min2, min3, Math.min(i7, i9)), 3, E.c.b(Math.max(f2.f162a, f3.f162a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        e0.f(view, windowInsets, false);
        duration.addUpdateListener(new b0(i0Var, g2, v0Var2, i8, view));
        duration.addListener(new c0(i0Var, view));
        ViewTreeObserverOnPreDrawListenerC0018t.a(view, new J.m(view, i0Var, jVar, duration));
        this.f540b = g2;
        return e0.i(view, windowInsets);
    }
}
