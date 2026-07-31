package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f37049a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37050b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = utilityServiceConfiguration.f37049a;
        }
        if ((i4 & 2) != 0) {
            j5 = utilityServiceConfiguration.f37050b;
        }
        return utilityServiceConfiguration.copy(j4, j5);
    }

    public final long component1() {
        return this.f37049a;
    }

    public final long component2() {
        return this.f37050b;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long j4, long j5) {
        return new UtilityServiceConfiguration(j4, j5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f37049a == utilityServiceConfiguration.f37049a && this.f37050b == utilityServiceConfiguration.f37050b;
    }

    public final long getInitialConfigTime() {
        return this.f37049a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f37050b;
    }

    public int hashCode() {
        return Long.hashCode(this.f37050b) + (Long.hashCode(this.f37049a) * 31);
    }

    @NotNull
    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f37049a + ", lastUpdateConfigTime=" + this.f37050b + ')';
    }

    public UtilityServiceConfiguration(long j4, long j5) {
        this.f37049a = j4;
        this.f37050b = j5;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j4, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j4, (i4 & 2) != 0 ? 0L : j5);
    }
}
