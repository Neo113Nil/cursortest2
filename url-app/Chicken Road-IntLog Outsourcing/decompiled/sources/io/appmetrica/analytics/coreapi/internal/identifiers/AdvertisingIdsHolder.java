package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f6159a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f6160b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f6161c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f6159a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f6160b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f6161c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f6159a + ", mHuawei=" + this.f6160b + ", yandex=" + this.f6161c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f6159a = adTrackingInfoResult;
        this.f6160b = adTrackingInfoResult2;
        this.f6161c = adTrackingInfoResult3;
    }
}
