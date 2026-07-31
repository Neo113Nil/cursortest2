package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: TextFieldDelegate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\b*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/IntSize;", "computeSizeForDefaultText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;I)J", "", "toIntPx", "(F)I", "EmptyTextReplacement", "Ljava/lang/String;", "getEmptyTextReplacement", "()Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextFieldDelegateKt {
    private static final String EmptyTextReplacement = StringsKt.repeat("H", 10);

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    public static final long computeSizeForDefaultText(TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, String text, int i) {
        Paragraph m2187ParagraphUdtVg6A;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(text, "text");
        m2187ParagraphUdtVg6A = ParagraphKt.m2187ParagraphUdtVg6A(text, style, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, fontFamilyResolver, (r22 & 32) != 0 ? CollectionsKt.emptyList() : CollectionsKt.emptyList(), (r22 & 64) != 0 ? CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : i, (r22 & 256) != 0 ? false : false);
        return IntSizeKt.IntSize(toIntPx(m2187ParagraphUdtVg6A.getMinIntrinsicWidth()), toIntPx(m2187ParagraphUdtVg6A.getHeight()));
    }

    private static final int toIntPx(float f) {
        return MathKt.roundToInt((float) Math.ceil(f));
    }
}
