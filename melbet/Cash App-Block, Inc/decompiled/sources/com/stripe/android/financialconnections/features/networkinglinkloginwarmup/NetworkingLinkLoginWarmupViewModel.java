package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkLoginWarmupViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final ToolbarTuckTargets disableNetworking;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final RealHandleError handleError;
    public final LookupAccount lookupAccount;
    public final NavigationManagerImpl navigationManager;
    public final ElementsSessionContext.PrefillDetails prefillDetails;

    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ NetworkingLinkLoginWarmupViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = networkingLinkLoginWarmupViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(networkingLinkLoginWarmupViewModel, continuation, 0);
                default:
                    return new AnonymousClass1(networkingLinkLoginWarmupViewModel, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            int i = this.$r8$classId;
            NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync = networkingLinkLoginWarmupViewModel.getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = ((SynchronizeSessionResponse) obj).manifest;
                    networkingLinkLoginWarmupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(NetworkingLinkLoginWarmupViewModel.PANE, 25));
                    String str2 = financialConnectionsSessionManifest.accountholderCustomerEmailAddress;
                    if (str2 == null) {
                        ElementsSessionContext.PrefillDetails prefillDetails = networkingLinkLoginWarmupViewModel.prefillDetails;
                        if (prefillDetails == null) {
                            str = null;
                            if (str != null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                return null;
                            }
                            String str3 = financialConnectionsSessionManifest.businessName;
                            if (str3 == null) {
                                str3 = financialConnectionsSessionManifest.connectPlatformName;
                            }
                            String str4 = str3;
                            String str5 = (String) StringsKt.split$default(str, new char[]{'@'}, 6).get(0);
                            return new NetworkingLinkLoginWarmupState.Payload(str4, str, str5.length() <= 15 ? str : Recorder$$ExternalSyntheticOutline2.m(str5.substring(0, 15), "•••@", (String) StringsKt.split$default(str, new char[]{'@'}, 6).get(1)), financialConnectionsSessionManifest.id, financialConnectionsSessionManifest.appVerificationEnabled);
                        }
                        str2 = prefillDetails.email;
                    }
                    str = str2;
                    if (str != null) {
                    }
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        networkingLinkLoginWarmupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.skip_sign_in", NetworkingLinkLoginWarmupViewModel.PANE));
                        ToolbarTuckTargets toolbarTuckTargets = networkingLinkLoginWarmupViewModel.disableNetworking;
                        String str6 = ((NetworkingLinkLoginWarmupState) networkingLinkLoginWarmupViewModel.stateFlow.$$delegate_0.getValue()).nextPaneOnDisableNetworking;
                        this.label = 1;
                        obj = ((FinancialConnectionsManifestRepositoryImpl) toolbarTuckTargets.endCornerCenterX$delegate).disableNetworking(((FinancialConnectionsSheetConfiguration) toolbarTuckTargets.startCornerCenterX$delegate).financialConnectionsSessionClientSecret, null, str6, this);
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
                    FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkLoginWarmupViewModel.PANE;
                    FinancialConnectionsSessionManifest.Pane pane2 = ((NetworkingLinkLoginWarmupState) networkingLinkLoginWarmupViewModel.stateFlow.$$delegate_0.getValue()).referrer;
                    NavigationManagerImpl.tryNavigateTo$default(networkingLinkLoginWarmupViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsSessionManifest2.nextPane), NetworkingLinkLoginWarmupViewModel.PANE), pane2 != null ? new PopUpToBehavior.Route(DestinationMappersKt.getDestination(pane2).getFullRoute()) : new PopUpToBehavior.Current(), 4);
                    return obj;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkLoginWarmupViewModel(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, RealHandleError realHandleError, GetOrFetchSync getOrFetchSync, ToolbarTuckTargets toolbarTuckTargets, NavigationManagerImpl navigationManagerImpl, LookupAccount lookupAccount, ElementsSessionContext.PrefillDetails prefillDetails, RealConsumerSessionRepository realConsumerSessionRepository) {
        super(networkingLinkLoginWarmupState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        realHandleError.getClass();
        getOrFetchSync.getClass();
        toolbarTuckTargets.getClass();
        navigationManagerImpl.getClass();
        lookupAccount.getClass();
        realConsumerSessionRepository.getClass();
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.handleError = realHandleError;
        this.getOrFetchSync = getOrFetchSync;
        this.disableNetworking = toolbarTuckTargets;
        this.navigationManager = navigationManagerImpl;
        this.lookupAccount = lookupAccount;
        this.prefillDetails = prefillDetails;
        this.consumerSessionProvider = realConsumerSessionRepository;
        Continuation continuation = null;
        int i = 0;
        FinancialConnectionsViewModel.onAsync$default(this, NetworkingLinkLoginWarmupViewModel$logErrors$1.INSTANCE, null, new NetworkingLinkLoginWarmupViewModel$logErrors$2(this, continuation, i), 2);
        FinancialConnectionsViewModel.onAsync$default(this, NetworkingLinkLoginWarmupViewModel$logErrors$3.INSTANCE, null, new NetworkingLinkLoginWarmupViewModel$logErrors$2(this, continuation, 1), 2);
        FinancialConnectionsViewModel.onAsync$default(this, NetworkingLinkLoginWarmupViewModel$logErrors$5.INSTANCE, null, new NetworkingLinkLoginWarmupViewModel$logErrors$2(this, continuation, 2), 2);
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(this, continuation, i), new ExitViewModel$$ExternalSyntheticLambda0(29));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((NetworkingLinkLoginWarmupState) obj).getClass();
        return null;
    }
}
