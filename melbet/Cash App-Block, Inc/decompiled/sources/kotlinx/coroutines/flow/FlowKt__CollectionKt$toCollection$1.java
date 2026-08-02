package kotlinx.coroutines.flow;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FlowKt__CollectionKt$toCollection$1 extends ContinuationImpl {
    public ArrayList L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FlowKt__CollectionKt.toCollection(null, null, this);
    }
}
