package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010#J \u0010-\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b3\u00100J\u0017\u00105\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00100J\u0017\u00106\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u00107J\u001f\u0010=\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020?2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010AJ9\u0010N\u001a\u00020K2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ3\u0010N\u001a\u00020K2\u0006\u0010D\u001a\u00020C2\u0006\u0010P\u001a\u00020O2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bN\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\bY\u0010ZR \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\b-\u0010hR\u0014\u0010l\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010kR\u0014\u0010p\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010kR\u0014\u0010r\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010kR\u0014\u0010t\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010kR\u0014\u0010v\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010ZR\u001a\u0010|\u001a\u00020w8@X\u0081\u0004¢\u0006\f\u0012\u0004\bz\u0010{\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010WR\u001e\u0010\u0083\u0001\u001a\u00020\u007f8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0082\u0001\u0010{\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0088\u0001\u001a\u00030\u0084\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0087\u0001\u0010{\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "getShaderBrushSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "constructTextLayout", "(IILandroid/text/TextUtils$TruncateAt;I)Landroidx/compose/ui/text/android/TextLayout;", "", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "offset", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getCursorRect", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline$ui_text_release", "getLineBaseline", "getLineBottom", "getLineStart", "(I)I", "visibleEnd", "getLineEnd", "(IZ)I", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/Brush;", "brush", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", "Z", "getEllipsis", "()Z", "J", "getConstraints-msEJaDk", "()J", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "()V", "textLocale", "getLineCount", "lineCount", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "charSequence", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidParagraph implements Paragraph {
    private final long constraints;
    private final boolean ellipsis;
    private final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List placeholderRects;

    /* renamed from: wordBoundary$delegate, reason: from kotlin metadata */
    private final Lazy wordBoundary;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j) {
        int m2397toLayoutAlignAMY3VfE;
        List list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        int numberOfLinesThatFitMaxHeight;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.ellipsis = z;
        this.constraints = j;
        if (Constraints.m2488getMinHeightimpl(j) != 0 || Constraints.m2489getMinWidthimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        boolean z2 = true;
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        m2397toLayoutAlignAMY3VfE = AndroidParagraph_androidKt.m2397toLayoutAlignAMY3VfE(style.m2266getTextAlignbuA522U());
        TextAlign m2266getTextAlignbuA522U = style.m2266getTextAlignbuA522U();
        int m2442equalsimpl0 = m2266getTextAlignbuA522U == null ? 0 : TextAlign.m2442equalsimpl0(m2266getTextAlignbuA522U.getValue(), TextAlign.INSTANCE.m2448getJustifye0LSkKk());
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        TextLayout constructTextLayout = constructTextLayout(m2397toLayoutAlignAMY3VfE, m2442equalsimpl0, truncateAt, i);
        if (z && constructTextLayout.getHeight() > Constraints.m2486getMaxHeightimpl(j) && i > 1) {
            numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(constructTextLayout, Constraints.m2486getMaxHeightimpl(j));
            if (numberOfLinesThatFitMaxHeight > 0 && numberOfLinesThatFitMaxHeight != i) {
                constructTextLayout = constructTextLayout(m2397toLayoutAlignAMY3VfE, m2442equalsimpl0, truncateAt, numberOfLinesThatFitMaxHeight);
            }
            this.layout = constructTextLayout;
        } else {
            this.layout = constructTextLayout;
        }
        getTextPaint$ui_text_release().m2398setBrushd16Qtg0(style.getBrush(), SizeKt.Size(getWidth(), getHeight()));
        for (ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
            shaderBrushSpan.m2410setSizeiaC8Vc4(Size.m1329boximpl(SizeKt.Size(getWidth(), getHeight())));
        }
        CharSequence charSequence = this.paragraphIntrinsics.getCharSequence();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i2 = 0;
            while (i2 < length) {
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[i2];
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.layout.getLineForOffset(spanStart);
                boolean z3 = (this.layout.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= this.layout.getLineEllipsisOffset(lineForOffset)) ? false : z2;
                boolean z4 = spanEnd > this.layout.getLineEnd(lineForOffset) ? z2 : false;
                if (z3 || z4) {
                    rect = null;
                } else {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i3 == z2) {
                        horizontalPosition = getHorizontalPosition(spanStart, z2);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        horizontalPosition = getHorizontalPosition(spanStart, z2) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                    TextLayout textLayout = this.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 1:
                            lineTop = textLayout.getLineTop(lineForOffset);
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 2:
                            lineBaseline = textLayout.getLineBottom(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 3:
                            lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 4:
                            f = placeholderSpan.getFontMetrics().ascent;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 5:
                            lineBaseline = placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(rect);
                i2++;
                z2 = true;
            }
            list = arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        this.placeholderRects = list;
        this.wordBoundary = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final WordBoundary mo4828invoke() {
                TextLayout textLayout2;
                Locale textLocale$ui_text_release = AndroidParagraph.this.getTextLocale$ui_text_release();
                textLayout2 = AndroidParagraph.this.layout;
                return new WordBoundary(textLocale$ui_text_release, textLayout2.getText());
            }
        });
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m2487getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        if (this.maxLines < getLineCount()) {
            return getLineBaseline$ui_text_release(this.maxLines - 1);
        }
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.paragraphIntrinsics.getCharSequence();
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M */
    public int mo2182getOffsetForPositionk4lQ0M(long position) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m1298getYimpl(position)), Offset.m1297getXimpl(position));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int offset) {
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        float primaryHorizontal$default2 = TextLayout.getPrimaryHorizontal$default(this.layout, offset + 1, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(offset);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default2, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int start, int end) {
        if (start < 0 || start > end || end > getCharSequence$ui_text_release().length()) {
            throw new AssertionError("Start(" + start + ") or End(" + end + ") is out of Range(0.." + getCharSequence$ui_text_release().length() + "), or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(start, end, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int offset) {
        if (offset < 0 || offset > getCharSequence$ui_text_release().length()) {
            throw new AssertionError("offset(" + offset + ") is out of bounds (0," + getCharSequence$ui_text_release().length());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(offset);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary.getValue();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs */
    public long mo2183getWordBoundaryjx7JFs(int offset) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(offset), getWordBoundary().getWordEnd(offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    public final float getLineBaseline$ui_text_release(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        if (visibleEnd) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        if (usePrimaryDirection) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int offset) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        if (this.layout.isRtlCharAt(offset)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (textLayout.getText() instanceof Spanned) {
            ShaderBrushSpan[] brushSpans = (ShaderBrushSpan[]) ((Spanned) textLayout.getText()).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
            Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
            return brushSpans.length == 0 ? new ShaderBrushSpan[0] : brushSpans;
        }
        return new ShaderBrushSpan[0];
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk */
    public void mo2184paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m2399setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    public void paint(Canvas canvas, Brush brush, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m2398setBrushd16Qtg0(brush, SizeKt.Size(getWidth(), getHeight()));
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    private final TextLayout constructTextLayout(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines) {
        return new TextLayout(this.paragraphIntrinsics.getCharSequence(), getWidth(), getTextPaint$ui_text_release(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, 0, 0, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 55424, null);
    }
}
