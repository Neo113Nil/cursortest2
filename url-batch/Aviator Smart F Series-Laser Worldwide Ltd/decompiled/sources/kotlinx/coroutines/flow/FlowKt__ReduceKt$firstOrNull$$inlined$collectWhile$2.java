package kotlinx.coroutines.flow;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements f {
    final /* synthetic */ f6.p $predicate$inlined;
    final /* synthetic */ Ref$ObjectRef $result$inlined;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {GattError.GATT_NOT_ENCRYPTED}, m = "emit", n = {"this", com.moyoung.dafit.module.common.utils.u.LANGUAGE_IT}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1, reason: invalid class name */
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
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(f6.p pVar, Ref$ObjectRef ref$ObjectRef) {
        this.$predicate$inlined = pVar;
        this.$result$inlined = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t7, kotlin.coroutines.c cVar) {
        AnonymousClass1 anonymousClass1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        T t8;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
                obj = anonymousClass1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = anonymousClass1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    f6.p pVar = this.$predicate$inlined;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = t7;
                    anonymousClass1.label = 1;
                    kotlin.jvm.internal.r.mark(6);
                    obj = pVar.invoke(t7, anonymousClass1);
                    kotlin.jvm.internal.r.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = this;
                    t8 = t7;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = anonymousClass1.L$1;
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) anonymousClass1.L$0;
                    y5.g.throwOnFailure(obj);
                    t8 = obj2;
                }
                if (((Boolean) obj).booleanValue()) {
                    return y5.w.INSTANCE;
                }
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.$result$inlined.element = t8;
                throw new AbortFlowException(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        obj = anonymousClass1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = anonymousClass1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
