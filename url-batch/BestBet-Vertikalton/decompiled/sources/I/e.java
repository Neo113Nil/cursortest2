package I;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f535a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f537c;
    public final int d;

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = d.h(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f535a = textPaint;
        this.f536b = textDirectionHeuristic;
        this.f537c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f537c == eVar.f537c && this.d == eVar.d) {
            TextPaint textPaint = this.f535a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = eVar.f535a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f536b == eVar.f536b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f535a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f536b, Integer.valueOf(this.f537c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f535a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f536b);
        sb.append(", breakStrategy=" + this.f537c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public e(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f535a = textPaint;
        textDirection = params.getTextDirection();
        this.f536b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f537c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.d = hyphenationFrequency;
    }
}
