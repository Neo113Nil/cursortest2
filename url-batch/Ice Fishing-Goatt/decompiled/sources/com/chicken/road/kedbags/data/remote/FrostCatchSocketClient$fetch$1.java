package com.chicken.road.kedbags.data.remote;

import androidx.core.view.MotionEventCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FrostCatchSocketClient.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.remote.FrostCatchSocketClient", f = "FrostCatchSocketClient.kt", i = {0}, l = {MotionEventCompat.AXIS_GENERIC_8}, m = "fetch", n = {"frame"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class FrostCatchSocketClient$fetch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrostCatchSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrostCatchSocketClient$fetch$1(FrostCatchSocketClient frostCatchSocketClient, Continuation<? super FrostCatchSocketClient$fetch$1> continuation) {
        super(continuation);
        this.this$0 = frostCatchSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetch(null, this);
    }
}
