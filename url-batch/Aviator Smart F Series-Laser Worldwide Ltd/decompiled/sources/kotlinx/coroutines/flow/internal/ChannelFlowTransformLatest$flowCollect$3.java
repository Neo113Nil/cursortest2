package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.f $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest this$0;

    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
    static final class AnonymousClass1 implements kotlinx.coroutines.flow.f {
        final /* synthetic */ i0 $$this$coroutineScope;
        final /* synthetic */ kotlinx.coroutines.flow.f $collector;
        final /* synthetic */ Ref$ObjectRef<l1> $previousFlow;
        final /* synthetic */ ChannelFlowTransformLatest this$0;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements p {
            final /* synthetic */ kotlinx.coroutines.flow.f $collector;
            final /* synthetic */ Object $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, kotlinx.coroutines.flow.f fVar, Object obj, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = fVar;
                this.$value = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                q qVar;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.label;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    qVar = this.this$0.transform;
                    kotlinx.coroutines.flow.f fVar = this.$collector;
                    Object obj2 = this.$value;
                    this.label = 1;
                    if (qVar.invoke(fVar, obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return w.INSTANCE;
            }

            @Override // f6.p
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((AnonymousClass2) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
            }
        }

        AnonymousClass1(Ref$ObjectRef<l1> ref$ObjectRef, i0 i0Var, ChannelFlowTransformLatest channelFlowTransformLatest, kotlinx.coroutines.flow.f fVar) {
            this.$previousFlow = ref$ObjectRef;
            this.$$this$coroutineScope = i0Var;
            this.this$0 = channelFlowTransformLatest;
            this.$collector = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r8v2, types: [T, kotlinx.coroutines.l1] */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            Object coroutine_suspended;
            int i8;
            AnonymousClass1 anonymousClass1;
            ?? launch$default;
            if (cVar instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) cVar;
                int i9 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i9 - Integer.MIN_VALUE;
                    Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj2);
                        l1 l1Var = this.$previousFlow.element;
                        if (l1Var != null) {
                            l1Var.cancel((CancellationException) new ChildCancelledException());
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = obj;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = l1Var;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                            if (l1Var.join(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        anonymousClass1 = this;
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                        y5.g.throwOnFailure(obj2);
                    }
                    Ref$ObjectRef<l1> ref$ObjectRef = anonymousClass1.$previousFlow;
                    launch$default = kotlinx.coroutines.i.launch$default(anonymousClass1.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.this$0, anonymousClass1.$collector, obj, null), 1, null);
                    ref$ObjectRef.element = launch$default;
                    return w.INSTANCE;
                }
            }
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
            Object obj22 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i8 != 0) {
            }
            Ref$ObjectRef<l1> ref$ObjectRef2 = anonymousClass1.$previousFlow;
            launch$default = kotlinx.coroutines.i.launch$default(anonymousClass1.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.this$0, anonymousClass1.$collector, obj, null), 1, null);
            ref$ObjectRef2.element = launch$default;
            return w.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, cVar);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest channelFlowTransformLatest = this.this$0;
            kotlinx.coroutines.flow.e eVar = channelFlowTransformLatest.flow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, i0Var, channelFlowTransformLatest, this.$collector);
            this.label = 1;
            if (eVar.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
