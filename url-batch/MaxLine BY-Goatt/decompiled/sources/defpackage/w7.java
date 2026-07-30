package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.majelw.libystne.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ w7(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                b8 b8Var = (b8) obj;
                AccessibilityManager accessibilityManager = b8Var.g;
                b8Var.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(b8Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(b8Var.j);
                break;
            case 1:
                x9 x9Var = (x9) obj;
                Context context = view.getContext();
                if (!x9Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(x9Var.e);
                    x9Var.d = true;
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = e53.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                b8 b8Var = (b8) obj;
                b8Var.l.removeCallbacks(b8Var.N);
                AccessibilityManager accessibilityManager = b8Var.g;
                accessibilityManager.removeAccessibilityStateChangeListener(b8Var.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(b8Var.j);
                break;
            case 1:
                x9 x9Var = (x9) obj;
                Context context = view.getContext();
                if (x9Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(x9Var.e);
                    x9Var.d = false;
                    break;
                }
                break;
            case 2:
                at atVar = (at) obj;
                ViewTreeObserver viewTreeObserver = atVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        atVar.J = view.getViewTreeObserver();
                    }
                    atVar.J.removeGlobalOnLayoutListener(atVar.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                break;
            case 4:
                lo2 lo2Var = (lo2) obj;
                ViewTreeObserver viewTreeObserver2 = lo2Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        lo2Var.A = view.getViewTreeObserver();
                    }
                    lo2Var.A.removeGlobalOnLayoutListener(lo2Var.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                d0 d0Var = (d0) obj;
                for (Object obj2 : aj2.c(d0Var.getParent(), j53.o)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                g93 g93Var = d0Var.o;
                if (g93Var != null) {
                    g93Var.a();
                }
                d0Var.o = null;
                d0Var.requestLayout();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((jo2) obj).f(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
