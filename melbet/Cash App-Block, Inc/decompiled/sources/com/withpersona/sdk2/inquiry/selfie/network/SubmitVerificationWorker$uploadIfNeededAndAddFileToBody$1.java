package com.withpersona.sdk2.inquiry.selfie.network;

import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SubmitVerificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1(SubmitVerificationWorker submitVerificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = submitVerificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A = SubmitVerificationWorker.m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A(this.this$0, null, null, null, this);
        return m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A : new Result(m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A);
    }
}
