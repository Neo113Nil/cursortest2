package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.R;
import com.squareup.cash.featureflags.AmplitudeExperiments$ProjMintCardGridNux;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.util.android.Toaster$Length;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardSchemePresenter$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardSchemePresenter f$0;

    public /* synthetic */ CardSchemePresenter$$ExternalSyntheticLambda1(CardSchemePresenter cardSchemePresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = cardSchemePresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.f$0;
        switch (i) {
            case 0:
                return new ParcelableSnapshotMutableIntState(cardSchemePresenter.initialPaymentDevicePage.intValue());
            case 1:
                return Updater.mutableStateOf$default(Boolean.valueOf(cardSchemePresenter.getCopyId() != null));
            case 2:
                return Updater.mutableStateOf$default(Boolean.valueOf(cardSchemePresenter.getCopyId() == null));
            case 3:
                cardSchemePresenter.toaster.makeToast(cardSchemePresenter.stringManager.get(R.string.wallet_card_tab_error), Toaster$Length.SHORT);
                return Unit.INSTANCE;
            case 4:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) cardSchemePresenter.featureFlagManager).currentValue(AmplitudeExperiments$ProjMintCardGridNux.INSTANCE)).enabled());
            default:
                return cardSchemePresenter.getCopyId();
        }
    }
}
