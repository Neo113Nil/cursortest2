package com.squareup.cash.threedsdataonly.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealThreeDsAuthenticationManager$invalidateCache$1 extends ContinuationImpl {
    public MutexImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealThreeDsAuthenticationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealThreeDsAuthenticationManager$invalidateCache$1(RealThreeDsAuthenticationManager realThreeDsAuthenticationManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realThreeDsAuthenticationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invalidateCache(this);
    }
}
