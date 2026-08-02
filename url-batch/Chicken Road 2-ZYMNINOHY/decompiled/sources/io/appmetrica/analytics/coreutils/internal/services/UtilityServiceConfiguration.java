package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f9764a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9765b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = utilityServiceConfiguration.f9764a;
        }
        if ((i4 & 2) != 0) {
            j5 = utilityServiceConfiguration.f9765b;
        }
        return utilityServiceConfiguration.copy(j4, j5);
    }

    public final long component1() {
        return this.f9764a;
    }

    public final long component2() {
        return this.f9765b;
    }

    public final UtilityServiceConfiguration copy(long j4, long j5) {
        return new UtilityServiceConfiguration(j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f9764a == utilityServiceConfiguration.f9764a && this.f9765b == utilityServiceConfiguration.f9765b;
    }

    public final long getInitialConfigTime() {
        return this.f9764a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f9765b;
    }

    public int hashCode() {
        return Long.hashCode(this.f9765b) + (Long.hashCode(this.f9764a) * 31);
    }

    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f9764a + ", lastUpdateConfigTime=" + this.f9765b + ')';
    }

    public UtilityServiceConfiguration(long j4, long j5) {
        this.f9764a = j4;
        this.f9765b = j5;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j4, long j5, int i4, e eVar) {
        this((i4 & 1) != 0 ? 0L : j4, (i4 & 2) != 0 ? 0L : j5);
    }
}
