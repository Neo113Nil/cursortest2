package io.flutter.view;

import L.C0026b;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2508a;

    public c(h hVar) {
        this.f2508a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        h hVar = this.f2508a;
        if (hVar.f2615t) {
            return;
        }
        boolean z3 = false;
        C0026b c0026b = hVar.f2598b;
        if (z2) {
            ((FlutterJNI) c0026b.f520f).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((FlutterJNI) c0026b.f520f).setSemanticsEnabled(false);
        }
        A.j jVar = hVar.r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = hVar.f2599c.isTouchExplorationEnabled();
            c0.r rVar = (c0.r) jVar.f30f;
            if (rVar.f1750m.f1789b.f2385a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            rVar.setWillNotDraw(z3);
        }
    }
}
