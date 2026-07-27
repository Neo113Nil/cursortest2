package io.appmetrica.analytics.coreutils.internal.services;

import b2.AbstractC0279e;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f6275a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6276b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j2, long j6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = utilityServiceConfiguration.f6275a;
        }
        if ((i2 & 2) != 0) {
            j6 = utilityServiceConfiguration.f6276b;
        }
        return utilityServiceConfiguration.copy(j2, j6);
    }

    public final long component1() {
        return this.f6275a;
    }

    public final long component2() {
        return this.f6276b;
    }

    public final UtilityServiceConfiguration copy(long j2, long j6) {
        return new UtilityServiceConfiguration(j2, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f6275a == utilityServiceConfiguration.f6275a && this.f6276b == utilityServiceConfiguration.f6276b;
    }

    public final long getInitialConfigTime() {
        return this.f6275a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f6276b;
    }

    public int hashCode() {
        return Long.hashCode(this.f6276b) + (Long.hashCode(this.f6275a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        sb.append(this.f6275a);
        sb.append(", lastUpdateConfigTime=");
        return AbstractC0279e.g(sb, this.f6276b, ')');
    }

    public UtilityServiceConfiguration(long j2, long j6) {
        this.f6275a = j2;
        this.f6276b = j6;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j2, long j6, int i2, e eVar) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j6);
    }
}
