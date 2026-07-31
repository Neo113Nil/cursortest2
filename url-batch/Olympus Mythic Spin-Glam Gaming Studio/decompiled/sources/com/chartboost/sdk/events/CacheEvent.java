package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/chartboost/sdk/events/CacheEvent;", "Lcom/chartboost/sdk/events/AdEvent;", VastAttributes.AD_ID, "", "ad", "Lcom/chartboost/sdk/ads/Ad;", "(Ljava/lang/String;Lcom/chartboost/sdk/ads/Ad;)V", "getAd", "()Lcom/chartboost/sdk/ads/Ad;", "getAdID", "()Ljava/lang/String;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CacheEvent implements AdEvent {

    @NotNull
    private final Ad ad;

    @Nullable
    private final String adID;

    public CacheEvent(@Nullable String str, @NotNull Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.adID = str;
        this.ad = ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @NotNull
    public Ad getAd() {
        return this.ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @Nullable
    public String getAdID() {
        return this.adID;
    }
}
