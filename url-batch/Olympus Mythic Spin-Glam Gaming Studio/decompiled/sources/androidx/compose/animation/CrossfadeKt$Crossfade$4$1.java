package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Crossfade.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CrossfadeKt$Crossfade$4$1 extends Lambda implements Function2 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function3 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ Transition<Object> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$4$1(Transition<Object> transition, int i, FiniteAnimationSpec<Float> finiteAnimationSpec, Object obj, Function3 function3) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = obj;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Transition<Object> transition = this.$this_Crossfade;
            final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
            Function3 function3 = new Function3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Object>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Object> animateFloat, @Nullable Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(438406499);
                    FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpec2;
                }
            };
            Object obj = this.$stateForContent;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            composer.startReplaceableGroup(-142660079);
            Object currentState = transition.getCurrentState();
            composer.startReplaceableGroup(-438678252);
            float f = Intrinsics.areEqual(currentState, obj) ? 1.0f : 0.0f;
            composer.endReplaceableGroup();
            Float valueOf = Float.valueOf(f);
            Object targetState = transition.getTargetState();
            composer.startReplaceableGroup(-438678252);
            float f2 = Intrinsics.areEqual(targetState, obj) ? 1.0f : 0.0f;
            composer.endReplaceableGroup();
            final State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, "FloatAnimation", composer, i2 & 14);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(createTransitionAnimation);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((GraphicsLayerScope) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                        float m58invoke$lambda1;
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        m58invoke$lambda1 = CrossfadeKt$Crossfade$4$1.m58invoke$lambda1(createTransitionAnimation);
                        graphicsLayer.setAlpha(m58invoke$lambda1);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
            Function3 function32 = this.$content;
            Object obj2 = this.$stateForContent;
            int i3 = this.$$dirty;
            composer.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(graphicsLayer);
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer);
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-222715758);
            function32.invoke(obj2, composer, Integer.valueOf((i3 >> 9) & 112));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final float m58invoke$lambda1(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
