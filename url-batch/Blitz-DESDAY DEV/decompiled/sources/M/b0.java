package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f529c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f530e;

    public b0(i0 i0Var, v0 v0Var, v0 v0Var2, int i, View view) {
        this.f527a = i0Var;
        this.f528b = v0Var;
        this.f529c = v0Var2;
        this.d = i;
        this.f530e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        i0 i0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i0 i0Var2 = this.f527a;
        i0Var2.f559a.d(animatedFraction);
        float b2 = i0Var2.f559a.b();
        PathInterpolator pathInterpolator = e0.f541e;
        int i = Build.VERSION.SDK_INT;
        v0 v0Var = this.f528b;
        n0 m0Var = i >= 30 ? new m0(v0Var) : i >= 29 ? new l0(v0Var) : new k0(v0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.d & i2;
            t0 t0Var = v0Var.f596a;
            if (i3 == 0) {
                m0Var.c(i2, t0Var.f(i2));
                f2 = b2;
                i0Var = i0Var2;
            } else {
                E.c f3 = t0Var.f(i2);
                E.c f4 = this.f529c.f596a.f(i2);
                int i4 = (int) (((f3.f162a - f4.f162a) * r10) + 0.5d);
                int i5 = (int) (((f3.f163b - f4.f163b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f164c - f4.f164c) * r10) + 0.5d);
                float f5 = (f3.d - f4.d) * (1.0f - b2);
                i0Var = i0Var2;
                m0Var.c(i2, v0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            i0Var2 = i0Var;
        }
        e0.g(this.f530e, m0Var.b(), Collections.singletonList(i0Var2));
    }
}
