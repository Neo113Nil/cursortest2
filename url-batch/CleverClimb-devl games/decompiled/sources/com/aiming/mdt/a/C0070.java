package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʽʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0070 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f160 = 0;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static volatile C0070 f161 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f162 = 1;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0070 m220() {
        if (f161 == null) {
            synchronized (C0070.class) {
                if (f161 == null) {
                    f161 = new C0070();
                }
            }
        }
        return f161;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m221() {
        C0131 m735;
        int i = f162 + 89;
        f160 = i % 128;
        if ((i % 2 != 0 ? 'W' : '\r') != 'W') {
            m735 = C0195.m731().m735();
            if ((m735 != null ? 'U' : '_') != 'U') {
                return;
            }
        } else {
            m735 = C0195.m731().m735();
            Object obj = null;
            super.hashCode();
            if (m735 == null) {
                return;
            }
        }
        if (m735.m485() != 0) {
            int i2 = f160 + 77;
            f162 = i2 % 128;
            int i3 = i2 % 2;
            EnumC0150.f498.m589();
            int i4 = f160 + 33;
            f162 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
