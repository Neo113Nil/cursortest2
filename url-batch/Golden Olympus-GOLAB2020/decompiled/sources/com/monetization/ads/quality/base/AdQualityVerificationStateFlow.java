package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r2.G;

@Metadata
/* loaded from: classes2.dex */
public interface AdQualityVerificationStateFlow {
    @NotNull
    AdQualityVerificationMode getVerificationMode();

    @NotNull
    G getVerificationResultStateFlow();
}
