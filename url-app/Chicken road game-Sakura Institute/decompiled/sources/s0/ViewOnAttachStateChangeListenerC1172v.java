package s0;

import a1.C0406u;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.chicken.road.kedro.laqer.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1172v implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10402e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1172v(int i2, Object obj) {
        this.f10401d = i2;
        this.f10402e = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f10401d) {
            case 0:
                C1118D c1118d = (C1118D) this.f10402e;
                AccessibilityManager accessibilityManager = c1118d.f10014g;
                accessibilityManager.addAccessibilityStateChangeListener(c1118d.f10016i);
                accessibilityManager.addTouchExplorationStateChangeListener(c1118d.f10017j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z4;
        switch (this.f10401d) {
            case 0:
                C1118D c1118d = (C1118D) this.f10402e;
                c1118d.f10019l.removeCallbacks(c1118d.f10008K);
                AccessibilityManager accessibilityManager = c1118d.f10014g;
                accessibilityManager.removeAccessibilityStateChangeListener(c1118d.f10016i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c1118d.f10017j);
                break;
            case 1:
                AbstractC1131a abstractC1131a = (AbstractC1131a) this.f10402e;
                Intrinsics.checkNotNullParameter(abstractC1131a, "<this>");
                Iterator it = T2.n.f(abstractC1131a.getParent(), C0406u.f4893o).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            Intrinsics.checkNotNullParameter(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z4 = true;
                            }
                        }
                    }
                }
                if (!z4) {
                    l1 l1Var = abstractC1131a.f10163i;
                    if (l1Var != null) {
                        l1Var.c();
                    }
                    abstractC1131a.f10163i = null;
                    abstractC1131a.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((W2.r0) this.f10402e).a(null);
                break;
        }
    }
}
