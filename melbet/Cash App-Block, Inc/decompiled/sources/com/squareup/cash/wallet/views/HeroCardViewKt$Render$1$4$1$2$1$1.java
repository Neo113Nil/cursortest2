package com.squareup.cash.wallet.views;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$4$1$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $cardEnabled;
    public final /* synthetic */ boolean $isPressed;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean $showPrepurchaseContourText;
    public final /* synthetic */ InteractiveCardState $this_with;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$4$1$2$1$1(InteractiveCardState interactiveCardState, boolean z, boolean z2, boolean z3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_with = interactiveCardState;
        this.$isPressed = z;
        this.$cardEnabled = z2;
        this.$showPrepurchaseContourText = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new HeroCardViewKt$Render$1$4$1$2$1$1(this.$this_with, this.$isPressed, this.$cardEnabled, this.$showPrepurchaseContourText, continuation, 0);
            default:
                return new HeroCardViewKt$Render$1$4$1$2$1$1(this.$this_with, this.$isPressed, this.$cardEnabled, this.$showPrepurchaseContourText, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HeroCardViewKt$Render$1$4$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.$showPrepurchaseContourText;
        boolean z2 = this.$cardEnabled;
        boolean z3 = this.$isPressed;
        InteractiveCardState interactiveCardState = this.$this_with;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (InteractiveCardState.animateCardTranslation$default(interactiveCardState, z3, z2, z, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z4 = z3 || !z2 || z;
                    this.label = 1;
                    if (interactiveCardState.animateDimmer(z4, false, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
