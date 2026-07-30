package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o1;
import y5.w;

/* loaded from: classes5.dex */
final class ChannelFlowMerge$collectTo$2 implements kotlinx.coroutines.flow.f {
    final /* synthetic */ m $collector;
    final /* synthetic */ l1 $job;
    final /* synthetic */ kotlinx.coroutines.channels.j $scope;
    final /* synthetic */ kotlinx.coroutines.sync.a $semaphore;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ m $collector;
        final /* synthetic */ kotlinx.coroutines.flow.e $inner;
        final /* synthetic */ kotlinx.coroutines.sync.a $semaphore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.flow.e eVar, m mVar, kotlinx.coroutines.sync.a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$inner = eVar;
            this.$collector = mVar;
            this.$semaphore = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    kotlinx.coroutines.flow.e eVar = this.$inner;
                    m mVar = this.$collector;
                    this.label = 1;
                    if (eVar.collect(mVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.$semaphore.release();
                return w.INSTANCE;
            } catch (Throwable th) {
                this.$semaphore.release();
                throw th;
            }
        }

        @Override // f6.p
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
        }
    }

    ChannelFlowMerge$collectTo$2(l1 l1Var, kotlinx.coroutines.sync.a aVar, kotlinx.coroutines.channels.j jVar, m mVar) {
        this.$job = l1Var;
        this.$semaphore = aVar;
        this.$scope = jVar;
        this.$collector = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        Object coroutine_suspended;
        int i8;
        ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2;
        if (cVar instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) cVar;
            int i9 = channelFlowMerge$collectTo$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelFlowMerge$collectTo$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelFlowMerge$collectTo$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    l1 l1Var = this.$job;
                    if (l1Var != null) {
                        o1.ensureActive(l1Var);
                    }
                    kotlinx.coroutines.sync.a aVar = this.$semaphore;
                    channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                    channelFlowMerge$collectTo$2$emit$1.L$1 = eVar;
                    channelFlowMerge$collectTo$2$emit$1.label = 1;
                    if (aVar.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelFlowMerge$collectTo$2 = this;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (kotlinx.coroutines.flow.e) channelFlowMerge$collectTo$2$emit$1.L$1;
                    channelFlowMerge$collectTo$2 = (ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                kotlinx.coroutines.i.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new AnonymousClass1(eVar, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
                return w.INSTANCE;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, cVar);
        Object obj2 = channelFlowMerge$collectTo$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelFlowMerge$collectTo$2$emit$1.label;
        if (i8 != 0) {
        }
        kotlinx.coroutines.i.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new AnonymousClass1(eVar, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
        return w.INSTANCE;
    }
}
