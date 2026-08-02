package io.flutter.view;

import E1.t;
import android.view.accessibility.AccessibilityManager;
import b0.C0178i;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9338a;

    public d(i iVar) {
        this.f9338a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        i iVar = this.f9338a;
        if (iVar.f9440u) {
            return;
        }
        boolean z2 = false;
        A0.f fVar = iVar.f9423b;
        if (z) {
            ((FlutterJNI) fVar.f24c).setSemanticsEnabled(true);
        } else {
            iVar.j(false);
            ((FlutterJNI) fVar.f24c).setSemanticsEnabled(false);
        }
        C0178i c0178i = iVar.f9438s;
        if (c0178i != null) {
            boolean isTouchExplorationEnabled = iVar.f9424c.isTouchExplorationEnabled();
            t tVar = (t) c0178i.f2532b;
            if (tVar.f392i.f9100b.f9162a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!z && !isTouchExplorationEnabled) {
                z2 = true;
            }
            tVar.setWillNotDraw(z2);
        }
    }
}
