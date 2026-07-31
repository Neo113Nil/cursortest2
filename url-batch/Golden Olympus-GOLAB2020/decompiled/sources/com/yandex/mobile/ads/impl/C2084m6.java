package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2084m6 {

    /* renamed from: com.yandex.mobile.ads.impl.m6$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28911a;

        static {
            int[] iArr = new int[AdQualityVerificationMode.values().length];
            try {
                iArr[AdQualityVerificationMode.FAST_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdQualityVerificationMode.LONG_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28911a = iArr;
        }
    }

    private static String a(AdQualityVerificationState adQualityVerificationState) {
        String str;
        if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
            str = "Blocked: " + ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason().getBlockReasons();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            str = "Error occurred during verification: " + ((AdQualityVerificationState.Error) adQualityVerificationState).getError().getDescription();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.NotStarted) {
            str = "Not verification started for the ad object";
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
            str = "Should be blocked on display: " + ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason().getBlockReasons();
        } else {
            if (!(adQualityVerificationState instanceof AdQualityVerificationState.Verified)) {
                throw new W1.m();
            }
            str = "Verified";
        }
        return "Verification Completed. With result: " + str;
    }

    @NotNull
    public static jp1 b(@NotNull AdQualityVerificationResult verificationResult) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        jp1 jp1Var = new jp1(MapsKt.emptyMap(), 2);
        jp1Var.b(a(verificationResult), "verification_status");
        boolean z4 = verificationResult instanceof AdQualityVerificationResult.Verified;
        if (z4) {
            int i4 = a.f28911a[((AdQualityVerificationResult.Verified) verificationResult).getVerifiedAd().getVerificationMode().ordinal()];
            if (i4 == 1) {
                str = "fastVerification";
            } else {
                if (i4 != 2) {
                    throw new W1.m();
                }
                str = "longVerification";
            }
        } else {
            str = null;
        }
        jp1Var.b(str, "verification_flow");
        if (z4) {
            AdQualityVerificationState adQualityVerificationState = (AdQualityVerificationState) ((AdQualityVerificationResult.Verified) verificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue();
            if ((adQualityVerificationState instanceof AdQualityVerificationState.Verified) || (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) || (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay)) {
                str2 = "success";
                jp1Var.b(str2, "status");
                return jp1Var;
            }
        }
        if (verificationResult instanceof AdQualityVerificationResult.NotVerified) {
            AdQualityVerificationError reason = ((AdQualityVerificationResult.NotVerified) verificationResult).getReason();
            if ((reason instanceof AdQualityVerificationError.DisabledError) || (reason instanceof AdQualityVerificationError.LowUsagePercent) || (reason instanceof AdQualityVerificationError.UnsupportedNetwork)) {
                str2 = "verification not enabled";
                jp1Var.b(str2, "status");
                return jp1Var;
            }
        }
        str2 = "error";
        jp1Var.b(str2, "status");
        return jp1Var;
    }

    private static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return "Not implemented by design";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified)) {
            if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                return a((AdQualityVerificationState) ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue());
            }
            throw new W1.m();
        }
        return "Not verified by reason: " + ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason().getDescription();
    }
}
