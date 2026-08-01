package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class Z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f722d;
    public final /* synthetic */ View e;

    public Z(g0 g0Var, t0 t0Var, t0 t0Var2, int i, View view) {
        this.f719a = g0Var;
        this.f720b = t0Var;
        this.f721c = t0Var2;
        this.f722d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        g0 g0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        g0 g0Var2 = this.f719a;
        g0Var2.f755a.d(animatedFraction);
        float b2 = g0Var2.f755a.b();
        PathInterpolator pathInterpolator = c0.e;
        int i = Build.VERSION.SDK_INT;
        t0 t0Var = this.f720b;
        l0 k0Var = i >= 30 ? new k0(t0Var) : i >= 29 ? new j0(t0Var) : new i0(t0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f722d & i2;
            r0 r0Var = t0Var.f794a;
            if (i3 == 0) {
                k0Var.c(i2, r0Var.f(i2));
                f2 = b2;
                g0Var = g0Var2;
            } else {
                E.c f3 = r0Var.f(i2);
                E.c f4 = this.f721c.f794a.f(i2);
                int i4 = (int) (((f3.f279a - f4.f279a) * r10) + 0.5d);
                int i5 = (int) (((f3.f280b - f4.f280b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f281c - f4.f281c) * r10) + 0.5d);
                float f5 = (f3.f282d - f4.f282d) * (1.0f - b2);
                g0Var = g0Var2;
                k0Var.c(i2, t0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            g0Var2 = g0Var;
        }
        c0.g(this.e, k0Var.b(), Collections.singletonList(g0Var2));
    }
}
