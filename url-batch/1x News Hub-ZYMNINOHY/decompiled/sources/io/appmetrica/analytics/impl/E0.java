package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f5916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5918c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5920e;
    public final F0 f;

    public E0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, F0 f02) {
        this.f5916a = nativeCrashSource;
        this.f5917b = str;
        this.f5918c = str2;
        this.f5919d = str3;
        this.f5920e = j3;
        this.f = f02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f5916a == e02.f5916a && kotlin.jvm.internal.j.a(this.f5917b, e02.f5917b) && kotlin.jvm.internal.j.a(this.f5918c, e02.f5918c) && kotlin.jvm.internal.j.a(this.f5919d, e02.f5919d) && this.f5920e == e02.f5920e && kotlin.jvm.internal.j.a(this.f, e02.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((Long.hashCode(this.f5920e) + ((this.f5919d.hashCode() + ((this.f5918c.hashCode() + ((this.f5917b.hashCode() + (this.f5916a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f5916a + ", handlerVersion=" + this.f5917b + ", uuid=" + this.f5918c + ", dumpFile=" + this.f5919d + ", creationTime=" + this.f5920e + ", metadata=" + this.f + ')';
    }
}
