package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2130o6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2036k6 f29915a;

    public C2130o6(@NotNull C2036k6 verificationPolicy) {
        Intrinsics.checkNotNullParameter(verificationPolicy, "verificationPolicy");
        this.f29915a = verificationPolicy;
    }

    @NotNull
    public final AdQualityVerificationResult a(@NotNull AdQualityVerificationResult status) {
        r2.G verificationResultStateFlow;
        Intrinsics.checkNotNullParameter(status, "status");
        AdQualityVerificationState adQualityVerificationState = null;
        AdQualityVerificationStateFlow verifiedAd = status instanceof AdQualityVerificationResult.Verified ? ((AdQualityVerificationResult.Verified) status).getVerifiedAd() : null;
        if (verifiedAd != null && (verificationResultStateFlow = verifiedAd.getVerificationResultStateFlow()) != null) {
            adQualityVerificationState = (AdQualityVerificationState) verificationResultStateFlow.getValue();
        }
        return ((adQualityVerificationState instanceof AdQualityVerificationState.Error) && this.f29915a.b()) ? new AdQualityVerificationResult.Verified(new C2107n6(verifiedAd.getVerificationMode(), ((AdQualityVerificationState.Error) adQualityVerificationState).getError())) : status;
    }
}
