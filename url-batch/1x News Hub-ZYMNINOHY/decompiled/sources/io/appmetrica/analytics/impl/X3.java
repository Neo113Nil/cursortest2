package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class X3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6855a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6856b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6857c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6858d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f6859e;

    public X3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f6855a = str;
        this.f6856b = str2;
        this.f6857c = num;
        this.f6858d = str3;
        this.f6859e = counterConfigurationReporterType;
    }

    public static X3 a(P3 p3) {
        return new X3(p3.f6428b.getApiKey(), p3.f6427a.f6044a.getAsString("PROCESS_CFG_PACKAGE_NAME"), p3.f6427a.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID"), p3.f6427a.f6044a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), p3.f6428b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X3.class == obj.getClass()) {
            X3 x3 = (X3) obj;
            String str = this.f6855a;
            if (str == null ? x3.f6855a != null : !str.equals(x3.f6855a)) {
                return false;
            }
            if (!this.f6856b.equals(x3.f6856b)) {
                return false;
            }
            Integer num = this.f6857c;
            if (num == null ? x3.f6857c != null : !num.equals(x3.f6857c)) {
                return false;
            }
            String str2 = this.f6858d;
            if (str2 == null ? x3.f6858d != null : !str2.equals(x3.f6858d)) {
                return false;
            }
            if (this.f6859e == x3.f6859e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6855a;
        int hashCode = (this.f6856b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f6857c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f6858d;
        return this.f6859e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f6855a + "', mPackageName='" + this.f6856b + "', mProcessID=" + this.f6857c + ", mProcessSessionID='" + this.f6858d + "', mReporterType=" + this.f6859e + '}';
    }
}
