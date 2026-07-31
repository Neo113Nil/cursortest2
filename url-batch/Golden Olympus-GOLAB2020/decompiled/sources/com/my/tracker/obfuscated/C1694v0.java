package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1694v0 {

    /* renamed from: a, reason: collision with root package name */
    private C1690u0 f21543a = null;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21544b = false;

    private static C1690u0 b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            AbstractC1708y2.a("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            AbstractC1708y2.a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + isLimitAdTrackingEnabled);
            return new C1690u0(id, isLimitAdTrackingEnabled);
        } catch (Throwable th) {
            AbstractC1708y2.b("HuaweiAdInfoDataProvider: failed to get huawei AId", th);
            return null;
        }
    }

    public C1690u0 a(Context context) {
        if (!this.f21544b) {
            this.f21543a = b(context);
            this.f21544b = true;
        }
        return this.f21543a;
    }
}
