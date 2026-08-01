package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* compiled from: PAGNetworkTools.java */
/* loaded from: classes2.dex */
public class uc {
    public static String pvs(Context context) {
        int pvs = com.bytedance.sdk.component.utils.ny.pvs(context, 0L);
        return pvs != 2 ? pvs != 3 ? pvs != 4 ? pvs != 5 ? pvs != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }
}
