package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paragraph.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\rH&¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u000bJ \u0010-\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J?\u00109\u001a\u0002062\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u000104H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J7\u00109\u001a\u0002062\u0006\u0010/\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\b9\u0010<R\u0014\u0010?\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010E\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010G\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010>R\u0014\u0010J\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Pø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "offset", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "(I)Landroidx/compose/ui/geometry/Rect;", "lineIndex", "", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBottom", "getLineStart", "(I)I", "", "visibleEnd", "getLineEnd", "(IZ)I", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/Brush;", "brush", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "getWidth", "()F", "width", "getHeight", "height", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "getLineCount", "()I", "lineCount", "", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Paragraph {

    /* compiled from: Paragraph.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    ResolvedTextDirection getBidiRunDirection(int offset);

    Rect getBoundingBox(int offset);

    Rect getCursorRect(int offset);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int offset, boolean usePrimaryDirection);

    float getLastBaseline();

    float getLineBottom(int lineIndex);

    int getLineCount();

    int getLineEnd(int lineIndex, boolean visibleEnd);

    int getLineForOffset(int offset);

    int getLineForVerticalPosition(float vertical);

    float getLineLeft(int lineIndex);

    float getLineRight(int lineIndex);

    int getLineStart(int lineIndex);

    float getLineTop(int lineIndex);

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    int mo2182getOffsetForPositionk4lQ0M(long position);

    ResolvedTextDirection getParagraphDirection(int offset);

    Path getPathForRange(int start, int end);

    List getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    long mo2183getWordBoundaryjx7JFs(int offset);

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    void mo2184paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration);

    default void paint(Canvas canvas, Brush brush, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        throw new UnsupportedOperationException("Using brush for painting the paragraph is a separate functionality that is not supported on this platform");
    }
}
