package com.squareup.util.coroutines;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class StateFlowKt$combineState$4 extends FunctionReferenceImpl implements Function4 {
    public final /* synthetic */ int $r8$classId = 1;

    public StateFlowKt$combineState$4(Function3 function3) {
        super(4, 0, ArrayIteratorKt.class, function3, "suspendConversion0", "combineState$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                break;
        }
        return ((Function3) this.receiver).invoke(obj, obj2, obj3);
    }

    public /* synthetic */ StateFlowKt$combineState$4(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }
}
