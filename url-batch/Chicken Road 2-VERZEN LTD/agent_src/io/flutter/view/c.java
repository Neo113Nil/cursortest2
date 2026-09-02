package io.flutter.view;

import D.u;
import D.y;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f696a;

    public c(h hVar) {
        this.f696a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        h hVar = this.f696a;
        if (hVar.f797t) {
            return;
        }
        boolean z3 = false;
        C.b bVar = hVar.f779b;
        if (z2) {
            ((FlutterJNI) bVar.f14b).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((FlutterJNI) bVar.f14b).setSemanticsEnabled(false);
        }
        u uVar = hVar.f795r;
        if (uVar != null) {
            boolean isTouchExplorationEnabled = hVar.f780c.isTouchExplorationEnabled();
            y yVar = (y) uVar.f111c;
            if (yVar.f129j.f149b.f570a.getIsSoftwareRenderingEnabled()) {
                yVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            yVar.setWillNotDraw(z3);
        }
    }
}
