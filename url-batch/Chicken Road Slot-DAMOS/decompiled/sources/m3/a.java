package m3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f6549a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f6550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6552d;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i10) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = c4.b.h(textPaint).setBreakStrategy(i3);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i10);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f6549a = textPaint;
        this.f6550b = textDirectionHeuristic;
        this.f6551c = i3;
        this.f6552d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i3 = aVar.f6551c;
        TextPaint textPaint = aVar.f6549a;
        if (this.f6551c != i3 || this.f6552d != aVar.f6552d) {
            return false;
        }
        TextPaint textPaint2 = this.f6549a;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f6550b == aVar.f6550b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f6549a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f6550b, Integer.valueOf(this.f6551c), Integer.valueOf(this.f6552d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f6549a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f6550b);
        sb2.append(", breakStrategy=" + this.f6551c);
        sb2.append(", hyphenationFrequency=" + this.f6552d);
        sb2.append("}");
        return sb2.toString();
    }

    public a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f6549a = textPaint;
        textDirection = params.getTextDirection();
        this.f6550b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f6551c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f6552d = hyphenationFrequency;
    }
}
