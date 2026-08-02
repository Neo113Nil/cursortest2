package com.stripe.android.financialconnections;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.logging.Logging;
import com.squareup.kotterknife.Lazy;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import net.idrnd.face.iad.capture.internal.o0;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewModel$onUserCancel$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetState $state;
    public int label;
    public final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsSheetViewModel$onUserCancel$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetState financialConnectionsSheetState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = financialConnectionsSheetViewModel;
        this.$state = financialConnectionsSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
        switch (i) {
            case 0:
                return new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState, continuation, 0);
            case 1:
                return new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState, continuation, 1);
            default:
                return new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FinancialConnectionsSheetViewModel$onUserCancel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        FinancialConnectionsSession.StatusDetails.Cancelled cancelled;
        Object failure2;
        Object failure3;
        int i = this.$r8$classId;
        FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
        FinancialConnectionsSession.StatusDetails.Cancelled.Reason reason = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        Lazy lazy = financialConnectionsSheetViewModel.fetchFinancialConnectionsSession;
                        String str = financialConnectionsSheetState.initialArgs.getConfiguration().financialConnectionsSessionClientSecret;
                        this.label = 1;
                        obj = lazy.invoke(str, this);
                        if (obj == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    failure = (FinancialConnectionsSession) obj;
                    Result.Companion companion2 = Result.Companion;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) failure;
                    financialConnectionsSession.getClass();
                    FinancialConnectionsSession.StatusDetails statusDetails = financialConnectionsSession.statusDetails;
                    if (statusDetails != null && (cancelled = statusDetails.cancelled) != null) {
                        reason = cancelled.reason;
                    }
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, reason == FinancialConnectionsSession.StatusDetails.Cancelled.Reason.CUSTOM_MANUAL_ENTRY ? new FinancialConnectionsSheetActivityResult.Failed(new CustomManualEntryRequiredError()) : FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, 6);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl), 6);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion4 = Result.Companion;
                        Lazy lazy2 = financialConnectionsSheetViewModel.fetchFinancialConnectionsSession;
                        String str2 = financialConnectionsSheetState.initialArgs.getConfiguration().financialConnectionsSessionClientSecret;
                        this.label = 1;
                        obj = lazy2.invoke(str2, this);
                        if (obj == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    failure2 = (FinancialConnectionsSession) obj;
                    Result.Companion companion5 = Result.Companion;
                } catch (Throwable th2) {
                    Result.Companion companion6 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                if (!(failure2 instanceof Result.Failure)) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Completed(null, Logging.update((FinancialConnectionsSession) failure2, financialConnectionsSheetState.manifest), null, 5), 6);
                }
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl2 != null) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl2), 6);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion7 = Result.Companion;
                        o0 o0Var = financialConnectionsSheetViewModel.fetchFinancialConnectionsSessionForToken;
                        String str3 = financialConnectionsSheetState.initialArgs.getConfiguration().financialConnectionsSessionClientSecret;
                        this.label = 1;
                        obj = o0Var.invoke(str3, this);
                        if (obj == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    failure3 = (Pair) obj;
                    Result.Companion companion8 = Result.Companion;
                } catch (Throwable th3) {
                    Result.Companion companion9 = Result.Companion;
                    failure3 = new Result.Failure(th3);
                }
                if (!(failure3 instanceof Result.Failure)) {
                    Pair pair = (Pair) failure3;
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Completed(null, Logging.update((FinancialConnectionsSession) pair.first, financialConnectionsSheetState.manifest), (Token) pair.second, 1), 6);
                }
                Throwable m4120exceptionOrNullimpl3 = Result.m4120exceptionOrNullimpl(failure3);
                if (m4120exceptionOrNullimpl3 != null) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl3), 6);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
