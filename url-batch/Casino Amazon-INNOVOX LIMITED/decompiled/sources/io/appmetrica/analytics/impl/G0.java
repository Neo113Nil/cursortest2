package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f853a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final H0 f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, H0 h0) {
        this.f853a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g0 = (G0) obj;
        return this.f853a == g0.f853a && Intrinsics.areEqual(this.b, g0.b) && Intrinsics.areEqual(this.c, g0.c) && Intrinsics.areEqual(this.d, g0.d) && this.e == g0.e && Intrinsics.areEqual(this.f, g0.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((Long.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f853a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f853a + ", handlerVersion=" + this.b + ", uuid=" + this.c + ", dumpFile=" + this.d + ", creationTime=" + this.e + ", metadata=" + this.f + ')';
    }
}
