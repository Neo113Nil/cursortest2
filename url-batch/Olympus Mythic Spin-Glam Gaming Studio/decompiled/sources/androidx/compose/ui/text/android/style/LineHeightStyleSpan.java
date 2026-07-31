package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LineHeightStyleSpan.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR$\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topPercentage", "<init>", "(FIIZZI)V", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "calculateTargetMetrics", "(Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", "start", "end", "spanStartVertical", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "F", "getLineHeight", "()F", "I", "Z", "firstAscent", "ascent", "descent", "lastDescent", "<set-?>", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescentDiff", "getLastDescentDiff", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final int topPercentage;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, int i3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topPercentage = i3;
        if ((i3 < 0 || i3 >= 101) && i3 != -1) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1");
        }
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = start == this.startIndex;
        boolean z2 = end == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (z) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil2 - LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int i = this.topPercentage;
        if (i == -1) {
            i = (int) ((Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt)) * 100.0f);
        }
        if (lineHeight <= 0) {
            ceil = Math.ceil((lineHeight * i) / 100.0f);
        } else {
            ceil = Math.ceil((lineHeight * (100 - i)) / 100.0f);
        }
        int i2 = (int) ceil;
        int i3 = fontMetricsInt.descent;
        int i4 = i2 + i3;
        this.descent = i4;
        int i5 = i4 - ceil2;
        this.ascent = i5;
        if (this.trimFirstLineTop) {
            i5 = fontMetricsInt.ascent;
        }
        this.firstAscent = i5;
        if (this.trimLastLineBottom) {
            i4 = i3;
        }
        this.lastDescent = i4;
        this.firstAscentDiff = fontMetricsInt.ascent - i5;
        this.lastDescentDiff = i4 - i3;
    }
}
