package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f378c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f379e;

    public c0(j0 j0Var, w0 w0Var, w0 w0Var2, int i, View view) {
        this.f376a = j0Var;
        this.f377b = w0Var;
        this.f378c = w0Var2;
        this.d = i;
        this.f379e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        j0 j0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        j0 j0Var2 = this.f376a;
        j0Var2.f409a.d(animatedFraction);
        float b2 = j0Var2.f409a.b();
        PathInterpolator pathInterpolator = f0.f391e;
        int i = Build.VERSION.SDK_INT;
        w0 w0Var = this.f377b;
        o0 n0Var = i >= 30 ? new n0(w0Var) : i >= 29 ? new m0(w0Var) : new l0(w0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.d & i2;
            u0 u0Var = w0Var.f449a;
            if (i3 == 0) {
                n0Var.c(i2, u0Var.f(i2));
                f2 = b2;
                j0Var = j0Var2;
            } else {
                C.c f3 = u0Var.f(i2);
                C.c f4 = this.f378c.f449a.f(i2);
                int i4 = (int) (((f3.f56a - f4.f56a) * r10) + 0.5d);
                int i5 = (int) (((f3.f57b - f4.f57b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f58c - f4.f58c) * r10) + 0.5d);
                float f5 = (f3.d - f4.d) * (1.0f - b2);
                j0Var = j0Var2;
                n0Var.c(i2, w0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            j0Var2 = j0Var;
        }
        f0.g(this.f379e, n0Var.b(), Collections.singletonList(j0Var2));
    }
}
