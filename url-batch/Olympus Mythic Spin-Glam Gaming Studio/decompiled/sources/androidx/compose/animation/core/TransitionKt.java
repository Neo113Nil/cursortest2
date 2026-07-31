package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\t\u001ac\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fR\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001ao\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "updateTransition", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "S", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createDeferredAnimation", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "initialState", "childLabel", "createChildTransitionInternal", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Landroidx/compose/runtime/State;", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final Transition updateTransition(Object obj, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Transition(obj, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(obj, composer, (i & 8) | 48 | (i & 14));
        EffectsKt.DisposableEffect(transition, new Function1() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Transition<Object> transition2 = transition;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.onTransitionEnd$animation_core_release();
                    }
                };
            }
        }, composer, 6);
        composer.endReplaceableGroup();
        return transition;
    }

    public static final Transition updateTransition(MutableTransitionState transitionState, String str, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        composer.startReplaceableGroup(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transitionState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Transition(transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        EffectsKt.DisposableEffect(transition, new Function1() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Transition<Object> transition2 = transition;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.onTransitionEnd$animation_core_release();
                    }
                };
            }
        }, composer, 0);
        composer.endReplaceableGroup();
        return transition;
    }

    public static final Transition.DeferredAnimation createDeferredAnimation(final Transition transition, TwoWayConverter typeConverter, String str, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Transition.DeferredAnimation(transition, typeConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new Function1() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Transition<Object> transition2 = transition;
                final Transition<Object>.DeferredAnimation<Object, AnimationVector> deferredAnimation2 = deferredAnimation;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.removeAnimation$animation_core_release(deferredAnimation2);
                    }
                };
            }
        }, composer, 8);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    public static final Transition createChildTransitionInternal(final Transition transition, Object obj, Object obj2, String childLabel, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(childLabel, "childLabel");
        composer.startReplaceableGroup(-198307638);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Transition(new MutableTransitionState(obj), transition.getLabel() + " > " + childLabel);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition transition2 = (Transition) rememberedValue;
        EffectsKt.DisposableEffect(transition2, new Function1() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                transition.addTransition$animation_core_release(transition2);
                final Transition<Object> transition3 = transition;
                final Transition<Object> transition4 = transition2;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.removeTransition$animation_core_release(transition4);
                    }
                };
            }
        }, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(obj, obj2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(obj2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    public static final State createTransitionAnimation(final Transition transition, Object obj, Object obj2, FiniteAnimationSpec animationSpec, TwoWayConverter typeConverter, String label, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(-304821198);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Transition.TransitionAnimationState(transition, obj, AnimationStateKt.createZeroVectorFrom(typeConverter, obj2), typeConverter, label);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) rememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(obj, obj2, animationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(obj2, animationSpec);
        }
        EffectsKt.DisposableEffect(transitionAnimationState, new Function1() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                transition.addAnimation$animation_core_release(transitionAnimationState);
                final Transition<Object> transition2 = transition;
                final Transition<Object>.TransitionAnimationState<Object, AnimationVector> transitionAnimationState2 = transitionAnimationState;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.removeAnimation$animation_core_release(transitionAnimationState2);
                    }
                };
            }
        }, composer, 0);
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }
}
