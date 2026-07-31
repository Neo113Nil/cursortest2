package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f865a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f865a = str;
        this.b = str2;
        this.c = counterConfigurationReporterType;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h0 = (H0) obj;
        return Intrinsics.areEqual(this.f865a, h0.f865a) && Intrinsics.areEqual(this.b, h0.b) && this.c == h0.c && this.d == h0.d && Intrinsics.areEqual(this.e, h0.e) && Intrinsics.areEqual(this.f, h0.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f865a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f865a + ", packageName=" + this.b + ", reporterType=" + this.c + ", processID=" + this.d + ", processSessionID=" + this.e + ", errorEnvironment=" + this.f + ')';
    }
}
