package com.monetization.ads.quality.base;

import android.content.Context;
import com.monetization.ads.quality.base.model.AdQualityVerifierAdapterInfo;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class AdQualityVerifierAdapter implements AdQualityVerifierAdEventListener {
    @NotNull
    public AdQualityVerifierAdapterInfo getAdapterInfo() {
        return new AdQualityVerifierAdapterInfo.Builder().build();
    }

    @Nullable
    public abstract Object verifyAd(@NotNull Context context, @NotNull AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, @NotNull AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, @NotNull d dVar);
}
