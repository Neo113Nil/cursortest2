package com.withpersona.sdk2.inquiry.governmentid.network;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker$addToForm$1 extends ContinuationImpl {
    public GovernmentIdRequestArguments L$0;
    public List L$1;
    public Iterator L$2;
    public GovernmentId L$3;
    public Iterator L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SubmitVerificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitVerificationWorker$addToForm$1(SubmitVerificationWorker submitVerificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = submitVerificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4094access$addToFormBWLJW6A = SubmitVerificationWorker.m4094access$addToFormBWLJW6A(this.this$0, null, null, null, this);
        return m4094access$addToFormBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4094access$addToFormBWLJW6A : new Result(m4094access$addToFormBWLJW6A);
    }
}
