package androidx.compose.ui.text.font;

import android.os.Build;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontSynthesis.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2321synthesizeTypefaceFxwP2eA(int i, Object typeface, Font font, FontWeight requestedWeight, int i2) {
        boolean z;
        boolean z2;
        int weight;
        boolean m2302equalsimpl0;
        android.graphics.Typeface create;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(requestedWeight, "requestedWeight");
        if (!(typeface instanceof android.graphics.Typeface)) {
            return typeface;
        }
        boolean z3 = false;
        if (FontSynthesis.m2314isWeightOnimpl$ui_text_release(i) && !Intrinsics.areEqual(font.getWeight(), requestedWeight)) {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (requestedWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) < 0) {
                z = true;
                z2 = (FontSynthesis.m2313isStyleOnimpl$ui_text_release(i) || FontStyle.m2302equalsimpl0(i2, font.getStyle())) ? false : true;
                if (z2 && !z) {
                    return typeface;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    if (z2 && FontStyle.m2302equalsimpl0(i2, FontStyle.INSTANCE.m2306getItalic_LCdwA())) {
                        z3 = true;
                    }
                    create = android.graphics.Typeface.create((android.graphics.Typeface) typeface, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z, z3));
                } else {
                    if (z) {
                        weight = requestedWeight.getWeight();
                    } else {
                        weight = font.getWeight().getWeight();
                    }
                    if (z2) {
                        m2302equalsimpl0 = FontStyle.m2302equalsimpl0(i2, FontStyle.INSTANCE.m2306getItalic_LCdwA());
                    } else {
                        m2302equalsimpl0 = FontStyle.m2302equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m2306getItalic_LCdwA());
                    }
                    create = TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) typeface, weight, m2302equalsimpl0);
                }
                Intrinsics.checkNotNullExpressionValue(create, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                return create;
            }
        }
        z = false;
        if (FontSynthesis.m2313isStyleOnimpl$ui_text_release(i)) {
        }
        if (z2) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
        Intrinsics.checkNotNullExpressionValue(create, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return create;
    }
}
