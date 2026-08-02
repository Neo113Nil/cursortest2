package com.stripe.android.uicore.utils;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultProduceStateScope$awaitDispose$1 extends ContinuationImpl {
    public Function0 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultProduceStateScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultProduceStateScope$awaitDispose$1(DefaultProduceStateScope defaultProduceStateScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultProduceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.awaitDispose(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
