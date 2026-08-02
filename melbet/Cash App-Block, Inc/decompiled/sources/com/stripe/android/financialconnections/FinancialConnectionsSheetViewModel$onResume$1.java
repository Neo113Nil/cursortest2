package com.stripe.android.financialconnections;

import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewModel$onResume$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public MutexImpl L$0;
    public FinancialConnectionsSheetViewModel L$1;
    public int label;
    public final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsSheetViewModel$onResume$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
        switch (i) {
            case 0:
                return new FinancialConnectionsSheetViewModel$onResume$1(financialConnectionsSheetViewModel, continuation, 0);
            default:
                return new FinancialConnectionsSheetViewModel$onResume$1(financialConnectionsSheetViewModel, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FinancialConnectionsSheetViewModel$onResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        Object value;
        MutexImpl mutexImpl2;
        Object value2;
        int i = this.$r8$classId;
        FinancialConnectionsSheetActivityResult.Canceled canceled = FinancialConnectionsSheetActivityResult.Canceled.INSTANCE;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutexImpl mutexImpl3 = financialConnectionsSheetViewModel.mutex;
                    this.L$0 = mutexImpl3;
                    this.L$1 = financialConnectionsSheetViewModel;
                    this.label = 1;
                    if (mutexImpl3.lock(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutexImpl = mutexImpl3;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsSheetViewModel = this.L$1;
                    mutexImpl = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) financialConnectionsSheetViewModel.stateFlow.$$delegate_0.getValue();
                    if (!financialConnectionsSheetState.activityRecreated) {
                        int ordinal = financialConnectionsSheetState.webAuthFlowStatus.ordinal();
                        if (ordinal == 0) {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, canceled, 6);
                        } else if (ordinal == 1) {
                            InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetViewModel.Factory;
                            StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel._stateFlow;
                            do {
                                value = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default((FinancialConnectionsSheetState) value, false, null, FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY, null, 23)));
                        } else if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutexImpl.unlock(null);
                    throw th;
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutexImpl mutexImpl4 = financialConnectionsSheetViewModel.mutex;
                    this.L$0 = mutexImpl4;
                    this.L$1 = financialConnectionsSheetViewModel;
                    this.label = 1;
                    if (mutexImpl4.lock(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    mutexImpl2 = mutexImpl4;
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsSheetViewModel = this.L$1;
                    mutexImpl2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    FinancialConnectionsSheetState financialConnectionsSheetState2 = (FinancialConnectionsSheetState) financialConnectionsSheetViewModel.stateFlow.$$delegate_0.getValue();
                    if (financialConnectionsSheetState2.activityRecreated) {
                        int ordinal2 = financialConnectionsSheetState2.webAuthFlowStatus.ordinal();
                        if (ordinal2 == 0) {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, canceled, 6);
                        } else if (ordinal2 == 1) {
                            InitializerViewModelFactory initializerViewModelFactory2 = FinancialConnectionsSheetViewModel.Factory;
                            StateFlowImpl stateFlowImpl2 = financialConnectionsSheetViewModel._stateFlow;
                            do {
                                value2 = stateFlowImpl2.getValue();
                            } while (!stateFlowImpl2.compareAndSet(value2, FinancialConnectionsSheetState.copy$default((FinancialConnectionsSheetState) value2, false, null, FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY, null, 23)));
                        } else if (ordinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    mutexImpl2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    mutexImpl2.unlock(null);
                    throw th2;
                }
        }
    }
}
