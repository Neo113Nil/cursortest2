package androidx.lifecycle;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: FlowLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend", v = 1)
/* loaded from: classes14.dex */
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ LiveData<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asFlow$1(LiveData<Object> liveData, Continuation continuation) {
        super(2, continuation);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, continuation);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope producerScope, Continuation continuation) {
        return ((FlowLiveDataConversions$asFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Observer observer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                Observer observer2 = new Observer() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        ProducerScope.this.mo8216trySendJP2dKIU(obj2);
                    }
                };
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer2, null);
                this.L$0 = observer2;
                this.label = 1;
                observer = observer2;
                if (BuildersKt.withContext(immediate, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        Observer observer3 = (Observer) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = observer3;
                        throw new KotlinNothingValueException();
                    }
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th;
                }
                Observer observer4 = (Observer) this.L$0;
                ResultKt.throwOnFailure(obj);
                observer = observer4;
            }
            this.L$0 = observer;
            this.label = 2;
            r1 = observer;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            CoroutineContext plus = Dispatchers.getMain().getImmediate().plus(NonCancellable.INSTANCE);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r1, null);
            this.L$0 = th2;
            this.label = 3;
            if (BuildersKt.withContext(plus, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th2;
        }
    }

    /* compiled from: FlowLiveData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ Observer<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<Object> liveData, Observer<Object> observer, Continuation continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$this_asFlow.observeForever(this.$observer);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FlowLiveData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        final /* synthetic */ Observer<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveData<Object> liveData, Observer<Object> observer, Continuation continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$this_asFlow.removeObserver(this.$observer);
            return Unit.INSTANCE;
        }
    }
}
