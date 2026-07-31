package androidx.compose.ui.text.font;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\fJ%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "", "familyName", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "genericFontFamily", "fontWeight", "fontStyle", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "createAndroidTypefaceUsingTypefaceStyle", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "Landroidx/compose/ui/text/font/GenericFontFamily;", "name", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes14.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo2324createDefaultFO1MlWM(FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo2325createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        android.graphics.Typeface m2327loadNamedFromTypefaceCacheOrNullRetOiIg = m2327loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, fontStyle);
        return m2327loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, fontStyle) : m2327loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m2327loadNamedFromTypefaceCacheOrNullRetOiIg(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        android.graphics.Typeface m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg = m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg(familyName, weight, style);
        if (Intrinsics.areEqual(m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m2273getAndroidTypefaceStyleFO1MlWM(weight, style))) || Intrinsics.areEqual(m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg, m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, weight, style))) {
            return null;
        }
        return m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m2326createAndroidTypefaceUsingTypefaceStyleRetOiIg(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (FontStyle.m2302equalsimpl0(fontStyle, FontStyle.INSTANCE.m2307getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int m2273getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m2273getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        if (genericFontFamily == null || genericFontFamily.length() == 0) {
            android.graphics.Typeface defaultFromStyle = android.graphics.Typeface.defaultFromStyle(m2273getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        android.graphics.Typeface create = android.graphics.Typeface.create(genericFontFamily, m2273getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }
}
