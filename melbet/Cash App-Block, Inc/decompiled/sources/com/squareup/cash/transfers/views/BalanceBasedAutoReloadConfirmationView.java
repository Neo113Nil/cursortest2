package com.squareup.cash.transfers.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewModel;
import com.squareup.cash.ui.OnTransitionListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import papa.PapaEvent;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class BalanceBasedAutoReloadConfirmationView extends ComposeUiView implements OnTransitionListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final BufferedChannel enterTransitionComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceBasedAutoReloadConfirmationView(Context context) {
        super(context);
        context.getClass();
        this.enterTransitionComplete = PapaEvent.Channel$default(1, null, null, 6);
    }

    public final void Content(BalanceBasedAutoReloadConfirmationViewModel balanceBasedAutoReloadConfirmationViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1442141146);
        int i2 = (gapComposer.changedInstance(balanceBasedAutoReloadConfirmationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(this) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxWebAppBridge.AnonymousClass3(this, function1, (Continuation) null, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, "Transition complete listener", (Function2) rememberedValue);
            if (balanceBasedAutoReloadConfirmationViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            if (balanceBasedAutoReloadConfirmationViewModel instanceof BalanceBasedAutoReloadConfirmationViewModel.Loading) {
                gapComposer.startReplaceGroup(1376804068);
                ComposeMooncakeThemeKt.MooncakeTheme(AddMoneyViewKt.lambda$2017508457, gapComposer, 6);
                gapComposer.end(false);
            } else {
                if (!(balanceBasedAutoReloadConfirmationViewModel instanceof BalanceBasedAutoReloadConfirmationViewModel.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1376802817, false);
                }
                gapComposer.startReplaceGroup(1376811677);
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1332767750, new TaxTooltipView$$ExternalSyntheticLambda0(28, balanceBasedAutoReloadConfirmationViewModel, function1), gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, balanceBasedAutoReloadConfirmationViewModel, function1, i, 9);
        }
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        Unit unit = Unit.INSTANCE;
        BufferedChannel bufferedChannel = this.enterTransitionComplete;
        if (bufferedChannel.mo1159trySendJP2dKIU(unit) instanceof ChannelResult.Failed) {
            Timber.Forest.e("Cannot send transition complete event", new Object[0]);
        }
        bufferedChannel.close(null);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BalanceBasedAutoReloadConfirmationViewModel) obj, function1, gapComposer, 0);
    }
}
