package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements e {
    final /* synthetic */ f6.p $action$inlined;
    final /* synthetic */ e $this_onStart$inlined;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {117, 121}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(f6.p pVar, e eVar) {
        this.$action$inlined = pVar;
        this.$this_onStart$inlined = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        AnonymousClass1 anonymousClass1;
        Object coroutine_suspended;
        int i8;
        Throwable th;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        f fVar2;
        e eVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = anonymousClass1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    SafeCollector safeCollector2 = new SafeCollector(fVar, anonymousClass1.getContext());
                    try {
                        f6.p pVar = this.$action$inlined;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = fVar;
                        anonymousClass1.L$2 = safeCollector2;
                        anonymousClass1.label = 1;
                        kotlin.jvm.internal.r.mark(6);
                        Object invoke = pVar.invoke(safeCollector2, anonymousClass1);
                        kotlin.jvm.internal.r.mark(7);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                        fVar2 = fVar;
                        safeCollector = safeCollector2;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj);
                        return y5.w.INSTANCE;
                    }
                    safeCollector = (SafeCollector) anonymousClass1.L$2;
                    fVar2 = (f) anonymousClass1.L$1;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                eVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.$this_onStart$inlined;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (eVar.collect(fVar2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return y5.w.INSTANCE;
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        Object obj2 = anonymousClass1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = anonymousClass1.label;
        if (i8 != 0) {
        }
        safeCollector.releaseIntercepted();
        eVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.$this_onStart$inlined;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (eVar.collect(fVar2, anonymousClass1) == coroutine_suspended) {
        }
        return y5.w.INSTANCE;
    }
}
