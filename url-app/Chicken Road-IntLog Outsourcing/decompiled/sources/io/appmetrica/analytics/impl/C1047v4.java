package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047v4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f9427b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f9428c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f9429d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f9430e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f9431f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f9432g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f9433h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f9434i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f9435j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f9436k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f9437l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f9438m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f9439n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<String> f9440o;

    public C1047v4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f9426a = str;
        this.f9427b = bool;
        this.f9428c = location;
        this.f9429d = bool2;
        this.f9430e = num;
        this.f9431f = num2;
        this.f9432g = num3;
        this.f9433h = bool3;
        this.f9434i = bool4;
        this.f9435j = map;
        this.f9436k = num4;
        this.f9437l = bool5;
        this.f9438m = bool6;
        this.f9439n = bool7;
        this.f9440o = set;
    }

    public final boolean a(C1047v4 c1047v4) {
        return equals(c1047v4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1047v4 mergeFrom(C1047v4 c1047v4) {
        return new C1047v4((String) WrapUtils.getOrDefaultNullable(this.f9426a, c1047v4.f9426a), (Boolean) WrapUtils.getOrDefaultNullable(this.f9427b, c1047v4.f9427b), (Location) WrapUtils.getOrDefaultNullable(this.f9428c, c1047v4.f9428c), (Boolean) WrapUtils.getOrDefaultNullable(this.f9429d, c1047v4.f9429d), (Integer) WrapUtils.getOrDefaultNullable(this.f9430e, c1047v4.f9430e), (Integer) WrapUtils.getOrDefaultNullable(this.f9431f, c1047v4.f9431f), (Integer) WrapUtils.getOrDefaultNullable(this.f9432g, c1047v4.f9432g), (Boolean) WrapUtils.getOrDefaultNullable(this.f9433h, c1047v4.f9433h), (Boolean) WrapUtils.getOrDefaultNullable(this.f9434i, c1047v4.f9434i), (Map) WrapUtils.getOrDefaultNullable(this.f9435j, c1047v4.f9435j), (Integer) WrapUtils.getOrDefaultNullable(this.f9436k, c1047v4.f9436k), (Boolean) WrapUtils.getOrDefaultNullable(this.f9437l, c1047v4.f9437l), (Boolean) WrapUtils.getOrDefaultNullable(this.f9438m, c1047v4.f9438m), (Boolean) WrapUtils.getOrDefaultNullable(this.f9439n, c1047v4.f9439n), CollectionUtils.merge(this.f9440o, c1047v4.f9440o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C1047v4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C1047v4.class != obj.getClass()) {
            return false;
        }
        C1047v4 c1047v4 = (C1047v4) obj;
        return Objects.equals(this.f9426a, c1047v4.f9426a) && Objects.equals(this.f9427b, c1047v4.f9427b) && Objects.equals(this.f9428c, c1047v4.f9428c) && Objects.equals(this.f9429d, c1047v4.f9429d) && Objects.equals(this.f9430e, c1047v4.f9430e) && Objects.equals(this.f9431f, c1047v4.f9431f) && Objects.equals(this.f9432g, c1047v4.f9432g) && Objects.equals(this.f9433h, c1047v4.f9433h) && Objects.equals(this.f9434i, c1047v4.f9434i) && Objects.equals(this.f9435j, c1047v4.f9435j) && Objects.equals(this.f9436k, c1047v4.f9436k) && Objects.equals(this.f9437l, c1047v4.f9437l) && Objects.equals(this.f9438m, c1047v4.f9438m) && Objects.equals(this.f9439n, c1047v4.f9439n) && Objects.equals(this.f9440o, c1047v4.f9440o);
    }

    public final int hashCode() {
        return Objects.hash(this.f9426a, this.f9427b, this.f9428c, this.f9429d, this.f9430e, this.f9431f, this.f9432g, this.f9433h, this.f9434i, this.f9435j, this.f9436k, this.f9437l, this.f9438m, this.f9439n, this.f9440o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f9426a + "', locationTracking=" + this.f9427b + ", manualLocation=" + this.f9428c + ", firstActivationAsUpdate=" + this.f9429d + ", sessionTimeout=" + this.f9430e + ", maxReportsCount=" + this.f9431f + ", dispatchPeriod=" + this.f9432g + ", logEnabled=" + this.f9433h + ", dataSendingEnabled=" + this.f9434i + ", clidsFromClient=" + this.f9435j + ", maxReportsInDbCount=" + this.f9436k + ", nativeCrashesEnabled=" + this.f9437l + ", revenueAutoTrackingEnabled=" + this.f9438m + ", advIdentifiersTrackingEnabled=" + this.f9439n + ", autoCollectedDataSubscribers=" + this.f9440o + '}';
    }

    public C1047v4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C1047v4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
