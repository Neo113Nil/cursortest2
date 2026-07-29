package com.aiming.mdt.utils;

import android.text.TextUtils;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0162;

/* renamed from: com.aiming.mdt.utils.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0279 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String f817 = "Rate";

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String f818 = "CAP";

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String f819 = "CAPTime";

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m947(String str) {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(f818);
        sb.append(str);
        Integer num = (Integer) m619.m622(sb.toString(), Integer.TYPE);
        if (num == null) {
            num = 0;
        }
        StringBuilder sb2 = new StringBuilder("AddCAP:");
        sb2.append(str);
        sb2.append(":");
        sb2.append(num);
        sb2.append(1);
        C0282.m971(sb2.toString());
        C0162 m6192 = C0162.m619();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f818);
        sb3.append(str);
        m6192.m624(sb3.toString(), Integer.valueOf(num.intValue() + 1));
        C0162 m6193 = C0162.m619();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f819);
        sb4.append(str);
        if (((Long) m6193.m622(sb4.toString(), Long.TYPE)) == null) {
            C0162 m6194 = C0162.m619();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(f819);
            sb5.append(str);
            m6194.m624(sb5.toString(), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m948(String str, C0088 c0088) {
        if (TextUtils.isEmpty(str) || c0088 == null) {
            return false;
        }
        return m950(str, (long) c0088.m551()) || m953(str, c0088.m554(), c0088.m552());
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m949(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        m952(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        m947(sb2.toString());
        m952(String.valueOf(str));
        m947(String.valueOf(str));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static boolean m950(String str, long j) {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(f817);
        sb.append(str);
        Long l = (Long) m619.m622(sb.toString(), Long.TYPE);
        if (l == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Interval:");
        sb2.append(str);
        sb2.append(":");
        sb2.append(System.currentTimeMillis() - l.longValue());
        sb2.append(":");
        sb2.append(j);
        C0282.m971(sb2.toString());
        return System.currentTimeMillis() - l.longValue() < j;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m951(String str, C0045 c0045) {
        if (TextUtils.isEmpty(str) || c0045 == null) {
            return false;
        }
        return m950(str, (long) c0045.m551()) || m953(str, c0045.m554(), c0045.m552());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m952(String str) {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(f817);
        sb.append(str);
        m619.m624(sb.toString(), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m953(String str, int i, int i2) {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(f819);
        sb.append(str);
        Long l = (Long) m619.m622(sb.toString(), Long.TYPE);
        if (l == null) {
            return false;
        }
        C0162 m6192 = C0162.m619();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f818);
        sb2.append(str);
        Integer num = (Integer) m6192.m622(sb2.toString(), Integer.TYPE);
        StringBuilder sb3 = new StringBuilder("CapTime:");
        sb3.append(str);
        sb3.append(":");
        sb3.append(System.currentTimeMillis() - l.longValue());
        sb3.append(":");
        sb3.append(i);
        sb3.append(":Cap:");
        sb3.append(num);
        sb3.append(":");
        sb3.append(i2);
        C0282.m971(sb3.toString());
        if (System.currentTimeMillis() - l.longValue() < i) {
            return num.intValue() >= i2;
        }
        C0162 m6193 = C0162.m619();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f819);
        sb4.append(str);
        m6193.m625(sb4.toString());
        C0162 m6194 = C0162.m619();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f818);
        sb5.append(str);
        m6194.m625(sb5.toString());
        return false;
    }
}
