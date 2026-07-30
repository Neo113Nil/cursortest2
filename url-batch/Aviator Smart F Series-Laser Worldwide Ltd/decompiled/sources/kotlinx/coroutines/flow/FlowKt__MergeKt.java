package kotlinx.coroutines.flow;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.h0;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = h0.systemProp(g.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    public static final class a implements e {
        final /* synthetic */ e $this_flattenConcat$inlined;

        public a(e eVar) {
            this.$this_flattenConcat$inlined = eVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object collect = this.$this_flattenConcat$inlined.collect(new FlowKt__MergeKt$flattenConcat$1$1(fVar), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
    }

    public static final <T, R> e flatMapConcat(final e eVar, final f6.p pVar) {
        return g.flattenConcat(new e() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ f6.p $transform$inlined;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, f6.p pVar) {
                    this.$this_unsafeFlow = fVar;
                    this.$transform$inlined = pVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    Object coroutine_suspended;
                    int i8;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i9 = anonymousClass1.label;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i9 - Integer.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                            i8 = anonymousClass1.label;
                            if (i8 != 0) {
                                y5.g.throwOnFailure(obj2);
                                f fVar2 = this.$this_unsafeFlow;
                                f6.p pVar = this.$transform$inlined;
                                anonymousClass1.L$0 = fVar2;
                                anonymousClass1.label = 1;
                                Object invoke = pVar.invoke(obj, anonymousClass1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = invoke;
                                fVar = fVar2;
                            } else {
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    y5.g.throwOnFailure(obj2);
                                    return y5.w.INSTANCE;
                                }
                                fVar = (f) anonymousClass1.L$0;
                                y5.g.throwOnFailure(obj2);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (fVar.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return y5.w.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = anonymousClass1.label;
                    if (i8 != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (fVar.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return y5.w.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object collect = e.this.collect(new AnonymousClass2(fVar, pVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
            }
        });
    }

    public static final <T, R> e flatMapLatest(e eVar, f6.p pVar) {
        return g.transformLatest(eVar, new FlowKt__MergeKt$flatMapLatest$1(pVar, null));
    }

    public static final <T, R> e flatMapMerge(final e eVar, int i8, final f6.p pVar) {
        return g.flattenMerge(new e() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ f6.p $transform$inlined;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, f6.p pVar) {
                    this.$this_unsafeFlow = fVar;
                    this.$transform$inlined = pVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    Object coroutine_suspended;
                    int i8;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i9 = anonymousClass1.label;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i9 - Integer.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                            i8 = anonymousClass1.label;
                            if (i8 != 0) {
                                y5.g.throwOnFailure(obj2);
                                f fVar2 = this.$this_unsafeFlow;
                                f6.p pVar = this.$transform$inlined;
                                anonymousClass1.L$0 = fVar2;
                                anonymousClass1.label = 1;
                                Object invoke = pVar.invoke(obj, anonymousClass1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = invoke;
                                fVar = fVar2;
                            } else {
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    y5.g.throwOnFailure(obj2);
                                    return y5.w.INSTANCE;
                                }
                                fVar = (f) anonymousClass1.L$0;
                                y5.g.throwOnFailure(obj2);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (fVar.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return y5.w.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = anonymousClass1.label;
                    if (i8 != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (fVar.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return y5.w.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object collect = e.this.collect(new AnonymousClass2(fVar, pVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
            }
        }, i8);
    }

    public static /* synthetic */ e flatMapMerge$default(e eVar, int i8, f6.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = DEFAULT_CONCURRENCY;
        }
        return g.flatMapMerge(eVar, i8, pVar);
    }

    public static final <T> e flattenConcat(e eVar) {
        return new a(eVar);
    }

    public static final <T> e flattenMerge(e eVar, int i8) {
        if (i8 > 0) {
            return i8 == 1 ? g.flattenConcat(eVar) : new ChannelFlowMerge(eVar, i8, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i8).toString());
    }

    public static /* synthetic */ e flattenMerge$default(e eVar, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = DEFAULT_CONCURRENCY;
        }
        return g.flattenMerge(eVar, i8);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    public static final <T, R> e mapLatest(e eVar, f6.p pVar) {
        return g.transformLatest(eVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }

    public static final <T> e merge(Iterable<? extends e> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    public static final <T, R> e transformLatest(e eVar, f6.q qVar) {
        return new ChannelFlowTransformLatest(qVar, eVar, null, 0, null, 28, null);
    }

    public static final <T> e merge(e... eVarArr) {
        Iterable asIterable;
        asIterable = ArraysKt___ArraysKt.asIterable(eVarArr);
        return g.merge((Iterable<? extends e>) asIterable);
    }
}
