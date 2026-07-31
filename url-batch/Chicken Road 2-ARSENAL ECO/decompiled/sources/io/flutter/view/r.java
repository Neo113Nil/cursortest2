package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f4731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4732b;

    public r(t tVar, DisplayManager displayManager) {
        this.f4732b = tVar;
        this.f4731a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            float refreshRate = this.f4731a.getDisplay(0).getRefreshRate();
            t tVar = this.f4732b;
            tVar.f4737a = (long) (1.0E9d / refreshRate);
            tVar.f4738b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
