package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class np implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ oe c;

    public /* synthetic */ np(oe oeVar, View view, int i) {
        this.a = i;
        this.c = oeVar;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        View view = this.b;
        oe oeVar = this.c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) oeVar;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.w(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) oeVar;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.x(view);
                    break;
                }
                break;
        }
    }
}
