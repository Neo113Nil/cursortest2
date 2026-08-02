package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10790b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10791c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10792d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f10793e;

    public P3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f10789a = str;
        this.f10790b = str2;
        this.f10791c = num;
        this.f10792d = str3;
        this.f10793e = counterConfigurationReporterType;
    }

    public static P3 a(H3 h32) {
        return new P3(h32.f10356b.getApiKey(), h32.f10355a.f10112a.getAsString("PROCESS_CFG_PACKAGE_NAME"), h32.f10355a.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID"), h32.f10355a.f10112a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), h32.f10356b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P3.class == obj.getClass()) {
            P3 p32 = (P3) obj;
            String str = this.f10789a;
            if (str == null ? p32.f10789a != null : !str.equals(p32.f10789a)) {
                return false;
            }
            if (!this.f10790b.equals(p32.f10790b)) {
                return false;
            }
            Integer num = this.f10791c;
            if (num == null ? p32.f10791c != null : !num.equals(p32.f10791c)) {
                return false;
            }
            String str2 = this.f10792d;
            if (str2 == null ? p32.f10792d != null : !str2.equals(p32.f10792d)) {
                return false;
            }
            if (this.f10793e == p32.f10793e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10789a;
        int f4 = AbstractC0005f.f((str != null ? str.hashCode() : 0) * 31, 31, this.f10790b);
        Integer num = this.f10791c;
        int hashCode = (f4 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f10792d;
        return this.f10793e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f10789a + "', mPackageName='" + this.f10790b + "', mProcessID=" + this.f10791c + ", mProcessSessionID='" + this.f10792d + "', mReporterType=" + this.f10793e + '}';
    }
}
