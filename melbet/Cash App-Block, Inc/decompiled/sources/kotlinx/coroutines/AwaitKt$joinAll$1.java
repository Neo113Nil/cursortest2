package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object[] L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AwaitKt.joinAll((Job[]) null, this);
    }
}
