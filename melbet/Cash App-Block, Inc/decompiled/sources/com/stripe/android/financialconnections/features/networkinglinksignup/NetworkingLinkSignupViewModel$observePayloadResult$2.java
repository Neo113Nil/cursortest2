package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkSignupViewModel$observePayloadResult$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ NetworkingLinkSignupViewModel this$0;

    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ NetworkingLinkSignupState.Payload $payload;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ NetworkingLinkSignupViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, NetworkingLinkSignupState.Payload payload, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = networkingLinkSignupViewModel;
            this.$payload = payload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            NetworkingLinkSignupState.Payload payload = this.$payload;
            NetworkingLinkSignupViewModel networkingLinkSignupViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(networkingLinkSignupViewModel, payload, continuation, 0);
                default:
                    return new AnonymousClass1(networkingLinkSignupViewModel, payload, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            StartedLazily startedLazily = SharingStarted.Companion.Lazily;
            NetworkingLinkSignupState.Payload payload = this.$payload;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$1 = new SquareAccountStore$userFlow$$inlined$map$1(payload.emailController.formFieldValue, 17);
                        NetworkingLinkSignupViewModel networkingLinkSignupViewModel = this.this$0;
                        ReadonlyStateFlow stateIn = FlowKt.stateIn(squareAccountStore$userFlow$$inlined$map$1, ViewModelKt.getViewModelScope(networkingLinkSignupViewModel), startedLazily, null);
                        HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 c00682 = new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(2, networkingLinkSignupViewModel, NetworkingLinkSignupViewModel.class, "onEmailEntered", "onEmailEntered(Ljava/lang/String;)V", 4, 6);
                        this.label = 1;
                        if (FlowKt.collectLatest(stateIn, c00682, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$12 = new SquareAccountStore$userFlow$$inlined$map$1(payload.phoneController.formFieldValue, 17);
                        NetworkingLinkSignupViewModel networkingLinkSignupViewModel2 = this.this$0;
                        ReadonlyStateFlow stateIn2 = FlowKt.stateIn(squareAccountStore$userFlow$$inlined$map$12, ViewModelKt.getViewModelScope(networkingLinkSignupViewModel2), startedLazily, null);
                        NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$2 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel2, continuation, 3);
                        this.label = 1;
                        if (FlowKt.collectLatest(stateIn2, networkingLinkSignupViewModel$observePayloadResult$2, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkingLinkSignupViewModel$observePayloadResult$2(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = networkingLinkSignupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        NetworkingLinkSignupViewModel networkingLinkSignupViewModel = this.this$0;
        switch (i) {
            case 0:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$2 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 0);
                networkingLinkSignupViewModel$observePayloadResult$2.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$2;
            case 1:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$22 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 1);
                networkingLinkSignupViewModel$observePayloadResult$22.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$22;
            case 2:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$23 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 2);
                networkingLinkSignupViewModel$observePayloadResult$23.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$23;
            case 3:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$24 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 3);
                networkingLinkSignupViewModel$observePayloadResult$24.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$24;
            case 4:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$25 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 4);
                networkingLinkSignupViewModel$observePayloadResult$25.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$25;
            case 5:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$26 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 5);
                networkingLinkSignupViewModel$observePayloadResult$26.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$26;
            default:
                NetworkingLinkSignupViewModel$observePayloadResult$2 networkingLinkSignupViewModel$observePayloadResult$27 = new NetworkingLinkSignupViewModel$observePayloadResult$2(networkingLinkSignupViewModel, continuation, 6);
                networkingLinkSignupViewModel$observePayloadResult$27.L$0 = obj;
                return networkingLinkSignupViewModel$observePayloadResult$27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((NetworkingLinkSignupState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((ConsumerSessionLookup) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((FinancialConnectionsSessionManifest.Pane) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((NetworkingLinkSignupViewModel$observePayloadResult$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.$r8$classId;
        boolean z = false;
        z = false;
        Continuation continuation = null;
        int i2 = 1;
        NetworkingLinkSignupViewModel networkingLinkSignupViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(ViewModelKt.getViewModelScope(networkingLinkSignupViewModel), null, null, new AnonymousClass1(networkingLinkSignupViewModel, payload, continuation, z ? 1 : 0), 3);
                JobKt.launch$default(ViewModelKt.getViewModelScope(networkingLinkSignupViewModel), null, null, new AnonymousClass1(networkingLinkSignupViewModel, payload, continuation, i2), 3);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean z2 = ((ConsumerSessionLookup) obj2).exists;
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingLinkSignupViewModel.eventTracker;
                if (z2) {
                    FinancialConnectionsSessionManifest.Pane pane = networkingLinkSignupViewModel.getPane();
                    pane.getClass();
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "networking.returning_consumer", true));
                    networkingLinkSignupViewModel.linkSignupHandler.navigateToVerification();
                } else {
                    FinancialConnectionsSessionManifest.Pane pane2 = networkingLinkSignupViewModel.getPane();
                    pane2.getClass();
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane2)))), "networking.new_consumer", true));
                }
                break;
            case 2:
                Throwable th = (Throwable) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((NetworkingLinkSignupState) networkingLinkSignupViewModel.stateFlow.$$delegate_0.getValue()).isInstantDebits && (th instanceof PermissionException)) {
                    z = true;
                }
                networkingLinkSignupViewModel.handleError.invoke("Error looking up account", th, networkingLinkSignupViewModel.getPane(), z);
                break;
            case 3:
                String str = (String) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = networkingLinkSignupViewModel._stateFlow;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.compareAndSet(value, NetworkingLinkSignupState.copy$default((NetworkingLinkSignupState) value, null, null, str, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)));
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(networkingLinkSignupViewModel.eventTracker, "Error fetching payload", (Throwable) obj2, networkingLinkSignupViewModel.logger, networkingLinkSignupViewModel.getPane());
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavigationManagerImpl.tryNavigateTo$default(networkingLinkSignupViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination((FinancialConnectionsSessionManifest.Pane) obj2), networkingLinkSignupViewModel.getPane()), null, 6);
                break;
            default:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                networkingLinkSignupViewModel.linkSignupHandler.handleSignupFailure((NetworkingLinkSignupState) networkingLinkSignupViewModel.stateFlow.$$delegate_0.getValue(), (Throwable) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
