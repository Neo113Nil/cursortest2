package n2;

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
import c2.y;
import com.appsflyer.internal.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final y f7003a = new y(3);

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i3, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, boolean z10, int i14, int i15, int i16, int i17) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i10 < 0) {
            r2.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            r2.a.a("invalid end value");
        }
        if (i11 < 0) {
            r2.a.a("invalid maxLines value");
        }
        if (i3 < 0) {
            r2.a.a("invalid width value");
        }
        if (i12 < 0) {
            r2.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i10, textPaint, i3);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i11);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i12);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z10);
        obtain.setBreakStrategy(i14);
        obtain.setHyphenationFrequency(i17);
        obtain.setIndents(null, null);
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            obtain.setJustificationMode(i13);
        }
        if (i18 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i18 >= 33) {
            lineBreakStyle = j.e().setLineBreakStyle(i15);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i16);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i18 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i3, int i10) {
        int i11 = i3;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i11 - 1, i10, MetricAffectingSpan.class) != i10) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i10) {
                    int nextSpanTransition = spanned.nextSpanTransition(i11, i10, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i11, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i11, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i11 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i11, i10, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i11, i10, rect3);
        return rect3;
    }

    public static final boolean c(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
