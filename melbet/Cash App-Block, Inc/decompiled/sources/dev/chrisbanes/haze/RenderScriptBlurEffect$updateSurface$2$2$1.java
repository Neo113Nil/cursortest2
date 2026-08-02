package dev.chrisbanes.haze;

import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardScene$setIconIndicatorRadius$1;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandPoseConfig;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.PageTagSlot;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RenderScriptBlurEffect$updateSurface$2$2$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ float $blurRadius;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $rs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RenderScriptBlurEffect$updateSurface$2$2$1(Object obj, float f, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$rs = obj;
        this.$blurRadius = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$rs;
        switch (i) {
            case 0:
                return new RenderScriptBlurEffect$updateSurface$2$2$1((RenderScriptContext) obj2, this.$blurRadius, continuation, 0);
            case 1:
                return new RenderScriptBlurEffect$updateSurface$2$2$1((TagPoseController) obj2, this.$blurRadius, continuation, 1);
            case 2:
                RenderScriptBlurEffect$updateSurface$2$2$1 renderScriptBlurEffect$updateSurface$2$2$1 = new RenderScriptBlurEffect$updateSurface$2$2$1((MutableState) obj2, continuation);
                renderScriptBlurEffect$updateSurface$2$2$1.$blurRadius = ((Number) obj).floatValue();
                return renderScriptBlurEffect$updateSurface$2$2$1;
            default:
                return new RenderScriptBlurEffect$updateSurface$2$2$1((PageTagSlot) obj2, this.$blurRadius, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RenderScriptBlurEffect$updateSurface$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RenderScriptBlurEffect$updateSurface$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RenderScriptBlurEffect$updateSurface$2$2$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RenderScriptBlurEffect$updateSurface$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$rs;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RenderScriptContext renderScriptContext = (RenderScriptContext) obj2;
                float f = this.$blurRadius;
                Allocation allocation = renderScriptContext.outputAlloc;
                ScriptIntrinsicBlur scriptIntrinsicBlur = renderScriptContext.blurScript;
                if (!renderScriptContext.isDestroyed) {
                    if (f > 25.0f) {
                        f = 25.0f;
                    }
                    scriptIntrinsicBlur.setRadius(f);
                    scriptIntrinsicBlur.forEach(allocation);
                    if (!renderScriptContext.isDestroyed) {
                        allocation.copyTo(renderScriptContext.outputBitmap);
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TagPoseController tagPoseController = (TagPoseController) obj2;
                WandPoseConfig config = tagPoseController.getConfig();
                float f2 = 0.012f / this.$blurRadius;
                tagPoseController.setConfig(WandPoseConfig.copy$default(config, f2, f2, -1, -12582913));
                break;
            case 2:
                float f3 = this.$blurRadius;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardScene cardScene = (CardScene) ((MutableState) obj2).getValue();
                if (cardScene != null) {
                    cardScene.currentIndicatorRadius = f3;
                    cardScene.glLauncher.launch(new CardScene$setIconIndicatorRadius$1(cardScene, f3, null, 0));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TagPoseController tagPoseController2 = ((PageTagSlot) obj2).controller;
                WandPoseConfig config2 = tagPoseController2.getConfig();
                float f4 = 0.012f / this.$blurRadius;
                tagPoseController2.setConfig(WandPoseConfig.copy$default(config2, f4, f4, -1, -12582913));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderScriptBlurEffect$updateSurface$2$2$1(MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$rs = mutableState;
    }
}
