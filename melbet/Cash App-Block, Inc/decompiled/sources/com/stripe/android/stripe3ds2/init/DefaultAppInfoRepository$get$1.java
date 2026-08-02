package com.stripe.android.stripe3ds2.init;

import androidx.media3.extractor.mkv.Sniffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class DefaultAppInfoRepository$get$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Sniffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$get$1(Sniffer sniffer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sniffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.get(this);
    }
}
