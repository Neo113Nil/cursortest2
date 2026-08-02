package com.stripe.attestation;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class IntegrityStandardRequestManager$prepare$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public IntegrityStandardRequestManager L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityStandardRequestManager$prepare$1(IntegrityStandardRequestManager integrityStandardRequestManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4078prepareIoAF18A = this.this$0.m4078prepareIoAF18A(this);
        return m4078prepareIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4078prepareIoAF18A : new Result(m4078prepareIoAF18A);
    }
}
