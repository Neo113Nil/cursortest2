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
public final class C0896v4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f8477a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8478b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f8479c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f8480d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f8481e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8482g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f8483h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f8484i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f8485j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f8486k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f8487l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f8488m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f8489n;
    public final Set<String> o;

    public C0896v4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f8477a = str;
        this.f8478b = bool;
        this.f8479c = location;
        this.f8480d = bool2;
        this.f8481e = num;
        this.f = num2;
        this.f8482g = num3;
        this.f8483h = bool3;
        this.f8484i = bool4;
        this.f8485j = map;
        this.f8486k = num4;
        this.f8487l = bool5;
        this.f8488m = bool6;
        this.f8489n = bool7;
        this.o = set;
    }

    public final boolean a(C0896v4 c0896v4) {
        return equals(c0896v4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0896v4 mergeFrom(C0896v4 c0896v4) {
        return new C0896v4((String) WrapUtils.getOrDefaultNullable(this.f8477a, c0896v4.f8477a), (Boolean) WrapUtils.getOrDefaultNullable(this.f8478b, c0896v4.f8478b), (Location) WrapUtils.getOrDefaultNullable(this.f8479c, c0896v4.f8479c), (Boolean) WrapUtils.getOrDefaultNullable(this.f8480d, c0896v4.f8480d), (Integer) WrapUtils.getOrDefaultNullable(this.f8481e, c0896v4.f8481e), (Integer) WrapUtils.getOrDefaultNullable(this.f, c0896v4.f), (Integer) WrapUtils.getOrDefaultNullable(this.f8482g, c0896v4.f8482g), (Boolean) WrapUtils.getOrDefaultNullable(this.f8483h, c0896v4.f8483h), (Boolean) WrapUtils.getOrDefaultNullable(this.f8484i, c0896v4.f8484i), (Map) WrapUtils.getOrDefaultNullable(this.f8485j, c0896v4.f8485j), (Integer) WrapUtils.getOrDefaultNullable(this.f8486k, c0896v4.f8486k), (Boolean) WrapUtils.getOrDefaultNullable(this.f8487l, c0896v4.f8487l), (Boolean) WrapUtils.getOrDefaultNullable(this.f8488m, c0896v4.f8488m), (Boolean) WrapUtils.getOrDefaultNullable(this.f8489n, c0896v4.f8489n), CollectionUtils.merge(this.o, c0896v4.o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C0896v4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0896v4.class == obj.getClass()) {
            C0896v4 c0896v4 = (C0896v4) obj;
            if (Objects.equals(this.f8477a, c0896v4.f8477a) && Objects.equals(this.f8478b, c0896v4.f8478b) && Objects.equals(this.f8479c, c0896v4.f8479c) && Objects.equals(this.f8480d, c0896v4.f8480d) && Objects.equals(this.f8481e, c0896v4.f8481e) && Objects.equals(this.f, c0896v4.f) && Objects.equals(this.f8482g, c0896v4.f8482g) && Objects.equals(this.f8483h, c0896v4.f8483h) && Objects.equals(this.f8484i, c0896v4.f8484i) && Objects.equals(this.f8485j, c0896v4.f8485j) && Objects.equals(this.f8486k, c0896v4.f8486k) && Objects.equals(this.f8487l, c0896v4.f8487l) && Objects.equals(this.f8488m, c0896v4.f8488m) && Objects.equals(this.f8489n, c0896v4.f8489n) && Objects.equals(this.o, c0896v4.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8477a, this.f8478b, this.f8479c, this.f8480d, this.f8481e, this.f, this.f8482g, this.f8483h, this.f8484i, this.f8485j, this.f8486k, this.f8487l, this.f8488m, this.f8489n, this.o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f8477a + "', locationTracking=" + this.f8478b + ", manualLocation=" + this.f8479c + ", firstActivationAsUpdate=" + this.f8480d + ", sessionTimeout=" + this.f8481e + ", maxReportsCount=" + this.f + ", dispatchPeriod=" + this.f8482g + ", logEnabled=" + this.f8483h + ", dataSendingEnabled=" + this.f8484i + ", clidsFromClient=" + this.f8485j + ", maxReportsInDbCount=" + this.f8486k + ", nativeCrashesEnabled=" + this.f8487l + ", revenueAutoTrackingEnabled=" + this.f8488m + ", advIdentifiersTrackingEnabled=" + this.f8489n + ", autoCollectedDataSubscribers=" + this.o + '}';
    }

    public C0896v4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0896v4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
