package com.squareup.cash.storage;

import com.squareup.cash.util.cache.Cache;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1 extends ContinuationImpl {
    public StorageLinkState L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Cache.AnonymousClass1.C00671 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1(Cache.AnonymousClass1.C00671 c00671, Continuation continuation) {
        super(continuation);
        this.this$0 = c00671;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((StorageLinkState) null, (Continuation) this);
    }
}
