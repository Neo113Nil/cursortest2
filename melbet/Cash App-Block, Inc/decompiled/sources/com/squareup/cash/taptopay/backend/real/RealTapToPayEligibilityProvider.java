package com.squareup.cash.taptopay.backend.real;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$model$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileC4bTapToPay;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class RealTapToPayEligibilityProvider {
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final RealNfcPaymentsManager nfcPaymentManager;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TapToPay.OnboardingStatus.values().length];
            try {
                Edge.Companion companion = TapToPay.OnboardingStatus.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Edge.Companion companion2 = TapToPay.OnboardingStatus.Companion;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Edge.Companion companion3 = TapToPay.OnboardingStatus.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealTapToPayEligibilityProvider(RealFeatureEligibilityRepository realFeatureEligibilityRepository, FeatureFlagManager featureFlagManager, RealNfcPaymentsManager realNfcPaymentsManager, SyncValueReader syncValueReader) {
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.featureFlagManager = featureFlagManager;
        this.nfcPaymentManager = realNfcPaymentsManager;
        this.syncValueReader = syncValueReader;
    }

    public final FinishSetupTileBadgeCounter isEligible() {
        int i = 10;
        return FlowKt.combine(new FinishSetupTileBadgeCounter(i, this.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.TAP_TO_PAY}), ((RealFeatureFlagManager) this.featureFlagManager).peekValues(AmplitudeExperiments$MobileC4bTapToPay.INSTANCE), this.syncValueReader.getAllValues(AndroidSyncValueSpecs.C4bTapToPay), new RealStyledCardPresenter$model$1(this, null, 3));
    }
}
