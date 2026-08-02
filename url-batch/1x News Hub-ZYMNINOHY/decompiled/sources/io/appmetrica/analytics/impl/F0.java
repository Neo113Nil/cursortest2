package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5973b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f5974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5975d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5976e;
    public final String f;

    public F0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i3, String str3, String str4) {
        this.f5972a = str;
        this.f5973b = str2;
        this.f5974c = counterConfigurationReporterType;
        this.f5975d = i3;
        this.f5976e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return kotlin.jvm.internal.j.a(this.f5972a, f02.f5972a) && kotlin.jvm.internal.j.a(this.f5973b, f02.f5973b) && this.f5974c == f02.f5974c && this.f5975d == f02.f5975d && kotlin.jvm.internal.j.a(this.f5976e, f02.f5976e) && kotlin.jvm.internal.j.a(this.f, f02.f);
    }

    public final int hashCode() {
        int hashCode = (this.f5976e.hashCode() + ((Integer.hashCode(this.f5975d) + ((this.f5974c.hashCode() + ((this.f5973b.hashCode() + (this.f5972a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f5972a + ", packageName=" + this.f5973b + ", reporterType=" + this.f5974c + ", processID=" + this.f5975d + ", processSessionID=" + this.f5976e + ", errorEnvironment=" + this.f + ')';
    }
}
