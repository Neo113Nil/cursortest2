package com.squareup.cash.wallet.views;

import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1(AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
