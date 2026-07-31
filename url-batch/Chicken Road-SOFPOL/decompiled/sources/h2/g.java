package h2;

import android.graphics.Rect;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i8, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i8 < 0) {
            l2.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i8 < 0 || i8 > length) {
            l2.a.a("invalid end value");
        }
        if (i9 < 0) {
            l2.a.a("invalid maxLines value");
        }
        if (i < 0) {
            l2.a.a("invalid width value");
        }
        if (i10 < 0) {
            l2.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i8, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i9);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i10);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z3);
        obtain.setBreakStrategy(i12);
        obtain.setHyphenationFrequency(i15);
        obtain.setIndents(null, null);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            obtain.setJustificationMode(i11);
        }
        if (i16 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i16 >= 33) {
            lineBreakStyle = b.b.b().setLineBreakStyle(i13);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i14);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i16 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i, int i8) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i8, MetricAffectingSpan.class) != i8) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i8) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i8, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    d6.b h8 = q6.i.h(metricAffectingSpanArr);
                    while (h8.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) h8.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i, i8, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i8, rect3);
        return rect3;
    }

    public static final boolean c(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
