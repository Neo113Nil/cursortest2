package xyz.block.genie;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes10.dex */
public final class GenieSession$fetchScene$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GenieSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenieSession$fetchScene$1(GenieSession genieSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = genieSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchScene(null, this);
    }
}
