package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import e0.h0;
import e0.u;
import io.flutter.embedding.engine.FlutterJNI;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f542a;

    public d(i iVar) {
        this.f542a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        i iVar = this.f542a;
        h0 h0Var = iVar.f602b;
        if (iVar.f619t) {
            return;
        }
        if (z2) {
            ((FlutterJNI) h0Var.f152b).setSemanticsEnabled(true);
        } else {
            iVar.i(false);
            ((FlutterJNI) h0Var.f152b).setSemanticsEnabled(false);
        }
        androidx.lifecycle.n nVar = iVar.f617r;
        if (nVar != null) {
            boolean isTouchExplorationEnabled = iVar.f603c.isTouchExplorationEnabled();
            u uVar = (u) nVar.f40c;
            if (uVar.f219i.f269b.f422a.getIsSoftwareRenderingEnabled()) {
                uVar.setWillNotDraw(false);
            } else {
                uVar.setWillNotDraw((z2 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
