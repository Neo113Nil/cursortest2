package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;
import org.chromium.net.NetError;

/* renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20164m {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + NetError.ERR_SOCKS_CONNECTION_FAILED);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(Context context, C20194p c20194p) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC20023y.A01((TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            C20154l callback = new C20154l(c20194p);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c20194p.A07(5);
        }
    }
}
