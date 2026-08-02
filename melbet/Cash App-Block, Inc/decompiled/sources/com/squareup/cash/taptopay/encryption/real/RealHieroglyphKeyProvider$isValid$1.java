package com.squareup.cash.taptopay.encryption.real;

import java.time.Instant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealHieroglyphKeyProvider$isValid$1 extends ContinuationImpl {
    public String L$0;
    public Instant L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealHieroglyphKeyProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealHieroglyphKeyProvider$isValid$1(RealHieroglyphKeyProvider realHieroglyphKeyProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realHieroglyphKeyProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.isValid(null, this);
    }
}
