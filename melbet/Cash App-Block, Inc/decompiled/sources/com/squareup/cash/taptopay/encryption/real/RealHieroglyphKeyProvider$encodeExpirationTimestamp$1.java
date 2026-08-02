package com.squareup.cash.taptopay.encryption.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealHieroglyphKeyProvider$encodeExpirationTimestamp$1 extends ContinuationImpl {
    public long J$0;
    public ByteString.Companion L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealHieroglyphKeyProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealHieroglyphKeyProvider$encodeExpirationTimestamp$1(RealHieroglyphKeyProvider realHieroglyphKeyProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realHieroglyphKeyProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.encodeExpirationTimestamp(0L, this);
    }
}
