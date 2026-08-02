package com.stripe.android.uicore.elements.compat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DefaultTextFieldColors;
import androidx.compose.material.Shapes;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda2;
import androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda1;
import androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda2;
import androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0;
import androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1;
import androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.Trifle;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda20;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class CompatTextFieldKt {
    public static final long AutofillTransparentColor = ColorKt.Color(0);

    public static final void CommonDecorationBox(String str, final ComposableLambdaImpl composableLambdaImpl, VisualTransformation visualTransformation, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final boolean z, final boolean z2, final boolean z3, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final PaddingValuesImpl paddingValuesImpl, final Shape shape, final TextFieldColors textFieldColors, Composer composer, int i, int i2) {
        int i3;
        int i4;
        GapComposer gapComposer;
        boolean z4;
        boolean z5;
        str.getClass();
        visualTransformation.getClass();
        mutableInteractionSourceImpl.getClass();
        shape.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1102660609);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(visualTransformation) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changedInstance(function23) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changedInstance(function24) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(z3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(mutableInteractionSourceImpl) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(paddingValuesImpl) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(shape) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(textFieldColors) ? 2048 : 1024;
        }
        int i5 = i4;
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            boolean z6 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(str));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final String str2 = ((TransformedText) rememberedValue).text.text;
            InputPhase inputPhase = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, i5 & 14).getValue()).booleanValue() ? InputPhase.Focused : str2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(textFieldColors, z2, z3, mutableInteractionSourceImpl, 1);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = TypographyKt.LocalTypography;
            Typography typography = (Typography) gapComposer2.consume(staticProvidableCompositionLocal);
            TextStyle textStyle = typography.subtitle1;
            TextStyle textStyle2 = typography.caption;
            long m996getColor0d7_KjU = textStyle.m996getColor0d7_KjU();
            long j = Color.Unspecified;
            final boolean z7 = (Color.m676equalsimpl0(m996getColor0d7_KjU, j) && !Color.m676equalsimpl0(textStyle2.m996getColor0d7_KjU(), j)) || (!Color.m676equalsimpl0(textStyle.m996getColor0d7_KjU(), j) && Color.m676equalsimpl0(textStyle2.m996getColor0d7_KjU(), j));
            gapComposer2.startReplaceGroup(1200131642);
            long m996getColor0d7_KjU2 = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).caption.m996getColor0d7_KjU();
            if (z7) {
                gapComposer2.startReplaceGroup(-1288879584);
                if (m996getColor0d7_KjU2 == 16) {
                    m996getColor0d7_KjU2 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, gapComposer2, 0)).value;
                }
                z4 = false;
            } else {
                z4 = false;
                gapComposer2.startReplaceGroup(-1288501407);
            }
            gapComposer2.end(z4);
            long j2 = m996getColor0d7_KjU2;
            gapComposer2.end(z4);
            gapComposer2.startReplaceGroup(1200137756);
            long m996getColor0d7_KjU3 = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).subtitle1.m996getColor0d7_KjU();
            if (z7) {
                gapComposer2.startReplaceGroup(-66276959);
                if (m996getColor0d7_KjU3 == 16) {
                    m996getColor0d7_KjU3 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, gapComposer2, 0)).value;
                }
                z5 = false;
            } else {
                z5 = false;
                gapComposer2.startReplaceGroup(-556325952);
            }
            gapComposer2.end(z5);
            long j3 = m996getColor0d7_KjU3;
            gapComposer2.end(z5);
            gapComposer = gapComposer2;
            TextFieldTransitionScope.INSTANCE.m4075TransitionDTcfvLk(inputPhase, j2, j3, textFieldImplKt$CommonDecorationBox$labelColor$1, function2 != null ? true : z5, Expect_jvmKt.rememberComposableLambda(790678428, new Function6() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3
                @Override // kotlin.jvm.functions.Function6
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i6;
                    final float f;
                    ComposableLambdaImpl composableLambdaImpl2;
                    TextFieldColors textFieldColors2;
                    boolean z8;
                    ComposableLambdaImpl composableLambdaImpl3;
                    ComposableLambdaImpl rememberComposableLambda;
                    float floatValue = ((Number) obj).floatValue();
                    final long j4 = ((Color) obj2).value;
                    final long j5 = ((Color) obj3).value;
                    float floatValue2 = ((Number) obj4).floatValue();
                    Composer composer2 = (Composer) obj5;
                    int intValue = ((Number) obj6).intValue();
                    int i7 = 2;
                    if ((intValue & 6) == 0) {
                        i6 = (((GapComposer) composer2).changed(floatValue) ? 4 : 2) | intValue;
                    } else {
                        i6 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i6 |= ((GapComposer) composer2).changed(j4) ? 32 : 16;
                    }
                    if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                        i6 |= ((GapComposer) composer2).changed(j5) ? 256 : 128;
                    }
                    if ((intValue & 3072) == 0) {
                        i6 |= ((GapComposer) composer2).changed(floatValue2) ? 2048 : 1024;
                    }
                    int i8 = i6;
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(i8 & 1, (i8 & 9363) != 9362)) {
                        ComposableLambdaImpl composableLambdaImpl4 = null;
                        final Function2 function25 = Function2.this;
                        if (function25 == null) {
                            gapComposer3.startReplaceGroup(1500559198);
                            gapComposer3.end(false);
                            f = floatValue;
                            composableLambdaImpl2 = null;
                        } else {
                            gapComposer3.startReplaceGroup(1500559199);
                            f = floatValue;
                            final boolean z9 = z7;
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-424665208, new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = TypographyKt.LocalTypography;
                                        TextStyle lerp = BundleKt.lerp(((Typography) gapComposer4.consume(staticProvidableCompositionLocal2)).subtitle1, ((Typography) gapComposer4.consume(staticProvidableCompositionLocal2)).caption, f);
                                        if (z9) {
                                            lerp = TextStyle.m994copyp1EtxEg$default(lerp, j4, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                        }
                                        CompatTextFieldKt.m4074DecorationeuL9pac(j5, lerp, function25, gapComposer4, MLKEMEngine.KyberPolyBytes, 0);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer3);
                            gapComposer3.end(false);
                            composableLambdaImpl2 = rememberComposableLambda2;
                        }
                        boolean z10 = z2;
                        TextFieldColors textFieldColors3 = textFieldColors;
                        Function2 function26 = function22;
                        if (function26 == null || str2.length() != 0 || floatValue2 <= RecyclerView.DECELERATION_RATE) {
                            textFieldColors2 = textFieldColors3;
                            z8 = z10;
                            gapComposer3.startReplaceGroup(1501765378);
                            gapComposer3.end(false);
                            composableLambdaImpl3 = null;
                        } else {
                            gapComposer3.startReplaceGroup(1501338353);
                            TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0 textFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0 = new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0(floatValue2, textFieldColors3, z10, function26, 1);
                            textFieldColors2 = textFieldColors3;
                            z8 = z10;
                            composableLambdaImpl3 = Expect_jvmKt.rememberComposableLambda(154418702, textFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0, gapComposer3);
                            gapComposer3.end(false);
                        }
                        boolean z11 = z3;
                        long j6 = ((Color) textFieldColors2.mo491leadingIconColor(z8, z11, gapComposer3).getValue()).value;
                        Function2 function27 = function23;
                        if (function27 == null) {
                            gapComposer3.startReplaceGroup(1501973604);
                            gapComposer3.end(false);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer3.startReplaceGroup(1501973605);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(704901338, new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1(j6, function27, i7), gapComposer3);
                            gapComposer3.end(false);
                        }
                        long j7 = ((Color) textFieldColors2.trailingIconColor(z8, z11, mutableInteractionSourceImpl, gapComposer3).getValue()).value;
                        Function2 function28 = function24;
                        if (function28 == null) {
                            gapComposer3.startReplaceGroup(1502275203);
                        } else {
                            gapComposer3.startReplaceGroup(1502275204);
                            composableLambdaImpl4 = Expect_jvmKt.rememberComposableLambda(-1742107582, new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1(j7, function28, 3), gapComposer3);
                        }
                        gapComposer3.end(false);
                        ScanningHeartPulseKt.TextFieldLayout(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, ((Color) textFieldColors2.backgroundColor(gapComposer3).getValue()).value, shape), composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, rememberComposableLambda, composableLambdaImpl4, z, f, paddingValuesImpl, gapComposer3, (i8 << 21) & 29360128);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1769472);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda1(str, composableLambdaImpl, visualTransformation, function2, function22, function23, function24, z, z2, z3, mutableInteractionSourceImpl, paddingValuesImpl, shape, textFieldColors, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompatTextField(final TextFieldValue textFieldValue, final Function1 function1, final Modifier modifier, final boolean z, TextStyle textStyle, final Function2 function2, Function2 function22, final Function2 function23, final boolean z2, final String str, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, final DefaultTextFieldColors defaultTextFieldColors, final PaddingValuesImpl paddingValuesImpl, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        GapComposer gapComposer;
        final TextStyle textStyle2;
        final Function2 function24;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z4;
        final int i13;
        final int i14;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final Shape shape2;
        RecomposeScopeImpl endRestartGroup;
        KeyboardActions keyboardActions3;
        final boolean z5;
        final int i15;
        final Shape copy$default;
        final KeyboardActions keyboardActions4;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions3;
        final int i16;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        final Function2 function25;
        int i17;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-876476742);
        int i18 = (gapComposer2.changed(textFieldValue) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i18 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i18 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        int i19 = 90112 | i18;
        int i20 = i5 & 128;
        if (i20 != 0) {
            i6 = i18 | 12673024;
        } else {
            i6 = i19 | (gapComposer2.changedInstance(function22) ? 8388608 : 4194304);
        }
        int i21 = i6 | 100663296 | (gapComposer2.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if ((i4 & 6) == 0) {
            i7 = i4 | (gapComposer2.changed(z2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= gapComposer2.changed(str) ? 32 : 16;
        }
        int i22 = i7;
        int i23 = i5 & 4096;
        if (i23 != 0) {
            i22 |= MLKEMEngine.KyberPolyBytes;
            i8 = i23;
        } else {
            i8 = i23;
            if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i22 |= gapComposer2.changed(visualTransformation) ? 256 : 128;
                i9 = i5 & PKIFailureInfo.certRevoked;
                if (i9 == 0) {
                    i22 |= 3072;
                    i10 = i9;
                } else {
                    i10 = i9;
                    if ((i4 & 3072) == 0) {
                        i22 |= gapComposer2.changed(keyboardOptions) ? 2048 : 1024;
                        if ((i4 & 24576) == 0) {
                            if ((i5 & 16384) == 0 && gapComposer2.changed(keyboardActions)) {
                                i17 = 16384;
                                i22 |= i17;
                            }
                            i17 = PKIFailureInfo.certRevoked;
                            i22 |= i17;
                        }
                        i11 = i5 & 32768;
                        if (i11 != 0) {
                            i22 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i22 |= gapComposer2.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                        if ((i4 & 1572864) == 0) {
                            i22 |= PKIFailureInfo.signerNotTrusted;
                        }
                        i12 = i22 | 113246208;
                        if ((i4 & 805306368) == 0) {
                            i12 = i22 | 381681664;
                        }
                        if (gapComposer2.shouldExecute(i21 & 1, ((i21 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (((gapComposer2.changed(defaultTextFieldColors) ? (char) 4 : (char) 2) | (gapComposer2.changed(paddingValuesImpl) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
                            gapComposer2.startDefaults();
                            if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                TextStyle textStyle3 = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
                                Function2 function26 = i20 != 0 ? null : function22;
                                VisualTransformation visualTransformation4 = i8 != 0 ? VisualTransformation.Companion.None : visualTransformation;
                                KeyboardOptions keyboardOptions4 = i10 != 0 ? KeyboardOptions.Default : keyboardOptions;
                                if ((i5 & 16384) != 0) {
                                    textStyle = textStyle3;
                                    keyboardActions3 = new KeyboardActions(null, null, null, 63);
                                } else {
                                    textStyle = textStyle3;
                                    keyboardActions3 = keyboardActions;
                                }
                                boolean z6 = i11 != 0 ? false : z3;
                                int i24 = z6 ? 1 : Integer.MAX_VALUE;
                                boolean z7 = z6;
                                Object rememberedValue = gapComposer2.rememberedValue();
                                int i25 = i24;
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                }
                                CornerBasedShape cornerBasedShape = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).small;
                                Trifle trifle = CornerSizeKt.ZeroCornerSize;
                                z5 = z7;
                                i15 = i25;
                                copy$default = CornerBasedShape.copy$default(cornerBasedShape, null, null, trifle, trifle, 3);
                                keyboardActions4 = keyboardActions3;
                                visualTransformation3 = visualTransformation4;
                                keyboardOptions3 = keyboardOptions4;
                                i16 = 1;
                                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                                function25 = function26;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                function25 = function22;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions4 = keyboardActions;
                                z5 = z3;
                                i15 = i;
                                i16 = i2;
                                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                                copy$default = shape;
                            }
                            TextStyle textStyle4 = textStyle;
                            gapComposer2.endDefaults();
                            gapComposer2.startReplaceGroup(-480516460);
                            long m996getColor0d7_KjU = textStyle4.m996getColor0d7_KjU();
                            if (m996getColor0d7_KjU == 16) {
                                m996getColor0d7_KjU = ((Color) defaultTextFieldColors.textColor(z, gapComposer2).getValue()).value;
                            }
                            long j = m996getColor0d7_KjU;
                            gapComposer2.end(false);
                            final TextStyle merge = textStyle4.merge(new TextStyle(j, 0L, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
                            final MutableInteractionSourceImpl mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                            gapComposer = gapComposer2;
                            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(AutofillTransparentColor, AutofillHighlightKt.LocalAutofillHighlightColor), Expect_jvmKt.rememberComposableLambda(1584450426, new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    int i26 = 2;
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        final boolean z8 = z;
                                        final boolean z9 = z2;
                                        final MutableInteractionSourceImpl mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                                        final DefaultTextFieldColors defaultTextFieldColors2 = defaultTextFieldColors;
                                        Modifier composed = PlatformKt.composed(Modifier.this, new TextFieldDefaults$$ExternalSyntheticLambda2(z8, z9, mutableInteractionSourceImpl5, defaultTextFieldColors2, 2.0f, 1.0f));
                                        composed.getClass();
                                        Modifier composed2 = PlatformKt.composed(composed, new SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(str, i26, z9));
                                        SolidColor solidColor = new SolidColor(((Color) defaultTextFieldColors2.cursorColor(z9, gapComposer3).getValue()).value);
                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                        final Function2 function27 = function2;
                                        final Function2 function28 = function25;
                                        final Function2 function29 = function23;
                                        final VisualTransformation visualTransformation5 = visualTransformation3;
                                        final boolean z10 = z5;
                                        final Shape shape3 = copy$default;
                                        final PaddingValuesImpl paddingValuesImpl2 = paddingValuesImpl;
                                        BasicTextFieldKt.BasicTextField(textFieldValue2, function1, composed2, z8, merge, keyboardOptions3, keyboardActions4, z10, i15, i16, visualTransformation5, null, mutableInteractionSourceImpl5, solidColor, Expect_jvmKt.rememberComposableLambda(1069238135, new Function3() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2 function210 = (Function2) obj3;
                                                Composer composer3 = (Composer) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                function210.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((GapComposer) composer3).changedInstance(function210) ? 4 : 2;
                                                }
                                                GapComposer gapComposer4 = (GapComposer) composer3;
                                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    CompatTextFieldKt.InsetDecorationBox(TextFieldValue.this.annotatedString.text, function210, z8, function27, function28, null, function29, z9, visualTransformation5, z10, mutableInteractionSourceImpl5, shape3, defaultTextFieldColors2, paddingValuesImpl2, gapComposer4, (intValue2 << 3) & 112);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 0, 196608, 4096);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), gapComposer, 56);
                            int i26 = i15;
                            keyboardActions2 = keyboardActions4;
                            visualTransformation2 = visualTransformation3;
                            i13 = i26;
                            i14 = i16;
                            function24 = function25;
                            shape2 = copy$default;
                            textStyle2 = textStyle4;
                            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                            z4 = z5;
                            keyboardOptions2 = keyboardOptions3;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            textStyle2 = textStyle;
                            function24 = function22;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z4 = z3;
                            i13 = i;
                            i14 = i2;
                            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                            shape2 = shape;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i4);
                                    CompatTextFieldKt.CompatTextField(TextFieldValue.this, function1, modifier, z, textStyle2, function2, function24, function23, z2, str, visualTransformation2, keyboardOptions2, keyboardActions2, z4, i13, i14, mutableInteractionSourceImpl2, shape2, defaultTextFieldColors, paddingValuesImpl, (Composer) obj, updateChangedFlags, updateChangedFlags2, i5);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                if ((i4 & 24576) == 0) {
                }
                i11 = i5 & 32768;
                if (i11 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i12 = i22 | 113246208;
                if ((i4 & 805306368) == 0) {
                }
                if (gapComposer2.shouldExecute(i21 & 1, ((i21 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (((gapComposer2.changed(defaultTextFieldColors) ? (char) 4 : (char) 2) | (gapComposer2.changed(paddingValuesImpl) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        }
        i9 = i5 & PKIFailureInfo.certRevoked;
        if (i9 == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i11 = i5 & 32768;
        if (i11 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i12 = i22 | 113246208;
        if ((i4 & 805306368) == 0) {
        }
        if (gapComposer2.shouldExecute(i21 & 1, ((i21 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (((gapComposer2.changed(defaultTextFieldColors) ? (char) 4 : (char) 2) | (gapComposer2.changed(paddingValuesImpl) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m4074DecorationeuL9pac(long j, TextStyle textStyle, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1020207716);
        int i4 = (gapComposer.changed(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changed(textStyle) ? 32 : 16);
        }
        Float f = null;
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed((Object) null) ? 256 : 128;
        }
        int i6 = i3 | (gapComposer.changedInstance(function2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                textStyle = null;
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(832511270, new TextFieldImplKt$$ExternalSyntheticLambda2(j, f, function2, 2), gapComposer);
            if (textStyle != null) {
                gapComposer.startReplaceGroup(-1167046902);
                TextKt.ProvideTextStyle(textStyle, rememberComposableLambda, gapComposer, ((i6 >> 3) & 14) | 48);
            } else {
                gapComposer.startReplaceGroup(-1167045266);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        TextStyle textStyle2 = textStyle;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda3(j, textStyle2, function2, i, i2, 1);
        }
    }

    public static final void InsetDecorationBox(String str, Function2 function2, boolean z, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, VisualTransformation visualTransformation, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        boolean z4;
        GapComposer gapComposer;
        float f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1433396717);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z4 = z;
            i2 |= gapComposer2.changed(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function23) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer2.changedInstance(function24) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer2.changedInstance(function25) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer2.changed(visualTransformation) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer2.changed(z3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i3 = 128;
        int i4 = (gapComposer2.changed(mutableInteractionSourceImpl) ? 4 : 2) | (gapComposer2.changed(shape) ? 32 : 16);
        if (gapComposer2.changed(textFieldColors)) {
            i3 = 256;
        }
        int i5 = i4 | i3 | (gapComposer2.changed(paddingValues) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, ((i2 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection);
            float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValues, layoutDirection);
            float f2 = RecyclerView.DECELERATION_RATE;
            if (function24 != null) {
                float f3 = calculateStartPadding - CompatConstantsKt.HorizontalIconPadding;
                if (f3 < RecyclerView.DECELERATION_RATE) {
                    f3 = 0.0f;
                }
                f = f3;
            } else {
                f = 0.0f;
            }
            if (function25 != null) {
                float f4 = calculateEndPadding - CompatConstantsKt.HorizontalIconPadding;
                if (f4 >= RecyclerView.DECELERATION_RATE) {
                    f2 = f4;
                }
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, f, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i6 = i5 & 14;
            int i7 = i5 << 3;
            CommonDecorationBox(str, Expect_jvmKt.rememberComposableLambda(-1139891101, new ToastKt$$ExternalSyntheticLambda11(24, function2), gapComposer2), visualTransformation, function22, function23, function24, function25, z3, z4, z2, mutableInteractionSourceImpl, new PaddingValuesImpl(function24 != null ? CompatConstantsKt.TextFieldPadding : calculateStartPadding, paddingValues.mo267calculateTopPaddingD9Ej5fM(), function25 != null ? CompatConstantsKt.TextFieldPadding : calculateEndPadding, paddingValues.mo264calculateBottomPaddingD9Ej5fM()), shape, textFieldColors, gapComposer2, (i2 & 14) | 48 | ((i2 >> 18) & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 >> 6) & 29360128) | (234881024 & (i2 << 18)) | (1879048192 & (i2 << 6)), i6 | (i7 & 896) | (i7 & 7168));
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(str, function2, z, function22, function23, function24, function25, z2, visualTransformation, z3, mutableInteractionSourceImpl, shape, textFieldColors, paddingValues, i);
        }
    }

    public static final void CompatTextField(String str, Function1 function1, Modifier modifier, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, boolean z, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z2, int i, int i2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, DefaultTextFieldColors defaultTextFieldColors, PaddingValuesImpl paddingValuesImpl, Composer composer, int i3) {
        GapComposer gapComposer;
        TextStyle textStyle2;
        int i4;
        int i5;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        Shape shape2;
        TextStyle textStyle3;
        int i6;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        Shape copy$default;
        int i7;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-327306771);
        int i8 = i3 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | (gapComposer2.changed(true) ? 2048 : 1024) | 90112 | (gapComposer2.changedInstance(function23) ? 67108864 : 33554432) | (gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i8 & 1, ((i8 & 306783379) == 306783378 && (((((('0' | (gapComposer2.changed(z) ? (char) 4 : (char) 2)) | (gapComposer2.changed(visualTransformation) ? (char) 256 : (char) 128)) | (gapComposer2.changed(keyboardOptions) ? (char) 2048 : (char) 1024)) | (gapComposer2.changed(keyboardActions) ? 16384 : PKIFailureInfo.certRevoked)) | 382205952) & 306783379) == 306783378 && (((gapComposer2.changed(defaultTextFieldColors) ? (char) 4 : (char) 2) | (gapComposer2.changed(paddingValuesImpl) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
                textStyle3 = textStyle;
                i6 = i;
                i7 = i2;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                copy$default = shape;
            } else {
                textStyle3 = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
                int i9 = z2 ? 1 : Integer.MAX_VALUE;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                }
                CornerBasedShape cornerBasedShape = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).small;
                Trifle trifle = CornerSizeKt.ZeroCornerSize;
                i6 = i9;
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                copy$default = CornerBasedShape.copy$default(cornerBasedShape, null, null, trifle, trifle, 3);
                i7 = 1;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-1009152249);
            long m996getColor0d7_KjU = textStyle3.m996getColor0d7_KjU();
            if (m996getColor0d7_KjU == 16) {
                m996getColor0d7_KjU = ((Color) defaultTextFieldColors.textColor(true, gapComposer2).getValue()).value;
            }
            long j = m996getColor0d7_KjU;
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(AutofillTransparentColor, AutofillHighlightKt.LocalAutofillHighlightColor), Expect_jvmKt.rememberComposableLambda(-1851967827, new CompatTextFieldKt$$ExternalSyntheticLambda3(modifier, z, mutableInteractionSourceImpl3, defaultTextFieldColors, str, function1, textStyle3.merge(new TextStyle(j, 0L, null, null, 0L, 0L, 0, 0, 0L, null, 16777214)), keyboardOptions, keyboardActions, z2, i6, i7, visualTransformation, function2, function22, function23, copy$default, paddingValuesImpl), gapComposer), gapComposer, 56);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
            i4 = i6;
            i5 = i7;
            shape2 = copy$default;
            textStyle2 = textStyle3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            textStyle2 = textStyle;
            i4 = i;
            i5 = i2;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            shape2 = shape;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CompatTextFieldKt$$ExternalSyntheticLambda3(str, function1, modifier, textStyle2, function2, function22, function23, z, visualTransformation, keyboardOptions, keyboardActions, z2, i4, i5, mutableInteractionSourceImpl2, shape2, defaultTextFieldColors, paddingValuesImpl, i3);
        }
    }
}
