package com.startapp.sdk.internal;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoTdscdma;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {
    public static /* bridge */ /* synthetic */ CellIdentityNr e(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma f(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* synthetic */ Surface i(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder j() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction k() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction m(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ WindowInsets.Builder p(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void r() {
    }

    public static /* bridge */ /* synthetic */ boolean w(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }
}
