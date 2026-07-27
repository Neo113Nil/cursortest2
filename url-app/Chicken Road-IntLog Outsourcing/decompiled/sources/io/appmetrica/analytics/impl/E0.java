package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f6702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6704c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6705d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6706e;

    /* renamed from: f, reason: collision with root package name */
    public final F0 f6707f;

    public E0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, F0 f02) {
        this.f6702a = nativeCrashSource;
        this.f6703b = str;
        this.f6704c = str2;
        this.f6705d = str3;
        this.f6706e = j2;
        this.f6707f = f02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f6702a == e02.f6702a && kotlin.jvm.internal.i.a(this.f6703b, e02.f6703b) && kotlin.jvm.internal.i.a(this.f6704c, e02.f6704c) && kotlin.jvm.internal.i.a(this.f6705d, e02.f6705d) && this.f6706e == e02.f6706e && kotlin.jvm.internal.i.a(this.f6707f, e02.f6707f);
    }

    public final int hashCode() {
        return this.f6707f.hashCode() + ((Long.hashCode(this.f6706e) + B0.o.f(this.f6705d, B0.o.f(this.f6704c, B0.o.f(this.f6703b, this.f6702a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f6702a + ", handlerVersion=" + this.f6703b + ", uuid=" + this.f6704c + ", dumpFile=" + this.f6705d + ", creationTime=" + this.f6706e + ", metadata=" + this.f6707f + ')';
    }
}
