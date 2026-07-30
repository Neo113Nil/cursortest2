package io.flutter.view;

import android.hardware.display.DisplayManager;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f634b;

    public r(t tVar, DisplayManager displayManager) {
        this.f634b = tVar;
        this.f633a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f633a.getDisplay(0).getRefreshRate();
            t tVar = this.f634b;
            tVar.f639a = (long) (1.0E9d / refreshRate);
            tVar.f640b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
