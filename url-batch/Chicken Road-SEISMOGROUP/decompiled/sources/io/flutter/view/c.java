package io.flutter.view;

import E.v;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f751b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f751b = gVar;
        this.f750a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        g gVar = this.f751b;
        if (gVar.t) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            gVar.i(false);
            f fVar = gVar.f844o;
            if (fVar != null) {
                gVar.g(fVar.f805b, 256);
                gVar.f844o = null;
            }
        }
        B.k kVar = gVar.f847r;
        if (kVar != null) {
            boolean isEnabled = this.f750a.isEnabled();
            v vVar = (v) kVar.f44c;
            if (vVar.f197h.f224b.f623a.getIsSoftwareRenderingEnabled()) {
                vVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z) {
                z2 = true;
            }
            vVar.setWillNotDraw(z2);
        }
    }
}
