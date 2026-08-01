package t1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.c f3389c;

    public /* synthetic */ a(a0.c cVar, View view, int i) {
        this.f3387a = i;
        this.f3389c = cVar;
        this.f3388b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        switch (this.f3387a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f3389c;
                if (z4 && hideBottomViewOnScrollBehavior.f912j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f3388b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f3389c;
                if (z4 && hideViewOnScrollBehavior.f922j == 1) {
                    hideViewOnScrollBehavior.s(this.f3388b);
                    break;
                }
                break;
        }
    }
}
