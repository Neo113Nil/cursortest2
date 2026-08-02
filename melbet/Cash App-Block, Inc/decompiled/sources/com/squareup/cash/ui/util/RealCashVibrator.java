package com.squareup.cash.ui.util;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import app.cash.local.navigation.api.RealCashLocalNavigator$Factory$Impl;
import com.squareup.cash.boost.backend.BoostBackendModule$Companion$bindBoostSignOutAction$1;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.navigation.CashTabProviderOutboundNavigator$Factory$Impl;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.taptopay.backend.real.RealTagCommunicationTeardownRunner;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.ui.ScreenshotReportingManager;
import com.squareup.cash.userjourneys.tracker.RealObservabilityMetadataLogger;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealCashVibrator {
    public final boolean permittedToVibrate;
    public final Vibrator vibrator;

    public RealCashVibrator(Context context, PermissionChecker permissionChecker) {
        this.permittedToVibrate = permissionChecker.hasVibrate();
        Object systemService = context.getSystemService("vibrator");
        systemService.getClass();
        this.vibrator = (Vibrator) systemService;
    }

    public final void error() {
        vibrate(150L);
    }

    public final void vibrate(long j) {
        Vibrator vibrator = this.vibrator;
        if (vibrator.hasVibrator() && this.permittedToVibrate) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
        }
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory context;
        public final Provider permissionChecker;

        public /* synthetic */ MetroFactory(Provider provider, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.permissionChecker = provider;
            this.context = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.permissionChecker;
            InstanceFactory instanceFactory = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) instanceFactory.value;
                    PermissionChecker permissionChecker = (PermissionChecker) provider.invoke();
                    context.getClass();
                    permissionChecker.getClass();
                    return new RealCashVibrator(context, permissionChecker);
                case 1:
                    RealSupportViewedArticlesStore realSupportViewedArticlesStore = (RealSupportViewedArticlesStore) provider.invoke();
                    StorageLink storageLink = (StorageLink) instanceFactory.value;
                    realSupportViewedArticlesStore.getClass();
                    storageLink.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(7, storageLink, realSupportViewedArticlesStore);
                case 2:
                    SupportalAppService supportalAppService = (SupportalAppService) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    supportalAppService.getClass();
                    coroutineScope.getClass();
                    return new RealChatManager(supportalAppService, coroutineScope);
                case 3:
                    CashTabProviderOutboundNavigator$Factory$Impl cashTabProviderOutboundNavigator$Factory$Impl = (CashTabProviderOutboundNavigator$Factory$Impl) instanceFactory.value;
                    RealCashLocalNavigator$Factory$Impl realCashLocalNavigator$Factory$Impl = (RealCashLocalNavigator$Factory$Impl) provider.invoke();
                    cashTabProviderOutboundNavigator$Factory$Impl.getClass();
                    realCashLocalNavigator$Factory$Impl.getClass();
                    return new OkHttpCall.AnonymousClass1(12, cashTabProviderOutboundNavigator$Factory$Impl, realCashLocalNavigator$Factory$Impl);
                case 4:
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    coroutineContext.getClass();
                    coroutineScope2.getClass();
                    return new RealTagCommunicationTeardownRunner(coroutineContext, coroutineScope2);
                case 5:
                    BreadcrumbListener breadcrumbListener = (BreadcrumbListener) provider.invoke();
                    CashNavigationLogger cashNavigationLogger = (CashNavigationLogger) instanceFactory.value;
                    breadcrumbListener.getClass();
                    cashNavigationLogger.getClass();
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new EventListener[]{breadcrumbListener, cashNavigationLogger});
                case 6:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    featureFlagManager.getClass();
                    coroutineScope3.getClass();
                    return new ScreenshotReportingManager(featureFlagManager, coroutineScope3);
                default:
                    BugsnagClient bugsnagClient = (BugsnagClient) instanceFactory.value;
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    bugsnagClient.getClass();
                    realObservabilityManager.getClass();
                    return new RealObservabilityMetadataLogger(bugsnagClient, realObservabilityManager);
            }
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, int i) {
            this.$r8$classId = i;
            this.context = instanceFactory;
            this.permissionChecker = provider;
        }
    }
}
