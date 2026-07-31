package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f4608b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f4608b = iVar;
        this.f4607a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        i iVar = this.f4608b;
        if (iVar.f4715t) {
            return;
        }
        boolean z6 = false;
        if (!z5) {
            iVar.i(false);
            h hVar = iVar.f4710o;
            if (hVar != null) {
                iVar.g(hVar.f4667b, 256);
                iVar.f4710o = null;
            }
        }
        J1.c cVar = iVar.f4713r;
        if (cVar != null) {
            boolean isEnabled = this.f4607a.isEnabled();
            D3.t tVar = (D3.t) cVar.f1289g;
            if (tVar.f479n.f601b.f4486a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z5) {
                z6 = true;
            }
            tVar.setWillNotDraw(z6);
        }
    }
}
