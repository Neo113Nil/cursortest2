package kotlinx.serialization.json;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.TextKt$Text$1$1;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonElementBuildersKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public abstract class JsonElementBuildersKt {
    /* renamed from: InvestingCarouselCard-3IgeMak, reason: not valid java name */
    public static final void m4210InvestingCarouselCard3IgeMak(Function0 function0, long j, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1639783633);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            composableLambdaImpl2 = composableLambdaImpl;
            KeypadKt.m3648PushOnPressCardIkByU14(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, 144.0f, 160.0f), null, j, function0, null, Expect_jvmKt.rememberComposableLambda(-1136180575, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl2, 13), gapComposer), gapComposer, ((i2 << 3) & 896) | 100687878 | ((i2 << 15) & 458752));
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 6, j, function0, composableLambdaImpl2);
        }
    }

    /* renamed from: MarkdownBasicText-JAgEBs0, reason: not valid java name */
    public static final void m4211MarkdownBasicTextJAgEBs0(final String str, final TextStyle textStyle, Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        final Modifier modifier2;
        int i7;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i8;
        final boolean z2;
        final int i9;
        final int i10;
        Modifier modifier3;
        long j9;
        long j10;
        int i11;
        long j11;
        long j12;
        int i12;
        boolean z3;
        int i13;
        int i14;
        Modifier modifier4;
        long j13;
        str.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1931234560);
        if ((i4 & 6) == 0) {
            i6 = i4 | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i6 = i4;
        }
        int i15 = i6 | (gapComposer.changed(textStyle) ? 32 : 16);
        int i16 = i5 & 4;
        if (i16 != 0) {
            i7 = i15 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i7 = i15 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i17 = i7 | 920349696;
        if (gapComposer.shouldExecute(i17 & 1, (306783379 & i17) != 306783378)) {
            gapComposer.startDefaults();
            if ((i4 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = i16 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                j9 = Color.Unspecified;
                j10 = TextUnit.Unspecified;
                i11 = Integer.MAX_VALUE;
                j11 = j10;
                j12 = j11;
                i12 = 1;
                z3 = true;
                i13 = 1;
            } else {
                gapComposer.skipToGroupEnd();
                j10 = j2;
                j11 = j3;
                j12 = j4;
                i12 = i;
                z3 = z;
                i11 = i2;
                i13 = i3;
                modifier3 = modifier2;
                j9 = j;
            }
            gapComposer.endDefaults();
            if (j9 != 16) {
                gapComposer.startReplaceGroup(1973963117);
                gapComposer.end(false);
                i14 = i17;
                modifier4 = modifier3;
                j13 = j9;
            } else if (textStyle.m996getColor0d7_KjU() != 16) {
                gapComposer.startReplaceGroup(1974018855);
                gapComposer.end(false);
                j13 = textStyle.m996getColor0d7_KjU();
                i14 = i17;
                modifier4 = modifier3;
            } else {
                gapComposer.startReplaceGroup(1974052242);
                i14 = i17;
                modifier4 = modifier3;
                long j14 = ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).text;
                gapComposer.end(false);
                j13 = j14;
            }
            TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle, 0L, j10, null, null, j11, null, 0, j12, 16609105);
            boolean changed = gapComposer.changed(j13);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TextKt$Text$1$1(j13, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i18 = i12;
            boolean z4 = z3;
            int i19 = i11;
            int i20 = i13;
            BasicTextKt.m347BasicTextRWo7tUw(str, modifier4, m995mergedA7vx0o$default, null, i18, z4, i19, i20, (ColorProducer) rememberedValue, gapComposer, (i14 & 14) | ((i14 >> 3) & 112) | 14380032, 512);
            long j15 = j12;
            i8 = i18;
            j6 = j10;
            j7 = j11;
            j8 = j15;
            z2 = z4;
            i10 = i20;
            i9 = i19;
            j5 = j9;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i8 = i;
            z2 = z;
            i9 = i2;
            i10 = i3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.mikepenz.markdown.compose.elements.material.TextWrapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i4 | 1);
                    JsonElementBuildersKt.m4211MarkdownBasicTextJAgEBs0(str, textStyle, modifier2, j5, j6, j7, j8, i8, z2, i9, i10, (Composer) obj, updateChangedFlags, i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008c  */
    /* renamed from: MarkdownBasicText-eIOHA4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4212MarkdownBasicTexteIOHA4g(AnnotatedString annotatedString, TextStyle textStyle, Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, Composer composer, int i4, int i5, int i6) {
        int i7;
        TextStyle textStyle2;
        Modifier modifier2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Map map2;
        int i15;
        Function1 function12;
        GapComposer gapComposer;
        long j5;
        int i16;
        Function1 function13;
        Map map3;
        Modifier modifier3;
        int i17;
        long j6;
        long j7;
        long j8;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        long j9;
        long j10;
        Map map4;
        int i18;
        Function1 function14;
        Map map5;
        int i19;
        int i20;
        int i21;
        long j11;
        long j12;
        int i22;
        int i23;
        long j13;
        annotatedString.getClass();
        textStyle.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(679120460);
        if ((i4 & 6) == 0) {
            i7 = (gapComposer2.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            textStyle2 = textStyle;
            i7 |= gapComposer2.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        int i24 = i6 & 4;
        if (i24 != 0) {
            i7 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i8 = i7 | 920349696;
            int i25 = (i5 & 6) != 0 ? i5 | 2 : i5;
            int i26 = i25 | 48;
            i9 = i6 & 4096;
            if (i9 == 0) {
                i26 = i25 | 432;
            } else if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                i10 = i;
                i26 |= gapComposer2.changed(i10) ? 256 : 128;
                int i27 = i26 | 3072;
                i11 = i6 & 16384;
                if (i11 != 0) {
                    i27 = i26 | 27648;
                } else if ((i5 & 24576) == 0) {
                    i12 = i2;
                    i27 |= gapComposer2.changed(i12) ? 16384 : PKIFailureInfo.certRevoked;
                    i13 = 196608 | i27;
                    i14 = i6 & 65536;
                    if (i14 == 0) {
                        i13 = 1769472 | i27;
                    } else if ((1572864 & i5) == 0) {
                        map2 = map;
                        i13 |= gapComposer2.changedInstance(map2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        i15 = i6 & PKIFailureInfo.unsupportedVersion;
                        if (i15 != 0) {
                            i13 |= 12582912;
                            function12 = function1;
                        } else {
                            function12 = function1;
                            if ((i5 & 12582912) == 0) {
                                i13 |= gapComposer2.changedInstance(function12) ? 8388608 : 4194304;
                            }
                        }
                        boolean z3 = true;
                        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & i13) != 4793490)) {
                            gapComposer2.startDefaults();
                            int i28 = i4 & 1;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (i28 == 0 || gapComposer2.getDefaultsInvalid()) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.Companion.$$INSTANCE;
                                }
                                j9 = Color.Unspecified;
                                j10 = TextUnit.Unspecified;
                                int i29 = i13 & (-15);
                                if (i9 != 0) {
                                    i10 = 1;
                                }
                                if (i11 != 0) {
                                    i12 = Integer.MAX_VALUE;
                                }
                                if (i14 != 0) {
                                    map4 = EmptyMap.INSTANCE;
                                    map4.getClass();
                                } else {
                                    map4 = map2;
                                }
                                if (i15 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(11);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function12 = (Function1) rememberedValue;
                                }
                                i18 = i29;
                                function14 = function12;
                                map5 = map4;
                                i19 = i10;
                                i20 = i12;
                                i21 = 1;
                                j11 = j10;
                                j12 = j11;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                j9 = j;
                                j10 = j2;
                                z3 = z;
                                i21 = i3;
                                i18 = i13 & (-15);
                                function14 = function12;
                                map5 = map2;
                                i19 = i10;
                                i20 = i12;
                                j11 = j3;
                                j12 = j4;
                            }
                            gapComposer2.endDefaults();
                            if (j9 != 16) {
                                i22 = i19;
                                gapComposer2.startReplaceGroup(-1912407199);
                                gapComposer2.end(false);
                                i23 = i20;
                                j13 = j9;
                            } else {
                                i22 = i19;
                                if (textStyle2.m996getColor0d7_KjU() != 16) {
                                    gapComposer2.startReplaceGroup(-1912351461);
                                    gapComposer2.end(false);
                                    i23 = i20;
                                    j13 = textStyle2.m996getColor0d7_KjU();
                                } else {
                                    gapComposer2.startReplaceGroup(-1912318074);
                                    i23 = i20;
                                    j13 = ((DefaultMarkdownColors) gapComposer2.consume(ComposeLocalKt.LocalMarkdownColors)).text;
                                    gapComposer2.end(false);
                                }
                            }
                            long j14 = j11;
                            TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle2, 0L, j10, null, null, j14, null, 0, j12, 16609105);
                            boolean changed = gapComposer2.changed(j13);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new TextKt$Text$1$1(j13, 2);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            int i30 = i18 << 6;
                            int i31 = i22;
                            int i32 = i21;
                            Map map6 = map5;
                            Function1 function15 = function14;
                            BasicTextKt.m346BasicTextCL7eQgs(annotatedString, modifier2, m995mergedA7vx0o$default, function15, i31, z3, i23, i32, map6, (ColorProducer) rememberedValue2, gapComposer2, (i8 & 14) | ((i8 >> 3) & 112) | ((i18 >> 12) & 7168) | (57344 & i30) | (458752 & i30) | (3670016 & i30) | (29360128 & i30) | (i30 & 234881024), 1024);
                            gapComposer = gapComposer2;
                            i16 = i32;
                            map3 = map6;
                            modifier3 = modifier2;
                            j8 = j12;
                            i17 = i23;
                            z2 = z3;
                            i10 = i31;
                            function13 = function15;
                            j7 = j14;
                            j6 = j9;
                            j5 = j10;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            j5 = j2;
                            i16 = i3;
                            function13 = function12;
                            map3 = map2;
                            modifier3 = modifier2;
                            i17 = i12;
                            j6 = j;
                            j7 = j3;
                            j8 = j4;
                            z2 = z;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda3(annotatedString, textStyle, modifier3, j6, j5, j7, j8, i10, z2, i17, i16, map3, function13, i4, i5, i6);
                            return;
                        }
                        return;
                    }
                    map2 = map;
                    i15 = i6 & PKIFailureInfo.unsupportedVersion;
                    if (i15 != 0) {
                    }
                    boolean z32 = true;
                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & i13) != 4793490)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i2;
                i13 = 196608 | i27;
                i14 = i6 & 65536;
                if (i14 == 0) {
                }
                map2 = map;
                i15 = i6 & PKIFailureInfo.unsupportedVersion;
                if (i15 != 0) {
                }
                boolean z322 = true;
                if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & i13) != 4793490)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i10 = i;
            int i272 = i26 | 3072;
            i11 = i6 & 16384;
            if (i11 != 0) {
            }
            i12 = i2;
            i13 = 196608 | i272;
            i14 = i6 & 65536;
            if (i14 == 0) {
            }
            map2 = map;
            i15 = i6 & PKIFailureInfo.unsupportedVersion;
            if (i15 != 0) {
            }
            boolean z3222 = true;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & i13) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i7 | 920349696;
        if ((i5 & 6) != 0) {
        }
        int i262 = i25 | 48;
        i9 = i6 & 4096;
        if (i9 == 0) {
        }
        i10 = i;
        int i2722 = i262 | 3072;
        i11 = i6 & 16384;
        if (i11 != 0) {
        }
        i12 = i2;
        i13 = 196608 | i2722;
        i14 = i6 & 65536;
        if (i14 == 0) {
        }
        map2 = map;
        i15 = i6 & PKIFailureInfo.unsupportedVersion;
        if (i15 != 0) {
        }
        boolean z32222 = true;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & i13) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void put(JsonObjectBuilder jsonObjectBuilder, String str, String str2) {
        jsonObjectBuilder.getClass();
        str.getClass();
        jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(str2));
    }
}
