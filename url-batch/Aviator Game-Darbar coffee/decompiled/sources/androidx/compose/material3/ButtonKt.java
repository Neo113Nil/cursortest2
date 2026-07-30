package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ButtonKt {
    static final Unit Button$lambda$3(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        Button(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit ElevatedButton$lambda$4(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        ElevatedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit FilledTonalButton$lambda$5(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        FilledTonalButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit OutlinedButton$lambda$6(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        OutlinedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit TextButton$lambda$7(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        TextButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.compose.foundation.interaction.MutableInteractionSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        int i9;
        final Modifier modifier2;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final ?? r9;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        Modifier modifier3;
        boolean z4;
        BorderStroke borderStroke4;
        int i10;
        final PaddingValues contentPadding;
        BorderStroke borderStroke5;
        boolean z5;
        BorderStroke borderStroke6;
        int i11;
        Shape shape5;
        int i12;
        Modifier modifier4;
        ?? r12;
        InteractionSource interactionSource;
        State<Dp> shadowElevation$material3;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1310015664);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)129@6472L22,137@6736L590,127@6398L928:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i15 = 2048;
                            i3 |= i15;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i15 = 1024;
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = 16384;
                            i3 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i3 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i13 = 131072;
                            i3 |= i13;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i13 = 65536;
                    i3 |= i13;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = i16;
                    } else {
                        i7 = i16;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed((Object) mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "114@5728L5,115@5777L14,116@5842L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i11 = i3;
                                r12 = 1;
                                shape5 = shape2;
                                borderStroke5 = borderStroke2;
                                modifier4 = modifier;
                                contentPadding = paddingValues;
                                borderStroke6 = mutableInteractionSource;
                                z5 = z2;
                                i12 = -1310015664;
                            } else {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z6 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = ButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColors4 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                int i17 = i3;
                                if ((i2 & 32) != 0) {
                                    modifier3 = companion;
                                    z4 = true;
                                    borderStroke4 = null;
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m1766buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i10 = i17 & (-458753);
                                } else {
                                    modifier3 = companion;
                                    z4 = true;
                                    borderStroke4 = null;
                                    i10 = i17;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = borderStroke4;
                                }
                                contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                boolean z7 = z6;
                                borderStroke5 = borderStroke2;
                                z5 = z7;
                                borderStroke6 = i9 != 0 ? borderStroke4 : mutableInteractionSource;
                                i11 = i10;
                                buttonColors2 = buttonColors4;
                                shape5 = shape4;
                                i12 = -1310015664;
                                modifier4 = modifier3;
                                r12 = z4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.Button (Button.kt:121)");
                            }
                            if (borderStroke6 == null) {
                                startRestartGroup.startReplaceGroup(1691738187);
                                ComposerKt.sourceInformation(startRestartGroup, "123@6150L39");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -499617129, "CC(remember):Button.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                interactionSource = (MutableInteractionSource) rememberedValue;
                            } else {
                                startRestartGroup.startReplaceGroup(-499617780);
                                startRestartGroup.endReplaceGroup();
                                interactionSource = borderStroke6;
                            }
                            long m1758containerColorvNxB06k$material3 = buttonColors2.m1758containerColorvNxB06k$material3(z5);
                            Modifier modifier5 = modifier4;
                            final long m1759contentColorvNxB06k$material3 = buttonColors2.m1759contentColorvNxB06k$material3(z5);
                            if (buttonElevation2 == null) {
                                startRestartGroup.startReplaceGroup(1691921830);
                                startRestartGroup.endReplaceGroup();
                                shadowElevation$material3 = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-499611205);
                                ComposerKt.sourceInformation(startRestartGroup, "126@6335L43");
                                shadowElevation$material3 = buttonElevation2.shadowElevation$material3(z5, interactionSource, startRestartGroup, ((i11 >> 6) & 14) | ((i11 >> 9) & 896));
                                startRestartGroup.endReplaceGroup();
                            }
                            float m7536unboximpl = shadowElevation$material3 != null ? shadowElevation$material3.getValue().m7536unboximpl() : Dp.m7522constructorimpl(0.0f);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -499606842, "CC(remember):Button.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ButtonKt.Button$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            BorderStroke borderStroke7 = borderStroke6;
                            SurfaceKt.m2574Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(modifier5, false, (Function1) rememberedValue2, r12, null), z5, shape5, m1758containerColorvNxB06k$material3, m1759contentColorvNxB06k$material3, 0.0f, m7536unboximpl, borderStroke5, interactionSource, ComposableLambdaKt.rememberComposableLambda(-535639973, r12, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    ComposerKt.sourceInformation(composer3, "C140@6855L10,141@6888L432,138@6746L574:Button.kt#uh7d8r");
                                    if (!composer3.shouldExecute((i18 & 3) != 2, i18 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-535639973, i18, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:138)");
                                    }
                                    long j = m1759contentColorvNxB06k$material3;
                                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge();
                                    final PaddingValues paddingValues3 = contentPadding;
                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    ProvideContentColorTextStyleKt.m3009ProvideContentColorTextStyle3JVO9M(j, labelLarge, ComposableLambdaKt.rememberComposableLambda(417635459, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i19) {
                                            ComposerKt.sourceInformation(composer4, "C142@6902L408:Button.kt#uh7d8r");
                                            if (!composer4.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(417635459, i19, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:142)");
                                            }
                                            Modifier padding = PaddingKt.padding(SizeKt.m850defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1774getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1773getMinHeightD9Ej5fM()), PaddingValues.this);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer m4009constructorimpl = Updater.m4009constructorimpl(composer4);
                                            Updater.m4017setimpl(m4009constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4017setimpl(m4009constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4009constructorimpl.getInserting() || !Intrinsics.areEqual(m4009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4017setimpl(m4009constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            function33.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i11 & 8078) | (234881024 & (i11 << 6)), 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            z3 = z5;
                            shape3 = shape5;
                            borderStroke3 = borderStroke5;
                            paddingValues2 = contentPadding;
                            modifier2 = modifier5;
                            buttonElevation3 = buttonElevation2;
                            r9 = borderStroke7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z2;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = paddingValues;
                            r9 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ButtonKt.Button$lambda$3(Function0.this, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, r9, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & 512) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 512) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 512) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 512) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static final Unit Button$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6760setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6741getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1943994298);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)215@10659L315:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "207@10290L13,208@10347L22,209@10420L25");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke4 = borderStroke2;
                                    i9 = -1943994298;
                                    modifier4 = modifier2;
                                } else {
                                    Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape4 = ButtonDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        buttonColors4 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    int i14 = i3;
                                    if ((i2 & 32) != 0) {
                                        buttonElevation2 = ButtonDefaults.INSTANCE.m1768elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                        i3 = i14 & (-458753);
                                    } else {
                                        i3 = i14;
                                    }
                                    if (i5 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    borderStroke4 = borderStroke2;
                                    z4 = z5;
                                    shape5 = shape4;
                                    if (i8 != 0) {
                                        buttonColors5 = buttonColors4;
                                        modifier4 = companion;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        buttonColors5 = buttonColors4;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = companion;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = -1943994298;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.ElevatedButton (Button.kt:215)");
                                }
                                Button(function02, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, startRestartGroup, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                modifier3 = modifier4;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke4;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ButtonKt.ElevatedButton$lambda$4(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-102343472);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)288@14374L315:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "280@13996L16,281@14056L25,282@14132L28");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke4 = borderStroke2;
                                    i9 = -102343472;
                                    modifier4 = modifier2;
                                } else {
                                    Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape4 = ButtonDefaults.INSTANCE.getFilledTonalShape(startRestartGroup, 6);
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        buttonColors4 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    int i14 = i3;
                                    if ((i2 & 32) != 0) {
                                        buttonElevation2 = ButtonDefaults.INSTANCE.m1770filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                        i3 = i14 & (-458753);
                                    } else {
                                        i3 = i14;
                                    }
                                    if (i5 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    borderStroke4 = borderStroke2;
                                    z4 = z5;
                                    shape5 = shape4;
                                    if (i8 != 0) {
                                        buttonColors5 = buttonColors4;
                                        modifier4 = companion;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        buttonColors5 = buttonColors4;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = companion;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = -102343472;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:288)");
                                }
                                Button(function02, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, startRestartGroup, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                modifier3 = modifier4;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke4;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ButtonKt.FilledTonalButton$lambda$5(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        ButtonColors buttonColors5;
        BorderStroke borderStroke5;
        Shape shape5;
        boolean z4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(399974542);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)360@17981L315:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i10 = 524288;
                        i3 |= i10;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "352@17608L13,353@17665L22,355@17772L29");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke5 = borderStroke2;
                                    i9 = 399974542;
                                    modifier3 = modifier;
                                } else {
                                    Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        shape4 = ButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                        i3 &= -7169;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        buttonColors4 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                        i3 &= -57345;
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        borderStroke4 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                                        i3 &= -3670017;
                                    } else {
                                        borderStroke4 = borderStroke2;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    if (i8 != 0) {
                                        modifier3 = companion;
                                        buttonColors5 = buttonColors4;
                                        borderStroke5 = borderStroke4;
                                        shape5 = shape4;
                                        z4 = z2;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier3 = companion;
                                        buttonColors5 = buttonColors4;
                                        borderStroke5 = borderStroke4;
                                        shape5 = shape4;
                                        z4 = z2;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = 399974542;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:360)");
                                }
                                composer2 = startRestartGroup;
                                Button(function02, modifier3, z4, shape5, buttonColors5, buttonElevation4, borderStroke5, paddingValues3, mutableInteractionSource3, function3, composer2, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke5;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z3 = z2;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ButtonKt.OutlinedButton$lambda$6(Function0.this, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        BorderStroke borderStroke4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        Shape shape4;
        ButtonColors buttonColors4;
        ButtonElevation buttonElevation4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1061374109);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)429@21385L315:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i13 = 2048;
                            i3 |= i13;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i13 = 1024;
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                if ((i2 & 512) != 0) {
                                    i3 |= 805306368;
                                } else if ((i & 805306368) == 0) {
                                    i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "421@21050L9,422@21103L18");
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                            }
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier4 = modifier2;
                                            shape4 = shape2;
                                            buttonColors4 = buttonColors2;
                                            buttonElevation4 = buttonElevation2;
                                            borderStroke4 = borderStroke2;
                                            i11 = -1061374109;
                                            z4 = z2;
                                        } else {
                                            if (i14 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            boolean z5 = i4 == 0 ? z2 : true;
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                                shape2 = ButtonDefaults.INSTANCE.getTextShape(startRestartGroup, 6);
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                                buttonColors2 = ButtonDefaults.INSTANCE.textButtonColors(startRestartGroup, 6);
                                            }
                                            if (i5 != 0) {
                                                buttonElevation2 = null;
                                            }
                                            if (i6 != 0) {
                                                borderStroke2 = null;
                                            }
                                            PaddingValues textButtonContentPadding = i8 != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                            if (i10 != 0) {
                                                boolean z6 = z5;
                                                borderStroke4 = borderStroke2;
                                                z4 = z6;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                boolean z7 = z5;
                                                borderStroke4 = borderStroke2;
                                                z4 = z7;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                            }
                                            paddingValues3 = textButtonContentPadding;
                                            modifier4 = modifier2;
                                            shape4 = shape2;
                                            buttonColors4 = buttonColors2;
                                            buttonElevation4 = buttonElevation2;
                                            i11 = -1061374109;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(i11, i3, -1, "androidx.compose.material3.TextButton (Button.kt:429)");
                                        }
                                        composer2 = startRestartGroup;
                                        Button(function02, modifier4, z4, shape4, buttonColors4, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, composer2, i3 & 2147483646, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        z3 = z4;
                                        shape3 = shape4;
                                        buttonColors3 = buttonColors4;
                                        buttonElevation3 = buttonElevation4;
                                        borderStroke3 = borderStroke4;
                                        paddingValues2 = paddingValues3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        modifier3 = modifier2;
                                        z3 = z2;
                                        shape3 = shape2;
                                        buttonColors3 = buttonColors2;
                                        buttonElevation3 = buttonElevation2;
                                        borderStroke3 = borderStroke2;
                                        paddingValues2 = paddingValues;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ButtonKt.TextButton$lambda$7(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i10 = i9;
                            if ((i2 & 512) != 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i2 & 512) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i2 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
