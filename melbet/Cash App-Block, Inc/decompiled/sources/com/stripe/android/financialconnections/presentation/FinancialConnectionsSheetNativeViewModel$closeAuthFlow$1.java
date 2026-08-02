package com.stripe.android.financialconnections.presentation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Throwable $closeAuthFlowError;
    public final /* synthetic */ NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause $earlyTerminationCause;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Mutex L$1;
    public FinancialConnectionsSheetNativeViewModel L$2;
    public Throwable L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Throwable th, NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Continuation continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeViewModel;
        this.$closeAuthFlowError = th;
        this.$earlyTerminationCause = earlyTerminationCause;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1 financialConnectionsSheetNativeViewModel$closeAuthFlow$1 = new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(this.this$0, this.$closeAuthFlowError, this.$earlyTerminationCause, continuation);
        financialConnectionsSheetNativeViewModel$closeAuthFlow$1.L$0 = obj;
        return financialConnectionsSheetNativeViewModel$closeAuthFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x019b, code lost:
    
        if (com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel.access$handleInstantDebitsCompletion(r11, r13, r23) == r2) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bb A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x01b5, B:13:0x01bb, B:16:0x01dd, B:73:0x0091, B:75:0x009f, B:78:0x00a8, B:79:0x00aa, B:83:0x00bd, B:85:0x00c1), top: B:72:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:37:0x00f1, B:39:0x012a, B:41:0x012e, B:42:0x0132, B:46:0x013b, B:48:0x0152, B:50:0x0160, B:52:0x0164, B:56:0x016b, B:57:0x0174, B:58:0x017f, B:60:0x0185, B:63:0x019e), top: B:36:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152 A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:37:0x00f1, B:39:0x012a, B:41:0x012e, B:42:0x0132, B:46:0x013b, B:48:0x0152, B:50:0x0160, B:52:0x0164, B:56:0x016b, B:57:0x0174, B:58:0x017f, B:60:0x0185, B:63:0x019e), top: B:36:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
        MutexImpl mutexImpl;
        Throwable th;
        NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause;
        int i;
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
        Object value;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2;
        ?? r3;
        Object invoke;
        int i2;
        int i3;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel3;
        int i4;
        FinancialConnectionsSession.StatusDetails statusDetails;
        FinancialConnectionsSession.StatusDetails.Cancelled cancelled;
        Object failure;
        Mutex mutex;
        Throwable m4120exceptionOrNullimpl;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        try {
            if (i5 == 0) {
                SafeTrace.throwOnFailure(obj);
                financialConnectionsSheetNativeViewModel = this.this$0;
                mutexImpl = financialConnectionsSheetNativeViewModel.mutex;
                this.L$0 = coroutineScope;
                this.L$1 = mutexImpl;
                this.L$2 = financialConnectionsSheetNativeViewModel;
                th = this.$closeAuthFlowError;
                this.L$3 = th;
                earlyTerminationCause = this.$earlyTerminationCause;
                this.L$4 = earlyTerminationCause;
                this.I$0 = 0;
                this.label = 1;
                if (mutexImpl.lock(this) != coroutineSingletons) {
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.L$3;
                    financialConnectionsSheetNativeViewModel2 = this.L$2;
                    r3 = this.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        r3 = r3;
                        failure = Unit.INSTANCE;
                        Result.Companion companion = Result.Companion;
                        mutex = r3;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                            mutex = r3;
                            Mutex mutex2 = mutex;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            mutexImpl = r3;
                            mutexImpl.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex22 = mutex;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        financialConnectionsSheetNativeViewModel2.logger.error("Error completing session before closing", m4120exceptionOrNullimpl);
                        financialConnectionsSheetNativeViewModel2.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel2.currentPane.getValue(), m4120exceptionOrNullimpl, "Error completing session before closing", null, "failed"));
                        if (th == null) {
                            th = m4120exceptionOrNullimpl;
                        }
                        financialConnectionsSheetNativeViewModel2.finishWithResult$2(new FinancialConnectionsSheetActivityResult.Failed(th));
                    }
                    mutex22.unlock(null);
                    return Unit.INSTANCE;
                }
                int i6 = this.I$2;
                int i7 = this.I$1;
                int i8 = this.I$0;
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) this.L$4;
                Throwable th4 = this.L$3;
                financialConnectionsSheetNativeViewModel3 = this.L$2;
                ?? r12 = this.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    i4 = i6;
                    th = th4;
                    i3 = i8;
                    i2 = i7;
                    financialConnectionsSheetNativeState = financialConnectionsSheetNativeState2;
                    mutexImpl = r12;
                    invoke = obj;
                    try {
                        CompleteFinancialConnectionsSession.Result result = (CompleteFinancialConnectionsSession.Result) invoke;
                        FinancialConnectionsSession financialConnectionsSession = result.session;
                        financialConnectionsSheetNativeViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel3.currentPane.getValue(), null, null, new Integer(financialConnectionsSession.getAccounts().data.size()), result.status));
                        statusDetails = financialConnectionsSession.statusDetails;
                        if (((statusDetails != null || (cancelled = statusDetails.cancelled) == null) ? null : cancelled.reason) != FinancialConnectionsSession.StatusDetails.Cancelled.Reason.CUSTOM_MANUAL_ENTRY) {
                            if (financialConnectionsSession.getAccounts().data.isEmpty() && financialConnectionsSession.paymentAccount == null && financialConnectionsSession.bankAccountToken == null) {
                                if (th != null) {
                                    financialConnectionsSheetNativeViewModel3.finishWithResult$2(new FinancialConnectionsSheetActivityResult.Failed(th));
                                } else {
                                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.CANCEL, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                                    financialConnectionsSheetNativeViewModel3.finishWithResult$2(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                                }
                            }
                            if (financialConnectionsSheetNativeState.flowType == FinancialConnectionsSheetFlowType.ForInstantDebits) {
                                this.L$0 = null;
                                this.L$1 = mutexImpl;
                                this.L$2 = financialConnectionsSheetNativeViewModel3;
                                this.L$3 = th;
                                this.L$4 = null;
                                this.I$0 = i3;
                                this.I$1 = i2;
                                this.I$2 = i4;
                                this.label = 3;
                            } else {
                                FinancialConnectionsSheetNativeViewModel.access$handleFinancialConnectionsCompletion(financialConnectionsSheetNativeViewModel3, financialConnectionsSession);
                            }
                        } else {
                            FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.MANUAL_ENTRY_INITIATED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                            financialConnectionsSheetNativeViewModel3.finishWithResult$2(new FinancialConnectionsSheetActivityResult.Failed(new CustomManualEntryRequiredError()));
                        }
                        r3 = mutexImpl;
                        financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel3;
                        failure = Unit.INSTANCE;
                        Result.Companion companion3 = Result.Companion;
                        mutex = r3;
                    } catch (Throwable th5) {
                        th = th5;
                        r3 = mutexImpl;
                        financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel3;
                        Result.Companion companion22 = Result.Companion;
                        failure = new Result.Failure(th);
                        mutex = r3;
                        Mutex mutex222 = mutex;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        mutex222.unlock(null);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = th4;
                    financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel3;
                    r3 = r12;
                    Result.Companion companion222 = Result.Companion;
                    failure = new Result.Failure(th);
                    mutex = r3;
                    Mutex mutex2222 = mutex;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    mutex2222.unlock(null);
                    return Unit.INSTANCE;
                }
                Mutex mutex22222 = mutex;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                mutex22222.unlock(null);
                return Unit.INSTANCE;
            }
            int i9 = this.I$0;
            NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause2 = (NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause) this.L$4;
            Throwable th7 = this.L$3;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel4 = this.L$2;
            ?? r11 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            i = i9;
            th = th7;
            mutexImpl = r11;
            earlyTerminationCause = earlyTerminationCause2;
            financialConnectionsSheetNativeViewModel = financialConnectionsSheetNativeViewModel4;
            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) financialConnectionsSheetNativeViewModel.stateFlow.$$delegate_0.getValue();
            if (financialConnectionsSheetNativeState.completed) {
                Unit unit = Unit.INSTANCE;
                mutexImpl.unlock(null);
                return unit;
            }
            StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel._stateFlow;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default((FinancialConnectionsSheetNativeState) value, null, null, null, 16255)));
            if (th instanceof FinancialConnectionsAttestationError) {
                financialConnectionsSheetNativeViewModel.finishWithResult$2(new FinancialConnectionsSheetActivityResult.Failed(th));
                Unit unit2 = Unit.INSTANCE;
                mutexImpl.unlock(null);
                return unit2;
            }
            try {
                Result.Companion companion4 = Result.Companion;
                CompleteFinancialConnectionsSession completeFinancialConnectionsSession = financialConnectionsSheetNativeViewModel.completeFinancialConnectionsSession;
                this.L$0 = null;
                this.L$1 = mutexImpl;
                this.L$2 = financialConnectionsSheetNativeViewModel;
                this.L$3 = th;
                this.L$4 = financialConnectionsSheetNativeState;
                this.I$0 = i;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 2;
                invoke = completeFinancialConnectionsSession.invoke(earlyTerminationCause, th, this);
            } catch (Throwable th8) {
                th = th8;
                financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                r3 = mutexImpl;
                Result.Companion companion2222 = Result.Companion;
                failure = new Result.Failure(th);
                mutex = r3;
                Mutex mutex222222 = mutex;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                mutex222222.unlock(null);
                return Unit.INSTANCE;
            }
            if (invoke != coroutineSingletons) {
                i2 = 0;
                i3 = i;
                financialConnectionsSheetNativeViewModel3 = financialConnectionsSheetNativeViewModel;
                i4 = 0;
                CompleteFinancialConnectionsSession.Result result2 = (CompleteFinancialConnectionsSession.Result) invoke;
                FinancialConnectionsSession financialConnectionsSession2 = result2.session;
                financialConnectionsSheetNativeViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel3.currentPane.getValue(), null, null, new Integer(financialConnectionsSession2.getAccounts().data.size()), result2.status));
                statusDetails = financialConnectionsSession2.statusDetails;
                if (((statusDetails != null || (cancelled = statusDetails.cancelled) == null) ? null : cancelled.reason) != FinancialConnectionsSession.StatusDetails.Cancelled.Reason.CUSTOM_MANUAL_ENTRY) {
                }
                r3 = mutexImpl;
                financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel3;
                failure = Unit.INSTANCE;
                Result.Companion companion32 = Result.Companion;
                mutex = r3;
                Mutex mutex2222222 = mutex;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                mutex2222222.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutineSingletons;
        } catch (Throwable th9) {
            th = th9;
            mutexImpl.unlock(null);
            throw th;
        }
    }
}
