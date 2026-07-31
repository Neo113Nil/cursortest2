package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Font.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontFamily;", "toFontFamily", "(Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FontKt {
    public static final FontFamily toFontFamily(Font font) {
        Intrinsics.checkNotNullParameter(font, "<this>");
        return FontFamilyKt.FontFamily(font);
    }
}
