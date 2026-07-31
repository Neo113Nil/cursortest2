package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2249Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C2250Ef A00;
    public final /* synthetic */ C21359h A01;

    public C2249Ee(C2250Ef c2250Ef, C21359h c21359h) {
        this.A00 = c2250Ef;
        this.A01 = c21359h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
