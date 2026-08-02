package com.squareup.cash.transfers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class WithdrawView extends ComposeUiView implements OutsideTapCloses {
    public final RealImageLoader imageLoader;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final boolean multiLinkingButtonsEnabled;
    public final RealCashVibrator vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawView(Context context, LocalizedMoneyFormatter.Factory factory, RealCashVibrator realCashVibrator, FeatureFlagManager featureFlagManager, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.moneyFormatterFactory = factory;
        this.vibrator = realCashVibrator;
        this.imageLoader = realImageLoader;
        this.multiLinkingButtonsEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons.INSTANCE)).enabled();
    }

    public final void Content(WithdrawViewModel withdrawViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(56233520);
        int i2 = (gapComposer.changedInstance(withdrawViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (withdrawViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new WithdrawView$$ExternalSyntheticLambda0(this, withdrawViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(542584709, new WithdrawView$$ExternalSyntheticLambda0(this, withdrawViewModel, function1), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda5(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new WithdrawView$$ExternalSyntheticLambda0(this, withdrawViewModel, function1, i, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((WithdrawViewModel) obj, function1, gapComposer, 0);
    }
}
