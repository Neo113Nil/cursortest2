package i5;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3.a f3453c;

    public /* synthetic */ a(d3.a aVar, View view, int i) {
        this.f3451a = i;
        this.f3453c = aVar;
        this.f3452b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f3451a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f3453c;
                if (z3 && hideBottomViewOnScrollBehavior.f1821j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f3452b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f3453c;
                if (z3 && hideViewOnScrollBehavior.f1831j == 1) {
                    hideViewOnScrollBehavior.s(this.f3452b);
                    break;
                }
                break;
        }
    }
}
