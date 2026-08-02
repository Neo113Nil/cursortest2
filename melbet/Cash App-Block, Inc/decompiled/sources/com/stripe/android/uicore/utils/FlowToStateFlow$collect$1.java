package com.stripe.android.uicore.utils;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FlowToStateFlow$collect$1 extends ContinuationImpl {
    public Job L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowToStateFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowToStateFlow$collect$1(FlowToStateFlow flowToStateFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = flowToStateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collect(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
