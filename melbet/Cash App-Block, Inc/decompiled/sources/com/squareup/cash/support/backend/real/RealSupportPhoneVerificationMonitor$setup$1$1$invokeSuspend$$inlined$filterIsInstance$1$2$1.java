package com.squareup.cash.support.backend.real;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(FlowKt__MergeKt$flattenConcat$1$1 flowKt__MergeKt$flattenConcat$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
