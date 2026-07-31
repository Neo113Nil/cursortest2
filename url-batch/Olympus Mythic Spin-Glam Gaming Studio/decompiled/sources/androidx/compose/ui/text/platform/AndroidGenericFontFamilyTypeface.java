package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidGenericFontFamilyTypeface.android.kt */
@Deprecated
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001J-\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "buildStyledTypeface-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "buildStyledTypeface", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "nativeTypeface", "Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    private final Typeface nativeTypeface;

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo2390getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m2391buildStyledTypefaceFO1MlWM = m2391buildStyledTypefaceFO1MlWM(fontWeight, fontStyle);
        Intrinsics.checkNotNullExpressionValue(m2391buildStyledTypefaceFO1MlWM, "buildStyledTypeface(fontWeight, fontStyle)");
        return m2391buildStyledTypefaceFO1MlWM;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m2391buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int fontStyle) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m2273getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m2302equalsimpl0(fontStyle, FontStyle.INSTANCE.m2306getItalic_LCdwA()));
    }
}
