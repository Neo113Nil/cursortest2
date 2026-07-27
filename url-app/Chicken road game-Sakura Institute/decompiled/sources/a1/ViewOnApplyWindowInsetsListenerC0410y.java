package a1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import q.RunnableC1012P;

/* renamed from: a1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0410y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC1012P f4901a;

    /* renamed from: b, reason: collision with root package name */
    public C0383T f4902b;

    public ViewOnApplyWindowInsetsListenerC0410y(View view, RunnableC1012P runnableC1012P) {
        C0383T c0383t;
        this.f4901a = runnableC1012P;
        int i2 = AbstractC0404s.f4892a;
        C0383T a4 = AbstractC0398m.a(view);
        if (a4 != null) {
            int i4 = Build.VERSION.SDK_INT;
            c0383t = (i4 >= 30 ? new C0373I(a4) : i4 >= 29 ? new C0372H(a4) : new C0370F(a4)).b();
        } else {
            c0383t = null;
        }
        this.f4902b = c0383t;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0380P c0380p;
        if (!view.isLaidOut()) {
            this.f4902b = C0383T.b(view, windowInsets);
            return C0411z.h(view, windowInsets);
        }
        C0383T b4 = C0383T.b(view, windowInsets);
        if (this.f4902b == null) {
            int i2 = AbstractC0404s.f4892a;
            this.f4902b = AbstractC0398m.a(view);
        }
        if (this.f4902b == null) {
            this.f4902b = b4;
            return C0411z.h(view, windowInsets);
        }
        RunnableC1012P i4 = C0411z.i(view);
        if (i4 != null && Objects.equals(i4.f9202d, windowInsets)) {
            return C0411z.h(view, windowInsets);
        }
        C0383T c0383t = this.f4902b;
        int i5 = 1;
        int i6 = 0;
        while (true) {
            c0380p = b4.f4871a;
            if (i5 > 256) {
                break;
            }
            if (!c0380p.f(i5).equals(c0383t.f4871a.f(i5))) {
                i6 |= i5;
            }
            i5 <<= 1;
        }
        if (i6 == 0) {
            return C0411z.h(view, windowInsets);
        }
        C0383T c0383t2 = this.f4902b;
        C0368D c0368d = new C0368D(i6, (i6 & 8) != 0 ? c0380p.f(8).f4146d > c0383t2.f4871a.f(8).f4146d ? C0411z.f4903d : C0411z.f4904e : C0411z.f4905f, 160L);
        c0368d.f4839a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0368d.f4839a.a());
        V0.c f4 = c0380p.f(i6);
        V0.c f5 = c0383t2.f4871a.f(i6);
        int min = Math.min(f4.f4143a, f5.f4143a);
        int i7 = f4.f4144b;
        int i8 = f5.f4144b;
        int min2 = Math.min(i7, i8);
        int i9 = f4.f4145c;
        int i10 = f5.f4145c;
        int min3 = Math.min(i9, i10);
        int i11 = f4.f4146d;
        int i12 = i6;
        int i13 = f5.f4146d;
        y.t tVar = new y.t(V0.c.b(min, min2, min3, Math.min(i11, i13)), 15, V0.c.b(Math.max(f4.f4143a, f5.f4143a), Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i13)));
        C0411z.e(view, windowInsets, false);
        duration.addUpdateListener(new C0408w(c0368d, b4, c0383t2, i12, view));
        duration.addListener(new C0409x(c0368d, view));
        G1.n nVar = new G1.n(view, c0368d, tVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0392g viewTreeObserverOnPreDrawListenerC0392g = new ViewTreeObserverOnPreDrawListenerC0392g(view, nVar);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0392g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0392g);
        this.f4902b = b4;
        return C0411z.h(view, windowInsets);
    }
}
