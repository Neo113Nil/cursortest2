package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0000\u001a-\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002\u001a\u0016\u0010\u001b\u001a\u00020\u000b*\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002\u001a1\u0010\u001d\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a1\u0010%\u001a\u00020\t*\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b(\u001a&\u0010)\u001a\u00020\t*\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a1\u0010,\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010$\u001aS\u0010.\u001a\u00020\t*\u00020\u001e2\u0006\u0010/\u001a\u00020\u001a2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2&\u00100\u001a\"\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020601H\u0002ø\u0001\u0000\u001a&\u00107\u001a\u00020\t*\u00020\u001e2\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a9\u0010:\u001a\u00020\t*\u00020\u001e2\u0006\u0010;\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a&\u0010>\u001a\u00020\t*\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a1\u0010A\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a9\u0010A\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010D\u001a\u00020EH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010G\u001a&\u0010H\u001a\u00020\t*\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000\u001a&\u0010K\u001a\u00020\t*\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a$\u0010N\u001a\u00020\t*\u00020\u001e2\u0006\u0010O\u001a\u00020P2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000\u001a:\u0010Q\u001a\u00020\t*\u00020\u001e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020U0Tj\b\u0012\u0004\u0012\u00020U`VH\u0002\u001a[\u0010W\u001a\u00020\t*\u00020\u001e2\u0006\u0010/\u001a\u00020\u001a2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052&\u00100\u001a\"\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020601H\u0000ø\u0001\u0000\u001a&\u0010X\u001a\u00020\t*\u00020\u001e2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0000\u001a&\u0010[\u001a\u00020\t*\u00020\u001e2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "resolveLineHeightInPx", "", "lineHeight", "contextFontSize", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "hasFontAttributes", "", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "setColor", "setColor-RPmYEkk", "setFontAttributes", "contextTextStyle", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "lowPrioritySpans", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpannableExtensions_androidKt {
    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List list, final Function4 function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).getFontSynthesis() != null) {
                arrayList.add(obj);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m2262getFontStyle4Lr2A7w(), textStyle.m2263getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16323, (DefaultConstructorMarker) null) : null, arrayList, new Function3() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                invoke((SpanStyle) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SpanStyle spanStyle, int i2, int i3) {
                Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                Function4 function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle m2299boximpl = FontStyle.m2299boximpl(fontStyle != null ? fontStyle.getValue() : FontStyle.INSTANCE.m2307getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan((Typeface) function42.invoke(fontFamily, fontWeight, m2299boximpl, FontSynthesis.m2308boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m2317getAllGVVA2EU()))), i2, i3, 33);
            }
        });
    }

    public static final void setSpan(Spannable spannable, Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        float m2579getValueimpl;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m2576equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m2576equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m2587isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m2587isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float f2 = 0.0f;
            if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
                m2579getValueimpl = density.mo270toPxR2X_6o(textIndent.getFirstLine());
            } else {
                m2579getValueimpl = TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA()) ? TextUnit.m2579getValueimpl(textIndent.getFirstLine()) * f : 0.0f;
            }
            long m2578getTypeUIouoOA2 = TextUnit.m2578getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA2, companion.m2597getSpUIouoOA())) {
                f2 = density.mo270toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA2, companion.m2596getEmUIouoOA())) {
                f2 = TextUnit.m2579getValueimpl(textIndent.getRestLine()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(m2579getValueimpl), (int) Math.ceil(f2)), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m2408setLineHeightKmRG4DE(Spannable setLineHeight, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float m2403resolveLineHeightInPxo2QH7mI = m2403resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m2403resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightStyleSpan(m2403resolveLineHeightInPxo2QH7mI, 0, setLineHeight.length(), LineHeightStyle.Trim.m2434isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m2435isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, setLineHeight.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m2409setLineHeightr9BaKPg(Spannable setLineHeight, long j, float f, Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float m2403resolveLineHeightInPxo2QH7mI = m2403resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m2403resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightSpan(m2403resolveLineHeightInPxo2QH7mI), 0, setLineHeight.length());
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m2403resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            return density.mo270toPxR2X_6o(j);
        }
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA())) {
            return TextUnit.m2579getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle contextTextStyle, List spanStyles, Density density, Function4 resolveTypeface) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        setFontAttributes(spannable, contextTextStyle, spanStyles, resolveTypeface);
        ArrayList arrayList = new ArrayList();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) spanStyles.get(i);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SpanRange spanRange = (SpanRange) arrayList.get(i2);
            setSpan(spannable, spanRange.getSpan(), spanRange.getStart(), spanRange.getEnd());
        }
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range range, Density density, ArrayList arrayList) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle spanStyle = (SpanStyle) range.getItem();
        m2405setBaselineShift0ocSgnM(spannable, spanStyle.getBaselineShift(), start, end);
        m2406setColorRPmYEkk(spannable, spanStyle.m2225getColor0d7_KjU(), start, end);
        setBrush(spannable, spanStyle.getBrush(), start, end);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), start, end);
        m2407setFontSizeKmRG4DE(spannable, spanStyle.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, spanStyle.getLocaleList(), start, end);
        m2404setBackgroundRPmYEkk(spannable, spanStyle.getBackground(), start, end);
        setShadow(spannable, spanStyle.getShadow(), start, end);
        MetricAffectingSpan m2402createLetterSpacingSpaneAf_CNQ = m2402createLetterSpacingSpaneAf_CNQ(spanStyle.getLetterSpacing(), density);
        if (m2402createLetterSpacingSpaneAf_CNQ != null) {
            arrayList.add(new SpanRange(m2402createLetterSpacingSpaneAf_CNQ, start, end));
        }
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List spanStyles, Function3 block) {
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (spanStyles.isEmpty()) {
                return;
            }
            block.invoke(merge(spanStyle, (SpanStyle) ((AnnotatedString.Range) spanStyles.get(0)).getItem()), Integer.valueOf(((AnnotatedString.Range) spanStyles.get(0)).getStart()), Integer.valueOf(((AnnotatedString.Range) spanStyles.get(0)).getEnd()));
            return;
        }
        int size = spanStyles.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = spanStyles.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) spanStyles.get(i3);
            numArr[i3] = Integer.valueOf(range.getStart());
            numArr[i3 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt.sort(numArr);
        int intValue = ((Number) ArraysKt.first(numArr)).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = numArr[i4];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    AnnotatedString.Range range2 = (AnnotatedString.Range) spanStyles.get(i5);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, (SpanStyle) range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    block.invoke(spanStyle2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m2402createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo270toPxR2X_6o(j));
        }
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m2579getValueimpl(j));
        }
        return null;
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m1471toArgb8_81llA(shadow.getColor()), Offset.m1297getXimpl(shadow.getOffset()), Offset.m1298getYimpl(shadow.getOffset()), shadow.getBlurRadius()), i, i2);
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m2407setFontSizeKmRG4DE(Spannable setFontSize, long j, Density density, int i, int i2) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(MathKt.roundToInt(density.mo270toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m2579getValueimpl(j)), i, i2);
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m2405setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.getMultiplier()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m2406setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i, i2);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush), i, i2);
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m2263getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m2404setBackgroundRPmYEkk(Spannable setBackground, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j != Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m1471toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m2406setColorRPmYEkk(Spannable setColor, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j != Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m1471toArgb8_81llA(j)), i, i2);
        }
    }
}
