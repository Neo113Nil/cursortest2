package io.flutter.view;

import E.v;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f749a;

    public b(g gVar) {
        this.f749a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        g gVar = this.f749a;
        if (gVar.t) {
            return;
        }
        boolean z2 = false;
        D.b bVar = gVar.f831b;
        if (z) {
            a aVar = gVar.f849u;
            bVar.f101c = aVar;
            ((FlutterJNI) bVar.f100b).setAccessibilityDelegate(aVar);
            ((FlutterJNI) bVar.f100b).setSemanticsEnabled(true);
        } else {
            gVar.i(false);
            bVar.f101c = null;
            ((FlutterJNI) bVar.f100b).setAccessibilityDelegate(null);
            ((FlutterJNI) bVar.f100b).setSemanticsEnabled(false);
        }
        B.k kVar = gVar.f847r;
        if (kVar != null) {
            boolean isTouchExplorationEnabled = gVar.f832c.isTouchExplorationEnabled();
            v vVar = (v) kVar.f44c;
            if (vVar.f197h.f224b.f623a.getIsSoftwareRenderingEnabled()) {
                vVar.setWillNotDraw(false);
                return;
            }
            if (!z && !isTouchExplorationEnabled) {
                z2 = true;
            }
            vVar.setWillNotDraw(z2);
        }
    }
}
