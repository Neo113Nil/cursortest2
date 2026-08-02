package com.squareup.cash.work.tinygraph.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealLoginEssentialsRepository$fetchEssentials$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLoginEssentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLoginEssentialsRepository$fetchEssentials$1(RealLoginEssentialsRepository realLoginEssentialsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLoginEssentialsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchEssentials(this);
    }
}
