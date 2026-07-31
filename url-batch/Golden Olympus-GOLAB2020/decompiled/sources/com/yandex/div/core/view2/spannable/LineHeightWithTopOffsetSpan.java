package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {
    private boolean fontMetricsSaved;
    private final int lineHeight;
    private final int topOffset;
    private final int topOffsetEnd;
    private final int topOffsetStart;
    private int savedTop = Integer.MAX_VALUE;
    private int savedAscent = Integer.MAX_VALUE;
    private int savedDescent = Integer.MAX_VALUE;
    private int savedBottom = Integer.MAX_VALUE;

    public LineHeightWithTopOffsetSpan(int i4, int i5, int i6, int i7) {
        this.topOffset = i4;
        this.lineHeight = i5;
        this.topOffsetStart = i6;
        this.topOffsetEnd = i7;
    }

    private final void applyLineHeight(int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i4 <= 0) {
            return;
        }
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = fontMetricsInt.top - i6;
        int i9 = fontMetricsInt.bottom - i5;
        if (i7 >= 0) {
            int i10 = i4 - i7;
            if (i10 < 0) {
                int g4 = g.g(i6 - (i10 / 2), 0);
                fontMetricsInt.ascent = g4;
                fontMetricsInt.descent = g.d(g4 + i4, 0);
            } else {
                int d4 = g.d(i5 + (i10 / 2), 0);
                fontMetricsInt.descent = d4;
                fontMetricsInt.ascent = g.g(d4 - i4, 0);
            }
            fontMetricsInt.top = fontMetricsInt.ascent + i8;
            fontMetricsInt.bottom = fontMetricsInt.descent + i9;
        }
    }

    private final void applyTopOffset(Paint.FontMetricsInt fontMetricsInt) {
        int i4 = this.topOffset;
        if (i4 <= 0) {
            return;
        }
        fontMetricsInt.top -= i4;
        fontMetricsInt.ascent -= i4;
    }

    private final void restoreFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.top = this.savedTop;
        fontMetricsInt.ascent = this.savedAscent;
        fontMetricsInt.descent = this.savedDescent;
        fontMetricsInt.bottom = this.savedBottom;
    }

    private final void saveFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.savedTop = fontMetricsInt.top;
        this.savedAscent = fontMetricsInt.ascent;
        this.savedDescent = fontMetricsInt.descent;
        this.savedBottom = fontMetricsInt.bottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@Nullable CharSequence charSequence, int i4, int i5, int i6, int i7, @NotNull Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i4 > spanned.getSpanEnd(this) || spanStart > i5) {
            return;
        }
        if (this.fontMetricsSaved) {
            restoreFontMetrics(fm);
        } else {
            this.fontMetricsSaved = true;
            saveFontMetrics(fm);
        }
        Object[] spans = spanned.getSpans(i4, i5, LineHeightWithTopOffsetSpan.class);
        int i8 = this.lineHeight;
        for (Object obj : spans) {
            i8 = Math.max(i8, ((LineHeightWithTopOffsetSpan) obj).lineHeight);
        }
        applyLineHeight(i8, fm);
        int i9 = this.topOffsetStart;
        if (i9 == spanStart && i4 <= i9 && i9 <= i5) {
            applyTopOffset(fm);
        }
        if (StringsKt.P(charSequence.subSequence(i4, i5).toString(), "\n", false, 2, null)) {
            this.fontMetricsSaved = false;
        }
    }
}
