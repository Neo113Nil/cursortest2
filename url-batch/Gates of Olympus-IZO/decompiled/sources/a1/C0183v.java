package a1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: a1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162D f3564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f3566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f3568e;

    public C0183v(C0162D c0162d, Q q2, Q q3, int i3, View view) {
        this.f3564a = c0162d;
        this.f3565b = q2;
        this.f3566c = q3;
        this.f3567d = i3;
        this.f3568e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        C0162D c0162d;
        I i3;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0162D c0162d2 = this.f3564a;
        c0162d2.f3511a.c(animatedFraction);
        float b2 = c0162d2.f3511a.b();
        PathInterpolator pathInterpolator = z.f3576d;
        int i4 = Build.VERSION.SDK_INT;
        Q q2 = this.f3565b;
        I h3 = i4 >= 30 ? new H(q2) : i4 >= 29 ? new G(q2) : new F(q2);
        int i5 = 1;
        while (i5 <= 256) {
            int i6 = this.f3567d & i5;
            O o3 = q2.f3542a;
            if (i6 == 0) {
                h3.c(i5, o3.f(i5));
                f3 = b2;
                c0162d = c0162d2;
                i3 = h3;
            } else {
                V0.c f4 = o3.f(i5);
                V0.c f5 = this.f3566c.f3542a.f(i5);
                int i7 = f4.f3349a;
                float f6 = 1.0f - b2;
                int i8 = (int) (((i7 - f5.f3349a) * f6) + 0.5d);
                int i9 = f5.f3350b;
                int i10 = f4.f3350b;
                f3 = b2;
                int i11 = (int) (((i10 - i9) * f6) + 0.5d);
                int i12 = f5.f3351c;
                int i13 = f4.f3351c;
                c0162d = c0162d2;
                int i14 = (int) (((i13 - i12) * f6) + 0.5d);
                int i15 = f5.f3352d;
                int i16 = f4.f3352d;
                float f7 = (i16 - i15) * f6;
                i3 = h3;
                int i17 = (int) (f7 + 0.5d);
                int max = Math.max(0, i7 - i8);
                int max2 = Math.max(0, i10 - i11);
                int max3 = Math.max(0, i13 - i14);
                int max4 = Math.max(0, i16 - i17);
                if (max != i8 || max2 != i11 || max3 != i14 || max4 != i17) {
                    f4 = V0.c.b(max, max2, max3, max4);
                }
                i3.c(i5, f4);
            }
            i5 <<= 1;
            b2 = f3;
            h3 = i3;
            c0162d2 = c0162d;
        }
        Q b3 = h3.b();
        Collections.singletonList(c0162d2);
        z.f(this.f3568e, b3);
    }
}
