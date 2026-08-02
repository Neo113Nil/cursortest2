package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$fadeIn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $cardAlpha;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ float F$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$fadeIn$2(Animatable animatable, float f, Continuation continuation) {
        super(2, continuation);
        this.$cardAlpha = animatable;
        this.F$0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                CoreInteractiveCardKt$fadeIn$2 coreInteractiveCardKt$fadeIn$2 = new CoreInteractiveCardKt$fadeIn$2(this.$cardAlpha, continuation);
                coreInteractiveCardKt$fadeIn$2.F$0 = ((Number) obj).floatValue();
                return coreInteractiveCardKt$fadeIn$2;
            default:
                return new CoreInteractiveCardKt$fadeIn$2(this.$cardAlpha, this.F$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CoreInteractiveCardKt$fadeIn$2) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CoreInteractiveCardKt$fadeIn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float f = this.F$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f2 = new Float(f);
                    this.F$0 = f;
                    this.label = 1;
                    if (this.$cardAlpha.snapTo(f2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f3 = new Float(-this.F$0);
                    TweenSpec tween$default = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, ManagedAccountSwitchLoadingContentKt.BounceYEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$cardAlpha, f3, tween$default, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$fadeIn$2(Animatable animatable, Continuation continuation) {
        super(2, continuation);
        this.$cardAlpha = animatable;
    }
}
