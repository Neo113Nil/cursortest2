package com.squareup.util.android;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class RealCarrierInfo {
    public final TelephonyManager telephony;

    public RealCarrierInfo(Context context) {
        this.telephony = (TelephonyManager) context.getSystemService("phone");
    }
}
