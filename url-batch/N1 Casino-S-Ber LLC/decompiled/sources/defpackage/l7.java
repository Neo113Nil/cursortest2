package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            s7 s7Var = (s7) message.obj;
            r7 r7Var = s7Var.i;
            if (r7Var.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = r7Var.getLayoutParams();
                if (layoutParams instanceof qd) {
                    qd qdVar = (qd) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    k0 k0Var = baseTransientBottomBar$Behavior.i;
                    k0Var.getClass();
                    k0Var.g = s7Var.s;
                    baseTransientBottomBar$Behavior.b = new n7(s7Var);
                    qdVar.b(baseTransientBottomBar$Behavior);
                    qdVar.g = 80;
                }
                ViewGroup viewGroup = s7Var.g;
                r7Var.p = true;
                viewGroup.addView(r7Var);
                r7Var.p = false;
                s7Var.e();
                r7Var.setVisibility(4);
            }
            if (r7Var.isLaidOut()) {
                s7Var.d();
                return true;
            }
            s7Var.q = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        s7 s7Var2 = (s7) message.obj;
        int i2 = message.arg1;
        r7 r7Var2 = s7Var2.i;
        AccessibilityManager accessibilityManager = s7Var2.r;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || r7Var2.getVisibility() != 0) {
            s7Var2.b();
            return true;
        }
        if (r7Var2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(s7Var2.d);
            ofFloat.addUpdateListener(new k7(s7Var2, 0));
            ofFloat.setDuration(s7Var2.b);
            ofFloat.addListener(new j7(s7Var2, i2, 0));
            ofFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        r7 r7Var3 = s7Var2.i;
        int height = r7Var3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = r7Var3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(s7Var2.e);
        valueAnimator.setDuration(s7Var2.c);
        valueAnimator.addListener(new j7(s7Var2, i2, 2));
        valueAnimator.addUpdateListener(new k7(s7Var2, 3));
        valueAnimator.start();
        return true;
    }
}
