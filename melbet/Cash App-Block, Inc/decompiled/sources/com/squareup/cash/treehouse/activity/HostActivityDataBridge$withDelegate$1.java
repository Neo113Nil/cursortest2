package com.squareup.cash.treehouse.activity;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class HostActivityDataBridge$withDelegate$1 extends ContinuationImpl {
    public SuspendLambda L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HostActivityDataBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostActivityDataBridge$withDelegate$1(HostActivityDataBridge hostActivityDataBridge, Continuation continuation) {
        super(continuation);
        this.this$0 = hostActivityDataBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.withDelegate(null, this);
    }
}
