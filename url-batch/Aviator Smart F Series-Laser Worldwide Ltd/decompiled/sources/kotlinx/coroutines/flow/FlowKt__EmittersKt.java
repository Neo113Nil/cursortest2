package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__EmittersKt {
    public static final void ensureActive(f fVar) {
        if (fVar instanceof w) {
            throw ((w) fVar).f17051e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object invokeSafely$FlowKt__EmittersKt(f fVar, f6.q qVar, Throwable th, kotlin.coroutines.c cVar) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        Object coroutine_suspended;
        int i8;
        try {
            if (cVar instanceof FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) cVar;
                int i9 = flowKt__EmittersKt$invokeSafely$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$invokeSafely$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = flowKt__EmittersKt$invokeSafely$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = flowKt__EmittersKt$invokeSafely$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        flowKt__EmittersKt$invokeSafely$1.L$0 = th;
                        flowKt__EmittersKt$invokeSafely$1.label = 1;
                        if (qVar.invoke(fVar, th, flowKt__EmittersKt$invokeSafely$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    return y5.w.INSTANCE;
                }
            }
            if (i8 != 0) {
            }
            return y5.w.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                y5.b.addSuppressed(th2, th);
            }
            throw th2;
        }
        flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(cVar);
        Object obj2 = flowKt__EmittersKt$invokeSafely$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__EmittersKt$invokeSafely$1.label;
    }

    public static final <T> e onCompletion(e eVar, f6.q qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(eVar, qVar);
    }

    public static final <T> e onEmpty(e eVar, f6.p pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(eVar, pVar);
    }

    public static final <T> e onStart(e eVar, f6.p pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, eVar);
    }

    public static final <T, R> e transform(e eVar, f6.q qVar) {
        return g.flow(new FlowKt__EmittersKt$transform$1(eVar, qVar, null));
    }

    public static final <T, R> e unsafeTransform(e eVar, f6.q qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(eVar, qVar);
    }
}
