package q3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f6135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f6136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f6137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f6139e;

    public o0(u0 u0Var, l1 l1Var, l1 l1Var2, int i, View view) {
        this.f6135a = u0Var;
        this.f6136b = l1Var;
        this.f6137c = l1Var2;
        this.f6138d = i;
        this.f6139e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        u0 u0Var = this.f6135a;
        t0 t0Var = u0Var.f6160a;
        t0Var.e(animatedFraction);
        l1 l1Var = this.f6136b;
        i1 i1Var = l1Var.f6127a;
        float c8 = t0Var.c();
        PathInterpolator pathInterpolator = q0.f6142e;
        int i = Build.VERSION.SDK_INT;
        a1 z0Var = i >= 34 ? new z0(l1Var) : i >= 31 ? new y0(l1Var) : i >= 30 ? new x0(l1Var) : i >= 29 ? new w0(l1Var) : new v0(l1Var);
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((this.f6138d & i8) == 0) {
                z0Var.c(i8, i1Var.f(i8));
            } else {
                i3.c f6 = i1Var.f(i8);
                i3.c f8 = this.f6137c.f6127a.f(i8);
                float f9 = 1.0f - c8;
                z0Var.c(i8, l1.b(f6, (int) (((f6.f3421a - f8.f3421a) * f9) + 0.5d), (int) (((f6.f3422b - f8.f3422b) * f9) + 0.5d), (int) (((f6.f3423c - f8.f3423c) * f9) + 0.5d), (int) (((f6.f3424d - f8.f3424d) * f9) + 0.5d)));
            }
        }
        q0.h(this.f6139e, z0Var.b(), Collections.singletonList(u0Var));
    }
}
