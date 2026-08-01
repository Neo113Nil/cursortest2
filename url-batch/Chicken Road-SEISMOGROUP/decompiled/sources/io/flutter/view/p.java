package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class p implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f866b;

    public p(r rVar, DisplayManager displayManager) {
        this.f866b = rVar;
        this.f865a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f865a.getDisplay(0).getRefreshRate();
            r rVar = this.f866b;
            rVar.f871a = (long) (1.0E9d / refreshRate);
            rVar.f872b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
