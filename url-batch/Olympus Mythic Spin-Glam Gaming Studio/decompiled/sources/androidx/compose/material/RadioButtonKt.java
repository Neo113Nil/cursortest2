package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0017\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0017\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0017\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "RadioButtonRippleRadius", "F", "RadioButtonPadding", "RadioButtonSize", "RadioRadius", "RadioButtonDotSize", "RadioStrokeWidth", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadioButtonKt {
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m2507constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0062  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        RadioButtonColors radioButtonColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        float m2507constructorimpl;
        Composer composer2;
        final State state;
        RadioButtonColors radioButtonColors3;
        ?? r12;
        boolean z5;
        Modifier modifier4;
        final State state2;
        Modifier modifier5;
        boolean changed;
        Object rememberedValue;
        final MutableInteractionSource mutableInteractionSource5;
        final boolean z6;
        final RadioButtonColors radioButtonColors4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1314435585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            if (startRestartGroup.changed(radioButtonColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i6 = i3 & (-458753);
                                modifier3 = modifier6;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                radioButtonColors2 = RadioButtonDefaults.INSTANCE.m955colorsRGew2ao(0L, 0L, 0L, startRestartGroup, 3072, 7);
                            } else {
                                i6 = i3;
                                modifier3 = modifier6;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        startRestartGroup.endDefaults();
                        if (!z) {
                            m2507constructorimpl = Dp.m2507constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            m2507constructorimpl = Dp.m2507constructorimpl(0);
                        }
                        State m101animateDpAsStateKz89ssw = AnimateAsStateKt.m101animateDpAsStateKz89ssw(m2507constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
                        int i9 = i6 >> 9;
                        State radioColor = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i9 & 896) | (i9 & 14) | ((i6 << 3) & 112));
                        startRestartGroup.startReplaceableGroup(1941632354);
                        if (function0 == null) {
                            radioButtonColors3 = radioButtonColors2;
                            z5 = z4;
                            modifier4 = modifier3;
                            composer2 = startRestartGroup;
                            r12 = 0;
                            state2 = radioColor;
                            state = m101animateDpAsStateKz89ssw;
                            modifier5 = SelectableKt.m498selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1075rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, startRestartGroup, 54, 4), z5, Role.m2157boximpl(Role.INSTANCE.m2167getRadioButtono7Vup1c()), function0);
                        } else {
                            composer2 = startRestartGroup;
                            state = m101animateDpAsStateKz89ssw;
                            radioButtonColors3 = radioButtonColors2;
                            r12 = 0;
                            z5 = z4;
                            modifier4 = modifier3;
                            state2 = radioColor;
                            modifier5 = Modifier.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier7 = Modifier.INSTANCE;
                        if (function0 != null) {
                            modifier7 = TouchTargetKt.minimumTouchTargetSize(modifier7);
                        }
                        Modifier modifier8 = modifier4;
                        Modifier m352requiredSize3ABfNKs = SizeKt.m352requiredSize3ABfNKs(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(modifier8.then(modifier7).then(modifier5), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                        composer2.startReplaceableGroup(511388516);
                        changed = composer2.changed(state2) | composer2.changed(state);
                        rememberedValue = composer2.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((DrawScope) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull DrawScope Canvas) {
                                    float f;
                                    float f2;
                                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    f = RadioButtonKt.RadioStrokeWidth;
                                    float mo271toPx0680j_4 = Canvas.mo271toPx0680j_4(f);
                                    long value = ((Color) state2.getValue()).getValue();
                                    f2 = RadioButtonKt.RadioRadius;
                                    float f3 = mo271toPx0680j_4 / 2;
                                    DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, value, Canvas.mo271toPx0680j_4(f2) - f3, 0L, 0.0f, new Stroke(mo271toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.m2506compareTo0680j_4(((Dp) state.getValue()).getValue(), Dp.m2507constructorimpl(0)) > 0) {
                                        DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, ((Color) state2.getValue()).getValue(), Canvas.mo271toPx0680j_4(((Dp) state.getValue()).getValue()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(m352requiredSize3ABfNKs, (Function1) rememberedValue, composer2, r12);
                        modifier2 = modifier8;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        z6 = z5;
                        radioButtonColors4 = radioButtonColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors4 = radioButtonColors2;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                startRestartGroup.endDefaults();
                if (!z) {
                }
                State m101animateDpAsStateKz89ssw2 = AnimateAsStateKt.m101animateDpAsStateKz89ssw(m2507constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
                int i92 = i6 >> 9;
                State radioColor2 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i92 & 896) | (i92 & 14) | ((i6 << 3) & 112));
                startRestartGroup.startReplaceableGroup(1941632354);
                if (function0 == null) {
                }
                composer2.endReplaceableGroup();
                Modifier modifier72 = Modifier.INSTANCE;
                if (function0 != null) {
                }
                Modifier modifier82 = modifier4;
                Modifier m352requiredSize3ABfNKs2 = SizeKt.m352requiredSize3ABfNKs(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(modifier82.then(modifier72).then(modifier5), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(511388516);
                changed = composer2.changed(state2) | composer2.changed(state);
                rememberedValue = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function1() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DrawScope Canvas) {
                        float f;
                        float f2;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        f = RadioButtonKt.RadioStrokeWidth;
                        float mo271toPx0680j_4 = Canvas.mo271toPx0680j_4(f);
                        long value = ((Color) state2.getValue()).getValue();
                        f2 = RadioButtonKt.RadioRadius;
                        float f3 = mo271toPx0680j_4 / 2;
                        DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, value, Canvas.mo271toPx0680j_4(f2) - f3, 0L, 0.0f, new Stroke(mo271toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m2506compareTo0680j_4(((Dp) state.getValue()).getValue(), Dp.m2507constructorimpl(0)) > 0) {
                            DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, ((Color) state2.getValue()).getValue(), Canvas.mo271toPx0680j_4(((Dp) state.getValue()).getValue()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(m352requiredSize3ABfNKs2, (Function1) rememberedValue, composer2, r12);
                modifier2 = modifier82;
                mutableInteractionSource5 = mutableInteractionSource4;
                z6 = z5;
                radioButtonColors4 = radioButtonColors3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            startRestartGroup.endDefaults();
            if (!z) {
            }
            State m101animateDpAsStateKz89ssw22 = AnimateAsStateKt.m101animateDpAsStateKz89ssw(m2507constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
            int i922 = i6 >> 9;
            State radioColor22 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i922 & 896) | (i922 & 14) | ((i6 << 3) & 112));
            startRestartGroup.startReplaceableGroup(1941632354);
            if (function0 == null) {
            }
            composer2.endReplaceableGroup();
            Modifier modifier722 = Modifier.INSTANCE;
            if (function0 != null) {
            }
            Modifier modifier822 = modifier4;
            Modifier m352requiredSize3ABfNKs22 = SizeKt.m352requiredSize3ABfNKs(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(modifier822.then(modifier722).then(modifier5), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
            composer2.startReplaceableGroup(511388516);
            changed = composer2.changed(state2) | composer2.changed(state);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function1() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull DrawScope Canvas) {
                    float f;
                    float f2;
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    f = RadioButtonKt.RadioStrokeWidth;
                    float mo271toPx0680j_4 = Canvas.mo271toPx0680j_4(f);
                    long value = ((Color) state2.getValue()).getValue();
                    f2 = RadioButtonKt.RadioRadius;
                    float f3 = mo271toPx0680j_4 / 2;
                    DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, value, Canvas.mo271toPx0680j_4(f2) - f3, 0L, 0.0f, new Stroke(mo271toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                    if (Dp.m2506compareTo0680j_4(((Dp) state.getValue()).getValue(), Dp.m2507constructorimpl(0)) > 0) {
                        DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, ((Color) state2.getValue()).getValue(), Canvas.mo271toPx0680j_4(((Dp) state.getValue()).getValue()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                    }
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(m352requiredSize3ABfNKs22, (Function1) rememberedValue, composer2, r12);
            modifier2 = modifier822;
            mutableInteractionSource5 = mutableInteractionSource4;
            z6 = z5;
            radioButtonColors4 = radioButtonColors3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        startRestartGroup.endDefaults();
        if (!z) {
        }
        State m101animateDpAsStateKz89ssw222 = AnimateAsStateKt.m101animateDpAsStateKz89ssw(m2507constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
        int i9222 = i6 >> 9;
        State radioColor222 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i9222 & 896) | (i9222 & 14) | ((i6 << 3) & 112));
        startRestartGroup.startReplaceableGroup(1941632354);
        if (function0 == null) {
        }
        composer2.endReplaceableGroup();
        Modifier modifier7222 = Modifier.INSTANCE;
        if (function0 != null) {
        }
        Modifier modifier8222 = modifier4;
        Modifier m352requiredSize3ABfNKs222 = SizeKt.m352requiredSize3ABfNKs(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(modifier8222.then(modifier7222).then(modifier5), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
        composer2.startReplaceableGroup(511388516);
        changed = composer2.changed(state2) | composer2.changed(state);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DrawScope Canvas) {
                float f;
                float f2;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                f = RadioButtonKt.RadioStrokeWidth;
                float mo271toPx0680j_4 = Canvas.mo271toPx0680j_4(f);
                long value = ((Color) state2.getValue()).getValue();
                f2 = RadioButtonKt.RadioRadius;
                float f3 = mo271toPx0680j_4 / 2;
                DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, value, Canvas.mo271toPx0680j_4(f2) - f3, 0L, 0.0f, new Stroke(mo271toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                if (Dp.m2506compareTo0680j_4(((Dp) state.getValue()).getValue(), Dp.m2507constructorimpl(0)) > 0) {
                    DrawScope.m1694drawCircleVaOC9Bg$default(Canvas, ((Color) state2.getValue()).getValue(), Canvas.mo271toPx0680j_4(((Dp) state.getValue()).getValue()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                }
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(m352requiredSize3ABfNKs222, (Function1) rememberedValue, composer2, r12);
        modifier2 = modifier8222;
        mutableInteractionSource5 = mutableInteractionSource4;
        z6 = z5;
        radioButtonColors4 = radioButtonColors3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m2507constructorimpl(f);
        float m2507constructorimpl = Dp.m2507constructorimpl(20);
        RadioButtonSize = m2507constructorimpl;
        RadioRadius = Dp.m2507constructorimpl(m2507constructorimpl / f);
        RadioButtonDotSize = Dp.m2507constructorimpl(12);
        RadioStrokeWidth = Dp.m2507constructorimpl(f);
    }
}
