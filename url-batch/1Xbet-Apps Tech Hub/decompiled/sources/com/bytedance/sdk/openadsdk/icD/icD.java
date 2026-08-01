package com.bytedance.sdk.openadsdk.icD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AdEventConstants.java */
/* loaded from: classes2.dex */
public class icD {
    public static final Set<String> pvs = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* compiled from: AdEventConstants.java */
    /* renamed from: com.bytedance.sdk.openadsdk.icD.icD$icD, reason: collision with other inner class name */
    public static class C0090icD {
        public static int icD = 2;
        public static int pvs = 1;
        public static int vG = 100;
    }

    /* compiled from: AdEventConstants.java */
    public static class pvs {
        public static String icD = "openAdLandPageLinks";
        public static String pvs = "openDetailPage";
        public static String vG = "direct";
    }

    public static boolean pvs(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
