package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f2705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2706b;

    public d(k kVar, AccessibilityManager accessibilityManager) {
        this.f2706b = kVar;
        this.f2705a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        k kVar = this.f2706b;
        if (kVar.f2809u) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            kVar.i(false);
            h hVar = kVar.f2803o;
            if (hVar != null) {
                kVar.g(hVar.f2761b, 256);
                kVar.f2803o = null;
            }
        }
        B.m mVar = kVar.f2807s;
        if (mVar != null) {
            boolean isEnabled = this.f2705a.isEnabled();
            m0.q qVar = (m0.q) mVar.f78f;
            if (qVar.f3190l.f3264b.f2537a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            qVar.setWillNotDraw(z3);
        }
    }
}
