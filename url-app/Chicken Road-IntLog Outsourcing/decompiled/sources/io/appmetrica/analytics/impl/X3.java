package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class X3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7693b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7695d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f7696e;

    public X3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f7692a = str;
        this.f7693b = str2;
        this.f7694c = num;
        this.f7695d = str3;
        this.f7696e = counterConfigurationReporterType;
    }

    public static X3 a(P3 p32) {
        return new X3(p32.f7239b.getApiKey(), p32.f7238a.f6837a.getAsString("PROCESS_CFG_PACKAGE_NAME"), p32.f7238a.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID"), p32.f7238a.f6837a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), p32.f7239b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X3.class != obj.getClass()) {
            return false;
        }
        X3 x32 = (X3) obj;
        String str = this.f7692a;
        if (str == null ? x32.f7692a != null : !str.equals(x32.f7692a)) {
            return false;
        }
        if (!this.f7693b.equals(x32.f7693b)) {
            return false;
        }
        Integer num = this.f7694c;
        if (num == null ? x32.f7694c != null : !num.equals(x32.f7694c)) {
            return false;
        }
        String str2 = this.f7695d;
        if (str2 == null ? x32.f7695d == null : str2.equals(x32.f7695d)) {
            return this.f7696e == x32.f7696e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7692a;
        int f3 = B0.o.f(this.f7693b, (str != null ? str.hashCode() : 0) * 31, 31);
        Integer num = this.f7694c;
        int hashCode = (f3 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f7695d;
        return this.f7696e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f7692a + "', mPackageName='" + this.f7693b + "', mProcessID=" + this.f7694c + ", mProcessSessionID='" + this.f7695d + "', mReporterType=" + this.f7696e + '}';
    }
}
