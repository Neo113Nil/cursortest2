package com.squareup.cash.ui;

import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.core.navigationcontainer.UiContainer$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator$Factory$Impl;
import com.squareup.cash.core.presenters.CorePresenterModule$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.IntentHandler;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.thing.Thing;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.ConnectionPool;
import okio.Path;

/* loaded from: classes.dex */
public final class SandboxedActivityContext {
    public final Analytics analytics;
    public final DeepLinkCompletableNavigator deepLinkCompletableNavigator;
    public final boolean disableSecureScreens;
    public final FeatureFlagManager featureFlagManager;
    public final RealImageLoader imageLoader;
    public final IntentHandler intentHandler;
    public final MainActivityDelegate mainActivityDelegate;
    public final ConnectionPool mainContainerDelegateFactory;
    public final CorePresenterModule$$ExternalSyntheticLambda0 mainScreensPresenterFactory;
    public final CoroutineScope scope;
    public final ScreenshotReportingManager screenshotReportingManager;
    public final RealSessionFlags sessionFlags;
    public final WireAdapter setupTeardownsFactory;
    public final SplashScreenAnimationObserver splashScreenAnimationObserver;
    public final StorageLink storageLink;
    public final Path.Companion viewContainerViewFactory;

    public SandboxedActivityContext(IntentHandler intentHandler, Analytics analytics, Path.Companion companion, RealImageLoader realImageLoader, FeatureFlagManager featureFlagManager, SplashScreenAnimationObserver splashScreenAnimationObserver, WireAdapter wireAdapter, ConnectionPool connectionPool, CorePresenterModule$$ExternalSyntheticLambda0 corePresenterModule$$ExternalSyntheticLambda0, DeepLinkCompletableNavigator deepLinkCompletableNavigator, RealSessionFlags realSessionFlags, StorageLink storageLink, ScreenshotReportingManager screenshotReportingManager, CoroutineScope coroutineScope, boolean z, MainActivityDelegate mainActivityDelegate) {
        this.intentHandler = intentHandler;
        this.analytics = analytics;
        this.viewContainerViewFactory = companion;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = featureFlagManager;
        this.splashScreenAnimationObserver = splashScreenAnimationObserver;
        this.setupTeardownsFactory = wireAdapter;
        this.mainContainerDelegateFactory = connectionPool;
        this.mainScreensPresenterFactory = corePresenterModule$$ExternalSyntheticLambda0;
        this.deepLinkCompletableNavigator = deepLinkCompletableNavigator;
        this.sessionFlags = realSessionFlags;
        this.storageLink = storageLink;
        this.screenshotReportingManager = screenshotReportingManager;
        this.scope = coroutineScope;
        this.disableSecureScreens = z;
        this.mainActivityDelegate = mainActivityDelegate;
    }

    public final MainContainerDelegate createContainer(Thing.ThingContextThemeWrapper thingContextThemeWrapper) {
        MainActivityDelegate mainActivityDelegate = this.mainActivityDelegate;
        if (((MainActivity) mainActivityDelegate)._konfettiView == null) {
            a$$ExternalSyntheticBUOutline0.m$1("KonfettiView isn't initialized yet. Some screens like FormView will access it immediately during initialization.");
            return null;
        }
        RealGrpcStreamingCall realGrpcStreamingCall = (RealGrpcStreamingCall) this.mainContainerDelegateFactory.delegate;
        UiContainer$Factory$Impl uiContainer$Factory$Impl = (UiContainer$Factory$Impl) ((InstanceFactory) realGrpcStreamingCall.grpcClient).value;
        CashNavigator$Factory$Impl cashNavigator$Factory$Impl = (CashNavigator$Factory$Impl) ((InstanceFactory) realGrpcStreamingCall.method).value;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ((InstanceFactory) realGrpcStreamingCall.requestBody).value;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) realGrpcStreamingCall.call).invoke();
        boolean booleanValue = Boolean.FALSE.booleanValue();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) realGrpcStreamingCall.timeout).value;
        TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) ((Provider) realGrpcStreamingCall.requestMetadata).invoke();
        uiContainer$Factory$Impl.getClass();
        cashNavigator$Factory$Impl.getClass();
        lifecycleOwner.getClass();
        featureFlagManager.getClass();
        coroutineScope.getClass();
        tabToolbarPresenter$Factory$Impl.getClass();
        MainContainerDelegate mainContainerDelegate = new MainContainerDelegate(uiContainer$Factory$Impl, cashNavigator$Factory$Impl, lifecycleOwner, featureFlagManager, booleanValue, coroutineScope, thingContextThemeWrapper, mainActivityDelegate, tabToolbarPresenter$Factory$Impl);
        StateFlowImpl stateFlowImpl = mainContainerDelegate.presenterFactory;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, this.mainScreensPresenterFactory);
        return mainContainerDelegate;
    }

    public final void initWorkers() {
        MainActivity$$ExternalSyntheticLambda6 mainActivity$$ExternalSyntheticLambda6 = ((MainActivity) this.mainActivityDelegate).unlockedNavigator;
        mainActivity$$ExternalSyntheticLambda6.getClass();
        this.screenshotReportingManager.navigator = mainActivity$$ExternalSyntheticLambda6;
        JobKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new PreferenceFlow$flow$1(this, mainActivity$$ExternalSyntheticLambda6, null, 11), 1);
    }
}
