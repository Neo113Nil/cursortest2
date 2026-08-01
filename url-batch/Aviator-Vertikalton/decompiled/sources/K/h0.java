package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f452e;

    public h0(o0 o0Var, B0 b02, B0 b03, int i, View view) {
        this.f448a = o0Var;
        this.f449b = b02;
        this.f450c = b03;
        this.f451d = i;
        this.f452e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        o0 o0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o0 o0Var2 = this.f448a;
        o0Var2.f482a.d(animatedFraction);
        float b2 = o0Var2.f482a.b();
        PathInterpolator pathInterpolator = k0.f459e;
        int i = Build.VERSION.SDK_INT;
        B0 b02 = this.f449b;
        t0 s0Var = i >= 30 ? new s0(b02) : i >= 29 ? new r0(b02) : new q0(b02);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f451d & i2;
            z0 z0Var = b02.f395a;
            if (i3 == 0) {
                s0Var.c(i2, z0Var.f(i2));
                f2 = b2;
                o0Var = o0Var2;
            } else {
                C.d f3 = z0Var.f(i2);
                C.d f4 = this.f450c.f395a.f(i2);
                int i4 = (int) (((f3.f158a - f4.f158a) * r10) + 0.5d);
                int i5 = (int) (((f3.f159b - f4.f159b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f160c - f4.f160c) * r10) + 0.5d);
                float f5 = (f3.f161d - f4.f161d) * (1.0f - b2);
                o0Var = o0Var2;
                s0Var.c(i2, B0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            o0Var2 = o0Var;
        }
        k0.g(this.f452e, s0Var.b(), Collections.singletonList(o0Var2));
    }
}
