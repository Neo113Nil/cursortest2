package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            f8 f8Var = (f8) message.obj;
            int i3 = message.arg1;
            e8 e8Var = f8Var.i;
            AccessibilityManager accessibilityManager = f8Var.t;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || e8Var.getVisibility() != 0) {
                f8Var.c();
                return true;
            }
            if (e8Var.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(f8Var.d);
                ofFloat.addUpdateListener(new w7(f8Var, 0));
                ofFloat.setDuration(f8Var.b);
                ofFloat.addListener(new v7(f8Var, i3, 0));
                ofFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            e8 e8Var2 = f8Var.i;
            int height = e8Var2.getHeight();
            ViewGroup.LayoutParams layoutParams = e8Var2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(f8Var.e);
            valueAnimator.setDuration(f8Var.c);
            valueAnimator.addListener(new v7(f8Var, i3, 2));
            valueAnimator.addUpdateListener(new w7(f8Var, 3));
            valueAnimator.start();
            return true;
        }
        f8 f8Var2 = (f8) message.obj;
        e8 e8Var3 = f8Var2.i;
        ViewGroup viewGroup = f8Var2.g;
        if (e8Var3.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = e8Var3.getLayoutParams();
            if (layoutParams2 instanceof re) {
                re reVar = (re) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                rc0 rc0Var = baseTransientBottomBar$Behavior.i;
                rc0Var.getClass();
                rc0Var.g = f8Var2.u;
                baseTransientBottomBar$Behavior.b = new z7(f8Var2);
                reVar.b(baseTransientBottomBar$Behavior);
                if (f8Var2.b() == null) {
                    reVar.g = 80;
                }
            }
            e8Var3.p = true;
            viewGroup.addView(e8Var3);
            e8Var3.p = false;
            if (f8Var2.b() != null) {
                int[] iArr = new int[2];
                f8Var2.b().getLocationOnScreen(iArr);
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                i2 = (viewGroup.getHeight() + iArr2[1]) - i4;
            }
            f8Var2.p = i2;
            f8Var2.f();
            e8Var3.setVisibility(4);
        }
        if (e8Var3.isLaidOut()) {
            f8Var2.e();
            return true;
        }
        f8Var2.s = true;
        return true;
    }
}
