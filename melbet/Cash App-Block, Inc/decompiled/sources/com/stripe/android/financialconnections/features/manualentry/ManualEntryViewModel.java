package com.stripe.android.financialconnections.features.manualentry;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzai;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ManualEntryViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY;
    public final ParcelableSnapshotMutableState _account$delegate;
    public final ParcelableSnapshotMutableState _accountConfirm$delegate;
    public final ParcelableSnapshotMutableState _routing$delegate;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final ReadonlyStateFlow form;
    public final GetOrFetchSync getOrFetchSync;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final NavigationManagerImpl navigationManager;
    public final PollAttachPaymentAccount pollAttachPaymentAccount;
    public final SuccessContentRepository successContentRepository;
    public final UpdateCachedAccounts updateCachedAccounts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel(ManualEntryState manualEntryState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, PollAttachPaymentAccount pollAttachPaymentAccount, SuccessContentRepository successContentRepository, UpdateCachedAccounts updateCachedAccounts, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(manualEntryState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        pollAttachPaymentAccount.getClass();
        successContentRepository.getClass();
        updateCachedAccounts.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.successContentRepository = successContentRepository;
        this.updateCachedAccounts = updateCachedAccounts;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        Continuation continuation = null;
        this._routing$delegate = Updater.mutableStateOf$default(null);
        this._account$delegate = Updater.mutableStateOf$default(null);
        this._accountConfirm$delegate = Updater.mutableStateOf$default(null);
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.form = FlowKt.stateIn(FlowKt.combine(Updater.snapshotFlow(new Function0(this) { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda1
            public final /* synthetic */ ManualEntryViewModel f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                ManualEntryViewModel manualEntryViewModel = this.f$0;
                switch (i4) {
                    case 0:
                        return (String) manualEntryViewModel._routing$delegate.getValue();
                    case 1:
                        return (String) manualEntryViewModel._account$delegate.getValue();
                    default:
                        return (String) manualEntryViewModel._accountConfirm$delegate.getValue();
                }
            }
        }), Updater.snapshotFlow(new Function0(this) { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda1
            public final /* synthetic */ ManualEntryViewModel f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                ManualEntryViewModel manualEntryViewModel = this.f$0;
                switch (i4) {
                    case 0:
                        return (String) manualEntryViewModel._routing$delegate.getValue();
                    case 1:
                        return (String) manualEntryViewModel._account$delegate.getValue();
                    default:
                        return (String) manualEntryViewModel._accountConfirm$delegate.getValue();
                }
            }
        }), Updater.snapshotFlow(new Function0(this) { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda1
            public final /* synthetic */ ManualEntryViewModel f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                ManualEntryViewModel manualEntryViewModel = this.f$0;
                switch (i4) {
                    case 0:
                        return (String) manualEntryViewModel._routing$delegate.getValue();
                    case 1:
                        return (String) manualEntryViewModel._account$delegate.getValue();
                    default:
                        return (String) manualEntryViewModel._accountConfirm$delegate.getValue();
                }
            }
        }), ManualEntryViewModel$form$6.INSTANCE), ViewModelKt.getViewModelScope(this), new StartedWhileSubscribed(5000L, Long.MAX_VALUE), new ManualEntryFormState(null, null, null));
        FinancialConnectionsViewModel.onAsync$default(this, ManualEntryViewModel$observeAsyncs$1.INSTANCE, new ShimmerModifierKt$shimmer$1$1(this, continuation, 3), null, 4);
        FinancialConnectionsViewModel.onAsync$default(this, ManualEntryViewModel$observeAsyncs$3.INSTANCE, null, new InquiryViewModel.AnonymousClass1(this, continuation, 7), 2);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, continuation, 5), new ExitViewModel$$ExternalSyntheticLambda0(24));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r4 = kotlin.Result.Companion;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$clearCachedAccounts(ManualEntryViewModel manualEntryViewModel, ContinuationImpl continuationImpl) {
        ManualEntryViewModel$clearCachedAccounts$1 manualEntryViewModel$clearCachedAccounts$1;
        int i;
        if (continuationImpl instanceof ManualEntryViewModel$clearCachedAccounts$1) {
            manualEntryViewModel$clearCachedAccounts$1 = (ManualEntryViewModel$clearCachedAccounts$1) continuationImpl;
            int i2 = manualEntryViewModel$clearCachedAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                manualEntryViewModel$clearCachedAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = manualEntryViewModel$clearCachedAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = manualEntryViewModel$clearCachedAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    UpdateCachedAccounts updateCachedAccounts = manualEntryViewModel.updateCachedAccounts;
                    EmptyList emptyList = EmptyList.INSTANCE;
                    manualEntryViewModel$clearCachedAccounts$1.label = 1;
                    FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = updateCachedAccounts.repository;
                    financialConnectionsAccountsRepositoryImpl.getClass();
                    financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("updateCachedAccounts", emptyList);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Result.Companion companion2 = Result.Companion;
                return Unit.INSTANCE;
            }
        }
        manualEntryViewModel$clearCachedAccounts$1 = new ManualEntryViewModel$clearCachedAccounts$1(manualEntryViewModel, continuationImpl);
        Object obj2 = manualEntryViewModel$clearCachedAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = manualEntryViewModel$clearCachedAccounts$1.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ManualEntryState manualEntryState = (ManualEntryState) obj;
        manualEntryState.getClass();
        return new TopAppBarStateUpdate(PANE, true, zzai.getError(manualEntryState.payload), false, null, 56);
    }
}
