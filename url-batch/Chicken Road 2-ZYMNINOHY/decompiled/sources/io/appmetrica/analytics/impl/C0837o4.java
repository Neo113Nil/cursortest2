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

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837o4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f12484a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f12485b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f12486c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f12487d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12488e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12489f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f12490g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f12491h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f12492i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f12493j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f12494k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f12495l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f12496m;
    public final Boolean n;
    public final Set<String> o;

    public C0837o4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f12484a = str;
        this.f12485b = bool;
        this.f12486c = location;
        this.f12487d = bool2;
        this.f12488e = num;
        this.f12489f = num2;
        this.f12490g = num3;
        this.f12491h = bool3;
        this.f12492i = bool4;
        this.f12493j = map;
        this.f12494k = num4;
        this.f12495l = bool5;
        this.f12496m = bool6;
        this.n = bool7;
        this.o = set;
    }

    public final boolean a(C0837o4 c0837o4) {
        return equals(c0837o4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0837o4 mergeFrom(C0837o4 c0837o4) {
        return new C0837o4((String) WrapUtils.getOrDefaultNullable(this.f12484a, c0837o4.f12484a), (Boolean) WrapUtils.getOrDefaultNullable(this.f12485b, c0837o4.f12485b), (Location) WrapUtils.getOrDefaultNullable(this.f12486c, c0837o4.f12486c), (Boolean) WrapUtils.getOrDefaultNullable(this.f12487d, c0837o4.f12487d), (Integer) WrapUtils.getOrDefaultNullable(this.f12488e, c0837o4.f12488e), (Integer) WrapUtils.getOrDefaultNullable(this.f12489f, c0837o4.f12489f), (Integer) WrapUtils.getOrDefaultNullable(this.f12490g, c0837o4.f12490g), (Boolean) WrapUtils.getOrDefaultNullable(this.f12491h, c0837o4.f12491h), (Boolean) WrapUtils.getOrDefaultNullable(this.f12492i, c0837o4.f12492i), (Map) WrapUtils.getOrDefaultNullable(this.f12493j, c0837o4.f12493j), (Integer) WrapUtils.getOrDefaultNullable(this.f12494k, c0837o4.f12494k), (Boolean) WrapUtils.getOrDefaultNullable(this.f12495l, c0837o4.f12495l), (Boolean) WrapUtils.getOrDefaultNullable(this.f12496m, c0837o4.f12496m), (Boolean) WrapUtils.getOrDefaultNullable(this.n, c0837o4.n), CollectionUtils.merge(this.o, c0837o4.o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C0837o4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0837o4.class == obj.getClass()) {
            C0837o4 c0837o4 = (C0837o4) obj;
            if (Objects.equals(this.f12484a, c0837o4.f12484a) && Objects.equals(this.f12485b, c0837o4.f12485b) && Objects.equals(this.f12486c, c0837o4.f12486c) && Objects.equals(this.f12487d, c0837o4.f12487d) && Objects.equals(this.f12488e, c0837o4.f12488e) && Objects.equals(this.f12489f, c0837o4.f12489f) && Objects.equals(this.f12490g, c0837o4.f12490g) && Objects.equals(this.f12491h, c0837o4.f12491h) && Objects.equals(this.f12492i, c0837o4.f12492i) && Objects.equals(this.f12493j, c0837o4.f12493j) && Objects.equals(this.f12494k, c0837o4.f12494k) && Objects.equals(this.f12495l, c0837o4.f12495l) && Objects.equals(this.f12496m, c0837o4.f12496m) && Objects.equals(this.n, c0837o4.n) && Objects.equals(this.o, c0837o4.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12484a, this.f12485b, this.f12486c, this.f12487d, this.f12488e, this.f12489f, this.f12490g, this.f12491h, this.f12492i, this.f12493j, this.f12494k, this.f12495l, this.f12496m, this.n, this.o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f12484a + "', locationTracking=" + this.f12485b + ", manualLocation=" + this.f12486c + ", firstActivationAsUpdate=" + this.f12487d + ", sessionTimeout=" + this.f12488e + ", maxReportsCount=" + this.f12489f + ", dispatchPeriod=" + this.f12490g + ", logEnabled=" + this.f12491h + ", dataSendingEnabled=" + this.f12492i + ", clidsFromClient=" + this.f12493j + ", maxReportsInDbCount=" + this.f12494k + ", nativeCrashesEnabled=" + this.f12495l + ", revenueAutoTrackingEnabled=" + this.f12496m + ", advIdentifiersTrackingEnabled=" + this.n + ", autoCollectedDataSubscribers=" + this.o + '}';
    }

    public C0837o4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0837o4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
