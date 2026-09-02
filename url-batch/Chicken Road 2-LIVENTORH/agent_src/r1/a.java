package r1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.b f3148c;

    public /* synthetic */ a(a0.b bVar, View view, int i) {
        this.f3146a = i;
        this.f3148c = bVar;
        this.f3147b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f3146a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f3148c;
                if (z3 && hideBottomViewOnScrollBehavior.f802j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f3147b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f3148c;
                if (z3 && hideViewOnScrollBehavior.f811j == 1) {
                    hideViewOnScrollBehavior.s(this.f3147b);
                    break;
                }
                break;
        }
    }
}
