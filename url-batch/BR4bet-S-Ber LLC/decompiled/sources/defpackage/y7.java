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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class y7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ f8 g;

    public /* synthetic */ y7(f8 f8Var, int i) {
        this.f = i;
        this.g = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f;
        f8 f8Var = this.g;
        switch (i) {
            case 0:
                e8 e8Var = f8Var.i;
                if (e8Var != null) {
                    WindowManager windowManager = (WindowManager) f8Var.h.getSystemService("window");
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
                    e8Var.getLocationInWindow(iArr);
                    int height2 = (height - (e8Var.getHeight() + iArr[1])) + ((int) e8Var.getTranslationY());
                    int i2 = f8Var.q;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = e8Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(f8.A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = f8Var.q;
                            f8Var.r = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            e8Var.requestLayout();
                            break;
                        }
                    } else {
                        f8Var.r = i2;
                        break;
                    }
                }
                break;
            case 1:
                f8Var.c();
                break;
            default:
                e8 e8Var2 = f8Var.i;
                if (e8Var2 != null) {
                    if (e8Var2.getParent() != null) {
                        e8Var2.setVisibility(0);
                    }
                    if (e8Var2.getAnimationMode() != 1) {
                        int height3 = e8Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = e8Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        e8Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(f8Var.e);
                        valueAnimator.setDuration(f8Var.c);
                        valueAnimator.addListener(new v7(f8Var, 1));
                        valueAnimator.addUpdateListener(new w7(f8Var, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(f8Var.d);
                        ofFloat.addUpdateListener(new w7(f8Var, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(f8Var.f);
                        ofFloat2.addUpdateListener(new w7(f8Var, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(f8Var.a);
                        animatorSet.addListener(new v7(f8Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
