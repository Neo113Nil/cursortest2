package xyz.block.genie;

import com.squareup.wire.ProtoAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes10.dex */
public final class GenieSessionKt$post$1 extends ContinuationImpl {
    public ProtoAdapter L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GenieSessionKt.access$post(null, null, null, this);
    }
}
