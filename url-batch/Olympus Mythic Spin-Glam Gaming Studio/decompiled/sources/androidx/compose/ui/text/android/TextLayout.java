package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextLayout.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b$\u0010\u001fJ\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b*\u0010&J\u0015\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010&J\u001d\u0010.\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\u000f¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00042\u0006\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\u000f¢\u0006\u0004\b4\u00103J\u0015\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b5\u0010&J\u0015\u00106\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b8\u0010&J%\u0010>\u001a\u00020=2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010ER\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bI\u0010ER\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010M\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bN\u0010ER \u0010P\u001a\u00020O8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bT\u0010U\u001a\u0004\bR\u0010SR\u0017\u0010V\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010Z\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bZ\u0010W\u0012\u0004\b\\\u0010U\u001a\u0004\b[\u0010YR \u0010]\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010W\u0012\u0004\b_\u0010U\u001a\u0004\b^\u0010YR\u0014\u0010`\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010GR\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0011\u0010i\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010k\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bj\u0010Y¨\u0006l"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineBaseline", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", "offset", "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "(I)Z", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "Z", "getIncludePadding", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "bottomPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "isBoringLayout", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper$delegate", "Lkotlin/Lazy;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextLayout {
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final Layout layout;

    /* renamed from: layoutHelper$delegate, reason: from kotlin metadata */
    private final Lazy layoutHelper;
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;
    private final int topPadding;

    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        boolean z3;
        boolean z4;
        Layout create;
        Pair verticalPaddings;
        Pair lineHeightPaddings;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
        double d = f;
        int ceil = (int) Math.ceil(d);
        if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f && !z5) {
            this.isBoringLayout = true;
            create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, truncateAt, ceil);
            z3 = true;
            z4 = false;
        } else {
            this.isBoringLayout = false;
            z3 = true;
            z4 = false;
            create = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, ceil, textDirectionHeuristic, alignment, i3, truncateAt, (int) Math.ceil(d), f2, f3, i6, z, z2, i4, i5, iArr, iArr2);
        }
        this.layout = create;
        int min = Math.min(create.getLineCount(), i3);
        this.lineCount = min;
        this.didExceedMaxLines = (min >= i3 && (create.getEllipsisCount(min + (-1)) > 0 || create.getLineEnd(min + (-1)) != charSequence.length())) ? z3 : z4;
        verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
        lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this);
        this.topPadding = Math.max(((Number) verticalPaddings.getFirst()).intValue(), ((Number) lineHeightPaddings.getFirst()).intValue());
        this.bottomPadding = Math.max(((Number) verticalPaddings.getSecond()).intValue(), ((Number) lineHeightPaddings.getSecond()).intValue());
        this.layoutHelper = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final LayoutHelper mo4828invoke() {
                return new LayoutHelper(TextLayout.this.getLayout());
            }
        });
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, r5, textPaint, r7, r8, r9, (i7 & 64) != 0 ? 1.0f : f2, (i7 & 128) != 0 ? 0.0f : f3, (i7 & 256) != 0 ? false : z, (i7 & 512) != 0 ? true : z2, (i7 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i7 & 2048) != 0 ? 0 : i4, (i7 & 4096) != 0 ? 0 : i5, (i7 & 8192) != 0 ? 0 : i6, (i7 & 16384) != 0 ? null : iArr, (32768 & i7) != 0 ? null : iArr2, (i7 & 65536) != 0 ? new LayoutIntrinsics(charSequence, textPaint, r9) : layoutIntrinsics);
        float f4 = (i7 & 2) != 0 ? 0.0f : f;
        int i8 = (i7 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i7 & 16) != 0 ? null : truncateAt;
        int i9 = (i7 & 32) != 0 ? 2 : i2;
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper.getValue();
    }

    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding;
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final float getLineBottom(int line) {
        return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
    }

    public final float getLineBaseline(int line) {
        return this.topPadding + this.layout.getLineBaseline(line);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineEnd(lineIndex);
        }
        return this.layout.getText().length();
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(this.topPadding + vertical);
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal);
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream);
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final void getSelectionPath(int start, int end, Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final void paint(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.topPadding;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        this.layout.draw(canvas);
        int i2 = this.topPadding;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        return this.fallbackLineSpacing && !this.isBoringLayout && Build.VERSION.SDK_INT >= 28;
    }
}
