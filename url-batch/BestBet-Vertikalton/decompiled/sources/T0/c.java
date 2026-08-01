package T0;

import K.Q;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import x.AbstractC0392a;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            i iVar = (i) message.obj;
            h hVar = iVar.i;
            if (hVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                if (layoutParams instanceof x.d) {
                    x.d dVar = (x.d) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    A0.c cVar = baseTransientBottomBar$Behavior.i;
                    cVar.getClass();
                    cVar.f6b = iVar.f1065t;
                    baseTransientBottomBar$Behavior.f2140b = new e(iVar);
                    AbstractC0392a abstractC0392a = dVar.f4525a;
                    if (abstractC0392a != baseTransientBottomBar$Behavior) {
                        if (abstractC0392a != null) {
                            abstractC0392a.e();
                        }
                        dVar.f4525a = baseTransientBottomBar$Behavior;
                        dVar.f4526b = true;
                    }
                    dVar.f4530g = 80;
                }
                hVar.f1042k = true;
                iVar.f1054g.addView(hVar);
                hVar.f1042k = false;
                iVar.e();
                hVar.setVisibility(4);
            }
            WeakHashMap weakHashMap = Q.f578a;
            if (hVar.isLaidOut()) {
                iVar.d();
            } else {
                iVar.f1063r = true;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        i iVar2 = (i) message.obj;
        int i2 = message.arg1;
        AccessibilityManager accessibilityManager = iVar2.f1064s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            h hVar2 = iVar2.i;
            if (hVar2.getVisibility() == 0) {
                if (hVar2.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, RecyclerView.f1937A0);
                    ofFloat.setInterpolator(iVar2.d);
                    ofFloat.addUpdateListener(new b(iVar2, 0, (byte) 0));
                    ofFloat.setDuration(iVar2.f1050b);
                    ofFloat.addListener(new a(iVar2, i2, 0));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int height = hVar2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = hVar2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height);
                    valueAnimator.setInterpolator(iVar2.f1052e);
                    valueAnimator.setDuration(iVar2.f1051c);
                    valueAnimator.addListener(new a(iVar2, i2, 2));
                    valueAnimator.addUpdateListener(new b(iVar2, 3, (byte) 0));
                    valueAnimator.start();
                }
                return true;
            }
        }
        iVar2.b();
        return true;
    }
}
