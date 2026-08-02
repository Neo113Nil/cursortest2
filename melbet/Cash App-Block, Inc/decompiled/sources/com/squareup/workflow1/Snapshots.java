package com.squareup.workflow1;

import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.arcade.components.text.AutoScaleTextKt$$ExternalSyntheticLambda0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import okio.Buffer;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class Snapshots {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* renamed from: FoundationAutoScaleText-ZL-omxE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4002FoundationAutoScaleTextZLomxE(int i, int i2, int i3, int i4, int i5, long j, long j2, Composer composer, Modifier modifier, TextStyle textStyle, final String str, Function1 function1) {
        int i6;
        TextStyle textStyle2;
        Modifier modifier2;
        long j3;
        int i7;
        int i8;
        long j4;
        int i9;
        Function1 function12;
        int i10;
        Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        final Function1 function14;
        str.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(841566725);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            textStyle2 = textStyle;
            i6 |= gapComposer.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i6 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i4 & 3072) == 0) {
            j3 = j;
            i6 |= gapComposer.changed(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i4 & 24576) == 0) {
            i7 = i;
            i6 |= gapComposer.changed(i7) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            i7 = i;
        }
        if ((196608 & i4) == 0) {
            i8 = i2;
            i6 |= gapComposer.changed(i8) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            i8 = i2;
        }
        if ((1572864 & i4) == 0) {
            j4 = j2;
            i6 |= gapComposer.changed(j4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            j4 = j2;
        }
        if ((12582912 & i4) == 0) {
            i9 = i3;
            i6 |= gapComposer.changed(i9) ? 8388608 : 4194304;
        } else {
            i9 = i3;
        }
        int i11 = i5 & 256;
        if (i11 != 0) {
            i6 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            function12 = function1;
            i6 |= gapComposer.changedInstance(function12) ? 67108864 : 33554432;
            i10 = i6;
            if (gapComposer.shouldExecute(i10 & 1, (i10 & 38347923) == 38347922)) {
                gapComposer.skipToGroupEnd();
                function13 = function12;
            } else {
                gapComposer.startDefaults();
                if ((i4 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                    gapComposer.skipToGroupEnd();
                } else if (i11 != 0) {
                    function14 = null;
                    gapComposer.endDefaults();
                    final TextStyle textStyle3 = textStyle2;
                    final long j5 = j3;
                    final int i12 = i7;
                    final int i13 = i8;
                    final long j6 = j4;
                    final int i14 = i9;
                    OffsetKt.BoxWithConstraints(modifier2, null, false, Expect_jvmKt.rememberComposableLambda(570206319, new Function3() { // from class: com.squareup.cash.composeUi.foundation.text.FoundationAutoScaleTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Density density;
                            int i15;
                            int i16;
                            String str2;
                            long pack;
                            BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            boxWithConstraintsScopeImpl.getClass();
                            Density density2 = boxWithConstraintsScopeImpl.density;
                            long j7 = boxWithConstraintsScopeImpl.constraints;
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                TextStyle textStyle4 = TextStyle.this;
                                SpanStyle spanStyle = textStyle4.spanStyle;
                                ParagraphStyle paragraphStyle = textStyle4.paragraphStyle;
                                long j8 = spanStyle.fontSize;
                                boolean changed = gapComposer2.changed(j8);
                                long j9 = j6;
                                boolean changed2 = changed | gapComposer2.changed(j9);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (changed2 || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new TextUnit(j9);
                                    density = density2;
                                    if (!TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j8), TextUnit.m1058getTypeUIouoOA(j9))) {
                                        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("autoSizeMinFontSize type (", TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j9)), ") does not match style font size type (", TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j8)), ")."));
                                        return null;
                                    }
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                } else {
                                    density = density2;
                                }
                                TextUnit textUnit = (TextUnit) rememberedValue;
                                TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer2);
                                long j10 = paragraphStyle.lineHeight;
                                boolean changed3 = gapComposer2.changed(j7);
                                String str3 = str;
                                boolean changed4 = changed3 | gapComposer2.changed(str3) | gapComposer2.changed(j8) | gapComposer2.changed(j10) | gapComposer2.changed(textUnit);
                                int i17 = i13;
                                boolean changed5 = changed4 | gapComposer2.changed(i17) | gapComposer2.changed(rememberTextMeasurer);
                                TextMeasurer textMeasurer = rememberTextMeasurer;
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                String str4 = str3;
                                int i18 = i12;
                                if (changed5 || rememberedValue2 == neverEqualPolicy) {
                                    if (textUnit != null) {
                                        long j11 = textUnit.packedValue;
                                        long j12 = j10;
                                        long j13 = j12;
                                        long j14 = j8;
                                        long j15 = j14;
                                        while (true) {
                                            Room.m1168checkArithmeticNB67dxo(j15, j11);
                                            if (Float.compare(TextUnit.m1059getValueimpl(j15), TextUnit.m1059getValueimpl(j11)) <= 0) {
                                                i15 = i18;
                                                i16 = i17;
                                                str2 = str4;
                                                break;
                                            }
                                            long j16 = j14;
                                            i16 = i17;
                                            long j17 = j12;
                                            str2 = str4;
                                            i15 = i18;
                                            TextMeasurer textMeasurer2 = textMeasurer;
                                            if (!TextMeasurer.m979measurewNUYSr0$default(textMeasurer2, str2, TextStyle.m994copyp1EtxEg$default(textStyle4, 0L, j15, null, null, 0L, null, 0L, null, null, null, i16, j13, null, null, 0, 16613373), i15, boxWithConstraintsScopeImpl.constraints, 972).getDidOverflowHeight()) {
                                                break;
                                            }
                                            if (TextUnit.m1060isSpimpl(j15)) {
                                                pack = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j15) - 2.0f);
                                            } else {
                                                Room.m1167checkArithmeticR2X_6o(j15);
                                                pack = Room.pack(j15 & 1095216660480L, (float) (TextUnit.m1059getValueimpl(j15) * 0.9d));
                                            }
                                            Room.m1168checkArithmeticNB67dxo(pack, j11);
                                            j15 = Float.compare(TextUnit.m1059getValueimpl(pack), TextUnit.m1059getValueimpl(j11)) < 0 ? j11 : pack;
                                            float m1059getValueimpl = TextUnit.m1059getValueimpl(j16);
                                            Room.m1167checkArithmeticR2X_6o(j15);
                                            long pack2 = Room.pack(j15 & 1095216660480L, TextUnit.m1059getValueimpl(j15) / m1059getValueimpl);
                                            float m1059getValueimpl2 = TextUnit.m1059getValueimpl(j17);
                                            Room.m1167checkArithmeticR2X_6o(pack2);
                                            j13 = Room.pack(pack2 & 1095216660480L, TextUnit.m1059getValueimpl(pack2) * m1059getValueimpl2);
                                            textMeasurer = textMeasurer2;
                                            i17 = i16;
                                            j12 = j17;
                                            j14 = j16;
                                            str4 = str2;
                                            i18 = i15;
                                        }
                                        j8 = j15;
                                        j10 = j13;
                                    } else {
                                        i15 = i18;
                                        i16 = i17;
                                        str2 = str4;
                                    }
                                    Pair pair = new Pair(new TextUnit(j8), new TextUnit(j10));
                                    gapComposer2.updateRememberedValue(pair);
                                    rememberedValue2 = pair;
                                } else {
                                    i15 = i18;
                                    i16 = i17;
                                    str2 = str4;
                                }
                                Pair pair2 = (Pair) rememberedValue2;
                                long j18 = ((TextUnit) pair2.first).packedValue;
                                long j19 = ((TextUnit) pair2.second).packedValue;
                                Density density3 = density;
                                Modifier m288sizeInqDBjuR0 = SizeKt.m288sizeInqDBjuR0(Modifier.Companion.$$INSTANCE, density3.mo233toDpu2uoSUM(Constraints.m1027getMinWidthimpl(j7)), density3.mo233toDpu2uoSUM(Constraints.m1026getMinHeightimpl(j7)), boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM());
                                long j20 = j5;
                                if (j20 == 16) {
                                    j20 = textStyle4.m996getColor0d7_KjU();
                                }
                                BasicTextKt.m347BasicTextRWo7tUw(str2, m288sizeInqDBjuR0, TextStyle.m994copyp1EtxEg$default(textStyle4, j20, j18, null, null, 0L, null, 0L, null, null, null, i16, j19, null, null, 0, 16613372), function14, i14, false, i15, 0, null, gapComposer2, 0, 928);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, ((i10 >> 6) & 14) | 3072, 6);
                    function13 = function14;
                }
                function14 = function12;
                gapComposer.endDefaults();
                final TextStyle textStyle32 = textStyle2;
                final long j52 = j3;
                final int i122 = i7;
                final int i132 = i8;
                final long j62 = j4;
                final int i142 = i9;
                OffsetKt.BoxWithConstraints(modifier2, null, false, Expect_jvmKt.rememberComposableLambda(570206319, new Function3() { // from class: com.squareup.cash.composeUi.foundation.text.FoundationAutoScaleTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Density density;
                        int i15;
                        int i16;
                        String str2;
                        long pack;
                        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                        Composer composer2 = (Composer) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        boxWithConstraintsScopeImpl.getClass();
                        Density density2 = boxWithConstraintsScopeImpl.density;
                        long j7 = boxWithConstraintsScopeImpl.constraints;
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                        }
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            TextStyle textStyle4 = TextStyle.this;
                            SpanStyle spanStyle = textStyle4.spanStyle;
                            ParagraphStyle paragraphStyle = textStyle4.paragraphStyle;
                            long j8 = spanStyle.fontSize;
                            boolean changed = gapComposer2.changed(j8);
                            long j9 = j62;
                            boolean changed2 = changed | gapComposer2.changed(j9);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (changed2 || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new TextUnit(j9);
                                density = density2;
                                if (!TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j8), TextUnit.m1058getTypeUIouoOA(j9))) {
                                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("autoSizeMinFontSize type (", TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j9)), ") does not match style font size type (", TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j8)), ")."));
                                    return null;
                                }
                                gapComposer2.updateRememberedValue(rememberedValue);
                            } else {
                                density = density2;
                            }
                            TextUnit textUnit = (TextUnit) rememberedValue;
                            TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer2);
                            long j10 = paragraphStyle.lineHeight;
                            boolean changed3 = gapComposer2.changed(j7);
                            String str3 = str;
                            boolean changed4 = changed3 | gapComposer2.changed(str3) | gapComposer2.changed(j8) | gapComposer2.changed(j10) | gapComposer2.changed(textUnit);
                            int i17 = i132;
                            boolean changed5 = changed4 | gapComposer2.changed(i17) | gapComposer2.changed(rememberTextMeasurer);
                            TextMeasurer textMeasurer = rememberTextMeasurer;
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            String str4 = str3;
                            int i18 = i122;
                            if (changed5 || rememberedValue2 == neverEqualPolicy) {
                                if (textUnit != null) {
                                    long j11 = textUnit.packedValue;
                                    long j12 = j10;
                                    long j13 = j12;
                                    long j14 = j8;
                                    long j15 = j14;
                                    while (true) {
                                        Room.m1168checkArithmeticNB67dxo(j15, j11);
                                        if (Float.compare(TextUnit.m1059getValueimpl(j15), TextUnit.m1059getValueimpl(j11)) <= 0) {
                                            i15 = i18;
                                            i16 = i17;
                                            str2 = str4;
                                            break;
                                        }
                                        long j16 = j14;
                                        i16 = i17;
                                        long j17 = j12;
                                        str2 = str4;
                                        i15 = i18;
                                        TextMeasurer textMeasurer2 = textMeasurer;
                                        if (!TextMeasurer.m979measurewNUYSr0$default(textMeasurer2, str2, TextStyle.m994copyp1EtxEg$default(textStyle4, 0L, j15, null, null, 0L, null, 0L, null, null, null, i16, j13, null, null, 0, 16613373), i15, boxWithConstraintsScopeImpl.constraints, 972).getDidOverflowHeight()) {
                                            break;
                                        }
                                        if (TextUnit.m1060isSpimpl(j15)) {
                                            pack = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j15) - 2.0f);
                                        } else {
                                            Room.m1167checkArithmeticR2X_6o(j15);
                                            pack = Room.pack(j15 & 1095216660480L, (float) (TextUnit.m1059getValueimpl(j15) * 0.9d));
                                        }
                                        Room.m1168checkArithmeticNB67dxo(pack, j11);
                                        j15 = Float.compare(TextUnit.m1059getValueimpl(pack), TextUnit.m1059getValueimpl(j11)) < 0 ? j11 : pack;
                                        float m1059getValueimpl = TextUnit.m1059getValueimpl(j16);
                                        Room.m1167checkArithmeticR2X_6o(j15);
                                        long pack2 = Room.pack(j15 & 1095216660480L, TextUnit.m1059getValueimpl(j15) / m1059getValueimpl);
                                        float m1059getValueimpl2 = TextUnit.m1059getValueimpl(j17);
                                        Room.m1167checkArithmeticR2X_6o(pack2);
                                        j13 = Room.pack(pack2 & 1095216660480L, TextUnit.m1059getValueimpl(pack2) * m1059getValueimpl2);
                                        textMeasurer = textMeasurer2;
                                        i17 = i16;
                                        j12 = j17;
                                        j14 = j16;
                                        str4 = str2;
                                        i18 = i15;
                                    }
                                    j8 = j15;
                                    j10 = j13;
                                } else {
                                    i15 = i18;
                                    i16 = i17;
                                    str2 = str4;
                                }
                                Pair pair = new Pair(new TextUnit(j8), new TextUnit(j10));
                                gapComposer2.updateRememberedValue(pair);
                                rememberedValue2 = pair;
                            } else {
                                i15 = i18;
                                i16 = i17;
                                str2 = str4;
                            }
                            Pair pair2 = (Pair) rememberedValue2;
                            long j18 = ((TextUnit) pair2.first).packedValue;
                            long j19 = ((TextUnit) pair2.second).packedValue;
                            Density density3 = density;
                            Modifier m288sizeInqDBjuR0 = SizeKt.m288sizeInqDBjuR0(Modifier.Companion.$$INSTANCE, density3.mo233toDpu2uoSUM(Constraints.m1027getMinWidthimpl(j7)), density3.mo233toDpu2uoSUM(Constraints.m1026getMinHeightimpl(j7)), boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM());
                            long j20 = j52;
                            if (j20 == 16) {
                                j20 = textStyle4.m996getColor0d7_KjU();
                            }
                            BasicTextKt.m347BasicTextRWo7tUw(str2, m288sizeInqDBjuR0, TextStyle.m994copyp1EtxEg$default(textStyle4, j20, j18, null, null, 0L, null, 0L, null, null, null, i16, j19, null, null, 0, 16613372), function14, i142, false, i15, 0, null, gapComposer2, 0, 928);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i10 >> 6) & 14) | 3072, 6);
                function13 = function14;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AutoScaleTextKt$$ExternalSyntheticLambda0(str, textStyle, modifier, j, i, i2, j2, i3, function13, i4, i5);
                return;
            }
            return;
        }
        function12 = function1;
        i10 = i6;
        if (gapComposer.shouldExecute(i10 & 1, (i10 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static zzb fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            if (jsonObject.get("format_version").getAsLong() == 2) {
                return new zzb(1);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static final long getNotScaledUp(long j, Composer composer) {
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1921523410);
            long sp = Room.getSp((int) Math.min(TextUnit.m1059getValueimpl(j), TextUnit.m1059getValueimpl(j) / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getFontScale()));
            gapComposer.end(false);
            return sp;
        }
        if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1921526804);
            gapComposer2.end(false);
            return j;
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(1921526258);
        long pack = Room.pack(8589934592L, (int) Math.min(TextUnit.m1059getValueimpl(j), TextUnit.m1059getValueimpl(j) / ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).getFontScale()));
        gapComposer3.end(false);
        return pack;
    }

    public static final ByteString readByteStringWithLength(Buffer buffer) {
        return buffer.readByteString(buffer.readInt());
    }

    public static final void writeByteStringWithLength(Buffer buffer, ByteString byteString) {
        byteString.getClass();
        buffer.m4336writeInt(byteString.getSize$okio());
        buffer.m4333write(byteString);
    }
}
