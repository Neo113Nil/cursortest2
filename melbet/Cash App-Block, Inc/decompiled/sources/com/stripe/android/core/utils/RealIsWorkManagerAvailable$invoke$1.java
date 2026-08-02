package com.stripe.android.core.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealIsWorkManagerAvailable$invoke$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealIsWorkManagerAvailable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIsWorkManagerAvailable$invoke$1(RealIsWorkManagerAvailable realIsWorkManagerAvailable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realIsWorkManagerAvailable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(this);
    }
}
