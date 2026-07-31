package io.flutter.view;

import B0.C0008i;
import B0.E;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f2511a;

    public d(i iVar) {
        this.f2511a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        i iVar = this.f2511a;
        C0008i c0008i = iVar.f2597b;
        if (iVar.t) {
            return;
        }
        if (z2) {
            ((FlutterJNI) c0008i.f85g).setSemanticsEnabled(true);
        } else {
            iVar.i(false);
            ((FlutterJNI) c0008i.f85g).setSemanticsEnabled(false);
        }
        E e2 = iVar.f2613r;
        if (e2 != null) {
            boolean isTouchExplorationEnabled = iVar.f2598c.isTouchExplorationEnabled();
            k0.o oVar = (k0.o) e2.f20f;
            if (oVar.f2728n.f2776b.f2389a.getIsSoftwareRenderingEnabled()) {
                oVar.setWillNotDraw(false);
            } else {
                oVar.setWillNotDraw((z2 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
