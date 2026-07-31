package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aQ\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a^\u0010\u0017\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001d\u0010!\u001a\u00020\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010#\"\u0017\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010 \"\u001d\u0010%\u001a\u00020\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010#\"\u0017\u0010'\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010 \"\u0017\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010 \"\u0017\u0010)\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "MenuElevation", "F", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m2507constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m2507constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m2507constructorimpl(280);

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuContent(final MutableTransitionState expandedStates, final MutableState transformOriginState, Modifier modifier, final Function3 content, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1164283597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(expandedStates) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(transformOriginState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                Transition updateTransition = TransitionKt.updateTransition(expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i3 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }

                    @ComposableTarget
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> animateFloat, @Nullable Composer composer2, int i5) {
                        TweenSpec tween$default;
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(365249092);
                        if (animateFloat.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                            tween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                        }
                        composer2.endReplaceableGroup();
                        return tween$default;
                    }
                };
                startRestartGroup.startReplaceableGroup(1399891485);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                startRestartGroup.startReplaceableGroup(1847725064);
                boolean booleanValue = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1958825495);
                float f = !booleanValue ? 1.0f : 0.8f;
                startRestartGroup.endReplaceableGroup();
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1958825495);
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                startRestartGroup.endReplaceableGroup();
                final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) menuKt$DropdownMenuContent$scale$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }

                    @ComposableTarget
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> animateFloat, @Nullable Composer composer2, int i5) {
                        TweenSpec tween$default;
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(782718552);
                        if (animateFloat.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                            tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                        }
                        composer2.endReplaceableGroup();
                        return tween$default;
                    }
                };
                startRestartGroup.startReplaceableGroup(1399891485);
                TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                startRestartGroup.startReplaceableGroup(1847725064);
                boolean booleanValue3 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1541356035);
                float f3 = !booleanValue3 ? 1.0f : 0.0f;
                startRestartGroup.endReplaceableGroup();
                Float valueOf2 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1541356035);
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                startRestartGroup.endReplaceableGroup();
                final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) menuKt$DropdownMenuContent$alpha$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1618982084);
                changed = startRestartGroup.changed(createTransitionAnimation) | startRestartGroup.changed(createTransitionAnimation2) | startRestartGroup.changed(transformOriginState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((GraphicsLayerScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                            float m896DropdownMenuContent$lambda1;
                            float m896DropdownMenuContent$lambda12;
                            float m897DropdownMenuContent$lambda3;
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            m896DropdownMenuContent$lambda1 = MenuKt.m896DropdownMenuContent$lambda1(createTransitionAnimation);
                            graphicsLayer.setScaleX(m896DropdownMenuContent$lambda1);
                            m896DropdownMenuContent$lambda12 = MenuKt.m896DropdownMenuContent$lambda1(createTransitionAnimation);
                            graphicsLayer.setScaleY(m896DropdownMenuContent$lambda12);
                            m897DropdownMenuContent$lambda3 = MenuKt.m897DropdownMenuContent$lambda3(createTransitionAnimation2);
                            graphicsLayer.setAlpha(m897DropdownMenuContent$lambda3);
                            graphicsLayer.mo1498setTransformOrigin__ExYCQ(((TransformOrigin) transformOriginState.getValue()).getPackedValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
                float f5 = MenuElevation;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -242468534, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i5) {
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m336paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            Function3 function3 = content;
                            int i6 = i3 & 7168;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion2.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(verticalScroll$default);
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                modifier3 = modifier4;
                CardKt.m764CardFjzlyU(graphicsLayer, null, 0L, 0L, null, f5, composableLambda, startRestartGroup, 1769472, 30);
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    MenuKt.DropdownMenuContent(expandedStates, transformOriginState, modifier3, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        Transition updateTransition2 = TransitionKt.updateTransition(expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i3 & 14), 0);
        MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$22 = new Function3() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @ComposableTarget
            @Composable
            @NotNull
            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> animateFloat, @Nullable Composer composer2, int i5) {
                TweenSpec tween$default;
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceableGroup(365249092);
                if (animateFloat.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                    tween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                } else {
                    tween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                }
                composer2.endReplaceableGroup();
                return tween$default;
            }
        };
        startRestartGroup.startReplaceableGroup(1399891485);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        TwoWayConverter vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
        startRestartGroup.startReplaceableGroup(1847725064);
        boolean booleanValue5 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1958825495);
        if (!booleanValue5) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf3 = Float.valueOf(f);
        boolean booleanValue22 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1958825495);
        if (booleanValue22) {
        }
        startRestartGroup.endReplaceableGroup();
        final State<Float> createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf3, Float.valueOf(f2), (FiniteAnimationSpec) menuKt$DropdownMenuContent$scale$22.invoke((Object) updateTransition2.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter3, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$22 = new Function3() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @ComposableTarget
            @Composable
            @NotNull
            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> animateFloat, @Nullable Composer composer2, int i5) {
                TweenSpec tween$default;
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceableGroup(782718552);
                if (animateFloat.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                    tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                } else {
                    tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                }
                composer2.endReplaceableGroup();
                return tween$default;
            }
        };
        startRestartGroup.startReplaceableGroup(1399891485);
        TwoWayConverter vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
        startRestartGroup.startReplaceableGroup(1847725064);
        boolean booleanValue32 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1541356035);
        if (!booleanValue32) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf22 = Float.valueOf(f3);
        boolean booleanValue42 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1541356035);
        if (booleanValue42) {
        }
        startRestartGroup.endReplaceableGroup();
        final State<Float> createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf22, Float.valueOf(f4), (FiniteAnimationSpec) menuKt$DropdownMenuContent$alpha$22.invoke((Object) updateTransition2.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1618982084);
        changed = startRestartGroup.changed(createTransitionAnimation3) | startRestartGroup.changed(createTransitionAnimation22) | startRestartGroup.changed(transformOriginState);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GraphicsLayerScope graphicsLayer2) {
                float m896DropdownMenuContent$lambda1;
                float m896DropdownMenuContent$lambda12;
                float m897DropdownMenuContent$lambda3;
                Intrinsics.checkNotNullParameter(graphicsLayer2, "$this$graphicsLayer");
                m896DropdownMenuContent$lambda1 = MenuKt.m896DropdownMenuContent$lambda1(createTransitionAnimation3);
                graphicsLayer2.setScaleX(m896DropdownMenuContent$lambda1);
                m896DropdownMenuContent$lambda12 = MenuKt.m896DropdownMenuContent$lambda1(createTransitionAnimation3);
                graphicsLayer2.setScaleY(m896DropdownMenuContent$lambda12);
                m897DropdownMenuContent$lambda3 = MenuKt.m897DropdownMenuContent$lambda3(createTransitionAnimation22);
                graphicsLayer2.setAlpha(m897DropdownMenuContent$lambda3);
                graphicsLayer2.mo1498setTransformOrigin__ExYCQ(((TransformOrigin) transformOriginState.getValue()).getPackedValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue);
        float f52 = MenuElevation;
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -242468534, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer2, int i5) {
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m336paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    Function3 function3 = content;
                    int i6 = i3 & 7168;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion22.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(verticalScroll$default);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion22.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion22.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion22.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion22.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        modifier3 = modifier4;
        CardKt.m764CardFjzlyU(graphicsLayer2, null, 0L, 0L, null, f52, composableLambda2, startRestartGroup, 1769472, 30);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItemContent(final Function0 onClick, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        final int i7;
        MutableInteractionSource mutableInteractionSource3;
        final PaddingValues paddingValues3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(87134531);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            i8 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                            i7 = i3;
                            if ((374491 & i7) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i4 == 0 ? true : z2;
                                PaddingValues dropdownMenuItemContentPadding = i5 == 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues2;
                                if (i6 == 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                PaddingValues paddingValues4 = dropdownMenuItemContentPadding;
                                Modifier padding = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues4);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                startRestartGroup.startReplaceableGroup(693286680);
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(padding);
                                if (startRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                startRestartGroup.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                startRestartGroup.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                startRestartGroup.startReplaceableGroup(-678309503);
                                final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceableGroup(1664959143);
                                final int i10 = 6;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i11) {
                                        float disabled;
                                        if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                            if (z5) {
                                                composer2.startReplaceableGroup(-1945695285);
                                                disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                                            } else {
                                                composer2.startReplaceableGroup(-1945695262);
                                                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                                            }
                                            composer2.endReplaceableGroup();
                                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                            final Function3 function3 = content;
                                            final RowScope rowScope = rowScopeInstance;
                                            final int i12 = i10;
                                            final int i13 = i7;
                                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget
                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i14) {
                                                    if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                                    }
                                                }
                                            }), composer2, 56);
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, 48);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                paddingValues3 = paddingValues4;
                                modifier2 = modifier3;
                                z3 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    MenuKt.DropdownMenuItemContent(Function0.this, modifier2, z3, paddingValues3, mutableInteractionSource4, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i8;
                        i7 = i3;
                        if ((374491 & i7) == 74898) {
                        }
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        PaddingValues paddingValues42 = dropdownMenuItemContentPadding;
                        Modifier padding2 = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues42);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor2 = companion2.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(padding2);
                        if (startRestartGroup.getApplier() == null) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                        Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-678309503);
                        final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(1664959143);
                        final int i102 = 6;
                        final boolean z52 = z4;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i11) {
                                float disabled;
                                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                    if (z52) {
                                        composer2.startReplaceableGroup(-1945695285);
                                        disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                                    } else {
                                        composer2.startReplaceableGroup(-1945695262);
                                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                    final Function3 function3 = content;
                                    final RowScope rowScope = rowScopeInstance2;
                                    final int i12 = i102;
                                    final int i13 = i7;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i14) {
                                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                            }
                                        }
                                    }), composer2, 56);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, 48);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        paddingValues3 = paddingValues42;
                        modifier2 = modifier3;
                        z3 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i8;
                    i7 = i3;
                    if ((374491 & i7) == 74898) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    PaddingValues paddingValues422 = dropdownMenuItemContentPadding;
                    Modifier padding22 = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues422);
                    Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                    startRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0 constructor22 = companion22.getConstructor();
                    Function3 materializerOf22 = LayoutKt.materializerOf(padding22);
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl22, rowMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-678309503);
                    final RowScope rowScopeInstance22 = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(1664959143);
                    final int i1022 = 6;
                    final boolean z522 = z4;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11) {
                            float disabled;
                            if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                if (z522) {
                                    composer2.startReplaceableGroup(-1945695285);
                                    disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                                } else {
                                    composer2.startReplaceableGroup(-1945695262);
                                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                                }
                                composer2.endReplaceableGroup();
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                final Function3 function3 = content;
                                final RowScope rowScope = rowScopeInstance22;
                                final int i12 = i1022;
                                final int i13 = i7;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i14) {
                                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                        }
                                    }
                                }), composer2, 56);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 48);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    paddingValues3 = paddingValues422;
                    modifier2 = modifier3;
                    z3 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i8;
                i7 = i3;
                if ((374491 & i7) == 74898) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                PaddingValues paddingValues4222 = dropdownMenuItemContentPadding;
                Modifier padding222 = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues4222);
                Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                Function0 constructor222 = companion222.getConstructor();
                Function3 materializerOf222 = LayoutKt.materializerOf(padding222);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl222, rowMeasurePolicy222, companion222.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                final RowScope rowScopeInstance222 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1664959143);
                final int i10222 = 6;
                final boolean z5222 = z4;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11) {
                        float disabled;
                        if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                            if (z5222) {
                                composer2.startReplaceableGroup(-1945695285);
                                disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                            } else {
                                composer2.startReplaceableGroup(-1945695262);
                                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                            final Function3 function3 = content;
                            final RowScope rowScope = rowScopeInstance222;
                            final int i12 = i10222;
                            final int i13 = i7;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i14) {
                                    if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                    }
                                }
                            }), composer2, 56);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 48);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                paddingValues3 = paddingValues4222;
                modifier2 = modifier3;
                z3 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i8;
            i7 = i3;
            if ((374491 & i7) == 74898) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            PaddingValues paddingValues42222 = dropdownMenuItemContentPadding;
            Modifier padding2222 = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues42222);
            Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
            Function0 constructor2222 = companion2222.getConstructor();
            Function3 materializerOf2222 = LayoutKt.materializerOf(padding2222);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2222, rowMeasurePolicy2222, companion2222.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2222, density2222, companion2222.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2222, layoutDirection2222, companion2222.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2222, viewConfiguration2222, companion2222.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            final RowScope rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1664959143);
            final int i102222 = 6;
            final boolean z52222 = z4;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11) {
                    float disabled;
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        if (z52222) {
                            composer2.startReplaceableGroup(-1945695285);
                            disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                        } else {
                            composer2.startReplaceableGroup(-1945695262);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                        final Function3 function3 = content;
                        final RowScope rowScope = rowScopeInstance2222;
                        final int i12 = i102222;
                        final int i13 = i7;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                }
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            paddingValues3 = paddingValues42222;
            modifier2 = modifier3;
            z3 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i8;
        i7 = i3;
        if ((374491 & i7) == 74898) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        PaddingValues paddingValues422222 = dropdownMenuItemContentPadding;
        Modifier padding22222 = PaddingKt.padding(SizeKt.m361sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m170clickableO2vRcR0$default(modifier3, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z4, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues422222);
        Alignment.Vertical centerVertically22222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22222, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22222 = ComposeUiNode.INSTANCE;
        Function0 constructor22222 = companion22222.getConstructor();
        Function3 materializerOf22222 = LayoutKt.materializerOf(padding22222);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22222 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22222, rowMeasurePolicy22222, companion22222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22222, density22222, companion22222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22222, layoutDirection22222, companion22222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22222, viewConfiguration22222, companion22222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        final RowScope rowScopeInstance22222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1664959143);
        final int i1022222 = 6;
        final boolean z522222 = z4;
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(startRestartGroup, 1190489496, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer2, int i11) {
                float disabled;
                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                    if (z522222) {
                        composer2.startReplaceableGroup(-1945695285);
                        disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                    } else {
                        composer2.startReplaceableGroup(-1945695262);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                    final Function3 function3 = content;
                    final RowScope rowScope = rowScopeInstance22222;
                    final int i12 = i1022222;
                    final int i13 = i7;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new Function2() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                Function3.this.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                            }
                        }
                    }), composer2, 56);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 48);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        paddingValues3 = paddingValues422222;
        modifier2 = modifier3;
        z3 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 8;
        MenuElevation = Dp.m2507constructorimpl(f);
        float f2 = 48;
        MenuVerticalMargin = Dp.m2507constructorimpl(f2);
        DropdownMenuVerticalPadding = Dp.m2507constructorimpl(f);
        DropdownMenuItemDefaultMinHeight = Dp.m2507constructorimpl(f2);
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect parentBounds, IntRect menuBounds) {
        float max;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float f = 1.0f;
        if (menuBounds.getLeft() < parentBounds.getRight()) {
            if (menuBounds.getRight() <= parentBounds.getLeft()) {
                max = 1.0f;
            } else if (menuBounds.getWidth() != 0) {
                max = (((Math.max(parentBounds.getLeft(), menuBounds.getLeft()) + Math.min(parentBounds.getRight(), menuBounds.getRight())) / 2) - menuBounds.getLeft()) / menuBounds.getWidth();
            }
            if (menuBounds.getTop() < parentBounds.getBottom()) {
                if (menuBounds.getBottom() > parentBounds.getTop()) {
                    if (menuBounds.getHeight() != 0) {
                        f = (((Math.max(parentBounds.getTop(), menuBounds.getTop()) + Math.min(parentBounds.getBottom(), menuBounds.getBottom())) / 2) - menuBounds.getTop()) / menuBounds.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(max, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(max, f);
        }
        max = 0.0f;
        if (menuBounds.getTop() < parentBounds.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(max, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-1, reason: not valid java name */
    public static final float m896DropdownMenuContent$lambda1(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-3, reason: not valid java name */
    public static final float m897DropdownMenuContent$lambda3(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
