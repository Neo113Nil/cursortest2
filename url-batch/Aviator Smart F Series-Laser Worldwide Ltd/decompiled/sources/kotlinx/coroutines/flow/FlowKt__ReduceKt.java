package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__ReduceKt {

    public static final class a implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef $result$inlined;

        public a(Ref$ObjectRef ref$ObjectRef) {
            this.$result$inlined = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t7, kotlin.coroutines.c cVar) {
            this.$result$inlined.element = t7;
            throw new AbortFlowException(this);
        }
    }

    public static final class b implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef $result$inlined;

        public b(Ref$ObjectRef ref$ObjectRef) {
            this.$result$inlined = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t7, kotlin.coroutines.c cVar) {
            this.$result$inlined.element = t7;
            throw new AbortFlowException(this);
        }
    }

    static final class c implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef<Object> $result;

        c(Ref$ObjectRef<Object> ref$ObjectRef) {
            this.$result = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.$result.element = obj;
            return y5.w.INSTANCE;
        }
    }

    static final class d implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef<Object> $result;

        d(Ref$ObjectRef<Object> ref$ObjectRef) {
            this.$result = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.$result.element = obj;
            return y5.w.INSTANCE;
        }
    }

    static final class e implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef<Object> $result;

        e(Ref$ObjectRef<Object> ref$ObjectRef) {
            this.$result = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            Ref$ObjectRef<Object> ref$ObjectRef = this.$result;
            if (ref$ObjectRef.element != kotlinx.coroutines.flow.internal.l.NULL) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            ref$ObjectRef.element = obj;
            return y5.w.INSTANCE;
        }
    }

    public static final class f implements kotlinx.coroutines.flow.f {
        final /* synthetic */ Ref$ObjectRef $result$inlined;

        public f(Ref$ObjectRef ref$ObjectRef) {
            this.$result$inlined = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.g0] */
        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t7, kotlin.coroutines.c cVar) {
            Ref$ObjectRef ref$ObjectRef = this.$result$inlined;
            T t8 = ref$ObjectRef.element;
            ?? r12 = kotlinx.coroutines.flow.internal.l.NULL;
            if (t8 == r12) {
                ref$ObjectRef.element = t7;
                return y5.w.INSTANCE;
            }
            ref$ObjectRef.element = r12;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object first(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e8;
        kotlinx.coroutines.flow.f fVar;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) cVar;
            int i9 = flowKt__ReduceKt$first$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$first$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f aVar = new a(ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$first$1.L$1 = aVar;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (eVar.collect(aVar, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e9) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e8 = e9;
                        fVar = aVar;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (a) flowKt__ReduceKt$first$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e10) {
                        e8 = e10;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                }
                t7 = ref$ObjectRef.element;
                if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                    return t7;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar);
        Object obj2 = flowKt__ReduceKt$first$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$first$1.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object firstOrNull(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e8;
        kotlinx.coroutines.flow.f fVar;
        if (cVar instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) cVar;
            int i9 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$firstOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    kotlinx.coroutines.flow.f bVar = new b(ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$firstOrNull$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$firstOrNull$1.L$1 = bVar;
                        flowKt__ReduceKt$firstOrNull$1.label = 1;
                        if (eVar.collect(bVar, flowKt__ReduceKt$firstOrNull$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e9) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e8 = e9;
                        fVar = bVar;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (b) flowKt__ReduceKt$firstOrNull$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e10) {
                        e8 = e10;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar);
        Object obj2 = flowKt__ReduceKt$firstOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i8 != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, R> Object fold(kotlinx.coroutines.flow.e eVar, R r8, f6.q qVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar instanceof FlowKt__ReduceKt$fold$1) {
            flowKt__ReduceKt$fold$1 = (FlowKt__ReduceKt$fold$1) cVar;
            int i9 = flowKt__ReduceKt$fold$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$fold$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$fold$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = r8;
                    kotlinx.coroutines.flow.f flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(ref$ObjectRef2, qVar);
                    flowKt__ReduceKt$fold$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$fold$1.label = 1;
                    if (eVar.collect(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$fold$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(cVar);
        Object obj2 = flowKt__ReduceKt$fold$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$fold$1.label;
        if (i8 != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object fold$$forInline(kotlinx.coroutines.flow.e eVar, R r8, f6.q qVar, kotlin.coroutines.c cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r8;
        FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(ref$ObjectRef, qVar);
        kotlin.jvm.internal.r.mark(0);
        eVar.collect(flowKt__ReduceKt$fold$2, cVar);
        kotlin.jvm.internal.r.mark(1);
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object last(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (FlowKt__ReduceKt$last$1) cVar;
            int i9 = flowKt__ReduceKt$last$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$last$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$last$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f cVar2 = new c(ref$ObjectRef2);
                    flowKt__ReduceKt$last$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$last$1.label = 1;
                    if (eVar.collect(cVar2, flowKt__ReduceKt$last$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$last$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                t7 = ref$ObjectRef.element;
                if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                    return t7;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(cVar);
        Object obj2 = flowKt__ReduceKt$last$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$last$1.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object lastOrNull(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$lastOrNull$1 flowKt__ReduceKt$lastOrNull$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar instanceof FlowKt__ReduceKt$lastOrNull$1) {
            flowKt__ReduceKt$lastOrNull$1 = (FlowKt__ReduceKt$lastOrNull$1) cVar;
            int i9 = flowKt__ReduceKt$lastOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$lastOrNull$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$lastOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$lastOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    kotlinx.coroutines.flow.f dVar = new d(ref$ObjectRef2);
                    flowKt__ReduceKt$lastOrNull$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$lastOrNull$1.label = 1;
                    if (eVar.collect(dVar, flowKt__ReduceKt$lastOrNull$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$lastOrNull$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(cVar);
        Object obj2 = flowKt__ReduceKt$lastOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$lastOrNull$1.label;
        if (i8 != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S, T extends S> Object reduce(kotlinx.coroutines.flow.e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) cVar;
            int i9 = flowKt__ReduceKt$reduce$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$reduce$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$reduce$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2(ref$ObjectRef2, qVar);
                    flowKt__ReduceKt$reduce$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$reduce$1.label = 1;
                    if (eVar.collect(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$reduce$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                t7 = ref$ObjectRef.element;
                if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                    return t7;
                }
                throw new NoSuchElementException("Empty flow can't be reduced");
            }
        }
        flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(cVar);
        Object obj2 = flowKt__ReduceKt$reduce$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$reduce$1.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object single(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) cVar;
            int i9 = flowKt__ReduceKt$single$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$single$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$single$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f eVar2 = new e(ref$ObjectRef2);
                    flowKt__ReduceKt$single$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$single$1.label = 1;
                    if (eVar.collect(eVar2, flowKt__ReduceKt$single$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$single$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                t7 = ref$ObjectRef.element;
                if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                    return t7;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(cVar);
        Object obj2 = flowKt__ReduceKt$single$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$single$1.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object singleOrNull(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e8;
        kotlinx.coroutines.flow.f fVar;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) cVar;
            int i9 = flowKt__ReduceKt$singleOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$singleOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$singleOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f fVar2 = new f(ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$singleOrNull$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$singleOrNull$1.L$1 = fVar2;
                        flowKt__ReduceKt$singleOrNull$1.label = 1;
                        if (eVar.collect(fVar2, flowKt__ReduceKt$singleOrNull$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e9) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e8 = e9;
                        fVar = fVar2;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 != kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (f) flowKt__ReduceKt$singleOrNull$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e10) {
                        e8 = e10;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 != kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                }
                t7 = ref$ObjectRef.element;
                if (t7 != kotlinx.coroutines.flow.internal.l.NULL) {
                    return null;
                }
                return t7;
            }
        }
        flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(cVar);
        Object obj2 = flowKt__ReduceKt$singleOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$singleOrNull$1.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 != kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object first(kotlinx.coroutines.flow.e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Object coroutine_suspended;
        int i8;
        f6.p pVar2;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e8;
        kotlinx.coroutines.flow.f fVar;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) cVar;
            int i9 = flowKt__ReduceKt$first$3.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$3.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$first$3.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.l.NULL;
                    kotlinx.coroutines.flow.f flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(pVar, ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$first$3.L$0 = pVar;
                        flowKt__ReduceKt$first$3.L$1 = ref$ObjectRef2;
                        flowKt__ReduceKt$first$3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        flowKt__ReduceKt$first$3.label = 1;
                        if (eVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pVar2 = pVar;
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e9) {
                        pVar2 = pVar;
                        ref$ObjectRef = ref$ObjectRef2;
                        e8 = e9;
                        fVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$2;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$1;
                    pVar2 = (f6.p) flowKt__ReduceKt$first$3.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e10) {
                        e8 = e10;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        t7 = ref$ObjectRef.element;
                        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                    }
                }
                t7 = ref$ObjectRef.element;
                if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
                    return t7;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar);
        Object obj2 = flowKt__ReduceKt$first$3.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$first$3.label;
        if (i8 != 0) {
        }
        t7 = ref$ObjectRef.element;
        if (t7 == kotlinx.coroutines.flow.internal.l.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object firstOrNull(kotlinx.coroutines.flow.e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e8;
        kotlinx.coroutines.flow.f fVar;
        if (cVar instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) cVar;
            int i9 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$3.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$firstOrNull$3.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    kotlinx.coroutines.flow.f flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(pVar, ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        flowKt__ReduceKt$firstOrNull$3.label = 1;
                        if (eVar.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e9) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e8 = e9;
                        fVar = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e10) {
                        e8 = e10;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e8, fVar);
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(cVar);
        Object obj2 = flowKt__ReduceKt$firstOrNull$3.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i8 != 0) {
        }
        return ref$ObjectRef.element;
    }
}
