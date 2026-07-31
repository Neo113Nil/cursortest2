package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class J4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f37789a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f37790b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f37791c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f37792d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f37793e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f37794f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f37795g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f37796h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f37797i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f37798j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f37799k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f37800l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f37801m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f37802n;

    public J4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.f37789a = str;
        this.f37790b = bool;
        this.f37791c = location;
        this.f37792d = bool2;
        this.f37793e = num;
        this.f37794f = num2;
        this.f37795g = num3;
        this.f37796h = bool3;
        this.f37797i = bool4;
        this.f37798j = map;
        this.f37799k = num4;
        this.f37800l = bool5;
        this.f37801m = bool6;
        this.f37802n = bool7;
    }

    public final boolean a(@NonNull J4 j4) {
        return equals(j4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J4 mergeFrom(@NonNull J4 j4) {
        return new J4((String) WrapUtils.getOrDefaultNullable(this.f37789a, j4.f37789a), (Boolean) WrapUtils.getOrDefaultNullable(this.f37790b, j4.f37790b), (Location) WrapUtils.getOrDefaultNullable(this.f37791c, j4.f37791c), (Boolean) WrapUtils.getOrDefaultNullable(this.f37792d, j4.f37792d), (Integer) WrapUtils.getOrDefaultNullable(this.f37793e, j4.f37793e), (Integer) WrapUtils.getOrDefaultNullable(this.f37794f, j4.f37794f), (Integer) WrapUtils.getOrDefaultNullable(this.f37795g, j4.f37795g), (Boolean) WrapUtils.getOrDefaultNullable(this.f37796h, j4.f37796h), (Boolean) WrapUtils.getOrDefaultNullable(this.f37797i, j4.f37797i), (Map) WrapUtils.getOrDefaultNullable(this.f37798j, j4.f37798j), (Integer) WrapUtils.getOrDefaultNullable(this.f37799k, j4.f37799k), (Boolean) WrapUtils.getOrDefaultNullable(this.f37800l, j4.f37800l), (Boolean) WrapUtils.getOrDefaultNullable(this.f37801m, j4.f37801m), (Boolean) WrapUtils.getOrDefaultNullable(this.f37802n, j4.f37802n));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((J4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J4.class == obj.getClass()) {
            J4 j4 = (J4) obj;
            if (Objects.equals(this.f37789a, j4.f37789a) && Objects.equals(this.f37790b, j4.f37790b) && Objects.equals(this.f37791c, j4.f37791c) && Objects.equals(this.f37792d, j4.f37792d) && Objects.equals(this.f37793e, j4.f37793e) && Objects.equals(this.f37794f, j4.f37794f) && Objects.equals(this.f37795g, j4.f37795g) && Objects.equals(this.f37796h, j4.f37796h) && Objects.equals(this.f37797i, j4.f37797i) && Objects.equals(this.f37798j, j4.f37798j) && Objects.equals(this.f37799k, j4.f37799k) && Objects.equals(this.f37800l, j4.f37800l) && Objects.equals(this.f37801m, j4.f37801m) && Objects.equals(this.f37802n, j4.f37802n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37802n) + ((Objects.hashCode(this.f37801m) + ((Objects.hashCode(this.f37800l) + ((Objects.hashCode(this.f37799k) + ((Objects.hashCode(this.f37798j) + ((Objects.hashCode(this.f37797i) + ((Objects.hashCode(this.f37796h) + ((Objects.hashCode(this.f37795g) + ((Objects.hashCode(this.f37794f) + ((Objects.hashCode(this.f37793e) + ((Objects.hashCode(this.f37792d) + ((Objects.hashCode(this.f37791c) + ((Objects.hashCode(this.f37790b) + (Objects.hashCode(this.f37789a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f37789a + "', locationTracking=" + this.f37790b + ", manualLocation=" + this.f37791c + ", firstActivationAsUpdate=" + this.f37792d + ", sessionTimeout=" + this.f37793e + ", maxReportsCount=" + this.f37794f + ", dispatchPeriod=" + this.f37795g + ", logEnabled=" + this.f37796h + ", dataSendingEnabled=" + this.f37797i + ", clidsFromClient=" + this.f37798j + ", maxReportsInDbCount=" + this.f37799k + ", nativeCrashesEnabled=" + this.f37800l + ", revenueAutoTrackingEnabled=" + this.f37801m + ", advIdentifiersTrackingEnabled=" + this.f37802n + '}';
    }

    public J4(@NonNull CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled());
    }

    public J4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
