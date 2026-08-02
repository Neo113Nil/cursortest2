package com.squareup.cash.transactionpicker.blocker.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.support.presenters.ArticlePresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomePresenter$$ExternalSyntheticLambda2;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.moshi.Moshi;
import com.squareup.protos.franklin.app.AppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class UnifiedActivityPickerBlockerPresenter implements MoleculePresenter, ActivityItemEventHandler {
    public final Lazy activityContext$delegate;
    public final Lazy activityEmbeddedPresenter$delegate;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.ActivityPickerScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Lazy stringListAdapter$delegate;
    public final AndroidStringManager stringManager;
    public final SharedFlowImpl submittingStateSharedFlow;
    public final SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenterFactory;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SubmitState {
        public static final /* synthetic */ SubmitState[] $VALUES;
        public static final SubmitState IDLE;
        public static final SubmitState SUBMITTING;

        static {
            SubmitState submitState = new SubmitState("SUBMITTING", 0);
            SUBMITTING = submitState;
            SubmitState submitState2 = new SubmitState("IDLE", 1);
            IDLE = submitState2;
            $VALUES = new SubmitState[]{submitState, submitState2};
        }

        public static SubmitState valueOf(String str) {
            return (SubmitState) Enum.valueOf(SubmitState.class, str);
        }

        public static SubmitState[] values() {
            return (SubmitState[]) $VALUES.clone();
        }
    }

    public UnifiedActivityPickerBlockerPresenter(RealActivitiesCacheManager realActivitiesCacheManager, RealActivityTokenFactory realActivityTokenFactory, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl, AndroidStringManager androidStringManager, AppService appService, BlockersDataNavigator blockersDataNavigator, Analytics analytics, Moshi moshi, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.ActivityPickerScreen activityPickerScreen) {
        activityPickerScreen.getClass();
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.supportActivityItemPresenterFactory = supportActivityItemPresenter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.args = activityPickerScreen;
        this.submittingStateSharedFlow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.stringListAdapter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 5));
        this.activityContext$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new SupportHomePresenter$$ExternalSyntheticLambda2(realActivityTokenFactory, 2));
        this.activityEmbeddedPresenter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new TaxWebAppBridge$$ExternalSyntheticLambda0(19, this, realActivitiesCacheManager));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$awaitInitialLoadedActivities(UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter, SafeFlow safeFlow, ContinuationImpl continuationImpl) {
        UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1 unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1;
        int i;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        if (continuationImpl instanceof UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1) {
            unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1 = (UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1) continuationImpl;
            int i2 = unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSheetState$peek$3.AnonymousClass2 anonymousClass2 = new RealSheetState$peek$3.AnonymousClass2(2, continuation, 6);
                    unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.label = 1;
                    obj = FlowKt.firstOrNull(safeFlow, anonymousClass2, unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj;
                if (activityEmbeddedViewModel != null || activityEmbeddedViewModel.getHasLoadingError()) {
                    return null;
                }
                List list = activityEmbeddedViewModel.feedEntries;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ActivityFeedEntry.Item) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1 = new UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1(unifiedActivityPickerBlockerPresenter, continuationImpl);
        Object obj3 = unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj3;
        if (activityEmbeddedViewModel != null) {
        }
        return null;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemViewModel.getClass();
        activityItemViewEvent.getClass();
        activityItem.getClass();
        return new SafeFlow(new TaxWebAppPresenter$models$1$1(activityItemViewEvent, this, activityItem, (Continuation) null, 22));
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1179438914);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.activityEmbeddedPresenter$delegate.getValue()).models(gapComposer, 0), gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.submittingStateSharedFlow;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((MutableSharedFlow) rememberedValue, SubmitState.IDLE, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(rememberUpdatedState);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 14;
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TaxWebAppBridge.AnonymousClass3(this, rememberUpdatedState, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, i2));
        int ordinal = ((SubmitState) collectAsState.getValue()).ordinal();
        if (ordinal == 0) {
            obj = SupportFullScreenActivityPickerViewModel.Loading.INSTANCE;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel((UiCallbackModel) rememberUpdatedState.getValue(), "");
            SupportFullScreenActivityPickerViewModel.Loaded.NavigationIconType navigationIconType = SupportFullScreenActivityPickerViewModel.Loaded.NavigationIconType.CLOSE;
            String str = this.args.title;
            obj = new SupportFullScreenActivityPickerViewModel.Loaded(fullScreenActivityViewModel, navigationIconType, str != null ? str : "", null);
        }
        gapComposer.end(false);
        return obj;
    }
}
