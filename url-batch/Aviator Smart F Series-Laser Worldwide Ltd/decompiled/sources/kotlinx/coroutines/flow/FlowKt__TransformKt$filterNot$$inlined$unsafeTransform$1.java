package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1 implements e {
    final /* synthetic */ f6.p $predicate$inlined;
    final /* synthetic */ e $this_unsafeTransform$inlined;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2 implements f {
        final /* synthetic */ f6.p $predicate$inlined;
        final /* synthetic */ f $this_unsafeFlow;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
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
            this.$predicate$inlined = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
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
            Object obj3;
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
                        f6.p pVar = this.$predicate$inlined;
                        anonymousClass1.L$0 = obj;
                        anonymousClass1.L$1 = fVar2;
                        anonymousClass1.label = 1;
                        Object invoke = pVar.invoke(obj, anonymousClass1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj3 = obj;
                        fVar = fVar2;
                        obj2 = invoke;
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj2);
                            return y5.w.INSTANCE;
                        }
                        fVar = (f) anonymousClass1.L$1;
                        obj3 = anonymousClass1.L$0;
                        y5.g.throwOnFailure(obj2);
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (fVar.emit(obj3, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
            if (!((Boolean) obj2).booleanValue()) {
            }
            return y5.w.INSTANCE;
        }

        public final Object emit$$forInline(Object obj, kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.r.mark(4);
            new AnonymousClass1(cVar);
            kotlin.jvm.internal.r.mark(5);
            f fVar = this.$this_unsafeFlow;
            if (!((Boolean) this.$predicate$inlined.invoke(obj, cVar)).booleanValue()) {
                kotlin.jvm.internal.r.mark(0);
                fVar.emit(obj, cVar);
                kotlin.jvm.internal.r.mark(1);
            }
            return y5.w.INSTANCE;
        }
    }

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(e eVar, f6.p pVar) {
        this.$this_unsafeTransform$inlined = eVar;
        this.$predicate$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(fVar, this.$predicate$inlined), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }

    public Object collect$$forInline(f fVar, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.r.mark(5);
        e eVar = this.$this_unsafeTransform$inlined;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar, this.$predicate$inlined);
        kotlin.jvm.internal.r.mark(0);
        eVar.collect(anonymousClass2, cVar);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }
}
