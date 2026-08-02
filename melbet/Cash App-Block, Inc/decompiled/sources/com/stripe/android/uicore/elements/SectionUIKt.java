package com.stripe.android.uicore.elements;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.views.ScanningCardPulseParams;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.fidesmo.views.ScanningShapePulseParams;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.squareup.cash.fidesmo.views.ScanningStepAnimationTrigger;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.SectionStyle;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SectionUIKt {
    public static final void ScanningCardPulse(Modifier modifier, ScanningCardPulseParams scanningCardPulseParams, ScanningStepAnimationTrigger scanningStepAnimationTrigger, Integer num, float f, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-325571792);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(scanningCardPulseParams) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(scanningStepAnimationTrigger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function03) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer = gapComposer2;
            ScanningShapePulseKt.ScanningShapePulse(modifier, ScanningShapePulseParams.m3551copyXu8qxI8$default(ScanningShapePulseKt.defaultScanningShapePulseParams(FidesmoScanningPulseShape.MINI_CARD), scanningCardPulseParams.alignment, scanningCardPulseParams.offsetX, scanningCardPulseParams.offsetY, scanningCardPulseParams.cardSize, scanningCardPulseParams.cardScale, scanningCardPulseParams.primaryOpacity, scanningCardPulseParams.fillDurationSeconds, scanningCardPulseParams.beatDurationSeconds, scanningCardPulseParams.glowScale, scanningCardPulseParams.glowAlpha, scanningCardPulseParams.glowBlur, scanningCardPulseParams.glowPulseAmount, scanningCardPulseParams.glowPulseDurationSeconds, scanningCardPulseParams.cellSize, scanningCardPulseParams.gap, scanningCardPulseParams.cornerRadius, scanningCardPulseParams.spread, scanningCardPulseParams.twinkleSpeed, scanningCardPulseParams.targetFillDurationSeconds, scanningCardPulseParams.targetShapeScaleBoost, scanningCardPulseParams.targetHoldMillis, scanningCardPulseParams.targetSpringDamping, scanningCardPulseParams.targetSpringStiffness, scanningCardPulseParams.stepTurnRotationDegrees, scanningCardPulseParams.stepTurnMaxTurnsPerSpring, scanningCardPulseParams.stepTurnOrbPeakScale, scanningCardPulseParams.stepTurnHoldMillis, scanningCardPulseParams.orbTurnDamping, scanningCardPulseParams.orbTurnStiffness, scanningCardPulseParams.cardTurnDamping, scanningCardPulseParams.cardTurnStiffness, scanningCardPulseParams.orbReturnDamping, scanningCardPulseParams.orbReturnStiffness, scanningCardPulseParams.stabilityAnimationParams, 1, 0), scanningStepAnimationTrigger, num, f, function0, function02, function03, gapComposer, i2 & 33554318);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda3(modifier, scanningCardPulseParams, scanningStepAnimationTrigger, num, f, function0, function02, function03, i, 2);
        }
    }

    public static final void Section(ResolvableString resolvableString, FieldValidationMessage$Error fieldValidationMessage$Error, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-458700875);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(resolvableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(fieldValidationMessage$Error) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SectionTitle(resolvableString, gapComposer, i2 & 14);
            int i3 = i2 >> 3;
            m4071SectionCardfWhpE4E(null, null, z, 0L, null, composableLambdaImpl, gapComposer, (i3 & 896) | ((i2 << 3) & 458752), 27);
            if (fieldValidationMessage$Error != null) {
                gapComposer.startReplaceGroup(25792672);
                SectionValidationMessage(fieldValidationMessage$Error, null, gapComposer, i3 & 14);
            } else {
                gapComposer.startReplaceGroup(24235139);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(resolvableString, fieldValidationMessage$Error, modifier, z, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b9  */
    /* renamed from: SectionCard-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4071SectionCardfWhpE4E(Modifier modifier, Shape shape, boolean z, long j, BorderStroke borderStroke, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        boolean z2;
        long j2;
        BorderStroke borderStroke2;
        GapComposer gapComposer;
        Modifier modifier3;
        Shape shape3;
        long j3;
        BorderStroke borderStroke3;
        RecomposeScopeImpl endRestartGroup;
        Shape shape4;
        BorderStroke borderStroke4;
        long j4;
        Modifier modifier4;
        Shape shape5;
        boolean z3;
        long j5;
        BorderStroke borderStroke5;
        int i4;
        int i5;
        int i6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-130083887);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (gapComposer2.changed(shape2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (gapComposer2.changed(j2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    borderStroke2 = borderStroke;
                    if (gapComposer2.changed(borderStroke2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    borderStroke2 = borderStroke;
                }
                i4 = PKIFailureInfo.certRevoked;
                i3 |= i4;
            } else {
                borderStroke2 = borderStroke;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                j3 = j2;
                borderStroke3 = borderStroke2;
            } else {
                gapComposer2.startDefaults();
                int i9 = i & 1;
                float f = RecyclerView.DECELERATION_RATE;
                if (i9 == 0 || gapComposer2.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        shape4 = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).medium;
                        i3 &= -113;
                    } else {
                        shape4 = shape2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j2 = ((StripeColors) gapComposer2.consume(StripeThemeKt.LocalColors)).component;
                    }
                    if ((i2 & 16) != 0) {
                        float m4066getBorderStrokeWidth6a0pyJM = StripeThemeKt.m4066getBorderStrokeWidth6a0pyJM(z2, RecyclerView.DECELERATION_RATE, gapComposer2, (i3 >> 3) & 112, 2);
                        if (z2) {
                            gapComposer2.startReplaceGroup(-686192553);
                            j5 = StripeThemeKt.getStripeColors(gapComposer2).materialColors.m485getPrimary0d7_KjU();
                            z3 = false;
                        } else {
                            z3 = false;
                            gapComposer2.startReplaceGroup(-686191713);
                            j5 = StripeThemeKt.getStripeColors(gapComposer2).componentBorder;
                        }
                        gapComposer2.end(z3);
                        borderStroke4 = CanvasKt.m173BorderStrokecXLIe8U(j5, m4066getBorderStrokeWidth6a0pyJM);
                        i3 &= -57345;
                    } else {
                        borderStroke4 = borderStroke2;
                    }
                    j4 = j2;
                    modifier4 = modifier5;
                    shape5 = shape4;
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    borderStroke4 = borderStroke2;
                    j4 = j2;
                    modifier4 = modifier2;
                    shape5 = shape2;
                }
                gapComposer2.endDefaults();
                SectionStyle sectionStyle = (SectionStyle) gapComposer2.consume(StripeThemeKt.LocalSectionStyle);
                if (z2) {
                    f = 1.5f;
                }
                int ordinal = sectionStyle.ordinal();
                if (ordinal == 0) {
                    borderStroke5 = borderStroke4;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    borderStroke5 = null;
                }
                gapComposer = gapComposer2;
                CardKt.m466CardFjzlyU(modifier4, shape5, j4, borderStroke5, f, Expect_jvmKt.rememberComposableLambda(1258822772, new StripeThemeKt$$ExternalSyntheticLambda0(sectionStyle, borderStroke4, shape5, composableLambdaImpl, 1), gapComposer2), gapComposer, (i3 & 14) | 1572864 | (i3 & 112) | ((i3 >> 3) & 896), 8);
                borderStroke3 = borderStroke4;
                modifier3 = modifier4;
                shape3 = shape5;
                j3 = j4;
            }
            boolean z4 = z2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SectionUIKt$$ExternalSyntheticLambda1(modifier3, shape3, z4, j3, borderStroke3, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        boolean z42 = z2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SectionTitle(ResolvableString resolvableString, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1151512973);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(resolvableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 7;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (resolvableString == null) {
                gapComposer.startReplaceGroup(819258125);
            } else {
                gapComposer.startReplaceGroup(819258126);
                String resolve = ScanningShapePulseKt.resolve(resolvableString, gapComposer);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                H6TextKt.H6Text(0, gapComposer, SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, true, (Function1) rememberedValue), resolve, false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(resolvableString, i, i3);
        }
    }

    public static final void SectionValidationMessage(FieldValidationMessage$Error fieldValidationMessage$Error, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        fieldValidationMessage$Error.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(32943648);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(fieldValidationMessage$Error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String resolve = ScanningShapePulseKt.resolve(fieldValidationMessage$Error.getResolvable(), gapComposer2);
            long m483getError0d7_KjU = ((Colors) gapComposer2.consume(ColorsKt.LocalColors)).m483getError0d7_KjU();
            TextStyle textStyle = ((Typography) gapComposer2.consume(TypographyKt.LocalTypography)).h6;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(8);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(resolve, SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, true, (Function1) rememberedValue), m483getError0d7_KjU, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, gapComposer, 0, 0, 65528);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(fieldValidationMessage$Error, modifier2, i, 21);
        }
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int zza = ScanningHeartPulseKt.zza(obj);
        int i4 = zza & i;
        int zzc = zzc(i4, obj3);
        if (zzc != 0) {
            int i5 = ~i;
            int i6 = zza & i5;
            int i7 = -1;
            while (true) {
                i2 = zzc - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !ScanningStarPulseKt.zza(obj, objArr[i2]) || (objArr2 != null && !ScanningStarPulseKt.zza(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    zzc = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                zze(i4, i9, obj3);
                return i2;
            }
            iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            return i2;
        }
        return -1;
    }

    public static int zzc(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void zze(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
