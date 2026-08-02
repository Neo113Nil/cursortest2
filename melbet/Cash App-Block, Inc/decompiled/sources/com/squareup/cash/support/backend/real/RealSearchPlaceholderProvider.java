package com.squareup.cash.support.backend.real;

import androidx.compose.runtime.GapComposer;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.welcome.BitcoinWelcomeViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class RealSearchPlaceholderProvider implements BitcoinHomeWidgetPresenter {
    public final AndroidStringManager stringManager;

    public RealSearchPlaceholderProvider(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(-507152706);
        Integer valueOf = Integer.valueOf(R.string.bitcoin_welcome_title);
        Integer valueOf2 = Integer.valueOf(R.string.bitcoin_welcome_subtitle);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        AndroidStringManager androidStringManager = this.stringManager;
        BitcoinWelcomeViewModel bitcoinWelcomeViewModel = new BitcoinWelcomeViewModel(androidStringManager.get(intValue), androidStringManager.get(intValue2));
        gapComposer.end(false);
        return bitcoinWelcomeViewModel;
    }

    public RealSearchPlaceholderProvider(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }
}
