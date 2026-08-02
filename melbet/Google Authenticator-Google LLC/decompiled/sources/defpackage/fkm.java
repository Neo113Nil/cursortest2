package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkm extends fkd {
    public float f;
    public Rect g;
    public Rect h;
    public float[] i;
    private final float j;
    private final float k;

    public fkm(View view) {
        super(view);
        Resources resources = view.getResources();
        this.j = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.k = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private static final int j(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public final AnimatorSet e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.a;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new fkl(view));
        return animatorSet;
    }

    public final void f(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet e = e(view);
        View view2 = this.a;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view2;
            ValueAnimator ofObject = ValueAnimator.ofObject(new fkk(), clippableRoundedCornerLayout.b, i());
            ofObject.addUpdateListener(new mu(clippableRoundedCornerLayout, 9, null));
            e.playTogether(ofObject);
        }
        e.setDuration(this.d);
        e.start();
        g();
    }

    public final void g() {
        this.f = 0.0f;
        this.g = null;
        this.h = null;
    }

    public final void h(mx mxVar, View view, float f) {
        if (super.d(mxVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        int i = mxVar.c;
        float f2 = mxVar.b;
        float f3 = mxVar.a;
        float a = a(f2);
        View view2 = this.a;
        float width = view2.getWidth();
        float height = view2.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        TimeInterpolator timeInterpolator = fes.a;
        float f4 = (-0.100000024f) * a;
        float f5 = this.j;
        float max = ((Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f5) + 0.0f) * a) + 0.0f;
        int i2 = i != 0 ? -1 : 1;
        float f6 = f4 + 1.0f;
        float min = Math.min(Math.max(0.0f, ((height - (f6 * height)) / 2.0f) - f5), this.k);
        float f7 = f3 - this.f;
        float abs = (((Math.abs(f7) / height) * (min + 0.0f)) + 0.0f) * Math.signum(f7);
        if (Float.isNaN(f6)) {
            return;
        }
        float f8 = max * i2;
        if (Float.isNaN(f8) || Float.isNaN(abs)) {
            return;
        }
        view2.setScaleX(f6);
        view2.setScaleY(f6);
        view2.setTranslationX(f8);
        view2.setTranslationY(abs);
        if (view2 instanceof ClippableRoundedCornerLayout) {
            float[] i3 = i();
            float f9 = i3[0];
            float f10 = i3[1];
            float f11 = i3[2];
            float f12 = i3[3];
            float f13 = i3[4];
            float f14 = i3[5];
            float f15 = i3[6];
            float f16 = i3[7];
            ((ClippableRoundedCornerLayout) view2).b(new float[]{f9 + ((f - f9) * a), f10 + ((f - f10) * a), f11 + ((f - f11) * a), f12 + ((f - f12) * a), f13 + ((f - f13) * a), f14 + ((f - f14) * a), f15 + ((f - f15) * a), f16 + (a * (f - f16))});
        }
    }

    public final float[] i() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        float[] fArr2 = this.i;
        if (fArr2 != null) {
            return fArr2;
        }
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.a).getRootWindowInsets()) == null) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i4 = displayMetrics.widthPixels;
            int i5 = displayMetrics.heightPixels;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            int width = view.getWidth();
            int height = view.getHeight();
            if (i6 != 0) {
                i = i6;
                c = 7;
                i2 = 0;
            } else if (i7 == 0) {
                i = 0;
                i2 = j(rootWindowInsets, 0);
                c = 7;
                i7 = 0;
            } else {
                i2 = 0;
                i = 0;
                c = 7;
            }
            int i8 = i + width;
            if (i8 < i4 || i7 != 0) {
                i3 = 0;
                c2 = 6;
            } else {
                i3 = j(rootWindowInsets, 1);
                c2 = 6;
                i7 = 0;
            }
            int j = (i8 < i4 || i7 + height < i5) ? 0 : j(rootWindowInsets, 2);
            int j2 = (i != 0 || i7 + height < i5) ? 0 : j(rootWindowInsets, 3);
            fArr = new float[8];
            float f = i2;
            fArr[0] = f;
            fArr[1] = f;
            float f2 = i3;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = j;
            fArr[4] = f3;
            fArr[5] = f3;
            float f4 = j2;
            fArr[c2] = f4;
            fArr[c] = f4;
        }
        this.i = fArr;
        return fArr;
    }
}
