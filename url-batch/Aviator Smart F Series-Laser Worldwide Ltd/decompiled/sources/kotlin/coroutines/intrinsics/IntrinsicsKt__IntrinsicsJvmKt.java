package kotlin.coroutines.intrinsics;

import f6.l;
import f6.p;
import f6.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.x;
import y5.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    private static final <T> c createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final c cVar, final l lVar) {
        final CoroutineContext context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(cVar, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            final /* synthetic */ l $block;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar);
                this.$block = lVar;
                s.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i8 = this.label;
                if (i8 == 0) {
                    this.label = 1;
                    g.throwOnFailure(obj);
                    return this.$block.invoke(this);
                }
                if (i8 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                g.throwOnFailure(obj);
                return obj;
            }
        } : new ContinuationImpl(cVar, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            final /* synthetic */ l $block;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, context);
                this.$block = lVar;
                s.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i8 = this.label;
                if (i8 == 0) {
                    this.label = 1;
                    g.throwOnFailure(obj);
                    return this.$block.invoke(this);
                }
                if (i8 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                g.throwOnFailure(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> c createCoroutineUnintercepted(final l lVar, c completion) {
        s.checkNotNullParameter(lVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        final c probeCoroutineCreated = f.probeCoroutineCreated(completion);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(probeCoroutineCreated);
        }
        final CoroutineContext context = probeCoroutineCreated.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(probeCoroutineCreated, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(probeCoroutineCreated);
                this.$this_createCoroutineUnintercepted$inlined = lVar;
                s.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i8 = this.label;
                if (i8 == 0) {
                    this.label = 1;
                    g.throwOnFailure(obj);
                    s.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((l) x.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i8 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                g.throwOnFailure(obj);
                return obj;
            }
        } : new ContinuationImpl(probeCoroutineCreated, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(probeCoroutineCreated, context);
                this.$this_createCoroutineUnintercepted$inlined = lVar;
                s.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i8 = this.label;
                if (i8 == 0) {
                    this.label = 1;
                    g.throwOnFailure(obj);
                    s.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((l) x.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i8 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                g.throwOnFailure(obj);
                return obj;
            }
        };
    }

    private static final <T> c createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final c cVar) {
        final CoroutineContext context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(cVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar);
                s.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                g.throwOnFailure(obj);
                return obj;
            }
        } : new ContinuationImpl(cVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, context);
                s.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                g.throwOnFailure(obj);
                return obj;
            }
        };
    }

    public static <T> c intercepted(c cVar) {
        c intercepted;
        s.checkNotNullParameter(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? cVar : intercepted;
    }

    private static final <T> Object startCoroutineUninterceptedOrReturn(l lVar, c completion) {
        s.checkNotNullParameter(lVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return !(lVar instanceof BaseContinuationImpl) ? wrapWithContinuationImpl(lVar, completion) : ((l) x.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(completion);
    }

    public static final <T> Object wrapWithContinuationImpl(l lVar, c completion) {
        s.checkNotNullParameter(lVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return ((l) x.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(f.probeCoroutineCreated(completion)));
    }

    private static final <R, T> Object startCoroutineUninterceptedOrReturn(p pVar, R r8, c completion) {
        s.checkNotNullParameter(pVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return !(pVar instanceof BaseContinuationImpl) ? wrapWithContinuationImpl(pVar, r8, completion) : ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, completion);
    }

    public static final <R, T> Object wrapWithContinuationImpl(p pVar, R r8, c completion) {
        s.checkNotNullParameter(pVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(f.probeCoroutineCreated(completion)));
    }

    private static final <R, P, T> Object startCoroutineUninterceptedOrReturn(q qVar, R r8, P p8, c completion) {
        s.checkNotNullParameter(qVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return !(qVar instanceof BaseContinuationImpl) ? wrapWithContinuationImpl(qVar, r8, p8, completion) : ((q) x.beforeCheckcastToFunctionOfArity(qVar, 3)).invoke(r8, p8, completion);
    }

    public static final <R, P, T> Object wrapWithContinuationImpl(q qVar, R r8, P p8, c completion) {
        s.checkNotNullParameter(qVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        return ((q) x.beforeCheckcastToFunctionOfArity(qVar, 3)).invoke(r8, p8, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(f.probeCoroutineCreated(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> c createCoroutineUnintercepted(final p pVar, final R r8, c completion) {
        s.checkNotNullParameter(pVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        final c probeCoroutineCreated = f.probeCoroutineCreated(completion);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r8, probeCoroutineCreated);
        }
        final CoroutineContext context = probeCoroutineCreated.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(probeCoroutineCreated, pVar, r8) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(probeCoroutineCreated);
                    this.$this_createCoroutineUnintercepted$inlined = pVar;
                    this.$receiver$inlined = r8;
                    s.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected Object invokeSuspend(Object obj) {
                    int i8 = this.label;
                    if (i8 == 0) {
                        this.label = 1;
                        g.throwOnFailure(obj);
                        s.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((p) x.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                    }
                    if (i8 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.label = 2;
                    g.throwOnFailure(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(probeCoroutineCreated, context, pVar, r8) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(probeCoroutineCreated, context);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = r8;
                s.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object obj) {
                int i8 = this.label;
                if (i8 == 0) {
                    this.label = 1;
                    g.throwOnFailure(obj);
                    s.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p) x.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i8 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                g.throwOnFailure(obj);
                return obj;
            }
        };
    }
}
