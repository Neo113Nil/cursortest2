package com.stripe.android.financialconnections.lite;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean $userCancelled;
    public int I$0;
    public /* synthetic */ Object L$0;
    public FinancialConnectionsLiteViewModel L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ FinancialConnectionsLiteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = financialConnectionsLiteViewModel;
        this.$userCancelled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$userCancelled;
        FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = this.this$0;
        switch (i) {
            case 0:
                FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1 financialConnectionsLiteViewModel$onSuccessFromDataFlow$1 = new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, z, continuation, 0);
                financialConnectionsLiteViewModel$onSuccessFromDataFlow$1.L$0 = obj;
                return financialConnectionsLiteViewModel$onSuccessFromDataFlow$1;
            default:
                FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1 financialConnectionsLiteViewModel$onSuccessFromDataFlow$12 = new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, z, continuation, 1);
                financialConnectionsLiteViewModel$onSuccessFromDataFlow$12.L$0 = obj;
                return financialConnectionsLiteViewModel$onSuccessFromDataFlow$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r1.emit(r3, r11) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r1.emit(r3, r11) == r0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        Object m3757getFinancialConnectionsSessiongIAlus;
        FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel;
        Object failure2;
        Throwable m4120exceptionOrNullimpl2;
        Object m3757getFinancialConnectionsSessiongIAlus2;
        FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2;
        int i = this.$r8$classId;
        FinancialConnectionsSheetActivityResult.Canceled canceled = FinancialConnectionsSheetActivityResult.Canceled.INSTANCE;
        int i2 = 0;
        boolean z = this.$userCancelled;
        FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel3 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion2 = Result.Companion;
                    ToolbarTuckTargets toolbarTuckTargets = financialConnectionsLiteViewModel3.repository;
                    FinancialConnectionsSheetConfiguration configuration = financialConnectionsLiteViewModel3.args.getConfiguration();
                    this.L$0 = null;
                    this.L$1 = financialConnectionsLiteViewModel3;
                    this.Z$0 = z;
                    this.I$0 = 0;
                    this.label = 1;
                    m3757getFinancialConnectionsSessiongIAlus = toolbarTuckTargets.m3757getFinancialConnectionsSessiongIAlus(configuration, this);
                    if (m3757getFinancialConnectionsSessiongIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    financialConnectionsLiteViewModel = financialConnectionsLiteViewModel3;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        failure = Unit.INSTANCE;
                        Result.Companion companion3 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            financialConnectionsLiteViewModel3.handleError("Failed to complete session for data flow", m4120exceptionOrNullimpl);
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = this.I$0;
                    z = this.Z$0;
                    financialConnectionsLiteViewModel = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m3757getFinancialConnectionsSessiongIAlus = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m3757getFinancialConnectionsSessiongIAlus);
                FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) m3757getFinancialConnectionsSessiongIAlus;
                if (financialConnectionsSession.paymentAccount != null || !z) {
                    SharedFlowImpl sharedFlowImpl = financialConnectionsLiteViewModel._viewEffects;
                    FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession, null, 5));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 3;
                    break;
                } else {
                    SharedFlowImpl sharedFlowImpl2 = financialConnectionsLiteViewModel._viewEffects;
                    FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult2 = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(canceled);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    if (sharedFlowImpl2.emit(finishWithResult2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    failure = Unit.INSTANCE;
                    Result.Companion companion32 = Result.Companion;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                Result.Companion companion4 = Result.Companion;
                failure = new Result.Failure(th);
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                } catch (Throwable th2) {
                    Result.Companion companion5 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion6 = Result.Companion;
                    ToolbarTuckTargets toolbarTuckTargets2 = financialConnectionsLiteViewModel3.repository;
                    FinancialConnectionsSheetConfiguration configuration2 = financialConnectionsLiteViewModel3.args.getConfiguration();
                    this.L$0 = null;
                    this.L$1 = financialConnectionsLiteViewModel3;
                    this.Z$0 = z;
                    this.I$0 = 0;
                    this.label = 1;
                    m3757getFinancialConnectionsSessiongIAlus2 = toolbarTuckTargets2.m3757getFinancialConnectionsSessiongIAlus(configuration2, this);
                    if (m3757getFinancialConnectionsSessiongIAlus2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    financialConnectionsLiteViewModel2 = financialConnectionsLiteViewModel3;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        failure2 = Unit.INSTANCE;
                        Result.Companion companion7 = Result.Companion;
                        m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure2);
                        if (m4120exceptionOrNullimpl2 != null) {
                            financialConnectionsLiteViewModel3.handleError("Failed to complete session for token flow", m4120exceptionOrNullimpl2);
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = this.I$0;
                    z = this.Z$0;
                    financialConnectionsLiteViewModel2 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m3757getFinancialConnectionsSessiongIAlus2 = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m3757getFinancialConnectionsSessiongIAlus2);
                FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) m3757getFinancialConnectionsSessiongIAlus2;
                if (financialConnectionsSession2.paymentAccount == null && z) {
                    SharedFlowImpl sharedFlowImpl3 = financialConnectionsLiteViewModel2._viewEffects;
                    FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult3 = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(canceled);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    if (sharedFlowImpl3.emit(finishWithResult3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    failure2 = Unit.INSTANCE;
                    Result.Companion companion72 = Result.Companion;
                    m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure2);
                    if (m4120exceptionOrNullimpl2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                SharedFlowImpl sharedFlowImpl4 = financialConnectionsLiteViewModel2._viewEffects;
                Token parsedToken = financialConnectionsSession2.getParsedToken();
                if (parsedToken == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult4 = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession2, parsedToken, 1));
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 3;
                break;
        }
    }
}
