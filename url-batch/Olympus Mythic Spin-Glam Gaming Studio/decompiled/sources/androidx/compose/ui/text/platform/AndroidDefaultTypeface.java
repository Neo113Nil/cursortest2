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

/* compiled from: AndroidDefaultTypeface.android.kt */
@Deprecated
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo2390getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (Build.VERSION.SDK_INT < 28) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m2273getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle));
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…)\n            )\n        }");
            return defaultFromStyle;
        }
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        return typefaceHelperMethodsApi28.create(DEFAULT, fontWeight.getWeight(), FontStyle.m2302equalsimpl0(fontStyle, FontStyle.INSTANCE.m2306getItalic_LCdwA()));
    }
}
