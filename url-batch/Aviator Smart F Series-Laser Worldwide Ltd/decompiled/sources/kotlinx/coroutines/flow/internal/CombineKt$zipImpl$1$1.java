package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.z;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.e $flow;
    final /* synthetic */ kotlinx.coroutines.flow.e $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    int label;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements p {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ kotlinx.coroutines.flow.e $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ ReceiveChannel $second;
        final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;
        final /* synthetic */ q $transform;
        int label;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 implements kotlinx.coroutines.flow.f {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CoroutineContext $scopeContext;
            final /* synthetic */ ReceiveChannel $second;
            final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;
            final /* synthetic */ q $transform;

            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, 132, 132}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C03691 extends SuspendLambda implements p {
                final /* synthetic */ ReceiveChannel $second;
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;
                final /* synthetic */ q $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03691(ReceiveChannel receiveChannel, kotlinx.coroutines.flow.f fVar, q qVar, Object obj, kotlin.coroutines.c cVar) {
                    super(2, cVar);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = fVar;
                    this.$transform = qVar;
                    this.$value = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                    return new C03691(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, cVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    Object mo1232receiveCatchingJP2dKIU;
                    kotlinx.coroutines.flow.f fVar;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    int i8 = this.label;
                    if (i8 == 0) {
                        y5.g.throwOnFailure(obj);
                        ReceiveChannel receiveChannel = this.$second;
                        this.label = 1;
                        mo1232receiveCatchingJP2dKIU = receiveChannel.mo1232receiveCatchingJP2dKIU(this);
                        if (mo1232receiveCatchingJP2dKIU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5.g.throwOnFailure(obj);
                                return w.INSTANCE;
                            }
                            fVar = (kotlinx.coroutines.flow.f) this.L$0;
                            y5.g.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 3;
                            if (fVar.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return w.INSTANCE;
                        }
                        y5.g.throwOnFailure(obj);
                        mo1232receiveCatchingJP2dKIU = ((kotlinx.coroutines.channels.e) obj).m1252unboximpl();
                    }
                    fVar = this.$this_unsafeFlow;
                    if (mo1232receiveCatchingJP2dKIU instanceof e.c) {
                        Throwable m1244exceptionOrNullimpl = kotlinx.coroutines.channels.e.m1244exceptionOrNullimpl(mo1232receiveCatchingJP2dKIU);
                        if (m1244exceptionOrNullimpl == null) {
                            throw new AbortFlowException(fVar);
                        }
                        throw m1244exceptionOrNullimpl;
                    }
                    q qVar = this.$transform;
                    Object obj2 = this.$value;
                    if (mo1232receiveCatchingJP2dKIU == l.NULL) {
                        mo1232receiveCatchingJP2dKIU = null;
                    }
                    this.L$0 = fVar;
                    this.label = 2;
                    obj = qVar.invoke(obj2, mo1232receiveCatchingJP2dKIU, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                    }
                    return w.INSTANCE;
                }

                @Override // f6.p
                public final Object invoke(w wVar, kotlin.coroutines.c cVar) {
                    return ((C03691) create(wVar, cVar)).invokeSuspend(w.INSTANCE);
                }
            }

            AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel receiveChannel, kotlinx.coroutines.flow.f fVar, q qVar) {
                this.$scopeContext = coroutineContext;
                this.$cnt = obj;
                this.$second = receiveChannel;
                this.$this_unsafeFlow = fVar;
                this.$transform = qVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                Object coroutine_suspended;
                int i8;
                if (cVar instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) cVar;
                    int i9 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label = i9 - Integer.MIN_VALUE;
                        Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                        i8 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                        if (i8 != 0) {
                            y5.g.throwOnFailure(obj2);
                            CoroutineContext coroutineContext = this.$scopeContext;
                            w wVar = w.INSTANCE;
                            Object obj3 = this.$cnt;
                            C03691 c03691 = new C03691(this.$second, this.$this_unsafeFlow, this.$transform, obj, null);
                            combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                            if (d.withContextUndispatched(coroutineContext, wVar, obj3, c03691, combineKt$zipImpl$1$1$2$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj2);
                        }
                        return w.INSTANCE;
                    }
                }
                combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, cVar);
                Object obj22 = combineKt$zipImpl$1$1$2$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i8 != 0) {
                }
                return w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, Object obj, ReceiveChannel receiveChannel, kotlinx.coroutines.flow.f fVar, q qVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$flow = eVar;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = fVar;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                kotlinx.coroutines.flow.e eVar = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
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
        public final Object invoke(w wVar, kotlin.coroutines.c cVar) {
            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(w.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.f fVar, kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_unsafeFlow = fVar;
        this.$flow2 = eVar;
        this.$flow = eVar2;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, cVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        final z m1298Job$default;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        CoroutineContext plus;
        w wVar;
        AnonymousClass2 anonymousClass2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        ?? r12 = this.label;
        try {
            if (r12 != 0) {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel2 = (ReceiveChannel) this.L$0;
                try {
                    y5.g.throwOnFailure(obj);
                    r12 = receiveChannel2;
                } catch (AbortFlowException e8) {
                    e = e8;
                }
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r12, (CancellationException) null, 1, (Object) null);
                return w.INSTANCE;
            }
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            ReceiveChannel produce$default = ProduceKt.produce$default(i0Var, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            m1298Job$default = q1.m1298Job$default((l1) null, 1, (Object) null);
            s.checkNotNull(produce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            final kotlinx.coroutines.flow.f fVar = this.$this_unsafeFlow;
            ((kotlinx.coroutines.channels.l) produce$default).invokeOnClose(new f6.l() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return w.INSTANCE;
                }

                public final void invoke(Throwable th) {
                    if (z.this.isActive()) {
                        z.this.cancel((CancellationException) new AbortFlowException(fVar));
                    }
                }
            });
            try {
                CoroutineContext coroutineContext = i0Var.getCoroutineContext();
                Object threadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                plus = i0Var.getCoroutineContext().plus(m1298Job$default);
                wVar = w.INSTANCE;
                anonymousClass2 = new AnonymousClass2(this.$flow, coroutineContext, threadContextElements, produce$default, this.$this_unsafeFlow, this.$transform, null);
                this.L$0 = produce$default;
                this.label = 1;
                receiveChannel = produce$default;
            } catch (AbortFlowException e9) {
                e = e9;
                receiveChannel = produce$default;
            } catch (Throwable th) {
                th = th;
                receiveChannel = produce$default;
            }
            try {
            } catch (AbortFlowException e10) {
                e = e10;
                receiveChannel2 = receiveChannel;
                h.checkOwnership(e, this.$this_unsafeFlow);
                r12 = receiveChannel2;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r12, (CancellationException) null, 1, (Object) null);
                return w.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                r12 = receiveChannel;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r12, (CancellationException) null, 1, (Object) null);
                throw th;
            }
            if (d.withContextUndispatched$default(plus, wVar, null, anonymousClass2, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r12 = receiveChannel;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r12, (CancellationException) null, 1, (Object) null);
            return w.INSTANCE;
            h.checkOwnership(e, this.$this_unsafeFlow);
            r12 = receiveChannel2;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r12, (CancellationException) null, 1, (Object) null);
            return w.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((CombineKt$zipImpl$1$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
