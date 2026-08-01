package o1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2987b;
    public final /* synthetic */ x.a c;

    public /* synthetic */ a(x.a aVar, View view, int i4) {
        this.f2986a = i4;
        this.c = aVar;
        this.f2987b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f2986a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                if (z3 && hideBottomViewOnScrollBehavior.f1175j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f2987b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                if (z3 && hideViewOnScrollBehavior.f1185j == 1) {
                    hideViewOnScrollBehavior.s(this.f2987b);
                    break;
                }
                break;
        }
    }
}
