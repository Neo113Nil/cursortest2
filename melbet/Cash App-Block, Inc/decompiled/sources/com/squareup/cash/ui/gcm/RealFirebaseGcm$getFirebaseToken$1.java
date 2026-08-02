package com.squareup.cash.ui.gcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealFirebaseGcm$getFirebaseToken$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ByteString.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFirebaseGcm$getFirebaseToken$1(ByteString.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getFirebaseToken(this);
    }
}
