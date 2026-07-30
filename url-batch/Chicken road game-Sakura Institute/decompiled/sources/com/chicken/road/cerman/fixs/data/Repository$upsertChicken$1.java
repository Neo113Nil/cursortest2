package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.data.Repository", f = "Repository.kt", i = {1}, l = {23, 23}, m = "upsertChicken", n = {"c"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$upsertChicken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$upsertChicken$1(Repository repository, Continuation<? super Repository$upsertChicken$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.upsertChicken(null, this);
    }
}
