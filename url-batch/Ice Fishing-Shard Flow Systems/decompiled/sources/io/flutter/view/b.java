package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5788a;

    public b(g gVar) {
        this.f5788a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z7) {
        g gVar = this.f5788a;
        D0.j jVar = gVar.f5880b;
        if (gVar.f5898u) {
            return;
        }
        if (z7) {
            ((FlutterJNI) jVar.f331i).setSemanticsEnabled(true);
        } else {
            gVar.j(false);
            ((FlutterJNI) jVar.f331i).setSemanticsEnabled(false);
        }
        B.f fVar = gVar.f5896s;
        if (fVar != null) {
            boolean isTouchExplorationEnabled = gVar.f5881c.isTouchExplorationEnabled();
            h4.p pVar = (h4.p) fVar.f152e;
            if (pVar.f5250q.f5502b.f5598a.getIsSoftwareRenderingEnabled()) {
                pVar.setWillNotDraw(false);
            } else {
                pVar.setWillNotDraw((z7 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
