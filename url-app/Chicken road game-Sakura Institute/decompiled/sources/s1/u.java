package s1;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8434g;

    public /* synthetic */ u(int i7, Object obj) {
        this.f8433f = i7;
        this.f8434g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f8433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) this.f8434g;
                AccessibilityManager accessibilityManager = c0Var.f8163g;
                accessibilityManager.addAccessibilityStateChangeListener(c0Var.f8165i);
                accessibilityManager.addTouchExplorationStateChangeListener(c0Var.f8166j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z8;
        switch (this.f8433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) this.f8434g;
                c0Var.f8168l.removeCallbacks(c0Var.K);
                AccessibilityManager accessibilityManager = c0Var.f8163g;
                accessibilityManager.removeAccessibilityStateChangeListener(c0Var.f8165i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c0Var.f8166j);
                break;
            case 1:
                a aVar = (a) this.f8434g;
                Iterator it = y6.h.o(aVar.getParent(), b3.v.f1370n).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            r6.k.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (!z8) {
                    c3 c3Var = aVar.f8121h;
                    if (c3Var != null) {
                        c3Var.a();
                    }
                    aVar.f8121h = null;
                    aVar.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((c7.m1) this.f8434g).c(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
