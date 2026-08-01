package o3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f7399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f7400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f7401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f7403e;

    public i0(q0 q0Var, k1 k1Var, k1 k1Var2, int i3, View view) {
        this.f7399a = q0Var;
        this.f7400b = k1Var;
        this.f7401c = k1Var2;
        this.f7402d = i3;
        this.f7403e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        q0 q0Var = this.f7399a;
        p0 p0Var = q0Var.f7435a;
        p0Var.e(animatedFraction);
        float c10 = p0Var.c();
        PathInterpolator pathInterpolator = l0.f7417e;
        int i3 = Build.VERSION.SDK_INT;
        k1 k1Var = this.f7400b;
        y0 x0Var = i3 >= 36 ? new x0(k1Var) : i3 >= 35 ? new w0(k1Var) : i3 >= 34 ? new v0(k1Var) : i3 >= 31 ? new u0(k1Var) : i3 >= 30 ? new t0(k1Var) : i3 >= 29 ? new s0(k1Var) : new r0(k1Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int i11 = this.f7402d & i10;
            h1 h1Var = k1Var.f7415a;
            if (i11 == 0) {
                x0Var.d(i10, h1Var.i(i10));
            } else {
                h3.b i12 = h1Var.i(i10);
                h3.b i13 = this.f7401c.f7415a.i(i10);
                float f3 = 1.0f - c10;
                x0Var.d(i10, k1.a(i12, (int) (((i12.f4443a - i13.f4443a) * f3) + 0.5d), (int) (((i12.f4444b - i13.f4444b) * f3) + 0.5d), (int) (((i12.f4445c - i13.f4445c) * f3) + 0.5d), (int) (((i12.f4446d - i13.f4446d) * f3) + 0.5d)));
            }
        }
        l0.h(this.f7403e, x0Var.b(), Collections.singletonList(q0Var));
    }
}
