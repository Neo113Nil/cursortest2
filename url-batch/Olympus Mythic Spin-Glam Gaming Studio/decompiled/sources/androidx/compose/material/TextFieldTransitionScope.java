package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\f2)\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "<init>", "()V", "Landroidx/compose/material/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/Color;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "", "content", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "Transition", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        if (r34 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017f, code lost:
    
        if (r34 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0246  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1054TransitionDTcfvLk(final InputPhase inputState, final long j, final long j2, final Function3 contentColor, final boolean z, final Function6 content, Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1988729962);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(contentColor) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Transition updateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> animateFloat, @Nullable Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-611722692);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            startRestartGroup.startReplaceableGroup(1847725064);
            InputPhase inputPhase = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i6 = iArr[inputPhase.ordinal()];
            float f4 = 0.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    f = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase2 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1158004136);
                    i3 = iArr[inputPhase2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelProgress$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }

                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> animateFloat, @Nullable Composer composer2, int i7) {
                                    FiniteAnimationSpec<Float> tween;
                                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                    composer2.startReplaceableGroup(-1079955085);
                                    InputPhase inputPhase3 = InputPhase.Focused;
                                    InputPhase inputPhase4 = InputPhase.UnfocusedEmpty;
                                    if (animateFloat.isTransitioningTo(inputPhase3, inputPhase4)) {
                                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                                    } else if (animateFloat.isTransitioningTo(inputPhase4, inputPhase3) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase4)) {
                                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                                    } else {
                                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(1399891485);
                            TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                            startRestartGroup.startReplaceableGroup(1847725064);
                            InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            i4 = iArr[inputPhase3.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase4 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1376159017);
                                i5 = iArr[inputPhase4.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i7) {
                                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-130058045);
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    long j3 = iArr[inputPhase5.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    ColorSpace m1450getColorSpaceimpl = Color.m1450getColorSpaceimpl(j3);
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    changed = startRestartGroup.changed(m1450getColorSpaceimpl);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    long j4 = iArr[inputPhase6.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    Color m1441boximpl = Color.m1441boximpl(j4);
                                    InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    long j5 = iArr[inputPhase7.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl, Color.m1441boximpl(j5), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i7) {
                                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-32667848);
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    int i7 = (i2 & 7168) | 384;
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    ColorSpace m1450getColorSpaceimpl2 = Color.m1450getColorSpaceimpl(((Color) contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i7 >> 6) & 112))).getValue());
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    changed2 = startRestartGroup.changed(m1450getColorSpaceimpl2);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl2);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    int i8 = ((3136 | ((i7 << 3) & 57344)) >> 9) & 112;
                                    State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i8)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i8)), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelContentColor$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    content.invoke(Float.valueOf(m1050Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m1441boximpl(m1052Transition_DTcfvLk$lambda5(createTransitionAnimation3)), Color.m1441boximpl(m1053Transition_DTcfvLk$lambda6(createTransitionAnimation4)), Float.valueOf(m1051Transition_DTcfvLk$lambda3(createTransitionAnimation2)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                }
                                f4 = 1.0f;
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    }

                                    @Composable
                                    @NotNull
                                    public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i72) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-130058045);
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                if (iArr[inputPhase52.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ColorSpace m1450getColorSpaceimpl3 = Color.m1450getColorSpaceimpl(j3);
                                startRestartGroup.startReplaceableGroup(-3686930);
                                changed = startRestartGroup.changed(m1450getColorSpaceimpl3);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl3);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1847725064);
                                InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                if (iArr[inputPhase62.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Color m1441boximpl2 = Color.m1441boximpl(j4);
                                InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                if (iArr[inputPhase72.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl2, Color.m1441boximpl(j5), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    }

                                    @Composable
                                    @NotNull
                                    public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i72) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-32667848);
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                int i72 = (i2 & 7168) | 384;
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                ColorSpace m1450getColorSpaceimpl22 = Color.m1450getColorSpaceimpl(((Color) contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i72 >> 6) & 112))).getValue());
                                startRestartGroup.startReplaceableGroup(-3686930);
                                changed2 = startRestartGroup.changed(m1450getColorSpaceimpl22);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl22);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.startReplaceableGroup(1847725064);
                                int i82 = ((3136 | ((i72 << 3) & 57344)) >> 9) & 112;
                                State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i82)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i82)), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelContentColor$22.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                content.invoke(Float.valueOf(m1050Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m1441boximpl(m1052Transition_DTcfvLk$lambda5(createTransitionAnimation32)), Color.m1441boximpl(m1053Transition_DTcfvLk$lambda6(createTransitionAnimation42)), Float.valueOf(m1051Transition_DTcfvLk$lambda3(createTransitionAnimation22)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                            }
                            f3 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            i5 = iArr[inputPhase42.ordinal()];
                            if (i5 != 1) {
                            }
                            f4 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), (FiniteAnimationSpec) textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }

                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i722) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-130058045);
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            if (iArr[inputPhase522.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ColorSpace m1450getColorSpaceimpl32 = Color.m1450getColorSpaceimpl(j3);
                            startRestartGroup.startReplaceableGroup(-3686930);
                            changed = startRestartGroup.changed(m1450getColorSpaceimpl32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl32);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue;
                            startRestartGroup.startReplaceableGroup(1847725064);
                            InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            if (iArr[inputPhase622.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Color m1441boximpl22 = Color.m1441boximpl(j4);
                            InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            if (iArr[inputPhase722.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl22, Color.m1441boximpl(j5), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }

                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i722) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-32667848);
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            int i722 = (i2 & 7168) | 384;
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            ColorSpace m1450getColorSpaceimpl222 = Color.m1450getColorSpaceimpl(((Color) contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i722 >> 6) & 112))).getValue());
                            startRestartGroup.startReplaceableGroup(-3686930);
                            changed2 = startRestartGroup.changed(m1450getColorSpaceimpl222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(1847725064);
                            int i822 = ((3136 | ((i722 << 3) & 57344)) >> 9) & 112;
                            State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i822)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i822)), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelContentColor$222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            content.invoke(Float.valueOf(m1050Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m1441boximpl(m1052Transition_DTcfvLk$lambda5(createTransitionAnimation322)), Color.m1441boximpl(m1053Transition_DTcfvLk$lambda6(createTransitionAnimation422)), Float.valueOf(m1051Transition_DTcfvLk$lambda3(createTransitionAnimation222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelProgress$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> animateFloat, @Nullable Composer composer2, int i73) {
                            FiniteAnimationSpec<Float> tween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(-1079955085);
                            InputPhase inputPhase32 = InputPhase.Focused;
                            InputPhase inputPhase43 = InputPhase.UnfocusedEmpty;
                            if (animateFloat.isTransitioningTo(inputPhase32, inputPhase43)) {
                                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(inputPhase43, inputPhase32) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase43)) {
                                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            composer2.endReplaceableGroup();
                            return tween;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1399891485);
                    TwoWayConverter vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    startRestartGroup.startReplaceableGroup(1847725064);
                    InputPhase inputPhase32 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    i4 = iArr[inputPhase32.ordinal()];
                    if (i4 != 1) {
                    }
                    f3 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase422 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    i5 = iArr[inputPhase422.ordinal()];
                    if (i5 != 1) {
                    }
                    f4 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, 196608);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i7222) {
                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-130058045);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    if (iArr[inputPhase5222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ColorSpace m1450getColorSpaceimpl322 = Color.m1450getColorSpaceimpl(j3);
                    startRestartGroup.startReplaceableGroup(-3686930);
                    changed = startRestartGroup.changed(m1450getColorSpaceimpl322);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl322);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1847725064);
                    InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    if (iArr[inputPhase6222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Color m1441boximpl222 = Color.m1441boximpl(j4);
                    InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    if (iArr[inputPhase7222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl222, Color.m1441boximpl(j5), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i7222) {
                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-32667848);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    int i7222 = (i2 & 7168) | 384;
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    ColorSpace m1450getColorSpaceimpl2222 = Color.m1450getColorSpaceimpl(((Color) contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i7222 >> 6) & 112))).getValue());
                    startRestartGroup.startReplaceableGroup(-3686930);
                    changed2 = startRestartGroup.changed(m1450getColorSpaceimpl2222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl2222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1847725064);
                    int i8222 = ((3136 | ((i7222 << 3) & 57344)) >> 9) & 112;
                    State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i8222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i8222)), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelContentColor$2222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(m1050Transition_DTcfvLk$lambda1(createTransitionAnimation5)), Color.m1441boximpl(m1052Transition_DTcfvLk$lambda5(createTransitionAnimation3222)), Color.m1441boximpl(m1053Transition_DTcfvLk$lambda6(createTransitionAnimation4222)), Float.valueOf(m1051Transition_DTcfvLk$lambda3(createTransitionAnimation2222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                } else if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf3 = Float.valueOf(f);
            InputPhase inputPhase22 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            i3 = iArr[inputPhase22.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelProgress$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> animateFloat, @Nullable Composer composer2, int i73) {
                    FiniteAnimationSpec<Float> tween;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-1079955085);
                    InputPhase inputPhase322 = InputPhase.Focused;
                    InputPhase inputPhase43 = InputPhase.UnfocusedEmpty;
                    if (animateFloat.isTransitioningTo(inputPhase322, inputPhase43)) {
                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else if (animateFloat.isTransitioningTo(inputPhase43, inputPhase322) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase43)) {
                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                    } else {
                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            TwoWayConverter vectorConverter222 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            startRestartGroup.startReplaceableGroup(1847725064);
            InputPhase inputPhase322 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            i4 = iArr[inputPhase322.ordinal()];
            if (i4 != 1) {
            }
            f3 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase4222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            i5 = iArr[inputPhase4222.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, 196608);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i72222) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-130058045);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            InputPhase inputPhase52222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            if (iArr[inputPhase52222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m1450getColorSpaceimpl3222 = Color.m1450getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(-3686930);
            changed = startRestartGroup.changed(m1450getColorSpaceimpl3222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl3222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(1847725064);
            InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            if (iArr[inputPhase62222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            Color m1441boximpl2222 = Color.m1441boximpl(j4);
            InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            if (iArr[inputPhase72222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl2222, Color.m1441boximpl(j5), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = new Function3() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> animateColor, @Nullable Composer composer2, int i72222) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-32667848);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            int i72222 = (i2 & 7168) | 384;
            startRestartGroup.startReplaceableGroup(-1462136984);
            ColorSpace m1450getColorSpaceimpl22222 = Color.m1450getColorSpaceimpl(((Color) contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i72222 >> 6) & 112))).getValue());
            startRestartGroup.startReplaceableGroup(-3686930);
            changed2 = startRestartGroup.changed(m1450getColorSpaceimpl22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl22222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1847725064);
            int i82222 = ((3136 | ((i72222 << 3) & 57344)) >> 9) & 112;
            State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i82222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i82222)), (FiniteAnimationSpec) textFieldTransitionScope$Transition$labelContentColor$22222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(m1050Transition_DTcfvLk$lambda1(createTransitionAnimation52)), Color.m1441boximpl(m1052Transition_DTcfvLk$lambda5(createTransitionAnimation32222)), Color.m1441boximpl(m1053Transition_DTcfvLk$lambda6(createTransitionAnimation42222)), Float.valueOf(m1051Transition_DTcfvLk$lambda3(createTransitionAnimation22222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i9) {
                TextFieldTransitionScope.this.m1054TransitionDTcfvLk(inputState, j, j2, contentColor, z, content, composer2, i | 1);
            }
        });
    }

    /* renamed from: Transition_DTcfvLk$lambda-1, reason: not valid java name */
    private static final float m1050Transition_DTcfvLk$lambda1(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3, reason: not valid java name */
    private static final float m1051Transition_DTcfvLk$lambda3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5, reason: not valid java name */
    private static final long m1052Transition_DTcfvLk$lambda5(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-6, reason: not valid java name */
    private static final long m1053Transition_DTcfvLk$lambda6(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
