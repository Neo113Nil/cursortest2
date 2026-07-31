package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f37266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37267b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f37268c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37269d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37270e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37271f;

    public C0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i4, String str3, String str4) {
        this.f37266a = str;
        this.f37267b = str2;
        this.f37268c = counterConfigurationReporterType;
        this.f37269d = i4;
        this.f37270e = str3;
        this.f37271f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return Intrinsics.areEqual(this.f37266a, c02.f37266a) && Intrinsics.areEqual(this.f37267b, c02.f37267b) && this.f37268c == c02.f37268c && this.f37269d == c02.f37269d && Intrinsics.areEqual(this.f37270e, c02.f37270e) && Intrinsics.areEqual(this.f37271f, c02.f37271f);
    }

    public final int hashCode() {
        int hashCode = (this.f37270e.hashCode() + ((Integer.hashCode(this.f37269d) + ((this.f37268c.hashCode() + ((this.f37267b.hashCode() + (this.f37266a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f37271f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f37266a + ", packageName=" + this.f37267b + ", reporterType=" + this.f37268c + ", processID=" + this.f37269d + ", processSessionID=" + this.f37270e + ", errorEnvironment=" + this.f37271f + ')';
    }
}
