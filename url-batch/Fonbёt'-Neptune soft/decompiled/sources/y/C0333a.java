package y;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import n0.j;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333a {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3591a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3594d;

    public C0333a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = j.f(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3591a = textPaint;
        this.f3592b = textDirectionHeuristic;
        this.f3593c = i2;
        this.f3594d = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        if (r7.f3594d != r8.f3594d) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r3.getTypeface() != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r5.getTypeface() == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        LocaleList textLocales;
        LocaleList textLocales2;
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0333a)) {
            return false;
        }
        C0333a c0333a = (C0333a) obj;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f3593c == c0333a.f3593c) {
            }
            boolean z2 = false;
            return !z2 && this.f3592b == c0333a.f3592b;
        }
        TextPaint textPaint = this.f3591a;
        if (textPaint.getTextSize() == c0333a.f3591a.getTextSize()) {
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = c0333a.f3591a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                if (i2 >= 24) {
                    textLocales = textPaint.getTextLocales();
                    textLocales2 = textPaint2.getTextLocales();
                    equals = textLocales.equals(textLocales2);
                }
            }
        }
        boolean z22 = false;
        if (z22) {
            return false;
        }
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f3592b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f3594d;
        int i4 = this.f3593c;
        TextPaint textPaint = this.f3591a;
        if (i2 < 24) {
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3));
        }
        Float valueOf = Float.valueOf(textPaint.getTextSize());
        Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
        Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
        Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
        Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
        textLocales = textPaint.getTextLocales();
        return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3591a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i2 >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f3592b);
        sb.append(", breakStrategy=" + this.f3593c);
        sb.append(", hyphenationFrequency=" + this.f3594d);
        sb.append("}");
        return sb.toString();
    }

    public C0333a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3591a = textPaint;
        textDirection = params.getTextDirection();
        this.f3592b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3593c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3594d = hyphenationFrequency;
    }
}
