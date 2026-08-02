package dev.chrisbanes.haze;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class RenderScriptBlurEffect$drawEffect$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref$FloatRef $blurRadiusPx;
    public final /* synthetic */ GraphicsLayer $layer;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RenderScriptBlurEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RenderScriptBlurEffect$drawEffect$2$1(RenderScriptBlurEffect renderScriptBlurEffect, GraphicsLayer graphicsLayer, Ref$FloatRef ref$FloatRef, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = renderScriptBlurEffect;
        this.$layer = graphicsLayer;
        this.$blurRadiusPx = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RenderScriptBlurEffect$drawEffect$2$1(this.this$0, this.$layer, this.$blurRadiusPx, continuation, 0);
            default:
                return new RenderScriptBlurEffect$drawEffect$2$1(this.this$0, this.$layer, this.$blurRadiusPx, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RenderScriptBlurEffect$drawEffect$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Ref$FloatRef ref$FloatRef = this.$blurRadiusPx;
        RenderScriptBlurEffect renderScriptBlurEffect = this.this$0;
        GraphicsLayer graphicsLayer = this.$layer;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float f = ref$FloatRef.element;
                    this.label = 1;
                    if (RenderScriptBlurEffect.access$updateSurface(renderScriptBlurEffect, graphicsLayer, f, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((GraphicsContext) DepthSortedSetKt.currentValueOf(renderScriptBlurEffect.node, CompositionLocalsKt.LocalGraphicsContext)).releaseGraphicsLayer(graphicsLayer);
                break;
            default:
                HazeEffectNode hazeEffectNode = renderScriptBlurEffect.node;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float f2 = ref$FloatRef.element;
                    this.label = 1;
                    if (RenderScriptBlurEffect.access$updateSurface(renderScriptBlurEffect, graphicsLayer, f2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext)).releaseGraphicsLayer(graphicsLayer);
                if (renderScriptBlurEffect.drawSkipped) {
                    DepthSortedSetKt.invalidateDraw(hazeEffectNode);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
