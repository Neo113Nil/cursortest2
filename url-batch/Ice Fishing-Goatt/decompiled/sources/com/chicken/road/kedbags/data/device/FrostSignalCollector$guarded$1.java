package com.chicken.road.kedbags.data.device;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FrostSignalCollector.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.device.FrostSignalCollector", f = "FrostSignalCollector.kt", i = {0}, l = {72}, m = "guarded", n = {"block"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class FrostSignalCollector$guarded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrostSignalCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrostSignalCollector$guarded$1(FrostSignalCollector frostSignalCollector, Continuation<? super FrostSignalCollector$guarded$1> continuation) {
        super(continuation);
        this.this$0 = frostSignalCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object guarded;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        guarded = this.this$0.guarded(null, this);
        return guarded;
    }
}
