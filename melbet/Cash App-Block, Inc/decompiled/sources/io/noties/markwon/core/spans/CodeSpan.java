package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes9.dex */
public final class CodeSpan extends MetricAffectingSpan {
    public final /* synthetic */ int $r8$classId;
    public final Object theme;

    public /* synthetic */ CodeSpan(Object obj, int i) {
        this.$r8$classId = i;
        this.theme = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.$r8$classId;
        Object obj = this.theme;
        switch (i) {
            case 0:
                MarkwonTheme markwonTheme = (MarkwonTheme) obj;
                markwonTheme.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                markwonTheme.getClass();
                textPaint.bgColor = ColorUtils.applyAlpha(textPaint.getColor(), 25);
                break;
            default:
                textPaint.setFontFeatureSettings((String) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.$r8$classId;
        Object obj = this.theme;
        switch (i) {
            case 0:
                ((MarkwonTheme) obj).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            default:
                textPaint.setFontFeatureSettings((String) obj);
                break;
        }
    }
}
