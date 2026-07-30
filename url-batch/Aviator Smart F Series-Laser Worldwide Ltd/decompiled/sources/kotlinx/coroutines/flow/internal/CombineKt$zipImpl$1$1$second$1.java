package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.e $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    static final class AnonymousClass1 implements kotlinx.coroutines.flow.f {
        final /* synthetic */ kotlinx.coroutines.channels.j $$this$produce;

        AnonymousClass1(kotlinx.coroutines.channels.j jVar) {
            this.$$this$produce = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            Object coroutine_suspended;
            int i8;
            if (cVar instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) cVar;
                int i9 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                    Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj2);
                        kotlinx.coroutines.channels.l channel = this.$$this$produce.getChannel();
                        if (obj == null) {
                            obj = l.NULL;
                        }
                        combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                        if (channel.send(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == coroutine_suspended) {
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
            combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, cVar);
            Object obj22 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if (i8 != 0) {
            }
            return w.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombineKt$zipImpl$1$1$second$1(kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$flow2 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, cVar);
        combineKt$zipImpl$1$1$second$1.L$0 = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            kotlinx.coroutines.channels.j jVar = (kotlinx.coroutines.channels.j) this.L$0;
            kotlinx.coroutines.flow.e eVar = this.$flow2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar);
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
    public final Object invoke(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        return ((CombineKt$zipImpl$1$1$second$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
