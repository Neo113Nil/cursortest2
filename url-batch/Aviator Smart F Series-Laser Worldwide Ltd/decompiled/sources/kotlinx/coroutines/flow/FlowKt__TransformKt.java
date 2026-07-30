package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__TransformKt {

    public static final class a implements e {
        final /* synthetic */ f6.q $operation$inlined;
        final /* synthetic */ e $this_runningReduce$inlined;

        public a(e eVar, f6.q qVar) {
            this.$this_runningReduce$inlined = eVar;
            this.$operation$inlined = qVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.g0] */
        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.NULL;
            Object collect = this.$this_runningReduce$inlined.collect(new FlowKt__TransformKt$runningReduce$1$1(ref$ObjectRef, this.$operation$inlined, fVar), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
    }

    public static final class b implements e {
        final /* synthetic */ e $this_withIndex$inlined;

        public b(e eVar) {
            this.$this_withIndex$inlined = eVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object collect = this.$this_withIndex$inlined.collect(new FlowKt__TransformKt$withIndex$1$1(fVar, new Ref$IntRef()), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
    }

    public static final <T> e filter(e eVar, f6.p pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(eVar, pVar);
    }

    public static final /* synthetic */ <R> e filterIsInstance(e eVar) {
        kotlin.jvm.internal.s.needClassReification();
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(eVar);
    }

    public static final <T> e filterNot(e eVar, f6.p pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(eVar, pVar);
    }

    public static final <T> e filterNotNull(final e eVar) {
        return new e() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended;
                    int i8;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i9 = anonymousClass1.label;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i9 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                            i8 = anonymousClass1.label;
                            if (i8 != 0) {
                                y5.g.throwOnFailure(obj2);
                                f fVar = this.$this_unsafeFlow;
                                if (obj != null) {
                                    anonymousClass1.label = 1;
                                    if (fVar.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i8 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5.g.throwOnFailure(obj2);
                            }
                            return y5.w.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = anonymousClass1.label;
                    if (i8 != 0) {
                    }
                    return y5.w.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object collect = e.this.collect(new AnonymousClass2(fVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
            }
        };
    }

    public static final <T, R> e map(e eVar, f6.p pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(eVar, pVar);
    }

    public static final <T, R> e mapNotNull(e eVar, f6.p pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(eVar, pVar);
    }

    public static final <T> e onEach(final e eVar, final f6.p pVar) {
        return new e() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements f {
                final /* synthetic */ f6.p $action$inlined;
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                    this.$action$inlined = pVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended;
                    int i8;
                    Object obj2;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i9 = anonymousClass1.label;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i9 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                            i8 = anonymousClass1.label;
                            if (i8 != 0) {
                                y5.g.throwOnFailure(obj3);
                                f fVar2 = this.$this_unsafeFlow;
                                f6.p pVar = this.$action$inlined;
                                anonymousClass1.L$0 = obj;
                                anonymousClass1.L$1 = fVar2;
                                anonymousClass1.label = 1;
                                kotlin.jvm.internal.r.mark(6);
                                Object invoke = pVar.invoke(obj, anonymousClass1);
                                kotlin.jvm.internal.r.mark(7);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = obj;
                                fVar = fVar2;
                            } else {
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    y5.g.throwOnFailure(obj3);
                                    return y5.w.INSTANCE;
                                }
                                fVar = (f) anonymousClass1.L$1;
                                obj2 = anonymousClass1.L$0;
                                y5.g.throwOnFailure(obj3);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (fVar.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return y5.w.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj32 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = anonymousClass1.label;
                    if (i8 != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
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
        };
    }

    public static final <T, R> e runningFold(e eVar, R r8, f6.q qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r8, eVar, qVar);
    }

    public static final <T> e runningReduce(e eVar, f6.q qVar) {
        return new a(eVar, qVar);
    }

    public static final <T, R> e scan(e eVar, R r8, f6.q qVar) {
        return g.runningFold(eVar, r8, qVar);
    }

    public static final <T> e withIndex(e eVar) {
        return new b(eVar);
    }

    public static final <R> e filterIsInstance(final e eVar, final kotlin.reflect.d dVar) {
        return new e() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2 implements f {
                final /* synthetic */ kotlin.reflect.d $klass$inlined;
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar, kotlin.reflect.d dVar) {
                    this.$this_unsafeFlow = fVar;
                    this.$klass$inlined = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended;
                    int i8;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i9 = anonymousClass1.label;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i9 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                            i8 = anonymousClass1.label;
                            if (i8 != 0) {
                                y5.g.throwOnFailure(obj2);
                                f fVar = this.$this_unsafeFlow;
                                if (this.$klass$inlined.isInstance(obj)) {
                                    anonymousClass1.label = 1;
                                    if (fVar.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i8 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5.g.throwOnFailure(obj2);
                            }
                            return y5.w.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = anonymousClass1.label;
                    if (i8 != 0) {
                    }
                    return y5.w.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object collect = e.this.collect(new AnonymousClass2(fVar, dVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
            }
        };
    }
}
