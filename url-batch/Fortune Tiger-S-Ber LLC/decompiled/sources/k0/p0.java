package k0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f2766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f2767b;
    public final /* synthetic */ m1 c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2769e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i4, View view) {
        this.f2766a = w0Var;
        this.f2767b = m1Var;
        this.c = m1Var2;
        this.f2768d = i4;
        this.f2769e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f2766a;
        v0 v0Var = w0Var.f2788a;
        v0Var.e(animatedFraction);
        m1 m1Var = this.f2767b;
        i1 i1Var = m1Var.f2760a;
        float c = v0Var.c();
        PathInterpolator pathInterpolator = r0.f2773e;
        int i4 = Build.VERSION.SDK_INT;
        b1 a1Var = i4 >= 34 ? new a1(m1Var) : i4 >= 30 ? new z0(m1Var) : i4 >= 29 ? new y0(m1Var) : new x0(m1Var);
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((this.f2768d & i5) == 0) {
                a1Var.c(i5, i1Var.f(i5));
            } else {
                c0.c f4 = i1Var.f(i5);
                c0.c f5 = this.c.f2760a.f(i5);
                float f6 = 1.0f - c;
                a1Var.c(i5, m1.e(f4, (int) (((f4.f978a - f5.f978a) * f6) + 0.5d), (int) (((f4.f979b - f5.f979b) * f6) + 0.5d), (int) (((f4.c - f5.c) * f6) + 0.5d), (int) (((f4.f980d - f5.f980d) * f6) + 0.5d)));
            }
        }
        r0.h(this.f2769e, a1Var.b(), Collections.singletonList(w0Var));
    }
}
