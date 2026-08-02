package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FlowKt__ReduceKt$firstOrNull$3 extends ContinuationImpl {
    public Ref$ObjectRef L$2;
    public FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 L$4;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$firstOrNull$3(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FlowKt.firstOrNull(null, null, this);
    }
}
