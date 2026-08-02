package com.squareup.cash.support.screenshot;

import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.Room;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.Broadway;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.passcode.backend.RealAppLockState;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$Factory$Impl;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.util.android.AndroidToaster;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.ConnectionPool;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final /* synthetic */ class ScreenshotViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ScreenshotViewKt$$ExternalSyntheticLambda0(View view, RealScreenshotManager realScreenshotManager, ScreenshotEventReceiver screenshotEventReceiver, AndroidToaster androidToaster, int i) {
        this.$r8$classId = 0;
        OverlayState overlayState = OverlayState.SCREENSHOT_CONTROLS_DISPLAYED;
        this.f$0 = view;
        this.f$1 = realScreenshotManager;
        this.f$2 = screenshotEventReceiver;
        this.f$3 = androidToaster;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Room.ScreenshotOverlay((View) obj6, (RealScreenshotManager) obj5, (ScreenshotEventReceiver) obj4, (AndroidToaster) obj3, OverlayState.OVERLAY_HIDDEN, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                UiContainer uiContainer = (UiContainer) obj6;
                ContainerUiModel containerUiModel = (ContainerUiModel) obj5;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj4;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ToolbarConfig toolbarConfig = uiContainer.fullScreenConfigAggregator.getMergedConfig().toolbarConfig;
                    if (toolbarConfig == null) {
                        gapComposer.startReplaceGroup(285339555);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(285339556);
                        TabToolbarInternalViewModel tabToolbarInternalViewModel = containerUiModel.chrome.tabToolbarViewModel;
                        ElementBoundsRegistry elementBoundsRegistry = uiContainer.elementBoundsRegistry;
                        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = toolbarConfig.moneybotSharedElementKeys != null ? new MoneybotToolbarSharedElementConfig(animatedContentScopeImpl, sharedTransitionScope, MoneybotToolbarSharedKey$Leading.INSTANCE, MoneybotToolbarSharedKey$Trailing.INSTANCE) : null;
                        ToolbarConfig.SearchSharedElementKeys searchSharedElementKeys = toolbarConfig.searchSharedElementKeys;
                        UiContainerKt.ContainerTabToolbar(toolbarConfig, tabToolbarInternalViewModel, elementBoundsRegistry, moneybotToolbarSharedElementConfig, searchSharedElementKeys != null ? new SimpleActor(animatedContentScopeImpl, sharedTransitionScope, searchSharedElementKeys.getSearchBoundsKey(), searchSharedElementKeys.getSearchIconKey()) : null, BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.TopCenter), null, gapComposer, 36872, 64);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                UiContainerKt.TooltipAppMessage((ElementBoundsRegistry) obj6, (RealTooltipTargetLoadedCallbackRegistry) obj5, (Function1) obj4, (TooltipAppMessageViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Set set = (Set) obj3;
                NavigatorState navigatorState = (NavigatorState) obj;
                navigatorState.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                set.getClass();
                handlerContext.getClass();
                PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = ((BetterNavigator$Factory$Impl) obj6).delegateFactory;
                Retrofit.Builder builder = (Retrofit.Builder) ((RealBadger2.MetroFactory) poolDetailsPresenter$MetroFactory.stringManager).invoke();
                ConnectionPool connectionPool = (ConnectionPool) ((MusicViewFactory$MetroFactory) poolDetailsPresenter$MetroFactory.sessionManager).invoke();
                Broadway broadway = (Broadway) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
                ErrorReporter errorReporter = (ErrorReporter) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
                BugsnagClient bugsnagClient = (BugsnagClient) poolDetailsPresenter$MetroFactory.launcher.invoke();
                List list = (List) ((SandboxJanitor.MetroFactory) poolDetailsPresenter$MetroFactory.dateFormatManager).invoke();
                KeysetHandle keysetHandle = (KeysetHandle) ((TemporaryStorage.MetroFactory) poolDetailsPresenter$MetroFactory.clock).invoke();
                CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) poolDetailsPresenter$MetroFactory.uuidGenerator).value;
                List list2 = (List) ((RealAppLockState.MetroFactory) poolDetailsPresenter$MetroFactory.blockersNavigator).invoke();
                RealTabPublisher realTabPublisher = (RealTabPublisher) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                RealUuidGenerator realUuidGenerator = (RealUuidGenerator) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) ((InstanceFactory) poolDetailsPresenter$MetroFactory.analytics).value;
                RealSessionFlags realSessionFlags = (RealSessionFlags) poolDetailsPresenter$MetroFactory.featureFlagManager.invoke();
                MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
                broadway.getClass();
                errorReporter.getClass();
                bugsnagClient.getClass();
                list.getClass();
                coroutineScope.getClass();
                list2.getClass();
                realTabPublisher.getClass();
                realUuidGenerator.getClass();
                lifecycleOwner.getClass();
                realSessionFlags.getClass();
                moneybotFlagsHelper.getClass();
                return new BetterNavigator(builder, connectionPool, broadway, errorReporter, bugsnagClient, list, keysetHandle, coroutineScope, list2, realTabPublisher, realUuidGenerator, lifecycleOwner, realSessionFlags, moneybotFlagsHelper, navigatorState, (RoomDatabase$closeBarrier$1) obj5, (MainContainerDelegate$$ExternalSyntheticLambda0) obj4, (Bundle) obj2, set, handlerContext);
        }
    }

    public /* synthetic */ ScreenshotViewKt$$ExternalSyntheticLambda0(ElementBoundsRegistry elementBoundsRegistry, RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry, Function1 function1, TooltipAppMessageViewModel tooltipAppMessageViewModel, int i) {
        this.$r8$classId = 2;
        this.f$0 = elementBoundsRegistry;
        this.f$1 = realTooltipTargetLoadedCallbackRegistry;
        this.f$2 = function1;
        this.f$3 = tooltipAppMessageViewModel;
    }

    public /* synthetic */ ScreenshotViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
