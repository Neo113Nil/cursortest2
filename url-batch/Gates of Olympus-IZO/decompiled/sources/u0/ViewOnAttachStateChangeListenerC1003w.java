package u0;

import a1.C0181t;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.gates.olympus.miruv.R;
import java.util.Iterator;

/* renamed from: u0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1003w implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8493e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1003w(int i3, Object obj) {
        this.f8492d = i3;
        this.f8493e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f8492d) {
            case 0:
                C0959F c0959f = (C0959F) this.f8493e;
                AccessibilityManager accessibilityManager = c0959f.f8139g;
                accessibilityManager.addAccessibilityStateChangeListener(c0959f.f8141i);
                accessibilityManager.addTouchExplorationStateChangeListener(c0959f.f8142j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z3;
        switch (this.f8492d) {
            case 0:
                C0959F c0959f = (C0959F) this.f8493e;
                c0959f.f8144l.removeCallbacks(c0959f.f8133K);
                AccessibilityManager accessibilityManager = c0959f.f8139g;
                accessibilityManager.removeAccessibilityStateChangeListener(c0959f.f8141i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c0959f.f8142j);
                break;
            case 1:
                AbstractC0960a abstractC0960a = (AbstractC0960a) this.f8493e;
                Z1.i.f(abstractC0960a, "<this>");
                Iterator it = g2.h.c0(abstractC0960a.getParent(), C0181t.f3563l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            Z1.i.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    Z0 z02 = abstractC0960a.f8280f;
                    if (z02 != null) {
                        z02.c();
                    }
                    abstractC0960a.f8280f = null;
                    abstractC0960a.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((k2.m0) this.f8493e).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
