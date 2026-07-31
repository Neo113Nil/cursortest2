package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f4606a;

    public d(i iVar) {
        this.f4606a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        i iVar = this.f4606a;
        B0.c cVar = iVar.f4697b;
        if (iVar.f4715t) {
            return;
        }
        if (z5) {
            ((FlutterJNI) cVar.f73i).setSemanticsEnabled(true);
        } else {
            iVar.i(false);
            ((FlutterJNI) cVar.f73i).setSemanticsEnabled(false);
        }
        J1.c cVar2 = iVar.f4713r;
        if (cVar2 != null) {
            boolean isTouchExplorationEnabled = iVar.f4698c.isTouchExplorationEnabled();
            D3.t tVar = (D3.t) cVar2.f1289g;
            if (tVar.f479n.f601b.f4486a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
            } else {
                tVar.setWillNotDraw((z5 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
