package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f10300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10302c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10303d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10304e;

    /* renamed from: f, reason: collision with root package name */
    public final H0 f10305f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, H0 h02) {
        this.f10300a = nativeCrashSource;
        this.f10301b = str;
        this.f10302c = str2;
        this.f10303d = str3;
        this.f10304e = j4;
        this.f10305f = h02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f10300a == g02.f10300a && kotlin.jvm.internal.i.a(this.f10301b, g02.f10301b) && kotlin.jvm.internal.i.a(this.f10302c, g02.f10302c) && kotlin.jvm.internal.i.a(this.f10303d, g02.f10303d) && this.f10304e == g02.f10304e && kotlin.jvm.internal.i.a(this.f10305f, g02.f10305f);
    }

    public final int hashCode() {
        return this.f10305f.hashCode() + ((Long.hashCode(this.f10304e) + AbstractC0005f.f(AbstractC0005f.f(AbstractC0005f.f(this.f10300a.hashCode() * 31, 31, this.f10301b), 31, this.f10302c), 31, this.f10303d)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f10300a + ", handlerVersion=" + this.f10301b + ", uuid=" + this.f10302c + ", dumpFile=" + this.f10303d + ", creationTime=" + this.f10304e + ", metadata=" + this.f10305f + ')';
    }
}
