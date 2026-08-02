package kotlinx.coroutines.flow;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$2;
    public Serializable L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__MergeKt$flatMapMerge$$inlined$map$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__MergeKt$flatMapMerge$$inlined$map$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
