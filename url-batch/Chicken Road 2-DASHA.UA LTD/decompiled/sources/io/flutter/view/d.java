package io.flutter.view;

import D.u;
import D.y;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f698b;

    public d(h hVar, AccessibilityManager accessibilityManager) {
        this.f698b = hVar;
        this.f697a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        h hVar = this.f698b;
        if (hVar.f797t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            hVar.i(false);
            g gVar = hVar.f792o;
            if (gVar != null) {
                hVar.g(gVar.f752b, 256);
                hVar.f792o = null;
            }
        }
        u uVar = hVar.f795r;
        if (uVar != null) {
            boolean isEnabled = this.f697a.isEnabled();
            y yVar = (y) uVar.f111c;
            if (yVar.f129j.f149b.f570a.getIsSoftwareRenderingEnabled()) {
                yVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            yVar.setWillNotDraw(z3);
        }
    }
}
