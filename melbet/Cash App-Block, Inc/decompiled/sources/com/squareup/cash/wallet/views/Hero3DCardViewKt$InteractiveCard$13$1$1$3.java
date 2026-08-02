package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$13$1$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineScope $$this$LaunchedEffect;
    public final /* synthetic */ MutableState $animationState$delegate;
    public final /* synthetic */ PlatformHapticFeedback $hapticFeedback;
    public final /* synthetic */ Animatable $lockShake;
    public final /* synthetic */ MutableSharedFlow $lockedDragInterrupt;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$13$1$1$3(MutableSharedFlow mutableSharedFlow, PlatformHapticFeedback platformHapticFeedback, CoroutineScope coroutineScope, Animatable animatable, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$lockedDragInterrupt = mutableSharedFlow;
        this.$hapticFeedback = platformHapticFeedback;
        this.$$this$LaunchedEffect = coroutineScope;
        this.$lockShake = animatable;
        this.$animationState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$13$1$1$3(this.$lockedDragInterrupt, this.$hapticFeedback, this.$$this$LaunchedEffect, this.$lockShake, this.$animationState$delegate, continuation, 0);
            default:
                return new Hero3DCardViewKt$InteractiveCard$13$1$1$3(this.$lockedDragInterrupt, this.$hapticFeedback, this.$$this$LaunchedEffect, this.$lockShake, this.$animationState$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
            case 0:
                ((Hero3DCardViewKt$InteractiveCard$13$1$1$3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            default:
                ((Hero3DCardViewKt$InteractiveCard$13$1$1$3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(new com.squareup.cash.wallet.views.InteractiveCardState$shimmerAnimation$2(r14, null, 0), r13) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r6, r13) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(new com.squareup.cash.wallet.views.InteractiveCardState$shimmerAnimation$2(r14, null, 0), r13) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r6, r13) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009e -> B:26:0x0072). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$animationState$delegate;
        Animatable animatable = this.$lockShake;
        CoroutineScope coroutineScope = this.$$this$LaunchedEffect;
        PlatformHapticFeedback platformHapticFeedback = this.$hapticFeedback;
        MutableSharedFlow mutableSharedFlow = this.$lockedDragInterrupt;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
                        JobKt.launch$default(coroutineScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, null, 12), 3);
                        float[] fArr = Hero3DCardViewKt.X_AXIS;
                        InteractiveCardState interactiveCardState = (InteractiveCardState) mutableState.getValue();
                        this.label = 2;
                        interactiveCardState.getClass();
                        break;
                    } else if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
                        JobKt.launch$default(coroutineScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, null, 10), 3);
                        Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                        InteractiveCardState interactiveCardState2 = (InteractiveCardState) mutableState.getValue();
                        this.label = 2;
                        interactiveCardState2.getClass();
                        break;
                    } else if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                break;
        }
    }
}
