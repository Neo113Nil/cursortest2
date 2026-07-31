package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextPaintExtensions.android.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012&\u0010\u0004\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"applySpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle style, Function4 resolveTypeface, Density density) {
        long m2583getUnspecifiedXSAIIZE;
        long background;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(style.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo270toPxR2X_6o(style.getFontSize()));
        } else if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m2579getValueimpl(style.getFontSize()));
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = style.getFontStyle();
            FontStyle m2299boximpl = FontStyle.m2299boximpl(fontStyle != null ? fontStyle.getValue() : FontStyle.INSTANCE.m2307getNormal_LCdwA());
            FontSynthesis fontSynthesis = style.getFontSynthesis();
            androidTextPaint.setTypeface((Typeface) resolveTypeface.invoke(fontFamily, fontWeight, m2299boximpl, FontSynthesis.m2308boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m2317getAllGVVA2EU())));
        }
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
        }
        long m2578getTypeUIouoOA2 = TextUnit.m2578getTypeUIouoOA(style.getLetterSpacing());
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA2, companion.m2596getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m2579getValueimpl(style.getLetterSpacing()));
        } else {
            TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA2, companion.m2597getSpUIouoOA());
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m2399setColor8_81llA(style.m2225getColor0d7_KjU());
        androidTextPaint.m2398setBrushd16Qtg0(style.getBrush(), Size.INSTANCE.m1340getUnspecifiedNHjbRc());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        if (TextUnitType.m2592equalsimpl0(TextUnit.m2578getTypeUIouoOA(style.getLetterSpacing()), companion.m2597getSpUIouoOA()) && TextUnit.m2579getValueimpl(style.getLetterSpacing()) != 0.0f) {
            m2583getUnspecifiedXSAIIZE = style.getLetterSpacing();
        } else {
            m2583getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE();
        }
        long j = m2583getUnspecifiedXSAIIZE;
        long background2 = style.getBackground();
        Color.Companion companion2 = Color.INSTANCE;
        if (Color.m1447equalsimpl0(background2, companion2.m1460getTransparent0d7_KjU())) {
            background = companion2.m1461getUnspecified0d7_KjU();
        } else {
            background = style.getBackground();
        }
        long j2 = background;
        BaselineShift baselineShift = style.getBaselineShift();
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, j, baselineShift == null ? false : BaselineShift.m2414equalsimpl0(baselineShift.getMultiplier(), BaselineShift.INSTANCE.m2418getNoney9eOQZs()) ? null : style.getBaselineShift(), (TextGeometricTransform) null, (LocaleList) null, j2, (TextDecoration) null, (Shadow) null, 13951, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
