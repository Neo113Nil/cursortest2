package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ffo implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ tw b;
    private final /* synthetic */ int c;

    public /* synthetic */ ffo(tw twVar, View view, int i) {
        this.c = i;
        this.b = twVar;
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.c != 0) {
            if (z) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                if (hideBottomViewOnScrollBehavior.J()) {
                    hideBottomViewOnScrollBehavior.K(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
            if (hideViewOnScrollBehavior.J()) {
                hideViewOnScrollBehavior.K(this.a);
            }
        }
    }
}
