package com.squareup.cash.threedsdataonly.backend.real;

import com.squareup.cash.threedsdataonly.backend.real.ThreeDsAuthenticationWorker$setup$1$1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ThreeDsAuthenticationWorker$setup$1$1$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThreeDsAuthenticationWorker$setup$1$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsAuthenticationWorker$setup$1$1$2$emit$1(ThreeDsAuthenticationWorker$setup$1$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((List) null, (Continuation) this);
    }
}
