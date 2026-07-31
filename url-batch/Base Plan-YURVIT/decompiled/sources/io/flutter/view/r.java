package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f2630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2631b;

    public r(t tVar, DisplayManager displayManager) {
        this.f2631b = tVar;
        this.f2630a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f2630a.getDisplay(0).getRefreshRate();
            t tVar = this.f2631b;
            tVar.f2636a = (long) (1.0E9d / refreshRate);
            tVar.f2637b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
