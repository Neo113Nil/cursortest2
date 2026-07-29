package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʼʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0130 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f399 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile C0130 f400 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f401 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0130 m480() {
        if (f400 == null) {
            synchronized (C0130.class) {
                if (f400 == null) {
                    f400 = new C0130();
                }
            }
        }
        return f400;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m481() {
        C0131 m735;
        int i = f399 + 71;
        f401 = i % 128;
        if (!(i % 2 != 0)) {
            m735 = C0195.m731().m735();
            if (m735 == null) {
                return;
            }
        } else {
            m735 = C0195.m731().m735();
            if (m735 == null) {
                return;
            }
        }
        int i2 = f401 + 111;
        f399 = i2 % 128;
        if (i2 % 2 == 0) {
            if (m735.m499() == 0) {
                return;
            }
        } else if (m735.m499() == 0) {
            return;
        }
        EnumC0066.f144.m204();
    }
}
