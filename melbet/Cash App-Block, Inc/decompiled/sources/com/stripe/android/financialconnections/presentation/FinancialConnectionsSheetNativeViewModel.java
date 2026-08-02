package com.stripe.android.financialconnections.presentation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.logging.Logging;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.utils.FlowsKt$get$1;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeViewModel extends FinancialConnectionsViewModel {
    public static final InitializerViewModelFactory Factory;
    public final DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl activityRetainedComponent;
    public final String applicationId;
    public final CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
    public final RealCreateInstantDebitsResult createInstantDebitsResult;
    public final RealCurrentLinkBrand currentLinkBrand;
    public final StateFlowImpl currentPane;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final FinancialConnectionsSheetNativeState initialState;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MutexImpl mutex;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final ReadonlySharedFlow navigationFlow;
    public final NavigationManagerImpl navigationManager;
    public final ReadonlyStateFlow topAppBarState;
    public final StateFlowImpl topAppBarStateUpdatesByPane;
    public final UriUtils uriUtils;

    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = financialConnectionsSheetNativeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2(financialConnectionsSheetNativeViewModel, continuation, 0);
                default:
                    return new AnonymousClass2(financialConnectionsSheetNativeViewModel, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
                default:
                    ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            final FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this.this$0;
            final int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = financialConnectionsSheetNativeViewModel.nativeAuthFlowCoordinator.flow;
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            Object value;
                            Object value2;
                            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
                            Object value3;
                            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2;
                            Object value4;
                            LinkedHashMap linkedHashMap;
                            int i5 = i4;
                            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                            switch (i5) {
                                case 0:
                                    NativeAuthFlowCoordinator.Message message = (NativeAuthFlowCoordinator.Message) obj2;
                                    if (Intrinsics.areEqual(message, NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE)) {
                                        StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel2._stateFlow;
                                        do {
                                            value2 = stateFlowImpl.getValue();
                                            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value2;
                                            financialConnectionsSheetNativeState.getClass();
                                        } while (!stateFlowImpl.compareAndSet(value2, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, WebAuthFlowState.Uninitialized.INSTANCE, null, null, 16381)));
                                    } else if (message instanceof NativeAuthFlowCoordinator.Message.Complete) {
                                        FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel2, ((NativeAuthFlowCoordinator.Message.Complete) message).cause, null, 2);
                                    } else if (message instanceof NativeAuthFlowCoordinator.Message.CloseWithError) {
                                        FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel2, null, ((NativeAuthFlowCoordinator.Message.CloseWithError) message).cause, 1);
                                    } else {
                                        if (!(message instanceof NativeAuthFlowCoordinator.Message.UpdateTopAppBar)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        TopAppBarStateUpdate topAppBarStateUpdate = ((NativeAuthFlowCoordinator.Message.UpdateTopAppBar) message).update;
                                        InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetNativeViewModel.Factory;
                                        TopAppBarState defaultTopAppBarState = financialConnectionsSheetNativeViewModel2.getDefaultTopAppBarState();
                                        Boolean bool = topAppBarStateUpdate.hideStripeLogo;
                                        boolean booleanValue = bool != null ? bool.booleanValue() : defaultTopAppBarState.hideStripeLogo;
                                        boolean z = topAppBarStateUpdate.allowBackNavigation;
                                        boolean z2 = topAppBarStateUpdate.allowElevation;
                                        Throwable th = topAppBarStateUpdate.error;
                                        TopAppBarState copy$default = TopAppBarState.copy$default(defaultTopAppBarState, null, booleanValue, z, z2, false, th == null ? null : th, topAppBarStateUpdate.canCloseWithoutConfirmation, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
                                        StateFlowImpl stateFlowImpl2 = financialConnectionsSheetNativeViewModel2.topAppBarStateUpdatesByPane;
                                        Pair pair = new Pair(topAppBarStateUpdate.pane, copy$default);
                                        stateFlowImpl2.getClass();
                                        do {
                                            value = stateFlowImpl2.getValue();
                                        } while (!stateFlowImpl2.compareAndSet(value, MapsKt__MapsKt.plus((Map) value, MapsKt__MapsJVMKt.mapOf(pair))));
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    LinkBrand linkBrand = (LinkBrand) obj2;
                                    StateFlowImpl stateFlowImpl3 = financialConnectionsSheetNativeViewModel2._stateFlow;
                                    do {
                                        value3 = stateFlowImpl3.getValue();
                                        financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) value3;
                                        financialConnectionsSheetNativeState2.getClass();
                                    } while (!stateFlowImpl3.compareAndSet(value3, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState2, null, null, linkBrand, 15359)));
                                    StateFlowImpl stateFlowImpl4 = financialConnectionsSheetNativeViewModel2.topAppBarStateUpdatesByPane;
                                    do {
                                        value4 = stateFlowImpl4.getValue();
                                        Map map = (Map) value4;
                                        linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                                        for (Map.Entry entry : map.entrySet()) {
                                            linkedHashMap.put(entry.getKey(), TopAppBarState.copy$default((TopAppBarState) entry.getValue(), linkBrand, false, false, false, false, null, false, IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO));
                                        }
                                    } while (!stateFlowImpl4.compareAndSet(value4, linkedHashMap));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    this.label = 1;
                    sharedFlowImpl.collect(flowCollector, this);
                    return coroutineSingletons;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    FlowToStateFlow flowToStateFlow = financialConnectionsSheetNativeViewModel.currentLinkBrand.stateFlow;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            Object value;
                            Object value2;
                            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
                            Object value3;
                            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2;
                            Object value4;
                            LinkedHashMap linkedHashMap;
                            int i52 = i2;
                            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                            switch (i52) {
                                case 0:
                                    NativeAuthFlowCoordinator.Message message = (NativeAuthFlowCoordinator.Message) obj2;
                                    if (Intrinsics.areEqual(message, NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE)) {
                                        StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel2._stateFlow;
                                        do {
                                            value2 = stateFlowImpl.getValue();
                                            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value2;
                                            financialConnectionsSheetNativeState.getClass();
                                        } while (!stateFlowImpl.compareAndSet(value2, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, WebAuthFlowState.Uninitialized.INSTANCE, null, null, 16381)));
                                    } else if (message instanceof NativeAuthFlowCoordinator.Message.Complete) {
                                        FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel2, ((NativeAuthFlowCoordinator.Message.Complete) message).cause, null, 2);
                                    } else if (message instanceof NativeAuthFlowCoordinator.Message.CloseWithError) {
                                        FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel2, null, ((NativeAuthFlowCoordinator.Message.CloseWithError) message).cause, 1);
                                    } else {
                                        if (!(message instanceof NativeAuthFlowCoordinator.Message.UpdateTopAppBar)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        TopAppBarStateUpdate topAppBarStateUpdate = ((NativeAuthFlowCoordinator.Message.UpdateTopAppBar) message).update;
                                        InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetNativeViewModel.Factory;
                                        TopAppBarState defaultTopAppBarState = financialConnectionsSheetNativeViewModel2.getDefaultTopAppBarState();
                                        Boolean bool = topAppBarStateUpdate.hideStripeLogo;
                                        boolean booleanValue = bool != null ? bool.booleanValue() : defaultTopAppBarState.hideStripeLogo;
                                        boolean z = topAppBarStateUpdate.allowBackNavigation;
                                        boolean z2 = topAppBarStateUpdate.allowElevation;
                                        Throwable th = topAppBarStateUpdate.error;
                                        TopAppBarState copy$default = TopAppBarState.copy$default(defaultTopAppBarState, null, booleanValue, z, z2, false, th == null ? null : th, topAppBarStateUpdate.canCloseWithoutConfirmation, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
                                        StateFlowImpl stateFlowImpl2 = financialConnectionsSheetNativeViewModel2.topAppBarStateUpdatesByPane;
                                        Pair pair = new Pair(topAppBarStateUpdate.pane, copy$default);
                                        stateFlowImpl2.getClass();
                                        do {
                                            value = stateFlowImpl2.getValue();
                                        } while (!stateFlowImpl2.compareAndSet(value, MapsKt__MapsKt.plus((Map) value, MapsKt__MapsJVMKt.mapOf(pair))));
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    LinkBrand linkBrand = (LinkBrand) obj2;
                                    StateFlowImpl stateFlowImpl3 = financialConnectionsSheetNativeViewModel2._stateFlow;
                                    do {
                                        value3 = stateFlowImpl3.getValue();
                                        financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) value3;
                                        financialConnectionsSheetNativeState2.getClass();
                                    } while (!stateFlowImpl3.compareAndSet(value3, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState2, null, null, linkBrand, 15359)));
                                    StateFlowImpl stateFlowImpl4 = financialConnectionsSheetNativeViewModel2.topAppBarStateUpdatesByPane;
                                    do {
                                        value4 = stateFlowImpl4.getValue();
                                        Map map = (Map) value4;
                                        linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                                        for (Map.Entry entry : map.entrySet()) {
                                            linkedHashMap.put(entry.getKey(), TopAppBarState.copy$default((TopAppBarState) entry.getValue(), linkBrand, false, false, false, false, null, false, IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO));
                                        }
                                    } while (!stateFlowImpl4.compareAndSet(value4, linkedHashMap));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    this.label = 1;
                    flowToStateFlow.collect(flowCollector2, this);
                    return coroutineSingletons2;
            }
        }
    }

    static {
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class), new StripeApiRepository$$ExternalSyntheticLambda5(11));
        Factory = chunkIndexMerger.build();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel(DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, SavedStateHandle savedStateHandle, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, UriUtils uriUtils, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, RealCreateInstantDebitsResult realCreateInstantDebitsResult, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, NavigationManagerImpl navigationManagerImpl, RealCurrentLinkBrand realCurrentLinkBrand, String str, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        super(financialConnectionsSheetNativeState, nativeAuthFlowCoordinator);
        Object value;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2;
        daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
        savedStateHandle.getClass();
        nativeAuthFlowCoordinator.getClass();
        uriUtils.getClass();
        completeFinancialConnectionsSession.getClass();
        realCreateInstantDebitsResult.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        navigationManagerImpl.getClass();
        realCurrentLinkBrand.getClass();
        str.getClass();
        financialConnectionsSheetNativeState.getClass();
        this.activityRetainedComponent = daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.uriUtils = uriUtils;
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.createInstantDebitsResult = realCreateInstantDebitsResult;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.navigationManager = navigationManagerImpl;
        this.currentLinkBrand = realCurrentLinkBrand;
        this.applicationId = str;
        this.initialState = financialConnectionsSheetNativeState;
        this.mutex = new MutexImpl();
        this.navigationFlow = navigationManagerImpl.navigationFlow;
        FinancialConnectionsSessionManifest.Pane pane = financialConnectionsSheetNativeState.initialPane;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(pane);
        this.currentPane = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(MapsKt__MapsJVMKt.mapOf(new Pair(pane, getDefaultTopAppBarState())));
        this.topAppBarStateUpdatesByPane = MutableStateFlow2;
        Continuation continuation = null;
        int i = 0;
        int i2 = 1;
        this.topAppBarState = FlowKt.stateIn(FlowKt.distinctUntilChanged(new SafeFlow(new Logger$log$1(new Flow[]{MutableStateFlow2, MutableStateFlow}, (Continuation) null, new FlowsKt$get$1(4, null)))), ViewModelKt.getViewModelScope(this), new StartedWhileSubscribed(5000L, Long.MAX_VALUE), getDefaultTopAppBarState());
        NavHostFragment$$ExternalSyntheticLambda1 navHostFragment$$ExternalSyntheticLambda1 = new NavHostFragment$$ExternalSyntheticLambda1(this, 5);
        JWECryptoParts jWECryptoParts = savedStateHandle.impl;
        jWECryptoParts.getClass();
        ((LinkedHashMap) jWECryptoParts.encryptedKey).put("FinancialConnectionsSheetNativeState", navHostFragment$$ExternalSyntheticLambda1);
        StateFlowImpl stateFlowImpl = this._stateFlow;
        do {
            value = stateFlowImpl.getValue();
            financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) value;
            financialConnectionsSheetNativeState2.getClass();
        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState2, null, null, null, 16379)));
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(this, continuation, i), 3);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(this, continuation, i2), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$handleFinancialConnectionsCompletion(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, FinancialConnectionsSession financialConnectionsSession) {
        FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.SUCCESS, new FinancialConnectionsEvent.Metadata(null, Boolean.valueOf(financialConnectionsSession.paymentAccount instanceof BankAccount), 0 == true ? 1 : 0, 5));
        boolean z = ((FinancialConnectionsSheetNativeState) financialConnectionsSheetNativeViewModel.stateFlow.$$delegate_0.getValue()).manualEntryUsesMicrodeposits;
        PaymentAccount paymentAccount = financialConnectionsSession.paymentAccount;
        FinancialConnectionsSession copy$default = FinancialConnectionsSession.copy$default(financialConnectionsSession, paymentAccount != null ? Logging.setUsesMicrodepositsIfNeeded(paymentAccount, z) : null);
        financialConnectionsSheetNativeViewModel.finishWithResult$2(new FinancialConnectionsSheetActivityResult.Completed(null, copy$default, copy$default.getParsedToken(), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleInstantDebitsCompletion(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, FinancialConnectionsSession financialConnectionsSession, ContinuationImpl continuationImpl) {
        FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1 financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;
        int i;
        InstantDebitsResult instantDebitsResult;
        if (continuationImpl instanceof FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1) {
            financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1 = (FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1) continuationImpl;
            int i2 = financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentAccount paymentAccount = financialConnectionsSession.paymentAccount;
                    if (paymentAccount == null) {
                        instantDebitsResult = null;
                        financialConnectionsSheetNativeViewModel.finishWithResult$2(instantDebitsResult != null ? new FinancialConnectionsSheetActivityResult.Completed(instantDebitsResult, null, null, 6) : new FinancialConnectionsSheetActivityResult.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount")));
                        return Unit.INSTANCE;
                    }
                    RealCreateInstantDebitsResult realCreateInstantDebitsResult = financialConnectionsSheetNativeViewModel.createInstantDebitsResult;
                    String id = paymentAccount.getId();
                    financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.label = 1;
                    obj = realCreateInstantDebitsResult.invoke(id, financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1);
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
                instantDebitsResult = (InstantDebitsResult) obj;
                financialConnectionsSheetNativeViewModel.finishWithResult$2(instantDebitsResult != null ? new FinancialConnectionsSheetActivityResult.Completed(instantDebitsResult, null, null, 6) : new FinancialConnectionsSheetActivityResult.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount")));
                return Unit.INSTANCE;
            }
        }
        financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1 = new FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1(financialConnectionsSheetNativeViewModel, continuationImpl);
        Object obj2 = financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1.label;
        if (i != 0) {
        }
        instantDebitsResult = (InstantDebitsResult) obj2;
        financialConnectionsSheetNativeViewModel.finishWithResult$2(instantDebitsResult != null ? new FinancialConnectionsSheetActivityResult.Completed(instantDebitsResult, null, null, 6) : new FinancialConnectionsSheetActivityResult.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount")));
        return Unit.INSTANCE;
    }

    public static final void access$onUrlReceived(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, String str, String str2) {
        Object value;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
        Object value2;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2;
        Object value3;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState3;
        StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel._stateFlow;
        if (Intrinsics.areEqual(str2, "success")) {
            do {
                value3 = stateFlowImpl.getValue();
                financialConnectionsSheetNativeState3 = (FinancialConnectionsSheetNativeState) value3;
                financialConnectionsSheetNativeState3.getClass();
            } while (!stateFlowImpl.compareAndSet(value3, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState3, new WebAuthFlowState.Success(str), null, null, 16381)));
            return;
        }
        if (!Intrinsics.areEqual(str2, "failure")) {
            do {
                value = stateFlowImpl.getValue();
                financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value;
                financialConnectionsSheetNativeState.getClass();
            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, new WebAuthFlowState.Canceled(str), null, null, 16381)));
            return;
        }
        String queryParameter = financialConnectionsSheetNativeViewModel.uriUtils.getQueryParameter(str, "error_reason");
        StateFlowImpl stateFlowImpl2 = financialConnectionsSheetNativeViewModel._stateFlow;
        do {
            value2 = stateFlowImpl2.getValue();
            financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) value2;
            financialConnectionsSheetNativeState2.getClass();
        } while (!stateFlowImpl2.compareAndSet(value2, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState2, new WebAuthFlowState.Failed(str, Recorder$$ExternalSyntheticOutline2.m("Received return_url with failed status: ", str), queryParameter), null, null, 16381)));
    }

    public static void closeAuthFlow$default(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable th, int i) {
        if ((i & 1) != 0) {
            earlyTerminationCause = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        financialConnectionsSheetNativeViewModel.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), null, null, new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(financialConnectionsSheetNativeViewModel, th, earlyTerminationCause, null), 3);
    }

    public final void finishWithResult$2(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        StateFlowImpl stateFlowImpl;
        Object value;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
        do {
            stateFlowImpl = this._stateFlow;
            value = stateFlowImpl.getValue();
            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value;
            financialConnectionsSheetNativeState.getClass();
        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, null, new FinancialConnectionsSheetNativeViewEffect.Finish(financialConnectionsSheetActivityResult), null, 16319)));
    }

    public final TopAppBarState getDefaultTopAppBarState() {
        LinkBrand invoke = this.currentLinkBrand.invoke();
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = this.initialState;
        return new TopAppBarState(invoke, financialConnectionsSheetNativeState.reducedBranding, financialConnectionsSheetNativeState.theme, financialConnectionsSheetNativeState.testMode, false, 968);
    }

    public final void onCloseFromErrorClick(Throwable th) {
        StripeException stripeException;
        th.getClass();
        FinancialConnectionsError financialConnectionsError = th instanceof FinancialConnectionsError ? (FinancialConnectionsError) th : null;
        if (financialConnectionsError != null && (stripeException = financialConnectionsError.stripeException) != null) {
            th = stripeException;
        }
        closeAuthFlow$default(this, null, th, 1);
    }

    public final void trackBackgroundStateChanged(boolean z) {
        FinancialConnectionsSessionManifest.Pane pane = (FinancialConnectionsSessionManifest.Pane) this.currentPane.getValue();
        pane.getClass();
        String str = z ? "mobile.app_entered_background" : "mobile.app_entered_foreground";
        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), str, true));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((FinancialConnectionsSheetNativeState) obj).getClass();
        return null;
    }
}
