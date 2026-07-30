package com.chicken.road.cerman.fixs.roost;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RoostGate.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostGate", f = "RoostGate.kt", i = {}, l = {15}, m = "decide", n = {}, s = {})
/* loaded from: classes3.dex */
final class RoostGate$decide$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoostGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostGate$decide$1(RoostGate roostGate, Continuation<? super RoostGate$decide$1> continuation) {
        super(continuation);
        this.this$0 = roostGate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decide(this);
    }
}
