package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes.dex */
public final class Pg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f6465a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6466b;

    public Pg(long j3, long j4) {
        this.f6465a = j3;
        this.f6466b = j4;
    }

    public final Pg a(long j3, long j4) {
        return new Pg(j3, j4);
    }

    public final long b() {
        return this.f6466b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pg)) {
            return false;
        }
        Pg pg = (Pg) obj;
        return this.f6465a == pg.f6465a && this.f6466b == pg.f6466b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f6465a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f6466b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6466b) + (Long.hashCode(this.f6465a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f6465a + ", lastUpdateTime=" + this.f6466b + ')';
    }

    public final long a() {
        return this.f6465a;
    }

    public static Pg a(Pg pg, long j3, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = pg.f6465a;
        }
        if ((i3 & 2) != 0) {
            j4 = pg.f6466b;
        }
        pg.getClass();
        return new Pg(j3, j4);
    }
}
