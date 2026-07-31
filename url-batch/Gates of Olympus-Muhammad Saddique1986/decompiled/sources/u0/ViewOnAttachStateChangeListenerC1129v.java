package u0;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import c1.C0397v;
import com.gatesof.olympus.martu.marku.R;
import java.util.Iterator;

/* renamed from: u0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1129v implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9534e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1129v(int i3, Object obj) {
        this.f9533d = i3;
        this.f9534e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f9533d) {
            case 0:
                E e3 = (E) this.f9534e;
                AccessibilityManager accessibilityManager = e3.f9154g;
                accessibilityManager.addAccessibilityStateChangeListener(e3.f9156i);
                accessibilityManager.addTouchExplorationStateChangeListener(e3.f9157j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z3;
        switch (this.f9533d) {
            case 0:
                E e3 = (E) this.f9534e;
                e3.f9159l.removeCallbacks(e3.f9148K);
                AccessibilityManager accessibilityManager = e3.f9154g;
                accessibilityManager.removeAccessibilityStateChangeListener(e3.f9156i);
                accessibilityManager.removeTouchExplorationStateChangeListener(e3.f9157j);
                break;
            case 1:
                AbstractC1088a abstractC1088a = (AbstractC1088a) this.f9534e;
                f2.j.f(abstractC1088a, "<this>");
                Iterator it = m2.h.T(abstractC1088a.getParent(), C0397v.f5612l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            f2.j.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    k1 k1Var = abstractC1088a.f9300f;
                    if (k1Var != null) {
                        k1Var.c();
                    }
                    abstractC1088a.f9300f = null;
                    abstractC1088a.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((q2.m0) this.f9534e).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
