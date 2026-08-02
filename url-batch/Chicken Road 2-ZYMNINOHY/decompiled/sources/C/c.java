package C;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f255a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f257c;

    /* renamed from: d, reason: collision with root package name */
    public final int f258d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = b.h(textPaint).setBreakStrategy(i4);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f255a = textPaint;
        this.f256b = textDirectionHeuristic;
        this.f257c = i4;
        this.f258d = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f257c != cVar.f257c || this.f258d != cVar.f258d) {
            return false;
        }
        TextPaint textPaint = this.f255a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = cVar.f255a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f256b == cVar.f256b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f255a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f256b, Integer.valueOf(this.f257c), Integer.valueOf(this.f258d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f255a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i4 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i4 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f256b);
        sb.append(", breakStrategy=" + this.f257c);
        sb.append(", hyphenationFrequency=" + this.f258d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f255a = textPaint;
        textDirection = params.getTextDirection();
        this.f256b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f257c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f258d = hyphenationFrequency;
    }
}
