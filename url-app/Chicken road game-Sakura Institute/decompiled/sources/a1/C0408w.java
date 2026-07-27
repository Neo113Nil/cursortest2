package a1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: a1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0368D f4894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0383T f4895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0383T f4896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4898e;

    public C0408w(C0368D c0368d, C0383T c0383t, C0383T c0383t2, int i2, View view) {
        this.f4894a = c0368d;
        this.f4895b = c0383t;
        this.f4896c = c0383t2;
        this.f4897d = i2;
        this.f4898e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f4;
        C0368D c0368d;
        AbstractC0374J abstractC0374J;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0368D c0368d2 = this.f4894a;
        c0368d2.f4839a.c(animatedFraction);
        float b4 = c0368d2.f4839a.b();
        PathInterpolator pathInterpolator = C0411z.f4903d;
        int i2 = Build.VERSION.SDK_INT;
        C0383T c0383t = this.f4895b;
        AbstractC0374J c0373i = i2 >= 30 ? new C0373I(c0383t) : i2 >= 29 ? new C0372H(c0383t) : new C0370F(c0383t);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f4897d & i4;
            C0380P c0380p = c0383t.f4871a;
            if (i5 == 0) {
                c0373i.c(i4, c0380p.f(i4));
                f4 = b4;
                c0368d = c0368d2;
                abstractC0374J = c0373i;
            } else {
                V0.c f5 = c0380p.f(i4);
                V0.c f6 = this.f4896c.f4871a.f(i4);
                int i6 = f5.f4143a;
                float f7 = 1.0f - b4;
                int i7 = (int) (((i6 - f6.f4143a) * f7) + 0.5d);
                int i8 = f6.f4144b;
                int i9 = f5.f4144b;
                f4 = b4;
                int i10 = (int) (((i9 - i8) * f7) + 0.5d);
                int i11 = f6.f4145c;
                int i12 = f5.f4145c;
                c0368d = c0368d2;
                int i13 = (int) (((i12 - i11) * f7) + 0.5d);
                int i14 = f6.f4146d;
                int i15 = f5.f4146d;
                float f8 = (i15 - i14) * f7;
                abstractC0374J = c0373i;
                int i16 = (int) (f8 + 0.5d);
                int max = Math.max(0, i6 - i7);
                int max2 = Math.max(0, i9 - i10);
                int max3 = Math.max(0, i12 - i13);
                int max4 = Math.max(0, i15 - i16);
                if (max != i7 || max2 != i10 || max3 != i13 || max4 != i16) {
                    f5 = V0.c.b(max, max2, max3, max4);
                }
                abstractC0374J.c(i4, f5);
            }
            i4 <<= 1;
            b4 = f4;
            c0373i = abstractC0374J;
            c0368d2 = c0368d;
        }
        C0383T b5 = c0373i.b();
        Collections.singletonList(c0368d2);
        C0411z.f(this.f4898e, b5);
    }
}
