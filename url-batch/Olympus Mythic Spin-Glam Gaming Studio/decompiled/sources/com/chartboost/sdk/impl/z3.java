package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* loaded from: classes6.dex */
public class z3 {
    public y3 a(Context context) {
        String str;
        String str2;
        if (c(context)) {
            xb.a("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager b = b(context);
        if (!a(b)) {
            return null;
        }
        String simOperator = b.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            str = null;
            str2 = null;
        } else {
            str = simOperator.substring(0, 3);
            str2 = simOperator.substring(3);
        }
        return new y3(simOperator, str, str2, b.getNetworkOperatorName(), b.getNetworkCountryIso(), b.getPhoneType());
    }

    public final TelephonyManager b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e) {
            xb.b("Unable to retrieve TELEPHONY_SERVICE", e);
            return null;
        }
    }

    public final boolean c(Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == -1;
    }

    public final boolean a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
