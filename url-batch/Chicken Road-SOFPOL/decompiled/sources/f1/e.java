package f1;

import a7.h1;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.snovikpovik.vuevnxsj.R;
import java.util.Iterator;
import q3.n0;
import x1.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2634e;

    public /* synthetic */ e(int i, Object obj) {
        this.f2633d = i;
        this.f2634e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2633d) {
            case 0:
                f fVar = (f) this.f2634e;
                Context context = view.getContext();
                if (!fVar.f2641d) {
                    context.getApplicationContext().registerComponentCallbacks(fVar.f2642e);
                    fVar.f2641d = true;
                    break;
                }
                break;
            case 1:
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            case 5:
                x1.a0 a0Var = (x1.a0) this.f2634e;
                AccessibilityManager accessibilityManager = a0Var.f8333g;
                a0Var.f8336k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(a0Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(a0Var.f8335j);
                break;
            case 6:
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                z5.o oVar = (z5.o) this.f2634e;
                AccessibilityManager accessibilityManager2 = oVar.f9235w;
                if (oVar.f9236x != null && accessibilityManager2 != null && oVar.isAttachedToWindow()) {
                    accessibilityManager2.addTouchExplorationStateChangeListener(oVar.f9236x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        boolean z3;
        AccessibilityManager accessibilityManager3;
        switch (this.f2633d) {
            case 0:
                f fVar = (f) this.f2634e;
                Context context = view.getContext();
                if (fVar.f2641d) {
                    context.getApplicationContext().unregisterComponentCallbacks(fVar.f2642e);
                    fVar.f2641d = false;
                    break;
                }
                break;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2634e;
                i5.a aVar = hideBottomViewOnScrollBehavior.f1820h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f1819g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f1820h = null;
                    break;
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2634e;
                i5.a aVar2 = hideViewOnScrollBehavior.f1825c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f1824b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f1825c = null;
                    break;
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                k.f fVar2 = (k.f) this.f2634e;
                ViewTreeObserver viewTreeObserver = fVar2.A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar2.A = view.getViewTreeObserver();
                    }
                    fVar2.A.removeGlobalOnLayoutListener(fVar2.f4048l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                k.r rVar = (k.r) this.f2634e;
                ViewTreeObserver viewTreeObserver2 = rVar.f4138r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rVar.f4138r = view.getViewTreeObserver();
                    }
                    rVar.f4138r.removeGlobalOnLayoutListener(rVar.f4132l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                x1.a0 a0Var = (x1.a0) this.f2634e;
                a0Var.f8337l.removeCallbacks(a0Var.N);
                AccessibilityManager accessibilityManager4 = a0Var.f8333g;
                accessibilityManager4.removeAccessibilityStateChangeListener(a0Var.i);
                accessibilityManager4.removeTouchExplorationStateChangeListener(a0Var.f8335j);
                break;
            case 6:
                x1.a aVar3 = (x1.a) this.f2634e;
                Iterator it = x6.g.b0(aVar3.getParent(), n0.f6134l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            q6.i.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    i2 i2Var = aVar3.f8325f;
                    if (i2Var != null) {
                        i2Var.e();
                    }
                    aVar3.f8325f = null;
                    aVar3.requestLayout();
                    break;
                }
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                view.removeOnAttachStateChangeListener(this);
                ((h1) this.f2634e).a(null);
                break;
            default:
                z5.o oVar = (z5.o) this.f2634e;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = oVar.f9236x;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = oVar.f9235w) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
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

    private final void f(View view) {
    }
}
