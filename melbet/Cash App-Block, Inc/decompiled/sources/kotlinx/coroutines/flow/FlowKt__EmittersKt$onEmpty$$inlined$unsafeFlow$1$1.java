package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$2;
    public Ref$BooleanRef L$3;
    public SafeCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1(FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
