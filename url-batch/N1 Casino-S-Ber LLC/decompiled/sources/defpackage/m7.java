package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class m7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ s7 g;

    public /* synthetic */ m7(s7 s7Var, int i) {
        this.f = i;
        this.g = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f;
        s7 s7Var = this.g;
        switch (i) {
            case 0:
                r7 r7Var = s7Var.i;
                if (r7Var != null) {
                    WindowManager windowManager = (WindowManager) s7Var.h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    r7Var.getLocationInWindow(iArr);
                    int height2 = (height - (r7Var.getHeight() + iArr[1])) + ((int) r7Var.getTranslationY());
                    int i2 = s7Var.o;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = r7Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(s7.y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = s7Var.o;
                            s7Var.p = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            r7Var.requestLayout();
                            break;
                        }
                    } else {
                        s7Var.p = i2;
                        break;
                    }
                }
                break;
            case 1:
                s7Var.b();
                break;
            default:
                r7 r7Var2 = s7Var.i;
                if (r7Var2 != null) {
                    if (r7Var2.getParent() != null) {
                        r7Var2.setVisibility(0);
                    }
                    if (r7Var2.getAnimationMode() != 1) {
                        int height3 = r7Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = r7Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        r7Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(s7Var.e);
                        valueAnimator.setDuration(s7Var.c);
                        valueAnimator.addListener(new j7(s7Var, 1));
                        valueAnimator.addUpdateListener(new k7(s7Var, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(s7Var.d);
                        ofFloat.addUpdateListener(new k7(s7Var, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(s7Var.f);
                        ofFloat2.addUpdateListener(new k7(s7Var, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(s7Var.a);
                        animatorSet.addListener(new j7(s7Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
