package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class p implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f10392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10393b;

    public p(r rVar, DisplayManager displayManager) {
        this.f10393b = rVar;
        this.f10392a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f10392a.getDisplay(0).getRefreshRate();
            r rVar = this.f10393b;
            rVar.f10398a = (long) (1.0E9d / refreshRate);
            rVar.f10399b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
