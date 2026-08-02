package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f9648a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f9649b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f9650c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f9648a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f9649b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f9650c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f9648a + ", mHuawei=" + this.f9649b + ", yandex=" + this.f9650c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f9648a = adTrackingInfoResult;
        this.f9649b = adTrackingInfoResult2;
        this.f9650c = adTrackingInfoResult3;
    }
}
