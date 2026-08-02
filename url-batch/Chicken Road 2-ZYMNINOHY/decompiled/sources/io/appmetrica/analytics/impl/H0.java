package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10349b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f10350c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10351d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10352e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10353f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i4, String str3, String str4) {
        this.f10348a = str;
        this.f10349b = str2;
        this.f10350c = counterConfigurationReporterType;
        this.f10351d = i4;
        this.f10352e = str3;
        this.f10353f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return kotlin.jvm.internal.i.a(this.f10348a, h02.f10348a) && kotlin.jvm.internal.i.a(this.f10349b, h02.f10349b) && this.f10350c == h02.f10350c && this.f10351d == h02.f10351d && kotlin.jvm.internal.i.a(this.f10352e, h02.f10352e) && kotlin.jvm.internal.i.a(this.f10353f, h02.f10353f);
    }

    public final int hashCode() {
        int f4 = AbstractC0005f.f((Integer.hashCode(this.f10351d) + ((this.f10350c.hashCode() + AbstractC0005f.f(this.f10348a.hashCode() * 31, 31, this.f10349b)) * 31)) * 31, 31, this.f10352e);
        String str = this.f10353f;
        return f4 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f10348a + ", packageName=" + this.f10349b + ", reporterType=" + this.f10350c + ", processID=" + this.f10351d + ", processSessionID=" + this.f10352e + ", errorEnvironment=" + this.f10353f + ')';
    }
}
