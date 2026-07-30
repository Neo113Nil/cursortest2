package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import e0.u;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f544b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f544b = iVar;
        this.f543a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        i iVar = this.f544b;
        if (iVar.f619t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            iVar.i(false);
            h hVar = iVar.f614o;
            if (hVar != null) {
                iVar.g(hVar.f574b, 256);
                iVar.f614o = null;
            }
        }
        androidx.lifecycle.n nVar = iVar.f617r;
        if (nVar != null) {
            boolean isEnabled = this.f543a.isEnabled();
            u uVar = (u) nVar.f40c;
            if (uVar.f219i.f269b.f422a.getIsSoftwareRenderingEnabled()) {
                uVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            uVar.setWillNotDraw(z3);
        }
    }
}
