package xyz.block.genie;

import com.squareup.scannerview.SizeMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import xyz.block.genie.GenieSession;

/* loaded from: classes10.dex */
public final class GenieSession$Companion$create$1 extends ContinuationImpl {
    public String L$0;
    public SizeMap L$5;
    public String L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GenieSession.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenieSession$Companion$create$1(GenieSession.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.create(null, null, null, null, null, null, this);
    }
}
