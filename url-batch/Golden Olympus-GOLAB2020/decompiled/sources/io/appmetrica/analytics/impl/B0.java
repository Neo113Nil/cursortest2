package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f37197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37198b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37201e;

    /* renamed from: f, reason: collision with root package name */
    public final C0 f37202f;

    public B0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, C0 c02) {
        this.f37197a = nativeCrashSource;
        this.f37198b = str;
        this.f37199c = str2;
        this.f37200d = str3;
        this.f37201e = j4;
        this.f37202f = c02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return this.f37197a == b02.f37197a && Intrinsics.areEqual(this.f37198b, b02.f37198b) && Intrinsics.areEqual(this.f37199c, b02.f37199c) && Intrinsics.areEqual(this.f37200d, b02.f37200d) && this.f37201e == b02.f37201e && Intrinsics.areEqual(this.f37202f, b02.f37202f);
    }

    public final int hashCode() {
        return this.f37202f.hashCode() + ((Long.hashCode(this.f37201e) + ((this.f37200d.hashCode() + ((this.f37199c.hashCode() + ((this.f37198b.hashCode() + (this.f37197a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f37197a + ", handlerVersion=" + this.f37198b + ", uuid=" + this.f37199c + ", dumpFile=" + this.f37200d + ", creationTime=" + this.f37201e + ", metadata=" + this.f37202f + ')';
    }
}
