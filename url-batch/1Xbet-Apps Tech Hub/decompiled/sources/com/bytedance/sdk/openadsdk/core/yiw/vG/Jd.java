package com.bytedance.sdk.openadsdk.core.yiw.vG;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: VastUtils.java */
/* loaded from: classes2.dex */
public class Jd {
    public static final List<String> pvs = Arrays.asList("video/mp4", "video/3gpp");

    public static double pvs(int i, double d, int i2, int i3, int i4, String str) {
        double pvs2 = pvs(i, d, i2, i3);
        return pvs(str) * (1.0d / ((pvs2 + 1.0d) + pvs(i4)));
    }

    private static double pvs(int i, double d, int i2, int i3) {
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double abs = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.abs(d - (i3 > 0 ? i2 / i3 : 0.0d)) : 0.0d;
        if (i > 0) {
            d2 = Math.abs((i - i2) / i);
        }
        return abs + d2;
    }

    private static double pvs(int i) {
        int max = Math.max(i, 0);
        return (700 > max || max > 1500) ? Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    private static double pvs(String str) {
        char c;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("video/3gpp")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? 1.0d : 1.5d;
    }
}
