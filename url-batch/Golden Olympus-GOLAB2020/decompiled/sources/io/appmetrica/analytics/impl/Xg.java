package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Xg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f38525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38526b;

    public Xg(long j4, long j5) {
        this.f38525a = j4;
        this.f38526b = j5;
    }

    @NotNull
    public final Xg a(long j4, long j5) {
        return new Xg(j4, j5);
    }

    public final long b() {
        return this.f38526b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xg)) {
            return false;
        }
        Xg xg = (Xg) obj;
        return this.f38525a == xg.f38525a && this.f38526b == xg.f38526b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f38525a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f38526b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38526b) + (Long.hashCode(this.f38525a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f38525a + ", lastUpdateTime=" + this.f38526b + ')';
    }

    public final long a() {
        return this.f38525a;
    }

    public static Xg a(Xg xg, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = xg.f38525a;
        }
        if ((i4 & 2) != 0) {
            j5 = xg.f38526b;
        }
        xg.getClass();
        return new Xg(j4, j5);
    }
}
