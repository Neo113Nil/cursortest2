package io.flutter.view;

import B0.E;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2513b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f2513b = iVar;
        this.f2512a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        i iVar = this.f2513b;
        if (iVar.t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            iVar.i(false);
            h hVar = iVar.f2610o;
            if (hVar != null) {
                iVar.g(hVar.f2570b, 256);
                iVar.f2610o = null;
            }
        }
        E e2 = iVar.f2613r;
        if (e2 != null) {
            boolean isEnabled = this.f2512a.isEnabled();
            k0.o oVar = (k0.o) e2.f20f;
            if (oVar.f2728n.f2776b.f2389a.getIsSoftwareRenderingEnabled()) {
                oVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            oVar.setWillNotDraw(z3);
        }
    }
}
