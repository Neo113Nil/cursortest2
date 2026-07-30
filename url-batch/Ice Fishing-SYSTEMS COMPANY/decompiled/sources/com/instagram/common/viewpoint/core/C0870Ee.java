package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0870Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0871Ef A00;
    public final /* synthetic */ C07569h A01;

    public C0870Ee(C0871Ef c0871Ef, C07569h c07569h) {
        this.A00 = c0871Ef;
        this.A01 = c07569h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z8) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z8) {
        this.A01.A0L();
    }
}
