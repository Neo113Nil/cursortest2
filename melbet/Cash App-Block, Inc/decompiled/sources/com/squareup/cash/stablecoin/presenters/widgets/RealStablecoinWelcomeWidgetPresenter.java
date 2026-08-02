package com.squareup.cash.stablecoin.presenters.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.backend.disclosures.CryptoDisclosure;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$Factory$Impl;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.stablecoin.presenters.widgets.state.RealStablecoinHomeWidgetStateManager;
import com.squareup.cash.stablecoin.presenters.widgets.state.StablecoinHomeWidgetState;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeBalanceWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinWelcomeWidgetViewModel;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.ViewRegistryKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class RealStablecoinWelcomeWidgetPresenter implements MoleculeCallbackPresenter {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object stateManager;
    public final Object stringManager;

    public RealStablecoinWelcomeWidgetPresenter(LocalizedMoneyFormatter.Factory factory, RealStablecoinHomeWidgetStateManager realStablecoinHomeWidgetStateManager, BetterNavigator.ScreenNavigator screenNavigator) {
        realStablecoinHomeWidgetStateManager.getClass();
        this.stateManager = realStablecoinHomeWidgetStateManager;
        this.stringManager = factory.createSymbolAndCode();
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        int i = this.$r8$classId;
        Object obj = this.stateManager;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj2 = this.stringManager;
        switch (i) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-2026041340);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = ((RealStablecoinHomeWidgetStateManager) obj).widgetState;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                r3 = ((StablecoinHomeWidgetState) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).hasStablecoinActivity ? null : new StablecoinWelcomeWidgetViewModel(androidStringManager.get(R.string.stablecoin_welcome_title), androidStringManager.get(R.string.stablecoin_welcome_subtitle));
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ChatView$$ExternalSyntheticLambda2(8);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue2, r3);
                gapComposer.end(false);
                return uiCallbackModel;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-711393542);
                MutableState collectAsState = Updater.collectAsState(((RealStablecoinHomeWidgetStateManager) obj).widgetState, null, gapComposer2, 1);
                CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = ((StablecoinHomeWidgetState) collectAsState.getValue()).stablecoinBalance;
                Money money = cryptoBalance$StablecoinBalance != null ? new Money(Long.valueOf(cryptoBalance$StablecoinBalance.amount), CurrencyCode.XUS, 4) : null;
                if (((StablecoinHomeWidgetState) collectAsState.getValue()).hasStablecoinActivity && money != null) {
                    r3 = new StablecoinHomeBalanceWidgetViewModel(((MoneyFormatter) obj2).format(money));
                }
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ChatView$$ExternalSyntheticLambda2(7);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                UiCallbackModel uiCallbackModel2 = new UiCallbackModel((Function1) rememberedValue3, r3);
                gapComposer2.end(false);
                return uiCallbackModel2;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1006043790);
                RealCryptoDisclosuresRepo cryptoDisclosureRepo = ViewRegistryKt.cryptoDisclosureRepo((RealCryptoDisclosuresRepo$Factory$Impl) obj2, gapComposer3);
                CryptoDisclosure cryptoDisclosure = (CryptoDisclosure) Updater.collectAsState(StateFlowKt.mapState(cryptoDisclosureRepo.disclosureStateFlow, new RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0(cryptoDisclosureRepo, 1)), null, gapComposer3, 1).getValue();
                r3 = cryptoDisclosure != null ? new StablecoinHomeDisclosuresWidgetViewModel(cryptoDisclosure.url, cryptoDisclosure.disclosure) : null;
                boolean changedInstance = gapComposer3.changedInstance(this);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new RealSandboxer$$ExternalSyntheticLambda0(this, 20);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                UiCallbackModel uiCallbackModel3 = new UiCallbackModel((Function1) rememberedValue4, r3);
                gapComposer3.end(false);
                return uiCallbackModel3;
        }
    }

    public RealStablecoinWelcomeWidgetPresenter(RealCryptoDisclosuresRepo$Factory$Impl realCryptoDisclosuresRepo$Factory$Impl, IntentLauncher intentLauncher, RealStablecoinHomeWidgetStateManager realStablecoinHomeWidgetStateManager, BetterNavigator.ScreenNavigator screenNavigator) {
        realStablecoinHomeWidgetStateManager.getClass();
        this.stringManager = realCryptoDisclosuresRepo$Factory$Impl;
        this.stateManager = intentLauncher;
    }

    public RealStablecoinWelcomeWidgetPresenter(AndroidStringManager androidStringManager, RealStablecoinHomeWidgetStateManager realStablecoinHomeWidgetStateManager, BetterNavigator.ScreenNavigator screenNavigator) {
        realStablecoinHomeWidgetStateManager.getClass();
        this.stringManager = androidStringManager;
        this.stateManager = realStablecoinHomeWidgetStateManager;
    }
}
