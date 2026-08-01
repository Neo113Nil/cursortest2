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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k8 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ q8 g;

    public /* synthetic */ k8(q8 q8Var, int i) {
        this.f = i;
        this.g = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f;
        q8 q8Var = this.g;
        switch (i) {
            case 0:
                p8 p8Var = q8Var.i;
                if (p8Var != null) {
                    WindowManager windowManager = (WindowManager) q8Var.h.getSystemService("window");
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
                    p8Var.getLocationInWindow(iArr);
                    int height2 = (height - (p8Var.getHeight() + iArr[1])) + ((int) p8Var.getTranslationY());
                    int i2 = q8Var.p;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = p8Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(q8.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = q8Var.p;
                            q8Var.q = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            p8Var.requestLayout();
                            break;
                        }
                    } else {
                        q8Var.q = i2;
                        break;
                    }
                }
                break;
            case 1:
                q8Var.b();
                break;
            default:
                p8 p8Var2 = q8Var.i;
                if (p8Var2 != null) {
                    if (p8Var2.getParent() != null) {
                        p8Var2.setVisibility(0);
                    }
                    if (p8Var2.getAnimationMode() != 1) {
                        int height3 = p8Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = p8Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        p8Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(q8Var.e);
                        valueAnimator.setDuration(q8Var.c);
                        valueAnimator.addListener(new h8(q8Var, 1));
                        valueAnimator.addUpdateListener(new i8(q8Var, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(q8Var.d);
                        ofFloat.addUpdateListener(new i8(q8Var, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(q8Var.f);
                        ofFloat2.addUpdateListener(new i8(q8Var, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(q8Var.a);
                        animatorSet.addListener(new h8(q8Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
