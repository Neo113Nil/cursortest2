package com.squareup.util.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class CoroutinesKt$withTimeoutOrThrow$1 extends ContinuationImpl {
    public Function0 L$0;
    public int label;
    public /* synthetic */ Object result;

    public CoroutinesKt$withTimeoutOrThrow$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return StateFlowKt.m3995withTimeoutOrThrowrnQQ1Ag(0L, null, null, this);
    }
}
