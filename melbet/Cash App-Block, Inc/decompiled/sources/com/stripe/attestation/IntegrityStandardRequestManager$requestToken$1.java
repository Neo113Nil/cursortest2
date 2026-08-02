package com.stripe.attestation;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class IntegrityStandardRequestManager$requestToken$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityStandardRequestManager$requestToken$1(IntegrityStandardRequestManager integrityStandardRequestManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4080requestTokengIAlus = this.this$0.m4080requestTokengIAlus(this);
        return m4080requestTokengIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4080requestTokengIAlus : new Result(m4080requestTokengIAlus);
    }
}
