package expo.modules.updates.procedures;

import expo.modules.core.logging.LoggerTimer;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.updates.logging.IUpdatesLogger;
import expo.modules.updates.procedures.StateMachineProcedure;
import expo.modules.updates.statemachine.UpdatesStateEvent;
import expo.modules.updates.statemachine.UpdatesStateValue;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: StateMachineSerialExecutorQueue.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lexpo/modules/updates/procedures/StateMachineSerialExecutorQueue;", "", "updatesLogger", "Lexpo/modules/updates/logging/IUpdatesLogger;", "stateMachineProcedureContext", "Lexpo/modules/updates/procedures/StateMachineProcedure$StateMachineProcedureContext;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lexpo/modules/updates/logging/IUpdatesLogger;Lexpo/modules/updates/procedures/StateMachineProcedure$StateMachineProcedureContext;Lkotlinx/coroutines/CoroutineScope;)V", "procedureChannel", "Lkotlinx/coroutines/channels/Channel;", "Lexpo/modules/updates/procedures/StateMachineSerialExecutorQueue$ProcedureHolder;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "executorJob", "Lkotlinx/coroutines/Job;", "executeProcedure", "", "holder", "(Lexpo/modules/updates/procedures/StateMachineSerialExecutorQueue$ProcedureHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queueExecution", "stateMachineProcedure", "Lexpo/modules/updates/procedures/StateMachineProcedure;", "ProcedureHolder", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StateMachineSerialExecutorQueue {
    private final Job executorJob;
    private final Mutex mutex;
    private final Channel<ProcedureHolder> procedureChannel;
    private final CoroutineScope scope;
    private final StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext;
    private final IUpdatesLogger updatesLogger;

    public StateMachineSerialExecutorQueue(IUpdatesLogger updatesLogger, StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext, CoroutineScope scope) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(updatesLogger, "updatesLogger");
        Intrinsics.checkNotNullParameter(stateMachineProcedureContext, "stateMachineProcedureContext");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.updatesLogger = updatesLogger;
        this.stateMachineProcedureContext = stateMachineProcedureContext;
        this.scope = scope;
        this.procedureChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass1(null), 3, null);
        this.executorJob = launch$default;
    }

    public /* synthetic */ StateMachineSerialExecutorQueue(IUpdatesLogger iUpdatesLogger, StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iUpdatesLogger, stateMachineProcedureContext, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StateMachineSerialExecutorQueue.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lexpo/modules/updates/procedures/StateMachineSerialExecutorQueue$ProcedureHolder;", "", "procedure", "Lexpo/modules/updates/procedures/StateMachineProcedure;", "onComplete", "Lkotlinx/coroutines/CompletableDeferred;", "", "<init>", "(Lexpo/modules/updates/procedures/StateMachineProcedure;Lkotlinx/coroutines/CompletableDeferred;)V", "getProcedure", "()Lexpo/modules/updates/procedures/StateMachineProcedure;", "getOnComplete", "()Lkotlinx/coroutines/CompletableDeferred;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ProcedureHolder {
        private final CompletableDeferred<Unit> onComplete;
        private final StateMachineProcedure procedure;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProcedureHolder copy$default(ProcedureHolder procedureHolder, StateMachineProcedure stateMachineProcedure, CompletableDeferred completableDeferred, int i, Object obj) {
            if ((i & 1) != 0) {
                stateMachineProcedure = procedureHolder.procedure;
            }
            if ((i & 2) != 0) {
                completableDeferred = procedureHolder.onComplete;
            }
            return procedureHolder.copy(stateMachineProcedure, completableDeferred);
        }

        /* renamed from: component1, reason: from getter */
        public final StateMachineProcedure getProcedure() {
            return this.procedure;
        }

        public final CompletableDeferred<Unit> component2() {
            return this.onComplete;
        }

        public final ProcedureHolder copy(StateMachineProcedure procedure, CompletableDeferred<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(procedure, "procedure");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            return new ProcedureHolder(procedure, onComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProcedureHolder)) {
                return false;
            }
            ProcedureHolder procedureHolder = (ProcedureHolder) other;
            return Intrinsics.areEqual(this.procedure, procedureHolder.procedure) && Intrinsics.areEqual(this.onComplete, procedureHolder.onComplete);
        }

        public int hashCode() {
            return (this.procedure.hashCode() * 31) + this.onComplete.hashCode();
        }

        public String toString() {
            return "ProcedureHolder(procedure=" + this.procedure + ", onComplete=" + this.onComplete + ")";
        }

        public ProcedureHolder(StateMachineProcedure procedure, CompletableDeferred<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(procedure, "procedure");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            this.procedure = procedure;
            this.onComplete = onComplete;
        }

        public final StateMachineProcedure getProcedure() {
            return this.procedure;
        }

        public final CompletableDeferred<Unit> getOnComplete() {
            return this.onComplete;
        }
    }

    /* compiled from: StateMachineSerialExecutorQueue.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.procedures.StateMachineSerialExecutorQueue$1", f = "StateMachineSerialExecutorQueue.kt", i = {}, l = {35, 36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.procedures.StateMachineSerialExecutorQueue$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StateMachineSerialExecutorQueue.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
        
            if (r7.this$0.executeProcedure(r8, r7) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:6:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ChannelIterator it;
            ChannelIterator channelIterator;
            Object hasNext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it = StateMachineSerialExecutorQueue.this.procedureChannel.iterator();
                this.L$0 = it;
                this.label = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                it = channelIterator;
                this.L$0 = it;
                this.label = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    channelIterator = it;
                    obj = hasNext;
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    ProcedureHolder procedureHolder = (ProcedureHolder) channelIterator.next();
                    this.L$0 = channelIterator;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            channelIterator = (ChannelIterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r7.await(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r2.run(r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeProcedure(final ProcedureHolder procedureHolder, Continuation<? super Unit> continuation) {
        StateMachineSerialExecutorQueue$executeProcedure$1 stateMachineSerialExecutorQueue$executeProcedure$1;
        int i;
        if (continuation instanceof StateMachineSerialExecutorQueue$executeProcedure$1) {
            stateMachineSerialExecutorQueue$executeProcedure$1 = (StateMachineSerialExecutorQueue$executeProcedure$1) continuation;
            if ((stateMachineSerialExecutorQueue$executeProcedure$1.label & Integer.MIN_VALUE) != 0) {
                stateMachineSerialExecutorQueue$executeProcedure$1.label -= Integer.MIN_VALUE;
                Object obj = stateMachineSerialExecutorQueue$executeProcedure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stateMachineSerialExecutorQueue$executeProcedure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final LoggerTimer startTimer = this.updatesLogger.startTimer(procedureHolder.getProcedure().getLoggerTimerLabel());
                    StateMachineProcedure procedure = procedureHolder.getProcedure();
                    StateMachineProcedure.ProcedureContext procedureContext = new StateMachineProcedure.ProcedureContext() { // from class: expo.modules.updates.procedures.StateMachineSerialExecutorQueue$executeProcedure$2
                        private boolean isCompleted;

                        @Override // expo.modules.updates.procedures.StateMachineProcedure.ProcedureContext
                        public void onComplete() {
                            this.isCompleted = true;
                            LoggerTimer.this.mo691stopUwyO8pc();
                            procedureHolder.getOnComplete().complete(Unit.INSTANCE);
                        }

                        @Override // expo.modules.updates.procedures.StateMachineProcedure.StateMachineProcedureContext
                        public void processStateEvent(UpdatesStateEvent event) {
                            StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext;
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (!this.isCompleted) {
                                stateMachineProcedureContext = this.stateMachineProcedureContext;
                                stateMachineProcedureContext.processStateEvent(event);
                                return;
                            }
                            throw new Exception("Cannot set state after procedure completion");
                        }

                        @Override // expo.modules.updates.procedures.StateMachineProcedure.StateMachineProcedureContext
                        @Deprecated(message = "Avoid needing to access current state to know how to transition to next state")
                        public UpdatesStateValue getCurrentState() {
                            StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext;
                            if (!this.isCompleted) {
                                stateMachineProcedureContext = this.stateMachineProcedureContext;
                                return stateMachineProcedureContext.getCurrentState();
                            }
                            throw new Exception("Cannot get state after procedure completion");
                        }

                        @Override // expo.modules.updates.procedures.StateMachineProcedure.StateMachineProcedureContext
                        public void resetStateAfterRestart() {
                            StateMachineProcedure.StateMachineProcedureContext stateMachineProcedureContext;
                            if (!this.isCompleted) {
                                stateMachineProcedureContext = this.stateMachineProcedureContext;
                                stateMachineProcedureContext.resetStateAfterRestart();
                                return;
                            }
                            throw new Exception("Cannot reset state after procedure completion");
                        }
                    };
                    stateMachineSerialExecutorQueue$executeProcedure$1.L$0 = procedureHolder;
                    stateMachineSerialExecutorQueue$executeProcedure$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    procedureHolder = (ProcedureHolder) stateMachineSerialExecutorQueue$executeProcedure$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                CompletableDeferred<Unit> onComplete = procedureHolder.getOnComplete();
                stateMachineSerialExecutorQueue$executeProcedure$1.L$0 = null;
                stateMachineSerialExecutorQueue$executeProcedure$1.label = 2;
            }
        }
        stateMachineSerialExecutorQueue$executeProcedure$1 = new StateMachineSerialExecutorQueue$executeProcedure$1(this, continuation);
        Object obj2 = stateMachineSerialExecutorQueue$executeProcedure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stateMachineSerialExecutorQueue$executeProcedure$1.label;
        if (i != 0) {
        }
        CompletableDeferred<Unit> onComplete2 = procedureHolder.getOnComplete();
        stateMachineSerialExecutorQueue$executeProcedure$1.L$0 = null;
        stateMachineSerialExecutorQueue$executeProcedure$1.label = 2;
    }

    public final void queueExecution(StateMachineProcedure stateMachineProcedure) {
        Intrinsics.checkNotNullParameter(stateMachineProcedure, "stateMachineProcedure");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new StateMachineSerialExecutorQueue$queueExecution$1(this, stateMachineProcedure, null), 3, null);
    }
}
