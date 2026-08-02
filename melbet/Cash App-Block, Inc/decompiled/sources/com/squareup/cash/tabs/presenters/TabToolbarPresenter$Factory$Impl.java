package com.squareup.cash.tabs.presenters;

import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadgingStateAccessibilityHelper;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.navigation.RealTabToolbarOutboundNavigator$Factory$Impl;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class TabToolbarPresenter$Factory$Impl {
    public final TabToolbarPresenter.MetroFactory delegateFactory;

    public TabToolbarPresenter$Factory$Impl(TabToolbarPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final TabToolbarPresenter create(Navigator navigator, Screen screen) {
        navigator.getClass();
        TabToolbarPresenter.MetroFactory metroFactory = this.delegateFactory;
        SessionManager sessionManager = (SessionManager) metroFactory.sessionManager.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) metroFactory.profileManager.invoke();
        Flow flow = (Flow) metroFactory.badges.invoke();
        Badger2 badger2 = (Badger2) metroFactory.badger2.invoke();
        RealTabToolbarOutboundNavigator$Factory$Impl realTabToolbarOutboundNavigator$Factory$Impl = (RealTabToolbarOutboundNavigator$Factory$Impl) ((InstanceFactory) metroFactory.tabToolbarOutboundNavigatorFactory).value;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.invoke();
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.bitcoinCapabilityProvider.invoke();
        RealBadgingStateAccessibilityHelper realBadgingStateAccessibilityHelper = (RealBadgingStateAccessibilityHelper) metroFactory.badgingStateAccessibilityHelper.invoke();
        MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory.moneybotFlagsHelper.invoke();
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.moneybotAnalyticsService.invoke();
        RealSessionFlags realSessionFlags = (RealSessionFlags) metroFactory.sessionFlags.invoke();
        SyncValueReader syncValueReader = (SyncValueReader) metroFactory.syncValueReader.invoke();
        RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) metroFactory.p2pSettingsManager.invoke();
        RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl = (RealFamilyNavigator$Factory$Impl) metroFactory.familyNavigatorFactory.invoke();
        RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory.familyProfileManager.invoke();
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.balanceSnapshotManager.invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.moneyFormatterFactory.invoke();
        sessionManager.getClass();
        realProfileManager.getClass();
        flow.getClass();
        badger2.getClass();
        realTabToolbarOutboundNavigator$Factory$Impl.getClass();
        featureFlagManager.getClass();
        realBitcoinCapabilityProvider.getClass();
        realBadgingStateAccessibilityHelper.getClass();
        moneybotFlagsHelper.getClass();
        realMoneybotAnalyticsService.getClass();
        realSessionFlags.getClass();
        syncValueReader.getClass();
        realP2pSettingsManager.getClass();
        realFamilyNavigator$Factory$Impl.getClass();
        realFamilyProfileManager.getClass();
        realBalanceSnapshotManager.getClass();
        factory.getClass();
        return new TabToolbarPresenter(sessionManager, realProfileManager, flow, badger2, realTabToolbarOutboundNavigator$Factory$Impl, featureFlagManager, realBitcoinCapabilityProvider, realBadgingStateAccessibilityHelper, moneybotFlagsHelper, realMoneybotAnalyticsService, realSessionFlags, syncValueReader, realP2pSettingsManager, realFamilyNavigator$Factory$Impl, realFamilyProfileManager, realBalanceSnapshotManager, factory, navigator, screen);
    }
}
