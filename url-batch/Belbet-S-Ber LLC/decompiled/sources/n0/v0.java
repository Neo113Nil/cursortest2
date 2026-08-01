package n0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f2837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f2838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f2839c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2840e;

    public v0(b1 b1Var, v1 v1Var, v1 v1Var2, int i, View view) {
        this.f2837a = b1Var;
        this.f2838b = v1Var;
        this.f2839c = v1Var2;
        this.d = i;
        this.f2840e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        b1 b1Var = this.f2837a;
        a1 a1Var = b1Var.f2759a;
        a1Var.e(animatedFraction);
        v1 v1Var = this.f2838b;
        s1 s1Var = v1Var.f2842a;
        float c5 = a1Var.c();
        PathInterpolator pathInterpolator = x0.f2848e;
        int i = Build.VERSION.SDK_INT;
        j1 i1Var = i >= 36 ? new i1(v1Var) : i >= 35 ? new h1(v1Var) : i >= 34 ? new g1(v1Var) : i >= 31 ? new f1(v1Var) : i >= 30 ? new e1(v1Var) : i >= 29 ? new d1(v1Var) : new c1(v1Var);
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((this.d & i4) == 0) {
                i1Var.d(i4, s1Var.h(i4));
            } else {
                f0.c h = s1Var.h(i4);
                f0.c h5 = this.f2839c.f2842a.h(i4);
                float f5 = 1.0f - c5;
                i1Var.d(i4, v1.e(h, (int) (((h.f1415a - h5.f1415a) * f5) + 0.5d), (int) (((h.f1416b - h5.f1416b) * f5) + 0.5d), (int) (((h.f1417c - h5.f1417c) * f5) + 0.5d), (int) (((h.d - h5.d) * f5) + 0.5d)));
            }
        }
        x0.h(this.f2840e, i1Var.b(), Collections.singletonList(b1Var));
    }
}
