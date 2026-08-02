package com.squareup.cash.wallet.views;

import android.graphics.Bitmap;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3(ProduceStateScope produceStateScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$$this$produceState = produceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 = new Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3(this.$$this$produceState, continuation, 0);
                hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3.L$0 = obj;
                return hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3;
            default:
                Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$32 = new Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3(this.$$this$produceState, continuation, 1);
                hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$32.L$0 = obj;
                return hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3) create(bitmap, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.$$this$produceState;
        Bitmap bitmap = (Bitmap) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                produceStateScope.setValue(bitmap);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                produceStateScope.setValue(bitmap);
                break;
        }
        return Unit.INSTANCE;
    }
}
