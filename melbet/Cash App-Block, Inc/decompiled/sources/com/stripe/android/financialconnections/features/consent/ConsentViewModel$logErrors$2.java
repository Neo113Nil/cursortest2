package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ConsentViewModel$logErrors$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConsentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentViewModel$logErrors$2(ConsentViewModel consentViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = consentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ConsentViewModel consentViewModel = this.this$0;
        switch (i) {
            case 0:
                return new ConsentViewModel$logErrors$2(consentViewModel, continuation, 0);
            case 1:
                return new ConsentViewModel$logErrors$2(consentViewModel, continuation, 1);
            case 2:
                return new ConsentViewModel$logErrors$2(consentViewModel, continuation, 2);
            case 3:
                return new ConsentViewModel$logErrors$2(consentViewModel, continuation, 3);
            default:
                return new ConsentViewModel$logErrors$2(consentViewModel, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ConsentViewModel$logErrors$2) create((HandleClickableUrl.DeeplinkPayload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConsentPane consentPane;
        DataAccessNotice dataAccessNotice;
        ConsentPane consentPane2;
        LegalDetailsNotice legalDetailsNotice;
        int i = this.$r8$classId;
        ConsentViewModel consentViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                consentViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(FinancialConnectionsSessionManifest.Pane.CONSENT, 25));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConsentState.Payload payload = (ConsentState.Payload) ((ConsentState) consentViewModel.stateFlow.$$delegate_0.getValue()).consent.invoke();
                if (payload != null && (consentPane = payload.consent) != null && (dataAccessNotice = consentPane.dataAccessNotice) != null) {
                    consentViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConsentState.Payload payload2 = (ConsentState.Payload) ((ConsentState) consentViewModel.stateFlow.$$delegate_0.getValue()).consent.invoke();
                if (payload2 != null && (consentPane2 = payload2.consent) != null && (legalDetailsNotice = consentPane2.legalDetailsNotice) != null) {
                    consentViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(legalDetailsNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavigationManagerImpl.tryNavigateTo$default(consentViewModel.navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, FinancialConnectionsSessionManifest.Pane.CONSENT), null, 6);
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavigationManagerImpl.tryNavigateTo$default(consentViewModel.navigationManager, Destination.invoke$default(Destination.LinkAccountPicker.INSTANCE, FinancialConnectionsSessionManifest.Pane.CONSENT), null, 6);
                break;
        }
        return Unit.INSTANCE;
    }
}
