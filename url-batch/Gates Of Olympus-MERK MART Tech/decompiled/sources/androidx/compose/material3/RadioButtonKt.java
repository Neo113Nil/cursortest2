package androidx.compose.material3;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010\"\u0010\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010\"\u0010\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "RadioButtonPadding", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonDotSize", "RadioStrokeWidth", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RadioButtonKt {
    private static final float RadioButtonDotSize = Dp.m8227constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton$lambda$2(boolean z, Function0 function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        RadioButton(z, function0, modifier, z2, radioButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColors2;
        int i5;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final RadioButtonColors radioButtonColors3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        boolean z5;
        RadioButtonColors radioButtonColors4;
        float m8227constructorimpl;
        Object obj;
        Modifier modifier4;
        RadioButtonColors radioButtonColors5;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        boolean changed;
        Object rememberedValue;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation(startRestartGroup, "C(RadioButton)N(selected,onClick,modifier,enabled,colors,interactionSource)85@4070L7,82@3836L252,87@4117L29,114@5028L416,101@4610L834:RadioButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (startRestartGroup.changed(radioButtonColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "78@3737L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            i6 = i3;
                            companion = modifier2;
                        } else {
                            companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColors2 = RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                i6 = i3;
                                z5 = z3;
                                radioButtonColors4 = radioButtonColors2;
                                mutableInteractionSource3 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(408580840, i6, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                                }
                                if (!z) {
                                    m8227constructorimpl = Dp.m8227constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    m8227constructorimpl = Dp.m8227constructorimpl(0);
                                }
                                final State<Dp> m175animateDpAsStateAjpBEmI = AnimateAsStateKt.m175animateDpAsStateAjpBEmI(m8227constructorimpl, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                                final State<Color> radioColor$material3 = radioButtonColors4.radioColor$material3(z5, z, startRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                                if (function0 == null) {
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    int m7416getRadioButtono7Vup1c = Role.INSTANCE.m7416getRadioButtono7Vup1c();
                                    IndicationNodeFactory m2871rippleH2RKhps$default = RippleKt.m2871rippleH2RKhps$default(false, Dp.m8227constructorimpl(RadioButtonTokens.INSTANCE.m4321getStateLayerSizeD9Ej5fM() / 2), 0L, 4, null);
                                    Role m7404boximpl = Role.m7404boximpl(m7416getRadioButtono7Vup1c);
                                    Modifier modifier5 = companion;
                                    z4 = z5;
                                    modifier4 = modifier5;
                                    radioButtonColors5 = radioButtonColors4;
                                    obj = null;
                                    companion2 = SelectableKt.m1244selectableO2vRcR0(companion4, z, mutableInteractionSource3, m2871rippleH2RKhps$default, z4, m7404boximpl, function0);
                                } else {
                                    obj = null;
                                    modifier4 = companion;
                                    radioButtonColors5 = radioButtonColors4;
                                    z4 = z5;
                                    companion2 = Modifier.INSTANCE;
                                }
                                if (function0 == null) {
                                    companion3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                                } else {
                                    companion3 = Modifier.INSTANCE;
                                }
                                Modifier m969requiredSize3ABfNKs = SizeKt.m969requiredSize3ABfNKs(PaddingKt.m929padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion3).then(companion2), Alignment.INSTANCE.getCenter(), false, 2, obj), RadioButtonPadding), RadioButtonTokens.INSTANCE.m4320getIconSizeD9Ej5fM());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1804211304, "CC(remember):RadioButton.kt#9igjgp");
                                changed = startRestartGroup.changed(radioColor$material3) | startRestartGroup.changed(m175animateDpAsStateAjpBEmI);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.RadioButtonKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit RadioButton$lambda$1$lambda$0;
                                            RadioButton$lambda$1$lambda$0 = RadioButtonKt.RadioButton$lambda$1$lambda$0(State.this, m175animateDpAsStateAjpBEmI, (DrawScope) obj2);
                                            return RadioButton$lambda$1$lambda$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CanvasKt.Canvas(m969requiredSize3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource2 = mutableInteractionSource3;
                                radioButtonColors3 = radioButtonColors5;
                                modifier3 = modifier4;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                            }
                        }
                        z5 = z3;
                        radioButtonColors4 = radioButtonColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        final State m175animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m175animateDpAsStateAjpBEmI(m8227constructorimpl, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                        final State radioColor$material32 = radioButtonColors4.radioColor$material3(z5, z, startRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                        if (function0 == null) {
                        }
                        if (function0 == null) {
                        }
                        Modifier m969requiredSize3ABfNKs2 = SizeKt.m969requiredSize3ABfNKs(PaddingKt.m929padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion3).then(companion2), Alignment.INSTANCE.getCenter(), false, 2, obj), RadioButtonPadding), RadioButtonTokens.INSTANCE.m4320getIconSizeD9Ej5fM());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1804211304, "CC(remember):RadioButton.kt#9igjgp");
                        changed = startRestartGroup.changed(radioColor$material32) | startRestartGroup.changed(m175animateDpAsStateAjpBEmI2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new Function1() { // from class: androidx.compose.material3.RadioButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit RadioButton$lambda$1$lambda$0;
                                RadioButton$lambda$1$lambda$0 = RadioButtonKt.RadioButton$lambda$1$lambda$0(State.this, m175animateDpAsStateAjpBEmI2, (DrawScope) obj2);
                                return RadioButton$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(m969requiredSize3ABfNKs2, (Function1) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        radioButtonColors3 = radioButtonColors5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z3;
                        radioButtonColors3 = radioButtonColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.RadioButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit RadioButton$lambda$2;
                                RadioButton$lambda$2 = RadioButtonKt.RadioButton$lambda$2(z, function0, modifier3, z4, radioButtonColors3, mutableInteractionSource2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return RadioButton$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton$lambda$1$lambda$0(State state, State state2, DrawScope drawScope) {
        float f = drawScope.mo465toPx0680j_4(RadioStrokeWidth);
        float f2 = 2;
        float f3 = f / f2;
        DrawScope.m5955drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m5403unboximpl(), drawScope.mo465toPx0680j_4(Dp.m8227constructorimpl(RadioButtonTokens.INSTANCE.m4320getIconSizeD9Ej5fM() / f2)) - f3, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        if (Dp.m8226compareTo0680j_4(((Dp) state2.getValue()).m8241unboximpl(), Dp.m8227constructorimpl(0)) > 0) {
            DrawScope.m5955drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m5403unboximpl(), drawScope.mo465toPx0680j_4(((Dp) state2.getValue()).m8241unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        }
        return Unit.INSTANCE;
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m8227constructorimpl(f);
        RadioStrokeWidth = Dp.m8227constructorimpl(f);
    }
}
