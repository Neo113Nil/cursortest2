package com.squareup.cash.wallet.views;

import android.os.Handler;
import android.os.Looper;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CardTransitionKt$sceneCache$4$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function0 $onGraphicsError;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardTransitionKt$sceneCache$4$1$1(Function0 function0, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onGraphicsError = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function0 function0 = this.$onGraphicsError;
        switch (i) {
            case 0:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 0);
            case 1:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 1);
            case 2:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 2);
            case 3:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 3);
            case 4:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 4);
            default:
                return new CardTransitionKt$sceneCache$4$1$1(function0, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardTransitionKt$sceneCache$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.$onGraphicsError;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function0.invoke();
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function0.invoke();
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                new Handler(Looper.getMainLooper()).post(new P5$$ExternalSyntheticLambda0(5, function0));
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function0.invoke();
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function0.invoke();
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
