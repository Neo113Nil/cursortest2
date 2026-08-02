package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.PartnerAuthError;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PartnerAuthViewModel$handleErrors$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartnerAuthViewModel$handleErrors$3(PartnerAuthViewModel partnerAuthViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PartnerAuthViewModel partnerAuthViewModel = this.this$0;
        switch (i) {
            case 0:
                PartnerAuthViewModel$handleErrors$3 partnerAuthViewModel$handleErrors$3 = new PartnerAuthViewModel$handleErrors$3(partnerAuthViewModel, continuation, 0);
                partnerAuthViewModel$handleErrors$3.L$0 = obj;
                return partnerAuthViewModel$handleErrors$3;
            case 1:
                PartnerAuthViewModel$handleErrors$3 partnerAuthViewModel$handleErrors$32 = new PartnerAuthViewModel$handleErrors$3(partnerAuthViewModel, continuation, 1);
                partnerAuthViewModel$handleErrors$32.L$0 = obj;
                return partnerAuthViewModel$handleErrors$32;
            default:
                PartnerAuthViewModel$handleErrors$3 partnerAuthViewModel$handleErrors$33 = new PartnerAuthViewModel$handleErrors$3(partnerAuthViewModel, continuation, 2);
                partnerAuthViewModel$handleErrors$33.L$0 = obj;
                return partnerAuthViewModel$handleErrors$33;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((PartnerAuthViewModel$handleErrors$3) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((PartnerAuthViewModel$handleErrors$3) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((PartnerAuthViewModel$handleErrors$3) create((SharedPartnerAuthState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PartnerAuthViewModel partnerAuthViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                partnerAuthViewModel.handleError.invoke("Error fetching payload / posting AuthSession", (Throwable) obj2, partnerAuthViewModel.initialState.pane, true);
                break;
            case 1:
                Throwable th = (Throwable) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                partnerAuthViewModel.handleError.invoke("Error with authentication status", th instanceof FinancialConnectionsError ? (FinancialConnectionsError) th : new PartnerAuthError("PartnerAuthError", th.getMessage()), partnerAuthViewModel.initialState.pane, true);
                break;
            default:
                SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!payload.authSession.isOAuth()) {
                    partnerAuthViewModel.launchAuthInBrowser(payload.authSession);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
