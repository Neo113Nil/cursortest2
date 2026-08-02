package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes.dex */
public final class Kg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f10530a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10531b;

    public Kg(long j4, long j5) {
        this.f10530a = j4;
        this.f10531b = j5;
    }

    public final Kg a(long j4, long j5) {
        return new Kg(j4, j5);
    }

    public final long b() {
        return this.f10531b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kg)) {
            return false;
        }
        Kg kg = (Kg) obj;
        return this.f10530a == kg.f10530a && this.f10531b == kg.f10531b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f10530a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f10531b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10531b) + (Long.hashCode(this.f10530a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f10530a + ", lastUpdateTime=" + this.f10531b + ')';
    }

    public final long a() {
        return this.f10530a;
    }

    public static Kg a(Kg kg, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = kg.f10530a;
        }
        if ((i4 & 2) != 0) {
            j5 = kg.f10531b;
        }
        kg.getClass();
        return new Kg(j4, j5);
    }
}
