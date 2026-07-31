package c1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: c1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f5613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f5614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f5615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f5617e;

    public C0399x(F f3, U u3, U u4, int i3, View view) {
        this.f5613a = f3;
        this.f5614b = u3;
        this.f5615c = u4;
        this.f5616d = i3;
        this.f5617e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        F f4;
        K k3;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        F f5 = this.f5613a;
        f5.f5557a.c(animatedFraction);
        float b3 = f5.f5557a.b();
        PathInterpolator pathInterpolator = C0375B.f5547d;
        int i3 = Build.VERSION.SDK_INT;
        U u3 = this.f5614b;
        K j3 = i3 >= 30 ? new J(u3) : i3 >= 29 ? new I(u3) : new H(u3);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f5616d & i4;
            Q q3 = u3.f5589a;
            if (i5 == 0) {
                j3.c(i4, q3.f(i4));
                f3 = b3;
                f4 = f5;
                k3 = j3;
            } else {
                X0.c f6 = q3.f(i4);
                X0.c f7 = this.f5615c.f5589a.f(i4);
                int i6 = f6.f4623a;
                float f8 = 1.0f - b3;
                int i7 = (int) (((i6 - f7.f4623a) * f8) + 0.5d);
                int i8 = f7.f4624b;
                int i9 = f6.f4624b;
                f3 = b3;
                int i10 = (int) (((i9 - i8) * f8) + 0.5d);
                int i11 = f7.f4625c;
                int i12 = f6.f4625c;
                f4 = f5;
                int i13 = (int) (((i12 - i11) * f8) + 0.5d);
                int i14 = f7.f4626d;
                int i15 = f6.f4626d;
                float f9 = (i15 - i14) * f8;
                k3 = j3;
                int i16 = (int) (f9 + 0.5d);
                int max = Math.max(0, i6 - i7);
                int max2 = Math.max(0, i9 - i10);
                int max3 = Math.max(0, i12 - i13);
                int max4 = Math.max(0, i15 - i16);
                if (max != i7 || max2 != i10 || max3 != i13 || max4 != i16) {
                    f6 = X0.c.b(max, max2, max3, max4);
                }
                k3.c(i4, f6);
            }
            i4 <<= 1;
            b3 = f3;
            j3 = k3;
            f5 = f4;
        }
        U b4 = j3.b();
        Collections.singletonList(f5);
        C0375B.f(this.f5617e, b4);
    }
}
