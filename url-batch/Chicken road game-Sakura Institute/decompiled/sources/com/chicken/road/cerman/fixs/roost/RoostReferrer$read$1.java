package com.chicken.road.cerman.fixs.roost;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RoostReferrer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostReferrer", f = "RoostReferrer.kt", i = {}, l = {13}, m = "read", n = {}, s = {})
/* loaded from: classes3.dex */
final class RoostReferrer$read$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoostReferrer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostReferrer$read$1(RoostReferrer roostReferrer, Continuation<? super RoostReferrer$read$1> continuation) {
        super(continuation);
        this.this$0 = roostReferrer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(0L, this);
    }
}
