package b3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f1373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f1374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f1375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1377e;

    public x(f0 f0Var, t0 t0Var, t0 t0Var2, int i7, View view) {
        this.f1373a = f0Var;
        this.f1374b = t0Var;
        this.f1375c = t0Var2;
        this.f1376d = i7;
        this.f1377e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f0 f0Var;
        float f9;
        q0 q0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        f0 f0Var2 = this.f1373a;
        e0 e0Var = f0Var2.f1322a;
        e0Var.c(animatedFraction);
        t0 t0Var = this.f1374b;
        q0 q0Var2 = t0Var.f1367a;
        float b9 = e0Var.b();
        PathInterpolator pathInterpolator = b0.f1311d;
        int i7 = Build.VERSION.SDK_INT;
        k0 j0Var = i7 >= 30 ? new j0(t0Var) : i7 >= 29 ? new i0(t0Var) : new h0(t0Var);
        int i8 = 1;
        while (i8 <= 256) {
            if ((this.f1376d & i8) == 0) {
                j0Var.c(i8, q0Var2.f(i8));
                f0Var = f0Var2;
                f9 = b9;
                q0Var = q0Var2;
            } else {
                v2.c f10 = q0Var2.f(i8);
                v2.c f11 = this.f1375c.f1367a.f(i8);
                int i9 = f10.f9102a;
                int i10 = f10.f9105d;
                int i11 = f10.f9104c;
                int i12 = f10.f9103b;
                int i13 = (int) (((i9 - f11.f9102a) * r13) + 0.5d);
                int i14 = (int) (((i12 - f11.f9103b) * r13) + 0.5d);
                f0Var = f0Var2;
                f9 = b9;
                int i15 = (int) (((i11 - f11.f9104c) * r13) + 0.5d);
                float f12 = (i10 - f11.f9105d) * (1.0f - b9);
                q0Var = q0Var2;
                int i16 = (int) (f12 + 0.5d);
                int max = Math.max(0, i9 - i13);
                int max2 = Math.max(0, i12 - i14);
                int max3 = Math.max(0, i11 - i15);
                int max4 = Math.max(0, i10 - i16);
                if (max != i13 || max2 != i14 || max3 != i15 || max4 != i16) {
                    f10 = v2.c.b(max, max2, max3, max4);
                }
                j0Var.c(i8, f10);
            }
            i8 <<= 1;
            f0Var2 = f0Var;
            q0Var2 = q0Var;
            b9 = f9;
        }
        t0 b10 = j0Var.b();
        Collections.singletonList(f0Var2);
        b0.f(this.f1377e, b10);
    }
}
