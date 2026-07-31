package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.ExpirationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/callbacks/AdCallback;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BannerCallback extends AdCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(@NotNull BannerCallback bannerCallback, @NotNull ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AdCallback.DefaultImpls.onAdExpired(bannerCallback, event);
        }
    }
}
