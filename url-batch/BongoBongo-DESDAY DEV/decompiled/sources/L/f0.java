package L;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f519c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f520e;

    public f0(m0 m0Var, z0 z0Var, z0 z0Var2, int i, View view) {
        this.f517a = m0Var;
        this.f518b = z0Var;
        this.f519c = z0Var2;
        this.d = i;
        this.f520e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        m0 m0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m0 m0Var2 = this.f517a;
        m0Var2.f548a.d(animatedFraction);
        float b2 = m0Var2.f548a.b();
        PathInterpolator pathInterpolator = i0.f534e;
        int i = Build.VERSION.SDK_INT;
        z0 z0Var = this.f518b;
        r0 q0Var = i >= 30 ? new q0(z0Var) : i >= 29 ? new p0(z0Var) : new o0(z0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.d & i2;
            x0 x0Var = z0Var.f589a;
            if (i3 == 0) {
                q0Var.c(i2, x0Var.f(i2));
                f2 = b2;
                m0Var = m0Var2;
            } else {
                D.c f3 = x0Var.f(i2);
                D.c f4 = this.f519c.f589a.f(i2);
                int i4 = (int) (((f3.f114a - f4.f114a) * r10) + 0.5d);
                int i5 = (int) (((f3.f115b - f4.f115b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f116c - f4.f116c) * r10) + 0.5d);
                float f5 = (f3.d - f4.d) * (1.0f - b2);
                m0Var = m0Var2;
                q0Var.c(i2, z0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            m0Var2 = m0Var;
        }
        i0.g(this.f520e, q0Var.b(), Collections.singletonList(m0Var2));
    }
}
