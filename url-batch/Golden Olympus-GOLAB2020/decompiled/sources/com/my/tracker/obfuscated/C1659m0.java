package com.my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1659m0 {

    /* renamed from: a, reason: collision with root package name */
    private C1655l0 f21427a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21428b = false;

    private static C1655l0 b(Context context) {
        AbstractC1708y2.a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            AbstractC1708y2.a("GoogleAdInfoDataProvider: AId: " + id);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            AbstractC1708y2.a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + isLimitAdTrackingEnabled);
            return new C1655l0(id, isLimitAdTrackingEnabled);
        } catch (Throwable th) {
            AbstractC1708y2.b("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    public C1655l0 a(Context context) {
        if (!this.f21428b) {
            this.f21427a = b(context);
            this.f21428b = true;
        }
        return this.f21427a;
    }
}
