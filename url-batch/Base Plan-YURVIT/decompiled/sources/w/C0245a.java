package w;

import L.k;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245a {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3097c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3098d;

    public C0245a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = k.k(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3095a = textPaint;
        this.f3096b = textDirectionHeuristic;
        this.f3097c = i2;
        this.f3098d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0245a)) {
            return false;
        }
        C0245a c0245a = (C0245a) obj;
        if (this.f3097c != c0245a.f3097c || this.f3098d != c0245a.f3098d) {
            return false;
        }
        TextPaint textPaint = this.f3095a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0245a.f3095a;
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
        return this.f3096b == c0245a.f3096b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f3095a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3096b, Integer.valueOf(this.f3097c), Integer.valueOf(this.f3098d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3095a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f3096b);
        sb.append(", breakStrategy=" + this.f3097c);
        sb.append(", hyphenationFrequency=" + this.f3098d);
        sb.append("}");
        return sb.toString();
    }

    public C0245a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3095a = textPaint;
        textDirection = params.getTextDirection();
        this.f3096b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3097c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3098d = hyphenationFrequency;
    }
}
