package kotlinx.coroutines.flow.internal;

import f6.q;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // f6.q
    public final Object invoke(kotlinx.coroutines.flow.f fVar, Object obj, kotlin.coroutines.c cVar) {
        return fVar.emit(obj, cVar);
    }
}
