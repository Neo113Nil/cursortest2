package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f5789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5790b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f5790b = gVar;
        this.f5789a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z7) {
        g gVar = this.f5790b;
        if (gVar.f5898u) {
            return;
        }
        boolean z8 = false;
        if (!z7) {
            gVar.j(false);
            f fVar = gVar.f5893p;
            if (fVar != null) {
                gVar.h(fVar.f5849b, 256);
                gVar.f5893p = null;
            }
        }
        B.f fVar2 = gVar.f5896s;
        if (fVar2 != null) {
            boolean isEnabled = this.f5789a.isEnabled();
            h4.p pVar = (h4.p) fVar2.f152e;
            if (pVar.f5250q.f5502b.f5598a.getIsSoftwareRenderingEnabled()) {
                pVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z7) {
                z8 = true;
            }
            pVar.setWillNotDraw(z8);
        }
    }
}
