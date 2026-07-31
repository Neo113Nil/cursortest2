package com.rnstartiosdk;

import android.util.Log;
import com.rnstartiosdk.RNStartIoBanner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RNStartIoBanner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rnstartiosdk.RNStartIoBanner$onViewDisappear$1", f = "RNStartIoBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RNStartIoBanner$onViewDisappear$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RNStartIoBanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RNStartIoBanner$onViewDisappear$1(RNStartIoBanner rNStartIoBanner, Continuation<? super RNStartIoBanner$onViewDisappear$1> continuation) {
        super(2, continuation);
        this.this$0 = rNStartIoBanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RNStartIoBanner$onViewDisappear$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RNStartIoBanner$onViewDisappear$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RNStartIoBanner.Companion companion;
        CustomView customView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                customView = this.this$0.customView;
                customView.removeAllViews();
                this.this$0.getOnDisappear().invoke();
            } catch (Throwable th) {
                companion = RNStartIoBanner.Companion;
                Log.e(companion.getLOG_TAG(), "Failed to drop banner ad!", th);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
