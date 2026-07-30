package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e\u001a+\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a*\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0000\u001aÀ\u0001\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00012\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u00010\u00152\b\u00109\u001a\u0004\u0018\u00010:H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0018\u0010=\u001a\u0004\u0018\u00010\u0015*\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0015H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultColorForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpanStyleKt {
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultBackgroundColor = Color.INSTANCE.m3875getTransparent0d7_KjU();

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    static {
        long m3866getBlack0d7_KjU = Color.INSTANCE.m3866getBlack0d7_KjU();
        DefaultColor = m3866getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.INSTANCE.m6209from8_81llA(m3866getBlack0d7_KjU);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m5740lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (TextUnitKt.m6510isUnspecifiedR2X_6o(j) || TextUnitKt.m6510isUnspecifiedR2X_6o(j2)) {
            return ((TextUnit) lerpDiscrete(TextUnit.m6482boximpl(j), TextUnit.m6482boximpl(j2), f)).getPackedValue();
        }
        return TextUnitKt.m6512lerpC3pnCVY(j, j2, f);
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long m5740lerpTextUnitInheritableC3pnCVY = m5740lerpTextUnitInheritableC3pnCVY(spanStyle.getFontSize(), spanStyle2.getFontSize(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long m5740lerpTextUnitInheritableC3pnCVY2 = m5740lerpTextUnitInheritableC3pnCVY(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f);
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        float m6078unboximpl = baselineShift != null ? baselineShift.m6078unboximpl() : BaselineShift.m6073constructorimpl(0.0f);
        BaselineShift baselineShift2 = spanStyle2.getBaselineShift();
        float m6085lerpjWV1Mfo = BaselineShiftKt.m6085lerpjWV1Mfo(m6078unboximpl, baselineShift2 != null ? baselineShift2.m6078unboximpl() : BaselineShift.m6073constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f);
        long m3891lerpjxsXWHM = ColorKt.m3891lerpjxsXWHM(spanStyle.getBackground(), spanStyle2.getBackground(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m5740lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m5740lerpTextUnitInheritableC3pnCVY2, BaselineShift.m6072boximpl(m6085lerpjWV1Mfo), lerp3, localeList, m3891lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        long letterSpacing;
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextForegroundStyle invoke() {
                TextForegroundStyle textForegroundStyle;
                textForegroundStyle = SpanStyleKt.DefaultColorForegroundStyle;
                return textForegroundStyle;
            }
        });
        long fontSize = TextUnitKt.m6510isUnspecifiedR2X_6o(spanStyle.getFontSize()) ? DefaultFontSize : spanStyle.getFontSize();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = spanStyle.getFontStyle();
        FontStyle m5891boximpl = FontStyle.m5891boximpl(fontStyle != null ? fontStyle.m5897unboximpl() : FontStyle.INSTANCE.m5901getNormal_LCdwA());
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        FontSynthesis m5902boximpl = FontSynthesis.m5902boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m5911getAllGVVA2EU());
        SystemFontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m6510isUnspecifiedR2X_6o(spanStyle.getLetterSpacing())) {
            letterSpacing = DefaultLetterSpacing;
        } else {
            letterSpacing = spanStyle.getLetterSpacing();
        }
        long j = letterSpacing;
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        BaselineShift m6072boximpl = BaselineShift.m6072boximpl(baselineShift != null ? baselineShift.m6078unboximpl() : BaselineShift.INSTANCE.m6082getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = DefaultBackgroundColor;
        }
        long j2 = background;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, fontSize, fontWeight2, m5891boximpl, m5902boximpl, fontFamily2, str, j, m6072boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m6489equalsimpl0(r26, r21.getFontSize()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0055, code lost:
    
        if (androidx.compose.ui.graphics.Color.m3841equalsimpl0(r22, r21.getTextForegroundStyle().mo6086getColor0d7_KjU()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0061, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r21.getFontStyle()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r21.getFontWeight()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0075, code lost:
    
        if (r31 != r21.getFontFamily()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0089, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m6489equalsimpl0(r33, r21.getLetterSpacing()) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpanStyle m5739fastMergedSHsh3o(SpanStyle spanStyle, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextGeometricTransform textGeometricTransform2;
        long j5;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle2;
        SpanStyle spanStyle2;
        TextForegroundStyle m6209from8_81llA;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String str2 = str;
        BaselineShift baselineShift2 = baselineShift;
        if (!(!TextUnitKt.m6510isUnspecifiedR2X_6o(j2))) {
        }
        if (brush == null) {
            if (j != 16) {
            }
        }
        if (fontStyle2 != null) {
        }
        if (fontWeight2 != null) {
        }
        if (fontFamily != null) {
        }
        if (!(!TextUnitKt.m6510isUnspecifiedR2X_6o(j3))) {
        }
        if ((textDecoration == null || Intrinsics.areEqual(textDecoration, spanStyle.getTextDecoration())) && Intrinsics.areEqual(brush, spanStyle.getTextForegroundStyle().getBrush()) && ((brush == null || f == spanStyle.getTextForegroundStyle().getAlpha()) && ((fontSynthesis2 == null || Intrinsics.areEqual(fontSynthesis2, spanStyle.getFontSynthesis())) && ((str2 == null || Intrinsics.areEqual(str2, spanStyle.getFontFeatureSettings())) && (baselineShift2 == null || Intrinsics.areEqual(baselineShift2, spanStyle.getBaselineShift())))))) {
            textGeometricTransform2 = textGeometricTransform;
            if ((textGeometricTransform2 == null || Intrinsics.areEqual(textGeometricTransform2, spanStyle.getTextGeometricTransform())) && (localeList == null || Intrinsics.areEqual(localeList, spanStyle.getLocaleList()))) {
                j5 = j4;
                if ((j5 == 16 || Color.m3841equalsimpl0(j5, spanStyle.getBackground())) && (shadow == null || Intrinsics.areEqual(shadow, spanStyle.getShadow()))) {
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 == null || Intrinsics.areEqual(platformSpanStyle2, spanStyle.getPlatformStyle())) {
                        drawStyle2 = drawStyle;
                        if (drawStyle2 == null || Intrinsics.areEqual(drawStyle2, spanStyle.getDrawStyle())) {
                            return spanStyle;
                        }
                        spanStyle2 = spanStyle;
                        if (brush != null) {
                            m6209from8_81llA = TextForegroundStyle.INSTANCE.from(brush, f);
                        } else {
                            m6209from8_81llA = TextForegroundStyle.INSTANCE.m6209from8_81llA(j);
                        }
                        TextForegroundStyle merge = spanStyle.getTextForegroundStyle().merge(m6209from8_81llA);
                        FontFamily fontFamily2 = fontFamily == null ? spanStyle.getFontFamily() : fontFamily;
                        long fontSize = !TextUnitKt.m6510isUnspecifiedR2X_6o(j2) ? j2 : spanStyle.getFontSize();
                        if (fontWeight2 == null) {
                            fontWeight2 = spanStyle.getFontWeight();
                        }
                        if (fontStyle2 == null) {
                            fontStyle2 = spanStyle.getFontStyle();
                        }
                        if (fontSynthesis2 == null) {
                            fontSynthesis2 = spanStyle.getFontSynthesis();
                        }
                        if (str2 == null) {
                            str2 = spanStyle.getFontFeatureSettings();
                        }
                        long letterSpacing = !TextUnitKt.m6510isUnspecifiedR2X_6o(j3) ? j3 : spanStyle.getLetterSpacing();
                        if (baselineShift2 == null) {
                            baselineShift2 = spanStyle.getBaselineShift();
                        }
                        if (textGeometricTransform2 == null) {
                            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
                        }
                        LocaleList localeList2 = localeList == null ? spanStyle.getLocaleList() : localeList;
                        if (j5 == 16) {
                            j5 = spanStyle.getBackground();
                        }
                        TextDecoration textDecoration2 = textDecoration == null ? spanStyle.getTextDecoration() : textDecoration;
                        Shadow shadow2 = shadow == null ? spanStyle.getShadow() : shadow;
                        PlatformSpanStyle mergePlatformStyle = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                        if (drawStyle2 == null) {
                            drawStyle2 = spanStyle.getDrawStyle();
                        }
                        return new SpanStyle(merge, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, mergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
                    }
                    spanStyle2 = spanStyle;
                    drawStyle2 = drawStyle;
                    if (brush != null) {
                    }
                    TextForegroundStyle merge2 = spanStyle.getTextForegroundStyle().merge(m6209from8_81llA);
                    if (fontFamily == null) {
                    }
                    if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j2)) {
                    }
                    if (fontWeight2 == null) {
                    }
                    if (fontStyle2 == null) {
                    }
                    if (fontSynthesis2 == null) {
                    }
                    if (str2 == null) {
                    }
                    if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j3)) {
                    }
                    if (baselineShift2 == null) {
                    }
                    if (textGeometricTransform2 == null) {
                    }
                    if (localeList == null) {
                    }
                    if (j5 == 16) {
                    }
                    if (textDecoration == null) {
                    }
                    if (shadow == null) {
                    }
                    PlatformSpanStyle mergePlatformStyle2 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                    if (drawStyle2 == null) {
                    }
                    return new SpanStyle(merge2, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, mergePlatformStyle2, drawStyle2, (DefaultConstructorMarker) null);
                }
                spanStyle2 = spanStyle;
                platformSpanStyle2 = platformSpanStyle;
                drawStyle2 = drawStyle;
                if (brush != null) {
                }
                TextForegroundStyle merge22 = spanStyle.getTextForegroundStyle().merge(m6209from8_81llA);
                if (fontFamily == null) {
                }
                if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j2)) {
                }
                if (fontWeight2 == null) {
                }
                if (fontStyle2 == null) {
                }
                if (fontSynthesis2 == null) {
                }
                if (str2 == null) {
                }
                if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j3)) {
                }
                if (baselineShift2 == null) {
                }
                if (textGeometricTransform2 == null) {
                }
                if (localeList == null) {
                }
                if (j5 == 16) {
                }
                if (textDecoration == null) {
                }
                if (shadow == null) {
                }
                PlatformSpanStyle mergePlatformStyle22 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                if (drawStyle2 == null) {
                }
                return new SpanStyle(merge22, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, mergePlatformStyle22, drawStyle2, (DefaultConstructorMarker) null);
            }
            spanStyle2 = spanStyle;
            j5 = j4;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
            if (brush != null) {
            }
            TextForegroundStyle merge222 = spanStyle.getTextForegroundStyle().merge(m6209from8_81llA);
            if (fontFamily == null) {
            }
            if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j2)) {
            }
            if (fontWeight2 == null) {
            }
            if (fontStyle2 == null) {
            }
            if (fontSynthesis2 == null) {
            }
            if (str2 == null) {
            }
            if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j3)) {
            }
            if (baselineShift2 == null) {
            }
            if (textGeometricTransform2 == null) {
            }
            if (localeList == null) {
            }
            if (j5 == 16) {
            }
            if (textDecoration == null) {
            }
            if (shadow == null) {
            }
            PlatformSpanStyle mergePlatformStyle222 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
            if (drawStyle2 == null) {
            }
            return new SpanStyle(merge222, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, mergePlatformStyle222, drawStyle2, (DefaultConstructorMarker) null);
        }
        spanStyle2 = spanStyle;
        textGeometricTransform2 = textGeometricTransform;
        j5 = j4;
        platformSpanStyle2 = platformSpanStyle;
        drawStyle2 = drawStyle;
        if (brush != null) {
        }
        TextForegroundStyle merge2222 = spanStyle.getTextForegroundStyle().merge(m6209from8_81llA);
        if (fontFamily == null) {
        }
        if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j2)) {
        }
        if (fontWeight2 == null) {
        }
        if (fontStyle2 == null) {
        }
        if (fontSynthesis2 == null) {
        }
        if (str2 == null) {
        }
        if (!TextUnitKt.m6510isUnspecifiedR2X_6o(j3)) {
        }
        if (baselineShift2 == null) {
        }
        if (textGeometricTransform2 == null) {
        }
        if (localeList == null) {
        }
        if (j5 == 16) {
        }
        if (textDecoration == null) {
        }
        if (shadow == null) {
        }
        PlatformSpanStyle mergePlatformStyle2222 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
        if (drawStyle2 == null) {
        }
        return new SpanStyle(merge2222, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, mergePlatformStyle2222, drawStyle2, (DefaultConstructorMarker) null);
    }
}
