package com.chicken.road.kedbags.data.remote;

import androidx.core.view.MotionEventCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FrostCatchSocketClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/kedbags/data/remote/FrostCatchDto;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.remote.FrostCatchSocketClient$fetch$2", f = "FrostCatchSocketClient.kt", i = {}, l = {MotionEventCompat.AXIS_GENERIC_9}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class FrostCatchSocketClient$fetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FrostCatchDto>, Object> {
    final /* synthetic */ Map<String, String> $frame;
    int label;
    final /* synthetic */ FrostCatchSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrostCatchSocketClient$fetch$2(FrostCatchSocketClient frostCatchSocketClient, Map<String, String> map, Continuation<? super FrostCatchSocketClient$fetch$2> continuation) {
        super(2, continuation);
        this.this$0 = frostCatchSocketClient;
        this.$frame = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrostCatchSocketClient$fetch$2(this.this$0, this.$frame, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FrostCatchDto> continuation) {
        return ((FrostCatchSocketClient$fetch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitFrame;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        awaitFrame = this.this$0.awaitFrame(this.$frame, this);
        return awaitFrame == coroutine_suspended ? coroutine_suspended : awaitFrame;
    }
}
