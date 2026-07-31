package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\r*\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "", "setSpanStyle", "(Landroid/text/SpannableString;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver fontFamilyResolver) {
        SpanStyle m2222copyIuqyXdg;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) spanStyles.get(i);
            SpanStyle spanStyle = (SpanStyle) range.getItem();
            int start = range.getStart();
            int end = range.getEnd();
            m2222copyIuqyXdg = spanStyle.m2222copyIuqyXdg((r35 & 1) != 0 ? spanStyle.m2225getColor0d7_KjU() : 0L, (r35 & 2) != 0 ? spanStyle.fontSize : 0L, (r35 & 4) != 0 ? spanStyle.fontWeight : null, (r35 & 8) != 0 ? spanStyle.fontStyle : null, (r35 & 16) != 0 ? spanStyle.fontSynthesis : null, (r35 & 32) != 0 ? spanStyle.fontFamily : null, (r35 & 64) != 0 ? spanStyle.fontFeatureSettings : null, (r35 & 128) != 0 ? spanStyle.letterSpacing : 0L, (r35 & 256) != 0 ? spanStyle.baselineShift : null, (r35 & 512) != 0 ? spanStyle.textGeometricTransform : null, (r35 & 1024) != 0 ? spanStyle.localeList : null, (r35 & 2048) != 0 ? spanStyle.background : 0L, (r35 & 4096) != 0 ? spanStyle.textDecoration : null, (r35 & 8192) != 0 ? spanStyle.shadow : null);
            setSpanStyle(spannableString, m2222copyIuqyXdg, start, end, density, fontFamilyResolver);
        }
        List ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) ttsAnnotations.get(i2);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan((TtsAnnotation) range2.getItem()), range2.getStart(), range2.getEnd(), 33);
        }
        return spannableString;
    }

    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m2406setColorRPmYEkk(spannableString, spanStyle.m2225getColor0d7_KjU(), i, i2);
        SpannableExtensions_androidKt.m2407setFontSizeKmRG4DE(spannableString, spanStyle.getFontSize(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m2273getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.getValue() : FontStyle.INSTANCE.m2307getNormal_LCdwA())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) FontFamily.Resolver.m2287resolveDPcqOEQ$default(resolver, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m2317getAllGVVA2EU(), 6, null).getValue()), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i, i2);
        SpannableExtensions_androidKt.m2404setBackgroundRPmYEkk(spannableString, spanStyle.getBackground(), i, i2);
    }
}
