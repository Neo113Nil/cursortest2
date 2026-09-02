package n0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f2778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f2780c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2781e;

    public s0(y0 y0Var, q1 q1Var, q1 q1Var2, int i, View view) {
        this.f2778a = y0Var;
        this.f2779b = q1Var;
        this.f2780c = q1Var2;
        this.d = i;
        this.f2781e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        y0 y0Var = this.f2778a;
        x0 x0Var = y0Var.f2803a;
        x0Var.e(animatedFraction);
        q1 q1Var = this.f2779b;
        n1 n1Var = q1Var.f2775a;
        float c4 = x0Var.c();
        PathInterpolator pathInterpolator = u0.f2784e;
        int i = Build.VERSION.SDK_INT;
        f1 e1Var = i >= 34 ? new e1(q1Var) : i >= 31 ? new d1(q1Var) : i >= 30 ? new c1(q1Var) : i >= 29 ? new b1(q1Var) : new z0(q1Var);
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((this.d & i4) == 0) {
                e1Var.c(i4, n1Var.f(i4));
            } else {
                f0.c f2 = n1Var.f(i4);
                f0.c f4 = this.f2780c.f2775a.f(i4);
                float f5 = 1.0f - c4;
                e1Var.c(i4, q1.e(f2, (int) (((f2.f1266a - f4.f1266a) * f5) + 0.5d), (int) (((f2.f1267b - f4.f1267b) * f5) + 0.5d), (int) (((f2.f1268c - f4.f1268c) * f5) + 0.5d), (int) (((f2.d - f4.d) * f5) + 0.5d)));
            }
        }
        u0.h(this.f2781e, e1Var.b(), Collections.singletonList(y0Var));
    }
}
