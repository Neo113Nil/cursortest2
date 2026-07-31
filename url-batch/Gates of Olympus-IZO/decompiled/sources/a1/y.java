package a1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import r.RunnableC0789A;

/* loaded from: classes.dex */
public final class y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0789A f3574a;

    /* renamed from: b, reason: collision with root package name */
    public Q f3575b;

    public y(View view, RunnableC0789A runnableC0789A) {
        Q q2;
        this.f3574a = runnableC0789A;
        int i3 = AbstractC0179q.f3561a;
        Q a3 = AbstractC0173k.a(view);
        if (a3 != null) {
            int i4 = Build.VERSION.SDK_INT;
            q2 = (i4 >= 30 ? new H(a3) : i4 >= 29 ? new G(a3) : new F(a3)).b();
        } else {
            q2 = null;
        }
        this.f3575b = q2;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        O o3;
        if (!view.isLaidOut()) {
            this.f3575b = Q.b(view, windowInsets);
            return z.h(view, windowInsets);
        }
        Q b2 = Q.b(view, windowInsets);
        if (this.f3575b == null) {
            int i3 = AbstractC0179q.f3561a;
            this.f3575b = AbstractC0173k.a(view);
        }
        if (this.f3575b == null) {
            this.f3575b = b2;
            return z.h(view, windowInsets);
        }
        RunnableC0789A i4 = z.i(view);
        if (i4 != null && Objects.equals(i4.f6982d, windowInsets)) {
            return z.h(view, windowInsets);
        }
        Q q2 = this.f3575b;
        int i5 = 1;
        int i6 = 0;
        while (true) {
            o3 = b2.f3542a;
            if (i5 > 256) {
                break;
            }
            if (!o3.f(i5).equals(q2.f3542a.f(i5))) {
                i6 |= i5;
            }
            i5 <<= 1;
        }
        if (i6 == 0) {
            return z.h(view, windowInsets);
        }
        Q q3 = this.f3575b;
        C0162D c0162d = new C0162D(i6, (i6 & 8) != 0 ? o3.f(8).f3352d > q3.f3542a.f(8).f3352d ? z.f3576d : z.f3577e : z.f3578f, 160L);
        c0162d.f3511a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0162d.f3511a.a());
        V0.c f3 = o3.f(i6);
        V0.c f4 = q3.f3542a.f(i6);
        int min = Math.min(f3.f3349a, f4.f3349a);
        int i7 = f3.f3350b;
        int i8 = f4.f3350b;
        int min2 = Math.min(i7, i8);
        int i9 = f3.f3351c;
        int i10 = f4.f3351c;
        int min3 = Math.min(i9, i10);
        int i11 = f3.f3352d;
        int i12 = i6;
        int i13 = f4.f3352d;
        C2.c cVar = new C2.c(V0.c.b(min, min2, min3, Math.min(i11, i13)), 4, V0.c.b(Math.max(f3.f3349a, f4.f3349a), Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i13)));
        z.e(view, windowInsets, false);
        duration.addUpdateListener(new C0183v(c0162d, b2, q3, i12, view));
        duration.addListener(new w(c0162d, view));
        ViewTreeObserverOnPreDrawListenerC0169g viewTreeObserverOnPreDrawListenerC0169g = new ViewTreeObserverOnPreDrawListenerC0169g(view, new x(view, c0162d, cVar, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0169g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0169g);
        this.f3575b = b2;
        return z.h(view, windowInsets);
    }
}
