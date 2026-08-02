package kotlinx.coroutines.flow;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$2;
    public Ref$ObjectRef L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowUtil$createFlow$$inlined$map$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowUtil$createFlow$$inlined$map$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
