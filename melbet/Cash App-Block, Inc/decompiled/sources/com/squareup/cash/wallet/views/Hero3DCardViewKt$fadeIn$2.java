package com.squareup.cash.wallet.views;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Hero3DCardViewKt$fadeIn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardModelView $cardModelView;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ float F$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$fadeIn$2(int i, CardModelView cardModelView, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardModelView = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$2 = new Hero3DCardViewKt$fadeIn$2(0, this.$cardModelView, continuation);
                hero3DCardViewKt$fadeIn$2.F$0 = ((Number) obj).floatValue();
                return hero3DCardViewKt$fadeIn$2;
            case 1:
                Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$22 = new Hero3DCardViewKt$fadeIn$2(1, this.$cardModelView, continuation);
                hero3DCardViewKt$fadeIn$22.F$0 = ((Number) obj).floatValue();
                return hero3DCardViewKt$fadeIn$22;
            case 2:
                Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$23 = new Hero3DCardViewKt$fadeIn$2(2, this.$cardModelView, continuation);
                hero3DCardViewKt$fadeIn$23.F$0 = ((Number) obj).floatValue();
                return hero3DCardViewKt$fadeIn$23;
            default:
                Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$24 = new Hero3DCardViewKt$fadeIn$2(3, this.$cardModelView, continuation);
                hero3DCardViewKt$fadeIn$24.F$0 = ((Number) obj).floatValue();
                return hero3DCardViewKt$fadeIn$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float floatValue = ((Number) obj).floatValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((Hero3DCardViewKt$fadeIn$2) create(Float.valueOf(floatValue), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardModelView cardModelView = this.$cardModelView;
        switch (i) {
            case 0:
                float f = this.F$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardModelView.setAlpha(f);
                break;
            case 1:
                float f2 = this.F$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardModelView.setIndicatorRadius(f2);
                break;
            case 2:
                float f3 = this.F$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardModelView.setTranslation$default(this.$cardModelView, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, 3, null);
                break;
            default:
                float f4 = this.F$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardModelView.setTranslation$default(this.$cardModelView, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4, 3, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
