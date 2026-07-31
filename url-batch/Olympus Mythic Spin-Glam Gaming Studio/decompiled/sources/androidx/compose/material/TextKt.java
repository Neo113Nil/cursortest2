package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.exoplayer2.C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final TextStyle mo4828invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:101:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0292  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1056TextfLXpl1I(final String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        long m1461getUnspecified0d7_KjU;
        long m2583getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m2583getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long m2583getUnspecifiedXSAIIZE3;
        int m2473getClipgIe3tQ8;
        boolean z2;
        int i22;
        Function1 function12;
        int i23;
        TextStyle textStyle2;
        Color.Companion companion;
        long j5;
        final Modifier modifier3;
        int i24;
        final TextAlign textAlign3;
        int i25;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        boolean z3;
        Function1 function13;
        final long j6;
        final TextDecoration textDecoration3;
        long j7;
        final long j8;
        TextStyle textStyle3;
        final FontStyle fontStyle3;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-366126944);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= C.ENCODING_PCM_32BIT;
            } else if ((i3 & 1879048192) == 0) {
                i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
                i16 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i16 = i4;
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
                i16 |= 48;
            } else if ((i4 & 112) == 0) {
                i16 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i27 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
                i27 |= 384;
            } else if ((i4 & 896) == 0) {
                i27 |= startRestartGroup.changed(z) ? 256 : 128;
                i19 = i5 & 8192;
                if (i19 != 0) {
                    i27 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i27 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                        i27 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i21 = i20;
                        i27 |= startRestartGroup.changed(function1) ? 16384 : 8192;
                        if ((i4 & 458752) == 0) {
                            i27 |= ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i27) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i26 != 0 ? Modifier.INSTANCE : modifier;
                                m1461getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m1461getUnspecified0d7_KjU() : j;
                                m2583getUnspecifiedXSAIIZE = i8 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m2583getUnspecifiedXSAIIZE2 = i12 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                m2583getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j4;
                                m2473getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m2473getClipgIe3tQ8() : i;
                                z2 = i18 != 0 ? true : z;
                                i22 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                function12 = i21 != 0 ? new Function1() { // from class: androidx.compose.material.TextKt$Text$1
                                    public final void invoke(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextLayoutResult) obj);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                TextDecoration textDecoration4 = textDecoration2;
                                if ((i5 & 32768) != 0) {
                                    i23 = i27 & (-458753);
                                    textStyle2 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                    textDecoration2 = textDecoration4;
                                    startRestartGroup.endDefaults();
                                    startRestartGroup.startReplaceableGroup(1557613088);
                                    companion = Color.INSTANCE;
                                    if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                                        j5 = m1461getUnspecified0d7_KjU;
                                    } else {
                                        long m2260getColor0d7_KjU = textStyle2.m2260getColor0d7_KjU();
                                        if (m2260getColor0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                                            m2260getColor0d7_KjU = Color.m1445copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        j5 = m2260getColor0d7_KjU;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextStyle merge = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                                    TextDecoration textDecoration5 = textDecoration2;
                                    int i28 = ((i23 >> 3) & 7168) | (i6 & 126);
                                    int i29 = i23 << 9;
                                    BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i28 | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016), 0);
                                    modifier3 = modifier2;
                                    i24 = m2473getClipgIe3tQ8;
                                    textAlign3 = textAlign2;
                                    i25 = i22;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    z3 = z2;
                                    function13 = function12;
                                    j6 = m2583getUnspecifiedXSAIIZE;
                                    textDecoration3 = textDecoration5;
                                    j7 = m2583getUnspecifiedXSAIIZE3;
                                    j8 = m1461getUnspecified0d7_KjU;
                                    textStyle3 = textStyle2;
                                    fontStyle3 = fontStyle2;
                                    j9 = m2583getUnspecifiedXSAIIZE2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 32768) != 0) {
                                    i27 &= -458753;
                                }
                                modifier2 = modifier;
                                m1461getUnspecified0d7_KjU = j;
                                m2583getUnspecifiedXSAIIZE = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m2583getUnspecifiedXSAIIZE2 = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                m2583getUnspecifiedXSAIIZE3 = j4;
                                m2473getClipgIe3tQ8 = i;
                                z2 = z;
                                i22 = i2;
                                function12 = function1;
                            }
                            i23 = i27;
                            textStyle2 = textStyle;
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1557613088);
                            companion = Color.INSTANCE;
                            if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge2 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                            TextDecoration textDecoration52 = textDecoration2;
                            int i282 = ((i23 >> 3) & 7168) | (i6 & 126);
                            int i292 = i23 << 9;
                            BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge2, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i282 | (i292 & 57344) | (i292 & 458752) | (i292 & 3670016), 0);
                            modifier3 = modifier2;
                            i24 = m2473getClipgIe3tQ8;
                            textAlign3 = textAlign2;
                            i25 = i22;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            z3 = z2;
                            function13 = function12;
                            j6 = m2583getUnspecifiedXSAIIZE;
                            textDecoration3 = textDecoration52;
                            j7 = m2583getUnspecifiedXSAIIZE3;
                            j8 = m1461getUnspecified0d7_KjU;
                            textStyle3 = textStyle2;
                            fontStyle3 = fontStyle2;
                            j9 = m2583getUnspecifiedXSAIIZE2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j8 = j;
                            j6 = j2;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j9 = j3;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j7 = j4;
                            i24 = i;
                            z3 = z;
                            i25 = i2;
                            function13 = function1;
                            textStyle3 = textStyle;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final long j10 = j7;
                        final int i30 = i24;
                        final boolean z4 = z3;
                        final int i31 = i25;
                        final Function1 function14 = function13;
                        final TextStyle textStyle4 = textStyle3;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i32) {
                                TextKt.m1056TextfLXpl1I(text, modifier3, j8, j6, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j10, i30, z4, i31, function14, textStyle4, composer2, i3 | 1, i4, i5);
                            }
                        });
                        return;
                    }
                    i21 = i20;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    TextDecoration textDecoration42 = textDecoration2;
                    if ((i5 & 32768) != 0) {
                    }
                    i23 = i27;
                    textStyle2 = textStyle;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557613088);
                    companion = Color.INSTANCE;
                    if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge22 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                    TextDecoration textDecoration522 = textDecoration2;
                    int i2822 = ((i23 >> 3) & 7168) | (i6 & 126);
                    int i2922 = i23 << 9;
                    BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge22, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i2822 | (i2922 & 57344) | (i2922 & 458752) | (i2922 & 3670016), 0);
                    modifier3 = modifier2;
                    i24 = m2473getClipgIe3tQ8;
                    textAlign3 = textAlign2;
                    i25 = i22;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    z3 = z2;
                    function13 = function12;
                    j6 = m2583getUnspecifiedXSAIIZE;
                    textDecoration3 = textDecoration522;
                    j7 = m2583getUnspecifiedXSAIIZE3;
                    j8 = m1461getUnspecified0d7_KjU;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    j9 = m2583getUnspecifiedXSAIIZE2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                TextDecoration textDecoration422 = textDecoration2;
                if ((i5 & 32768) != 0) {
                }
                i23 = i27;
                textStyle2 = textStyle;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557613088);
                companion = Color.INSTANCE;
                if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                TextDecoration textDecoration5222 = textDecoration2;
                int i28222 = ((i23 >> 3) & 7168) | (i6 & 126);
                int i29222 = i23 << 9;
                BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge222, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i28222 | (i29222 & 57344) | (i29222 & 458752) | (i29222 & 3670016), 0);
                modifier3 = modifier2;
                i24 = m2473getClipgIe3tQ8;
                textAlign3 = textAlign2;
                i25 = i22;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                z3 = z2;
                function13 = function12;
                j6 = m2583getUnspecifiedXSAIIZE;
                textDecoration3 = textDecoration5222;
                j7 = m2583getUnspecifiedXSAIIZE3;
                j8 = m1461getUnspecified0d7_KjU;
                textStyle3 = textStyle2;
                fontStyle3 = fontStyle2;
                j9 = m2583getUnspecifiedXSAIIZE2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            TextDecoration textDecoration4222 = textDecoration2;
            if ((i5 & 32768) != 0) {
            }
            i23 = i27;
            textStyle2 = textStyle;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557613088);
            companion = Color.INSTANCE;
            if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
            TextDecoration textDecoration52222 = textDecoration2;
            int i282222 = ((i23 >> 3) & 7168) | (i6 & 126);
            int i292222 = i23 << 9;
            BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge2222, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i282222 | (i292222 & 57344) | (i292222 & 458752) | (i292222 & 3670016), 0);
            modifier3 = modifier2;
            i24 = m2473getClipgIe3tQ8;
            textAlign3 = textAlign2;
            i25 = i22;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            z3 = z2;
            function13 = function12;
            j6 = m2583getUnspecifiedXSAIIZE;
            textDecoration3 = textDecoration52222;
            j7 = m2583getUnspecifiedXSAIIZE3;
            j8 = m1461getUnspecified0d7_KjU;
            textStyle3 = textStyle2;
            fontStyle3 = fontStyle2;
            j9 = m2583getUnspecifiedXSAIIZE2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i272 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        TextDecoration textDecoration42222 = textDecoration2;
        if ((i5 & 32768) != 0) {
        }
        i23 = i272;
        textStyle2 = textStyle;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557613088);
        companion = Color.INSTANCE;
        if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
        TextDecoration textDecoration522222 = textDecoration2;
        int i2822222 = ((i23 >> 3) & 7168) | (i6 & 126);
        int i2922222 = i23 << 9;
        BasicTextKt.m520BasicTextBpD7jsM(text, modifier2, merge22222, function12, m2473getClipgIe3tQ8, z2, i22, startRestartGroup, i2822222 | (i2922222 & 57344) | (i2922222 & 458752) | (i2922222 & 3670016), 0);
        modifier3 = modifier2;
        i24 = m2473getClipgIe3tQ8;
        textAlign3 = textAlign2;
        i25 = i22;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        z3 = z2;
        function13 = function12;
        j6 = m2583getUnspecifiedXSAIIZE;
        textDecoration3 = textDecoration522222;
        j7 = m2583getUnspecifiedXSAIIZE3;
        j8 = m1461getUnspecified0d7_KjU;
        textStyle3 = textStyle2;
        fontStyle3 = fontStyle2;
        j9 = m2583getUnspecifiedXSAIIZE2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0286  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1055Text4IGK_g(final AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        long m1461getUnspecified0d7_KjU;
        long m2583getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m2583getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long m2583getUnspecifiedXSAIIZE3;
        int m2473getClipgIe3tQ8;
        boolean z2;
        int i23;
        Map map2;
        Function1 function12;
        int i24;
        TextStyle textStyle2;
        Color.Companion companion;
        long j5;
        final Modifier modifier3;
        boolean z3;
        final TextAlign textAlign3;
        final FontStyle fontStyle3;
        final FontFamily fontFamily3;
        Map map3;
        final TextDecoration textDecoration3;
        int i25;
        final long j6;
        long j7;
        final long j8;
        TextStyle textStyle3;
        Function1 function13;
        final FontWeight fontWeight3;
        int i26;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-422393234);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= C.ENCODING_PCM_32BIT;
            } else if ((i3 & 1879048192) == 0) {
                i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
                i16 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i16 = i4;
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
                i16 |= 48;
            } else if ((i4 & 112) == 0) {
                i16 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i28 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
                i28 |= 384;
            } else if ((i4 & 896) == 0) {
                i28 |= startRestartGroup.changed(z) ? 256 : 128;
                i19 = i5 & 8192;
                if (i19 != 0) {
                    i28 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i28 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                        i28 |= 8192;
                    }
                    i21 = i5 & 32768;
                    if (i21 == 0) {
                        i28 |= 196608;
                    } else if ((i4 & 458752) == 0) {
                        i22 = i19;
                        i28 |= startRestartGroup.changed(function1) ? 131072 : 65536;
                        if ((i4 & 3670016) == 0) {
                            i28 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if (i20 == 16384 || (1533916891 & i6) != 306783378 || (2995931 & i28) != 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i27 != 0 ? Modifier.INSTANCE : modifier;
                                m1461getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m1461getUnspecified0d7_KjU() : j;
                                m2583getUnspecifiedXSAIIZE = i8 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m2583getUnspecifiedXSAIIZE2 = i12 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                m2583getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j4;
                                m2473getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m2473getClipgIe3tQ8() : i;
                                z2 = i18 != 0 ? true : z;
                                i23 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                if (i20 != 0) {
                                    map2 = MapsKt.emptyMap();
                                    i28 &= -57345;
                                } else {
                                    map2 = map;
                                }
                                function12 = i21 != 0 ? new Function1() { // from class: androidx.compose.material.TextKt$Text$3
                                    public final void invoke(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextLayoutResult) obj);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                TextDecoration textDecoration4 = textDecoration2;
                                if ((i5 & 65536) != 0) {
                                    i24 = i28 & (-3670017);
                                    textStyle2 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                    textDecoration2 = textDecoration4;
                                    startRestartGroup.endDefaults();
                                    startRestartGroup.startReplaceableGroup(1557618192);
                                    companion = Color.INSTANCE;
                                    if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                                        j5 = m1461getUnspecified0d7_KjU;
                                    } else {
                                        long m2260getColor0d7_KjU = textStyle2.m2260getColor0d7_KjU();
                                        if (m2260getColor0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                                            m2260getColor0d7_KjU = Color.m1445copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        j5 = m2260getColor0d7_KjU;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextStyle merge = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                                    TextDecoration textDecoration5 = textDecoration2;
                                    int i29 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
                                    int i30 = i24 << 9;
                                    BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i29 | (i30 & 57344) | (i30 & 458752) | (i30 & 3670016), 0);
                                    modifier3 = modifier2;
                                    z3 = z2;
                                    textAlign3 = textAlign2;
                                    fontStyle3 = fontStyle2;
                                    fontFamily3 = fontFamily2;
                                    map3 = map2;
                                    textDecoration3 = textDecoration5;
                                    Function1 function14 = function12;
                                    i25 = m2473getClipgIe3tQ8;
                                    j6 = m2583getUnspecifiedXSAIIZE;
                                    j7 = m2583getUnspecifiedXSAIIZE3;
                                    j8 = m1461getUnspecified0d7_KjU;
                                    textStyle3 = textStyle2;
                                    function13 = function14;
                                    fontWeight3 = fontWeight2;
                                    i26 = i23;
                                    j9 = m2583getUnspecifiedXSAIIZE2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i20 != 0) {
                                    i28 &= -57345;
                                }
                                if ((i5 & 65536) != 0) {
                                    i28 &= -3670017;
                                }
                                modifier2 = modifier;
                                m1461getUnspecified0d7_KjU = j;
                                m2583getUnspecifiedXSAIIZE = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m2583getUnspecifiedXSAIIZE2 = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                m2583getUnspecifiedXSAIIZE3 = j4;
                                m2473getClipgIe3tQ8 = i;
                                z2 = z;
                                i23 = i2;
                                map2 = map;
                                function12 = function1;
                            }
                            i24 = i28;
                            textStyle2 = textStyle;
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1557618192);
                            companion = Color.INSTANCE;
                            if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge2 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                            TextDecoration textDecoration52 = textDecoration2;
                            int i292 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
                            int i302 = i24 << 9;
                            BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge2, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i292 | (i302 & 57344) | (i302 & 458752) | (i302 & 3670016), 0);
                            modifier3 = modifier2;
                            z3 = z2;
                            textAlign3 = textAlign2;
                            fontStyle3 = fontStyle2;
                            fontFamily3 = fontFamily2;
                            map3 = map2;
                            textDecoration3 = textDecoration52;
                            Function1 function142 = function12;
                            i25 = m2473getClipgIe3tQ8;
                            j6 = m2583getUnspecifiedXSAIIZE;
                            j7 = m2583getUnspecifiedXSAIIZE3;
                            j8 = m1461getUnspecified0d7_KjU;
                            textStyle3 = textStyle2;
                            function13 = function142;
                            fontWeight3 = fontWeight2;
                            i26 = i23;
                            j9 = m2583getUnspecifiedXSAIIZE2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j8 = j;
                            j6 = j2;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j9 = j3;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j7 = j4;
                            i25 = i;
                            z3 = z;
                            i26 = i2;
                            map3 = map;
                            function13 = function1;
                            textStyle3 = textStyle;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final long j10 = j7;
                        final int i31 = i25;
                        final boolean z4 = z3;
                        final int i32 = i26;
                        final Map map4 = map3;
                        final Function1 function15 = function13;
                        final TextStyle textStyle4 = textStyle3;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i33) {
                                TextKt.m1055Text4IGK_g(AnnotatedString.this, modifier3, j8, j6, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j10, i31, z4, i32, map4, function15, textStyle4, composer2, i3 | 1, i4, i5);
                            }
                        });
                        return;
                    }
                    i22 = i19;
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i20 == 16384) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    TextDecoration textDecoration42 = textDecoration2;
                    if ((i5 & 65536) != 0) {
                    }
                    i24 = i28;
                    textStyle2 = textStyle;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557618192);
                    companion = Color.INSTANCE;
                    if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge22 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                    TextDecoration textDecoration522 = textDecoration2;
                    int i2922 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
                    int i3022 = i24 << 9;
                    BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge22, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i2922 | (i3022 & 57344) | (i3022 & 458752) | (i3022 & 3670016), 0);
                    modifier3 = modifier2;
                    z3 = z2;
                    textAlign3 = textAlign2;
                    fontStyle3 = fontStyle2;
                    fontFamily3 = fontFamily2;
                    map3 = map2;
                    textDecoration3 = textDecoration522;
                    Function1 function1422 = function12;
                    i25 = m2473getClipgIe3tQ8;
                    j6 = m2583getUnspecifiedXSAIIZE;
                    j7 = m2583getUnspecifiedXSAIIZE3;
                    j8 = m1461getUnspecified0d7_KjU;
                    textStyle3 = textStyle2;
                    function13 = function1422;
                    fontWeight3 = fontWeight2;
                    i26 = i23;
                    j9 = m2583getUnspecifiedXSAIIZE2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i21 = i5 & 32768;
                if (i21 == 0) {
                }
                i22 = i19;
                if ((i4 & 3670016) == 0) {
                }
                if (i20 == 16384) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i27 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i22 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                TextDecoration textDecoration422 = textDecoration2;
                if ((i5 & 65536) != 0) {
                }
                i24 = i28;
                textStyle2 = textStyle;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557618192);
                companion = Color.INSTANCE;
                if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
                TextDecoration textDecoration5222 = textDecoration2;
                int i29222 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
                int i30222 = i24 << 9;
                BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge222, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i29222 | (i30222 & 57344) | (i30222 & 458752) | (i30222 & 3670016), 0);
                modifier3 = modifier2;
                z3 = z2;
                textAlign3 = textAlign2;
                fontStyle3 = fontStyle2;
                fontFamily3 = fontFamily2;
                map3 = map2;
                textDecoration3 = textDecoration5222;
                Function1 function14222 = function12;
                i25 = m2473getClipgIe3tQ8;
                j6 = m2583getUnspecifiedXSAIIZE;
                j7 = m2583getUnspecifiedXSAIIZE3;
                j8 = m1461getUnspecified0d7_KjU;
                textStyle3 = textStyle2;
                function13 = function14222;
                fontWeight3 = fontWeight2;
                i26 = i23;
                j9 = m2583getUnspecifiedXSAIIZE2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 == 0) {
            }
            i22 = i19;
            if ((i4 & 3670016) == 0) {
            }
            if (i20 == 16384) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i27 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i22 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            TextDecoration textDecoration4222 = textDecoration2;
            if ((i5 & 65536) != 0) {
            }
            i24 = i28;
            textStyle2 = textStyle;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557618192);
            companion = Color.INSTANCE;
            if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
            TextDecoration textDecoration52222 = textDecoration2;
            int i292222 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
            int i302222 = i24 << 9;
            BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge2222, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i292222 | (i302222 & 57344) | (i302222 & 458752) | (i302222 & 3670016), 0);
            modifier3 = modifier2;
            z3 = z2;
            textAlign3 = textAlign2;
            fontStyle3 = fontStyle2;
            fontFamily3 = fontFamily2;
            map3 = map2;
            textDecoration3 = textDecoration52222;
            Function1 function142222 = function12;
            i25 = m2473getClipgIe3tQ8;
            j6 = m2583getUnspecifiedXSAIIZE;
            j7 = m2583getUnspecifiedXSAIIZE3;
            j8 = m1461getUnspecified0d7_KjU;
            textStyle3 = textStyle2;
            function13 = function142222;
            fontWeight3 = fontWeight2;
            i26 = i23;
            j9 = m2583getUnspecifiedXSAIIZE2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i282 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 == 0) {
        }
        i22 = i19;
        if ((i4 & 3670016) == 0) {
        }
        if (i20 == 16384) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i27 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        TextDecoration textDecoration42222 = textDecoration2;
        if ((i5 & 65536) != 0) {
        }
        i24 = i282;
        textStyle2 = textStyle;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557618192);
        companion = Color.INSTANCE;
        if (m1461getUnspecified0d7_KjU == companion.m1461getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22222 = textStyle2.merge(new TextStyle(j5, m2583getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, null, fontFamily2, null, m2583getUnspecifiedXSAIIZE2, null, null, null, 0L, textDecoration2, null, textAlign2, null, m2583getUnspecifiedXSAIIZE3, null, 175952, null));
        TextDecoration textDecoration522222 = textDecoration2;
        int i2922222 = ((i24 >> 6) & 7168) | (i6 & 14) | 16777216 | (i6 & 112);
        int i3022222 = i24 << 9;
        BasicTextKt.m519BasicText4YKlhWE(text, modifier2, merge22222, function12, m2473getClipgIe3tQ8, z2, i23, map2, startRestartGroup, i2922222 | (i3022222 & 57344) | (i3022222 & 458752) | (i3022222 & 3670016), 0);
        modifier3 = modifier2;
        z3 = z2;
        textAlign3 = textAlign2;
        fontStyle3 = fontStyle2;
        fontFamily3 = fontFamily2;
        map3 = map2;
        textDecoration3 = textDecoration522222;
        Function1 function1422222 = function12;
        i25 = m2473getClipgIe3tQ8;
        j6 = m2583getUnspecifiedXSAIIZE;
        j7 = m2583getUnspecifiedXSAIIZE3;
        j8 = m1461getUnspecified0d7_KjU;
        textStyle3 = textStyle2;
        function13 = function1422222;
        fontWeight3 = fontWeight2;
        i26 = i23;
        j9 = m2583getUnspecifiedXSAIIZE2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final ProvidableCompositionLocal getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(value))}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                TextKt.ProvideTextStyle(TextStyle.this, content, composer2, i | 1);
            }
        });
    }
}
