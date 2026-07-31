package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.T3;

/* loaded from: classes6.dex */
public class rp {
    public static String zmn(Context context) {
        int zmn = com.bytedance.sdk.component.utils.rp.zmn(context, 0L);
        if (zmn == 2) {
            return "2g";
        }
        if (zmn == 3) {
            return T3.a;
        }
        if (zmn == 4) {
            return T3.b;
        }
        if (zmn == 5) {
            return "4g";
        }
        if (zmn == 6) {
            return "5g";
        }
        return "mobile";
    }
}
