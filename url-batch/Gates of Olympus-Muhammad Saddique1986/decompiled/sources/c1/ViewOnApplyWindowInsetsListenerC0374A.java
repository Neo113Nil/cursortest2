package c1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import r.RunnableC0841C;
import z.C1256t;

/* renamed from: c1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0374A implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0841C f5545a;

    /* renamed from: b, reason: collision with root package name */
    public U f5546b;

    public ViewOnApplyWindowInsetsListenerC0374A(View view, RunnableC0841C runnableC0841C) {
        U u3;
        this.f5545a = runnableC0841C;
        int i3 = AbstractC0394s.f5610a;
        U a3 = AbstractC0389m.a(view);
        if (a3 != null) {
            int i4 = Build.VERSION.SDK_INT;
            u3 = (i4 >= 30 ? new J(a3) : i4 >= 29 ? new I(a3) : new H(a3)).b();
        } else {
            u3 = null;
        }
        this.f5546b = u3;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Q q3;
        if (!view.isLaidOut()) {
            this.f5546b = U.b(view, windowInsets);
            return C0375B.h(view, windowInsets);
        }
        U b3 = U.b(view, windowInsets);
        if (this.f5546b == null) {
            int i3 = AbstractC0394s.f5610a;
            this.f5546b = AbstractC0389m.a(view);
        }
        if (this.f5546b == null) {
            this.f5546b = b3;
            return C0375B.h(view, windowInsets);
        }
        RunnableC0841C i4 = C0375B.i(view);
        if (i4 != null && Objects.equals(i4.f7953d, windowInsets)) {
            return C0375B.h(view, windowInsets);
        }
        U u3 = this.f5546b;
        int i5 = 1;
        int i6 = 0;
        while (true) {
            q3 = b3.f5589a;
            if (i5 > 256) {
                break;
            }
            if (!q3.f(i5).equals(u3.f5589a.f(i5))) {
                i6 |= i5;
            }
            i5 <<= 1;
        }
        if (i6 == 0) {
            return C0375B.h(view, windowInsets);
        }
        U u4 = this.f5546b;
        F f3 = new F(i6, (i6 & 8) != 0 ? q3.f(8).f4626d > u4.f5589a.f(8).f4626d ? C0375B.f5547d : C0375B.f5548e : C0375B.f5549f, 160L);
        f3.f5557a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(f3.f5557a.a());
        X0.c f4 = q3.f(i6);
        X0.c f5 = u4.f5589a.f(i6);
        int min = Math.min(f4.f4623a, f5.f4623a);
        int i7 = f4.f4624b;
        int i8 = f5.f4624b;
        int min2 = Math.min(i7, i8);
        int i9 = f4.f4625c;
        int i10 = f5.f4625c;
        int min3 = Math.min(i9, i10);
        int i11 = f4.f4626d;
        int i12 = i6;
        int i13 = f5.f4626d;
        C1256t c1256t = new C1256t(X0.c.b(min, min2, min3, Math.min(i11, i13)), 7, X0.c.b(Math.max(f4.f4623a, f5.f4623a), Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i13)));
        C0375B.e(view, windowInsets, false);
        duration.addUpdateListener(new C0399x(f3, b3, u4, i12, view));
        duration.addListener(new y(view, f3));
        ViewTreeObserverOnPreDrawListenerC0383g viewTreeObserverOnPreDrawListenerC0383g = new ViewTreeObserverOnPreDrawListenerC0383g(view, new z(view, f3, c1256t, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0383g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0383g);
        this.f5546b = b3;
        return C0375B.h(view, windowInsets);
    }
}
