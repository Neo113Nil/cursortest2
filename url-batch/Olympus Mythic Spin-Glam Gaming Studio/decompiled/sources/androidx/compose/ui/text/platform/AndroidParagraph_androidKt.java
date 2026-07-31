package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001au\u0010 \u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "align", "", "toLayoutAlign-AMY3VfE", "(Landroidx/compose/ui/text/style/TextAlign;)I", "toLayoutAlign", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "numberOfLinesThatFitMaxHeight", "(Landroidx/compose/ui/text/android/TextLayout;I)I", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "maxLines", "", "ellipsis", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/Paragraph;", "ActualParagraph-O3s9Psw", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/Paragraph;", "ActualParagraph", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "paragraphIntrinsics", "ActualParagraph--hBUhpc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;IZJ)Landroidx/compose/ui/text/Paragraph;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m2397toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlign == null ? false : TextAlign.m2442equalsimpl0(textAlign.getValue(), companion.m2449getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m2442equalsimpl0(textAlign.getValue(), companion.m2450getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m2442equalsimpl0(textAlign.getValue(), companion.m2446getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m2442equalsimpl0(textAlign.getValue(), companion.m2451getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m2442equalsimpl0(textAlign.getValue(), companion.m2447getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* renamed from: ActualParagraph-O3s9Psw, reason: not valid java name */
    public static final Paragraph m2395ActualParagraphO3s9Psw(String text, TextStyle style, List spanStyles, List placeholders, int i, boolean z, long j, Density density, FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density), i, z, j, null);
    }

    /* renamed from: ActualParagraph--hBUhpc, reason: not valid java name */
    public static final Paragraph m2394ActualParagraphhBUhpc(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, long j) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i, z, j, null);
    }
}
