package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.RewardEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/chartboost/sdk/callbacks/RewardedCallback;", "Lcom/chartboost/sdk/callbacks/DismissibleAdCallback;", "onRewardEarned", "", "event", "Lcom/chartboost/sdk/events/RewardEvent;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardedCallback extends DismissibleAdCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(@NotNull RewardedCallback rewardedCallback, @NotNull ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            DismissibleAdCallback.DefaultImpls.onAdExpired(rewardedCallback, event);
        }
    }

    void onRewardEarned(@NotNull RewardEvent event);
}
