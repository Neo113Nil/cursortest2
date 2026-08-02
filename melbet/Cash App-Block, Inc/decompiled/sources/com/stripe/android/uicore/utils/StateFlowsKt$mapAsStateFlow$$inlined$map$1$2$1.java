package com.stripe.android.uicore.utils;

import com.squareup.cash.work.tinygraph.BaseRepositoryKt$events$$inlined$filter$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseRepositoryKt$events$$inlined$filter$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1(BaseRepositoryKt$events$$inlined$filter$1$2 baseRepositoryKt$events$$inlined$filter$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = baseRepositoryKt$events$$inlined$filter$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
