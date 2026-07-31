package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InternalMutatorMutex.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {171, 158}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function2;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MutatorMutex$mutateWith$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Mutex mutex;
        Function2 function2;
        Object obj2;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        MutatorMutex.Mutator mutator2;
        Throwable th;
        MutatorMutex mutatorMutex2;
        Mutex mutex2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.Key);
                    Intrinsics.checkNotNull(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (Job) element);
                    this.this$0.tryMutateOrCancel(mutator3);
                    mutex = this.this$0.mutex;
                    function2 = this.$block;
                    Object obj3 = this.$receiver;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = mutex;
                    this.L$2 = function2;
                    this.L$3 = obj3;
                    this.L$4 = mutatorMutex3;
                    this.label = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    mutatorMutex = mutatorMutex3;
                } else {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            mutex2 = (Mutex) this.L$1;
                            mutator2 = (MutatorMutex.Mutator) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    function2 = (Function2) this.L$2;
                    Mutex mutex3 = (Mutex) this.L$1;
                    mutator = (MutatorMutex.Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                this.L$0 = mutator;
                this.L$1 = mutex;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = function2.invoke(obj2, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutatorMutex2 = mutatorMutex;
                mutex2 = mutex;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.currentMutator;
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }
}
