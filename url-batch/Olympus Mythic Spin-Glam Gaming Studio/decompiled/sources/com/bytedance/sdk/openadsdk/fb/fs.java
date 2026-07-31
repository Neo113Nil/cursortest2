package com.bytedance.sdk.openadsdk.fb;

import com.bytedance.sdk.openadsdk.fb.zn.zmn;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes14.dex */
public class fs {
    public static final String zmn = zmn.InterfaceC0195zmn.zmn;
    public static final String fs = zmn.InterfaceC0195zmn.fs;
    public static final String zn = zmn.InterfaceC0195zmn.zn;
    public static final String fb = zmn.InterfaceC0195zmn.fb;
    public static final String btk = zmn.InterfaceC0195zmn.btk;
    public static final String hhw = zmn.InterfaceC0195zmn.hhw;
    public static final Set<String> nps = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* renamed from: com.bytedance.sdk.openadsdk.fb.fs$fs, reason: collision with other inner class name */
    public static class C0189fs {
        public static int fs = 2;
        public static int zmn = 1;
        public static int zn = 100;
    }

    public static class zmn {
        public static String fb = "saLandingPageLinks";
        public static String fs = "openAdLandPageLinks";
        public static String zmn = "openDetailPage";
        public static String zn = "direct";
    }

    public static boolean zmn(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
