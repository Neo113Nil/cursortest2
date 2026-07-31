package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010 \u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010)\u001a\u00020\u0003*\u00020\u00172\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\u0017\u0010+\u001a\u00020*8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010,\"\u0017\u0010-\u001a\u00020*8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010,\"\u0017\u0010.\u001a\u00020*8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010,\"\u0017\u0010/\u001a\u00020*8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b/\u0010,\"\u0017\u00100\u001a\u00020*8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b0\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "value", "CheckboxImpl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawBox", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material/CheckDrawingCache;", "drawingCache", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "drawCheck", "Landroidx/compose/ui/unit/Dp;", "CheckboxRippleRadius", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckboxKt {
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m2507constructorimpl(24);
    private static final float CheckboxSize = Dp.m2507constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final Function1 function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        CheckboxColors m765colorszjMxDiM;
        Function0 function0;
        final CheckboxColors checkboxColors3;
        final Modifier modifier4;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-2118660998);
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
            i3 |= startRestartGroup.changed(function1) ? 32 : 16;
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
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
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
                            if ((i2 & 32) != 0) {
                                i6 = i3 & (-458753);
                                m765colorszjMxDiM = CheckboxDefaults.INSTANCE.m765colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, 196608, 31);
                                startRestartGroup.endDefaults();
                                ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                                startRestartGroup.startReplaceableGroup(1433125990);
                                if (function1 != null) {
                                    Boolean valueOf = Boolean.valueOf(z);
                                    startRestartGroup.startReplaceableGroup(511388516);
                                    boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function0() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                                m780invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m780invoke() {
                                                Function1.this.invoke(Boolean.valueOf(!z));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    function0 = (Function0) rememberedValue2;
                                } else {
                                    function0 = null;
                                }
                                startRestartGroup.endReplaceableGroup();
                                TriStateCheckbox(ToggleableState, function0, modifier3, z4, mutableInteractionSource3, m765colorszjMxDiM, startRestartGroup, i6 & 524160, 0);
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                checkboxColors3 = m765colorszjMxDiM;
                                modifier4 = modifier3;
                                z5 = z4;
                                mutableInteractionSource4 = mutableInteractionSource5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i6 = i3;
                        m765colorszjMxDiM = checkboxColors2;
                        startRestartGroup.endDefaults();
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                        startRestartGroup.startReplaceableGroup(1433125990);
                        if (function1 != null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TriStateCheckbox(ToggleableState2, function0, modifier3, z4, mutableInteractionSource3, m765colorszjMxDiM, startRestartGroup, i6 & 524160, 0);
                        MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        checkboxColors3 = m765colorszjMxDiM;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource52;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$Checkbox$3
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
                            CheckboxKt.Checkbox(z, function1, modifier4, z5, mutableInteractionSource4, checkboxColors3, composer2, i | 1, i2);
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
                if ((i2 & 32) != 0) {
                }
                i6 = i3;
                m765colorszjMxDiM = checkboxColors2;
                startRestartGroup.endDefaults();
                ToggleableState ToggleableState22 = ToggleableStateKt.ToggleableState(z);
                startRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState22, function0, modifier3, z4, mutableInteractionSource3, m765colorszjMxDiM, startRestartGroup, i6 & 524160, 0);
                MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                checkboxColors3 = m765colorszjMxDiM;
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource522;
                endRestartGroup = startRestartGroup.endRestartGroup();
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
            if ((i2 & 32) != 0) {
            }
            i6 = i3;
            m765colorszjMxDiM = checkboxColors2;
            startRestartGroup.endDefaults();
            ToggleableState ToggleableState222 = ToggleableStateKt.ToggleableState(z);
            startRestartGroup.startReplaceableGroup(1433125990);
            if (function1 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState222, function0, modifier3, z4, mutableInteractionSource3, m765colorszjMxDiM, startRestartGroup, i6 & 524160, 0);
            MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            checkboxColors3 = m765colorszjMxDiM;
            modifier4 = modifier3;
            z5 = z4;
            mutableInteractionSource4 = mutableInteractionSource5222;
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        if ((i2 & 32) != 0) {
        }
        i6 = i3;
        m765colorszjMxDiM = checkboxColors2;
        startRestartGroup.endDefaults();
        ToggleableState ToggleableState2222 = ToggleableStateKt.ToggleableState(z);
        startRestartGroup.startReplaceableGroup(1433125990);
        if (function1 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TriStateCheckbox(ToggleableState2222, function0, modifier3, z4, mutableInteractionSource3, m765colorszjMxDiM, startRestartGroup, i6 & 524160, 0);
        MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        checkboxColors3 = m765colorszjMxDiM;
        modifier4 = modifier3;
        z5 = z4;
        mutableInteractionSource4 = mutableInteractionSource52222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final ToggleableState state, final Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Modifier modifier3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource4;
        CheckboxColors m765colorszjMxDiM;
        Modifier modifier4;
        Composer composer2;
        Modifier modifier5;
        final Modifier modifier6;
        final MutableInteractionSource mutableInteractionSource5;
        final CheckboxColors checkboxColors3;
        int i7;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(2031255194);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
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
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier7 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 == 0 ? true : z2;
                            if (i5 == 0) {
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
                            if ((i2 & 32) == 0) {
                                i6 = i3 & (-458753);
                                modifier3 = modifier7;
                                z3 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                m765colorszjMxDiM = CheckboxDefaults.INSTANCE.m765colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, 196608, 31);
                                startRestartGroup.endDefaults();
                                startRestartGroup.startReplaceableGroup(-1517549514);
                                if (function0 == null) {
                                    modifier4 = modifier3;
                                    composer2 = startRestartGroup;
                                    modifier5 = ToggleableKt.m502triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1075rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, startRestartGroup, 54, 4), z3, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), function0);
                                } else {
                                    modifier4 = modifier3;
                                    composer2 = startRestartGroup;
                                    modifier5 = Modifier.INSTANCE;
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifier8 = Modifier.INSTANCE;
                                if (function0 != null) {
                                    modifier8 = TouchTargetKt.minimumTouchTargetSize(modifier8);
                                }
                                CheckboxImpl(z3, state, PaddingKt.m334padding3ABfNKs(modifier4.then(modifier8).then(modifier5), CheckboxDefaultPadding), m765colorszjMxDiM, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                                modifier6 = modifier4;
                                z2 = z3;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                checkboxColors3 = m765colorszjMxDiM;
                            } else {
                                i6 = i3;
                                modifier3 = modifier7;
                                z3 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        m765colorszjMxDiM = checkboxColors2;
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-1517549514);
                        if (function0 == null) {
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier82 = Modifier.INSTANCE;
                        if (function0 != null) {
                        }
                        CheckboxImpl(z3, state, PaddingKt.m334padding3ABfNKs(modifier4.then(modifier82).then(modifier5), CheckboxDefaultPadding), m765colorszjMxDiM, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                        modifier6 = modifier4;
                        z2 = z3;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        checkboxColors3 = m765colorszjMxDiM;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier6 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        composer2 = startRestartGroup;
                        checkboxColors3 = checkboxColors2;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i9) {
                            CheckboxKt.TriStateCheckbox(ToggleableState.this, function0, modifier6, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
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
            }
            z2 = z;
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
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
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
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m2507constructorimpl(f);
        StrokeWidth = Dp.m2507constructorimpl(f);
        RadiusSize = Dp.m2507constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0206 A[LOOP:0: B:73:0x0203->B:75:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxImpl(final boolean z, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i) {
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        Object rememberedValue;
        int i5;
        boolean z2;
        Object rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-2118895727);
        int i6 = (i & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i6 |= startRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i6 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i9, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new Function3() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @ComposableTarget
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> animateFloat, @Nullable Composer composer2, int i10) {
                    FiniteAnimationSpec<Float> snap;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-1707702900);
                    Object initialState = animateFloat.getInitialState();
                    ToggleableState toggleableState2 = ToggleableState.Off;
                    if (initialState == toggleableState2) {
                        snap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    } else {
                        snap = animateFloat.getTargetState() == toggleableState2 ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return snap;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            startRestartGroup.startReplaceableGroup(1847725064);
            ToggleableState toggleableState2 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i10 = iArr[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    ToggleableState toggleableState3 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1798345588);
                    i2 = iArr[toggleableState3.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f2 = 0.0f;
                            startRestartGroup.endReplaceableGroup();
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new Function3() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }

                                @ComposableTarget
                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> animateFloat, @Nullable Composer composer2, int i11) {
                                    FiniteAnimationSpec<Float> snap;
                                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                    composer2.startReplaceableGroup(1075283605);
                                    Object initialState = animateFloat.getInitialState();
                                    ToggleableState toggleableState4 = ToggleableState.Off;
                                    if (initialState == toggleableState4) {
                                        snap = AnimationSpecKt.snap$default(0, 1, null);
                                    } else {
                                        snap = animateFloat.getTargetState() == toggleableState4 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                                    }
                                    composer2.endReplaceableGroup();
                                    return snap;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(1399891485);
                            TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                            startRestartGroup.startReplaceableGroup(1847725064);
                            ToggleableState toggleableState4 = (ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            i3 = iArr[toggleableState4.ordinal()];
                            if (i3 != 1 || i3 == 2) {
                                f3 = 0.0f;
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f3 = 1.0f;
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            ToggleableState toggleableState5 = (ToggleableState) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            i4 = iArr[toggleableState5.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                if (i4 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CheckDrawingCache checkDrawingCache = (CheckDrawingCache) rememberedValue;
                            final State checkmarkColor = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                            int i11 = (i7 & 126) | (i8 & 896);
                            final State boxColor = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i11);
                            final State borderColor = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i11);
                            Modifier m352requiredSize3ABfNKs = SizeKt.m352requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                            Object[] objArr = {boxColor, borderColor, checkmarkColor, createTransitionAnimation, createTransitionAnimation2, checkDrawingCache};
                            startRestartGroup.startReplaceableGroup(-568225417);
                            z2 = false;
                            for (i5 = 0; i5 < 6; i5++) {
                                z2 |= startRestartGroup.changed(objArr[i5]);
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                                        float f5;
                                        long m770CheckboxImpl$lambda9;
                                        long m766CheckboxImpl$lambda10;
                                        float f6;
                                        long m769CheckboxImpl$lambda8;
                                        float m767CheckboxImpl$lambda4;
                                        float m768CheckboxImpl$lambda6;
                                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                        f5 = CheckboxKt.StrokeWidth;
                                        float floor = (float) Math.floor(Canvas.mo271toPx0680j_4(f5));
                                        m770CheckboxImpl$lambda9 = CheckboxKt.m770CheckboxImpl$lambda9(boxColor);
                                        m766CheckboxImpl$lambda10 = CheckboxKt.m766CheckboxImpl$lambda10(borderColor);
                                        f6 = CheckboxKt.RadiusSize;
                                        CheckboxKt.m778drawBox1wkBAMs(Canvas, m770CheckboxImpl$lambda9, m766CheckboxImpl$lambda10, Canvas.mo271toPx0680j_4(f6), floor);
                                        m769CheckboxImpl$lambda8 = CheckboxKt.m769CheckboxImpl$lambda8(checkmarkColor);
                                        m767CheckboxImpl$lambda4 = CheckboxKt.m767CheckboxImpl$lambda4(createTransitionAnimation);
                                        m768CheckboxImpl$lambda6 = CheckboxKt.m768CheckboxImpl$lambda6(createTransitionAnimation2);
                                        CheckboxKt.m779drawCheck3IgeMak(Canvas, m769CheckboxImpl$lambda8, m767CheckboxImpl$lambda4, m768CheckboxImpl$lambda6, floor, CheckDrawingCache.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(m352requiredSize3ABfNKs, (Function1) rememberedValue2, startRestartGroup, 0);
                        } else if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    final State<Float> createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22 = new Function3() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @ComposableTarget
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> animateFloat, @Nullable Composer composer2, int i112) {
                            FiniteAnimationSpec<Float> snap;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(1075283605);
                            Object initialState = animateFloat.getInitialState();
                            ToggleableState toggleableState42 = ToggleableState.Off;
                            if (initialState == toggleableState42) {
                                snap = AnimationSpecKt.snap$default(0, 1, null);
                            } else {
                                snap = animateFloat.getTargetState() == toggleableState42 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                            }
                            composer2.endReplaceableGroup();
                            return snap;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1399891485);
                    TwoWayConverter vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    startRestartGroup.startReplaceableGroup(1847725064);
                    ToggleableState toggleableState42 = (ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    i3 = iArr[toggleableState42.ordinal()];
                    if (i3 != 1) {
                    }
                    f3 = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf22 = Float.valueOf(f3);
                    ToggleableState toggleableState52 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    i4 = iArr[toggleableState52.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 3) {
                        }
                    }
                    startRestartGroup.endReplaceableGroup();
                    final State<Float> createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue;
                    final State<Color> checkmarkColor2 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                    int i112 = (i7 & 126) | (i8 & 896);
                    final State<Color> boxColor2 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i112);
                    final State<Color> borderColor2 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i112);
                    Modifier m352requiredSize3ABfNKs2 = SizeKt.m352requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                    Object[] objArr2 = {boxColor2, borderColor2, checkmarkColor2, createTransitionAnimation3, createTransitionAnimation22, checkDrawingCache2};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    z2 = false;
                    while (i5 < 6) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                            float f5;
                            long m770CheckboxImpl$lambda9;
                            long m766CheckboxImpl$lambda10;
                            float f6;
                            long m769CheckboxImpl$lambda8;
                            float m767CheckboxImpl$lambda4;
                            float m768CheckboxImpl$lambda6;
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            f5 = CheckboxKt.StrokeWidth;
                            float floor = (float) Math.floor(Canvas.mo271toPx0680j_4(f5));
                            m770CheckboxImpl$lambda9 = CheckboxKt.m770CheckboxImpl$lambda9(boxColor2);
                            m766CheckboxImpl$lambda10 = CheckboxKt.m766CheckboxImpl$lambda10(borderColor2);
                            f6 = CheckboxKt.RadiusSize;
                            CheckboxKt.m778drawBox1wkBAMs(Canvas, m770CheckboxImpl$lambda9, m766CheckboxImpl$lambda10, Canvas.mo271toPx0680j_4(f6), floor);
                            m769CheckboxImpl$lambda8 = CheckboxKt.m769CheckboxImpl$lambda8(checkmarkColor2);
                            m767CheckboxImpl$lambda4 = CheckboxKt.m767CheckboxImpl$lambda4(createTransitionAnimation3);
                            m768CheckboxImpl$lambda6 = CheckboxKt.m768CheckboxImpl$lambda6(createTransitionAnimation22);
                            CheckboxKt.m779drawCheck3IgeMak(Canvas, m769CheckboxImpl$lambda8, m767CheckboxImpl$lambda4, m768CheckboxImpl$lambda6, floor, CheckDrawingCache.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(m352requiredSize3ABfNKs2, (Function1) rememberedValue2, startRestartGroup, 0);
                } else if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf3 = Float.valueOf(f);
            ToggleableState toggleableState32 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            i2 = iArr[toggleableState32.ordinal()];
            if (i2 != 1) {
            }
            f2 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            final State<Float> createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222 = new Function3() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @ComposableTarget
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> animateFloat, @Nullable Composer composer2, int i1122) {
                    FiniteAnimationSpec<Float> snap;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(1075283605);
                    Object initialState = animateFloat.getInitialState();
                    ToggleableState toggleableState422 = ToggleableState.Off;
                    if (initialState == toggleableState422) {
                        snap = AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        snap = animateFloat.getTargetState() == toggleableState422 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    }
                    composer2.endReplaceableGroup();
                    return snap;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            TwoWayConverter vectorConverter222 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            startRestartGroup.startReplaceableGroup(1847725064);
            ToggleableState toggleableState422 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            i3 = iArr[toggleableState422.ordinal()];
            if (i3 != 1) {
            }
            f3 = 0.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf222 = Float.valueOf(f3);
            ToggleableState toggleableState522 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            i4 = iArr[toggleableState522.ordinal()];
            if (i4 != 1) {
            }
            startRestartGroup.endReplaceableGroup();
            final State<Float> createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), (FiniteAnimationSpec) checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue;
            final State<Color> checkmarkColor22 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
            int i1122 = (i7 & 126) | (i8 & 896);
            final State<Color> boxColor22 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i1122);
            final State<Color> borderColor22 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i1122);
            Modifier m352requiredSize3ABfNKs22 = SizeKt.m352requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
            Object[] objArr22 = {boxColor22, borderColor22, checkmarkColor22, createTransitionAnimation32, createTransitionAnimation222, checkDrawingCache22};
            startRestartGroup.startReplaceableGroup(-568225417);
            z2 = false;
            while (i5 < 6) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                    float f5;
                    long m770CheckboxImpl$lambda9;
                    long m766CheckboxImpl$lambda10;
                    float f6;
                    long m769CheckboxImpl$lambda8;
                    float m767CheckboxImpl$lambda4;
                    float m768CheckboxImpl$lambda6;
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    f5 = CheckboxKt.StrokeWidth;
                    float floor = (float) Math.floor(Canvas.mo271toPx0680j_4(f5));
                    m770CheckboxImpl$lambda9 = CheckboxKt.m770CheckboxImpl$lambda9(boxColor22);
                    m766CheckboxImpl$lambda10 = CheckboxKt.m766CheckboxImpl$lambda10(borderColor22);
                    f6 = CheckboxKt.RadiusSize;
                    CheckboxKt.m778drawBox1wkBAMs(Canvas, m770CheckboxImpl$lambda9, m766CheckboxImpl$lambda10, Canvas.mo271toPx0680j_4(f6), floor);
                    m769CheckboxImpl$lambda8 = CheckboxKt.m769CheckboxImpl$lambda8(checkmarkColor22);
                    m767CheckboxImpl$lambda4 = CheckboxKt.m767CheckboxImpl$lambda4(createTransitionAnimation32);
                    m768CheckboxImpl$lambda6 = CheckboxKt.m768CheckboxImpl$lambda6(createTransitionAnimation222);
                    CheckboxKt.m779drawCheck3IgeMak(Canvas, m769CheckboxImpl$lambda8, m767CheckboxImpl$lambda4, m768CheckboxImpl$lambda6, floor, CheckDrawingCache.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m352requiredSize3ABfNKs22, (Function1) rememberedValue2, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                CheckboxKt.CheckboxImpl(z, toggleableState, modifier, checkboxColors, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m778drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float m1335getWidthimpl = Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc());
        if (Color.m1447equalsimpl0(j, j2)) {
            DrawScope.m1705drawRoundRectuAw5IA$default(drawScope, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(m1335getWidthimpl, m1335getWidthimpl), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, null);
            return;
        }
        float f4 = m1335getWidthimpl - (2 * f2);
        DrawScope.m1705drawRoundRectuAw5IA$default(drawScope, j, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f4, f4), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f - f2), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = m1335getWidthimpl - f2;
        DrawScope.m1705drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(f - f3, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m779drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m1596getSquareKaPHkGw(), 0, null, 26, null);
        float m1335getWidthimpl = Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m1335getWidthimpl, lerp3 * m1335getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m1335getWidthimpl, lerp2 * m1335getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m1335getWidthimpl, m1335getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m1700drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-4, reason: not valid java name */
    public static final float m767CheckboxImpl$lambda4(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-6, reason: not valid java name */
    public static final float m768CheckboxImpl$lambda6(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-8, reason: not valid java name */
    public static final long m769CheckboxImpl$lambda8(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-9, reason: not valid java name */
    public static final long m770CheckboxImpl$lambda9(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-10, reason: not valid java name */
    public static final long m766CheckboxImpl$lambda10(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
