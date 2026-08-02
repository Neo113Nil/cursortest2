package com.squareup.cash.ui.overlays.presenter;

import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;

/* loaded from: classes.dex */
public final class RealAlertBannerPresenter$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public RealAlertBannerPresenter$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final RealAlertBannerPresenter create$1(BetterNavigator.ScreenNavigator screenNavigator, AlertBannerScreen alertBannerScreen) {
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        SyncValueReader syncValueReader = (SyncValueReader) realFamilyNavigator$MetroFactory.analytics.invoke();
        Analytics analytics = (Analytics) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) realFamilyNavigator$MetroFactory.stringManager.invoke();
        syncValueReader.getClass();
        analytics.getClass();
        featureFlagManager.getClass();
        realRouter$Factory$Impl.getClass();
        return new RealAlertBannerPresenter(syncValueReader, analytics, featureFlagManager, realRouter$Factory$Impl, screenNavigator, alertBannerScreen);
    }
}
