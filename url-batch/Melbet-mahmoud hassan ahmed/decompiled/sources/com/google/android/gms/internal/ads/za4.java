package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class za4 implements DisplayManager.DisplayListener, wa4 {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f15058a;

    /* renamed from: b, reason: collision with root package name */
    private ua4 f15059b;

    private za4(DisplayManager displayManager) {
        this.f15058a = displayManager;
    }

    public static wa4 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new za4(displayManager);
        }
        return null;
    }

    private final Display c() {
        return this.f15058a.getDisplay(0);
    }

    @Override // com.google.android.gms.internal.ads.wa4
    public final void a(ua4 ua4Var) {
        this.f15059b = ua4Var;
        this.f15058a.registerDisplayListener(this, n13.f0(null));
        bb4.b(ua4Var.f12726a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        ua4 ua4Var = this.f15059b;
        if (ua4Var == null || i7 != 0) {
            return;
        }
        bb4.b(ua4Var.f12726a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.wa4
    public final void zza() {
        this.f15058a.unregisterDisplayListener(this);
        this.f15059b = null;
    }
}
