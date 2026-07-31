package com.yandex.div.core.view2.spannable;

import A.f;
import V1.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import j2.AbstractC3185a;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final f LINE_POOL = new f(16);

    @NotNull
    private final TextVerticalAlignment alignment;

    @NotNull
    private final Paint.FontMetricsInt fontMetrics;
    private final int fontSize;

    @NotNull
    private final a layoutProvider;

    @NotNull
    private final Queue<int[]> lines;
    private boolean textDrawWasCalled;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VerticalAlignmentSpan(int i4, @NotNull TextVerticalAlignment alignment, @NotNull a layoutProvider) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        this.fontSize = i4;
        this.alignment = alignment;
        this.layoutProvider = layoutProvider;
        this.fontMetrics = new Paint.FontMetricsInt();
        this.lines = new LinkedList();
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int i4, int i5, int i6, int i7, int i8, @NotNull CharSequence text, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i9 > spanned.getSpanEnd(this) || spanStart > i10) {
            return;
        }
        Layout layout = (Layout) this.layoutProvider.get();
        int c4 = i11 == layout.getLineCount() - 1 ? 0 : AbstractC3185a.c(layout.getSpacingAdd());
        int[] iArr = (int[]) LINE_POOL.b();
        if (iArr == null) {
            iArr = new int[2];
        }
        iArr[0] = i6 - i7;
        iArr[1] = (i8 - i7) - c4;
        this.lines.add(iArr);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] line = this.lines.remove();
        int i4 = line[0];
        int i5 = line[1];
        f fVar = LINE_POOL;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        fVar.a(line);
        int i6 = this.fontSize;
        if (i6 > 0) {
            paint.setTextSize(i6);
        }
        paint.getFontMetricsInt(this.fontMetrics);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i7 == 1) {
            paint.baselineShift += i4 - this.fontMetrics.ascent;
            return;
        }
        if (i7 != 2) {
            if (i7 != 4) {
                return;
            }
            paint.baselineShift += i5 - this.fontMetrics.descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            paint.baselineShift += ((i4 + i5) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
    }
}
