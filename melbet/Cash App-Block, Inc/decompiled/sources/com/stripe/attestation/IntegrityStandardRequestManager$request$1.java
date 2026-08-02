package com.stripe.attestation;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class IntegrityStandardRequestManager$request$1 extends ContinuationImpl {
    public int I$0;
    public IntegrityStandardRequestManager L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityStandardRequestManager$request$1(IntegrityStandardRequestManager integrityStandardRequestManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4079requestgIAlus = this.this$0.m4079requestgIAlus(this);
        return m4079requestgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4079requestgIAlus : new Result(m4079requestgIAlus);
    }
}
