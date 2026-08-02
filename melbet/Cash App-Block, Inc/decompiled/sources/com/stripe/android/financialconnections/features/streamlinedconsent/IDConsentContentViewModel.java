package com.stripe.android.financialconnections.features.streamlinedconsent;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzai;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class IDConsentContentViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT;
    public final AcceptConsent acceptConsent;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final HandleClickableUrl handleClickableUrl;
    public final NavigationManagerImpl navigationManager;
    public final RealPresentSheet presentSheet;

    /* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ IDConsentContentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(IDConsentContentViewModel iDConsentContentViewModel, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = iDConsentContentViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            IDConsentContentViewModel iDConsentContentViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(iDConsentContentViewModel, continuation, 0);
                default:
                    return new AnonymousClass1(iDConsentContentViewModel, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            IDConsentContentViewModel iDConsentContentViewModel = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync = iDConsentContentViewModel.getOrFetchSync;
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
                    TextUpdate textUpdate = ((SynchronizeSessionResponse) obj).text;
                    textUpdate.getClass();
                    IDConsentContentPane iDConsentContentPane = textUpdate.idConsentContentPane;
                    iDConsentContentPane.getClass();
                    return new IDConsentContentState.Payload(iDConsentContentPane);
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        iDConsentContentViewModel.eventTracker.track(FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE);
                        AcceptConsent acceptConsent = iDConsentContentViewModel.acceptConsent;
                        this.label = 1;
                        obj = acceptConsent.repository.markConsentAcquired(acceptConsent.configuration.financialConnectionsSessionClientSecret, this);
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
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.CONSENT_ACQUIRED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                    NavigationManagerImpl.tryNavigateTo$default(iDConsentContentViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsSessionManifest.nextPane), IDConsentContentViewModel.PANE), null, 6);
                    return financialConnectionsSessionManifest;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDConsentContentViewModel(IDConsentContentState iDConsentContentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, HandleClickableUrl handleClickableUrl, RealPresentSheet realPresentSheet) {
        super(iDConsentContentState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        acceptConsent.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        handleClickableUrl.getClass();
        realPresentSheet.getClass();
        this.acceptConsent = acceptConsent;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.handleClickableUrl = handleClickableUrl;
        this.presentSheet = realPresentSheet;
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(this, null, 0), new PhoneNumberController$$ExternalSyntheticLambda5(17));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        IDConsentContentState iDConsentContentState = (IDConsentContentState) obj;
        iDConsentContentState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(iDConsentContentState.payload), false, Boolean.FALSE, 40);
    }
}
