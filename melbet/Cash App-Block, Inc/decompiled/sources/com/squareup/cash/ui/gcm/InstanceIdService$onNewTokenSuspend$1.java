package com.squareup.cash.ui.gcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class InstanceIdService$onNewTokenSuspend$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InstanceIdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceIdService$onNewTokenSuspend$1(InstanceIdService instanceIdService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = instanceIdService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onNewTokenSuspend(this);
    }
}
