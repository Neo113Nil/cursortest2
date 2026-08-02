package kotlinx.coroutines.flow;

import com.squareup.cash.util.cache.Cache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowKt__ReduceKt$first$1 extends ContinuationImpl {
    public Ref$ObjectRef L$1;
    public Cache.AnonymousClass1.C00671 L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FlowKt.first(null, this);
    }
}
