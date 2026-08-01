package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j8 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            q8 q8Var = (q8) message.obj;
            p8 p8Var = q8Var.i;
            if (p8Var.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = p8Var.getLayoutParams();
                if (layoutParams instanceof kg) {
                    kg kgVar = (kg) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    o0 o0Var = baseTransientBottomBar$Behavior.i;
                    o0Var.getClass();
                    o0Var.g = q8Var.t;
                    baseTransientBottomBar$Behavior.b = new l8(q8Var);
                    kgVar.b(baseTransientBottomBar$Behavior);
                    kgVar.g = 80;
                }
                ViewGroup viewGroup = q8Var.g;
                p8Var.p = true;
                viewGroup.addView(p8Var);
                p8Var.p = false;
                q8Var.e();
                p8Var.setVisibility(4);
            }
            if (p8Var.isLaidOut()) {
                q8Var.d();
                return true;
            }
            q8Var.r = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        q8 q8Var2 = (q8) message.obj;
        int i2 = message.arg1;
        p8 p8Var2 = q8Var2.i;
        AccessibilityManager accessibilityManager = q8Var2.s;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || p8Var2.getVisibility() != 0) {
            q8Var2.b();
            return true;
        }
        if (p8Var2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(q8Var2.d);
            ofFloat.addUpdateListener(new i8(q8Var2, 0));
            ofFloat.setDuration(q8Var2.b);
            ofFloat.addListener(new h8(q8Var2, i2, 0));
            ofFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        p8 p8Var3 = q8Var2.i;
        int height = p8Var3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = p8Var3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(q8Var2.e);
        valueAnimator.setDuration(q8Var2.c);
        valueAnimator.addListener(new h8(q8Var2, i2, 2));
        valueAnimator.addUpdateListener(new i8(q8Var2, 3));
        valueAnimator.start();
        return true;
    }
}
