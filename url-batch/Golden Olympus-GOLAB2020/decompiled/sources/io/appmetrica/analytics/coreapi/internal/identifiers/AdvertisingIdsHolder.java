package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f36942a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f36943b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f36944c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f36942a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f36943b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f36944c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f36942a + ", mHuawei=" + this.f36943b + ", yandex=" + this.f36944c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f36942a = adTrackingInfoResult;
        this.f36943b = adTrackingInfoResult2;
        this.f36944c = adTrackingInfoResult3;
    }
}
