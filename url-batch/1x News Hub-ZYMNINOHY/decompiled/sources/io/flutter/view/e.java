package io.flutter.view;

import E1.t;
import android.view.accessibility.AccessibilityManager;
import b0.C0178i;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f9339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9340b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f9340b = iVar;
        this.f9339a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        i iVar = this.f9340b;
        if (iVar.f9440u) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            iVar.j(false);
            h hVar = iVar.f9435p;
            if (hVar != null) {
                iVar.h(hVar.f9395b, 256);
                iVar.f9435p = null;
            }
        }
        C0178i c0178i = iVar.f9438s;
        if (c0178i != null) {
            boolean isEnabled = this.f9339a.isEnabled();
            t tVar = (t) c0178i.f2532b;
            if (tVar.f392i.f9100b.f9162a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z) {
                z2 = true;
            }
            tVar.setWillNotDraw(z2);
        }
    }
}
