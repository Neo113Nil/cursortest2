package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f5395a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f5396b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f5397c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f5395a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f5396b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f5397c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f5395a + ", mHuawei=" + this.f5396b + ", yandex=" + this.f5397c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f5395a = adTrackingInfoResult;
        this.f5396b = adTrackingInfoResult2;
        this.f5397c = adTrackingInfoResult3;
    }
}
