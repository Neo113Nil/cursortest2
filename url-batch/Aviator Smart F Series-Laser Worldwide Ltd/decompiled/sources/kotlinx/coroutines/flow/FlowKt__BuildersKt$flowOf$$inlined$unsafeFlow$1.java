package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 implements e {
    final /* synthetic */ Object[] $elements$inlined;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
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
            return FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] objArr) {
        this.$elements$inlined = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        AnonymousClass1 anonymousClass1;
        Object coroutine_suspended;
        int i8;
        int i9;
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
        f fVar2;
        int length;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = anonymousClass1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    i9 = 0;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = this;
                    fVar2 = fVar;
                    length = this.$elements$inlined.length;
                    if (i9 < length) {
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = anonymousClass1.I$1;
                    i9 = anonymousClass1.I$0;
                    f fVar3 = (f) anonymousClass1.L$1;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = (FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    y5.g.throwOnFailure(obj);
                    fVar2 = fVar3;
                    i9++;
                    if (i9 < length) {
                        Object obj2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.$elements$inlined[i9];
                        anonymousClass1.L$0 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
                        anonymousClass1.L$1 = fVar2;
                        anonymousClass1.I$0 = i9;
                        anonymousClass1.I$1 = length;
                        anonymousClass1.label = 1;
                        if (fVar2.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i9++;
                        if (i9 < length) {
                            return y5.w.INSTANCE;
                        }
                    }
                }
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        Object obj3 = anonymousClass1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = anonymousClass1.label;
        if (i8 != 0) {
        }
    }
}
