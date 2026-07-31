package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2771l4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39370b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f39371c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39372d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f39373e;

    public C2771l4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f39369a = str;
        this.f39370b = str2;
        this.f39371c = num;
        this.f39372d = str3;
        this.f39373e = counterConfigurationReporterType;
    }

    public static C2771l4 a(C2562d4 c2562d4) {
        return new C2771l4(c2562d4.f38818b.getApiKey(), c2562d4.f38817a.f38132a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c2562d4.f38817a.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c2562d4.f38817a.f38132a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c2562d4.f38818b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2771l4.class == obj.getClass()) {
            C2771l4 c2771l4 = (C2771l4) obj;
            String str = this.f39369a;
            if (str == null ? c2771l4.f39369a != null : !str.equals(c2771l4.f39369a)) {
                return false;
            }
            if (!this.f39370b.equals(c2771l4.f39370b)) {
                return false;
            }
            Integer num = this.f39371c;
            if (num == null ? c2771l4.f39371c != null : !num.equals(c2771l4.f39371c)) {
                return false;
            }
            String str2 = this.f39372d;
            if (str2 == null ? c2771l4.f39372d != null : !str2.equals(c2771l4.f39372d)) {
                return false;
            }
            if (this.f39373e == c2771l4.f39373e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39369a;
        int hashCode = (this.f39370b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f39371c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f39372d;
        return this.f39373e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f39369a + "', mPackageName='" + this.f39370b + "', mProcessID=" + this.f39371c + ", mProcessSessionID='" + this.f39372d + "', mReporterType=" + this.f39373e + '}';
    }
}
