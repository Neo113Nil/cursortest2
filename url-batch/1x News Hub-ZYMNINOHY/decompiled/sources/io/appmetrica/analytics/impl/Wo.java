package io.appmetrica.analytics.impl;

import android.view.Surface;
import android.view.SurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Wo {
    public static /* synthetic */ Surface f(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder g() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction h() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction k(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void o() {
    }
}
