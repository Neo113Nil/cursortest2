package io.flutter.view;

import B0.C0031i;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2704a;

    public c(k kVar) {
        this.f2704a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        k kVar = this.f2704a;
        if (kVar.f2809u) {
            return;
        }
        boolean z3 = false;
        C0031i c0031i = kVar.f2790b;
        if (z2) {
            b bVar = kVar.v;
            c0031i.f156h = bVar;
            ((FlutterJNI) c0031i.f155g).setAccessibilityDelegate(bVar);
            ((FlutterJNI) c0031i.f155g).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            c0031i.f156h = null;
            ((FlutterJNI) c0031i.f155g).setAccessibilityDelegate(null);
            ((FlutterJNI) c0031i.f155g).setSemanticsEnabled(false);
        }
        B.m mVar = kVar.f2807s;
        if (mVar != null) {
            boolean isTouchExplorationEnabled = kVar.f2791c.isTouchExplorationEnabled();
            m0.q qVar = (m0.q) mVar.f78f;
            if (qVar.f3190l.f3264b.f2537a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            qVar.setWillNotDraw(z3);
        }
    }
}
