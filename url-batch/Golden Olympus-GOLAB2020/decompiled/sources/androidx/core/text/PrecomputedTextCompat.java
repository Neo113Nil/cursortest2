package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f11837e = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Spannable f11838b;

    /* renamed from: c, reason: collision with root package name */
    private final Params f11839c;

    /* renamed from: d, reason: collision with root package name */
    private final PrecomputedText f11840d;

    public Params a() {
        return this.f11839c;
    }

    public PrecomputedText b() {
        if (c.a(this.f11838b)) {
            return d.a(this.f11838b);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f11838b.charAt(i4);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f11838b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f11838b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f11838b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i4, int i5, Class cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return this.f11838b.getSpans(i4, i5, cls);
        }
        spans = this.f11840d.getSpans(i4, i5, cls);
        return spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f11838b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f11838b.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11840d.removeSpan(obj);
        } else {
            this.f11838b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11840d.setSpan(obj, i4, i5, i6);
        } else {
            this.f11838b.setSpan(obj, i4, i5, i6);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f11838b.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f11838b.toString();
    }

    public static final class Params {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f11841a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f11842b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11843c;

        /* renamed from: d, reason: collision with root package name */
        private final int f11844d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f11845e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f11846a;

            /* renamed from: c, reason: collision with root package name */
            private int f11848c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f11849d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f11847b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.f11846a = textPaint;
            }

            public Params a() {
                return new Params(this.f11846a, this.f11847b, this.f11848c, this.f11849d);
            }

            public a b(int i4) {
                this.f11848c = i4;
                return this;
            }

            public a c(int i4) {
                this.f11849d = i4;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f11847b = textDirectionHeuristic;
                return this;
            }
        }

        Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = q.a(textPaint).setBreakStrategy(i4);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f11845e = build;
            } else {
                this.f11845e = null;
            }
            this.f11841a = textPaint;
            this.f11842b = textDirectionHeuristic;
            this.f11843c = i4;
            this.f11844d = i5;
        }

        public boolean a(Params params) {
            if (this.f11843c == params.b() && this.f11844d == params.c() && this.f11841a.getTextSize() == params.e().getTextSize() && this.f11841a.getTextScaleX() == params.e().getTextScaleX() && this.f11841a.getTextSkewX() == params.e().getTextSkewX() && this.f11841a.getLetterSpacing() == params.e().getLetterSpacing() && TextUtils.equals(this.f11841a.getFontFeatureSettings(), params.e().getFontFeatureSettings()) && this.f11841a.getFlags() == params.e().getFlags() && this.f11841a.getTextLocales().equals(params.e().getTextLocales())) {
                return this.f11841a.getTypeface() == null ? params.e().getTypeface() == null : this.f11841a.getTypeface().equals(params.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f11843c;
        }

        public int c() {
            return this.f11844d;
        }

        public TextDirectionHeuristic d() {
            return this.f11842b;
        }

        public TextPaint e() {
            return this.f11841a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f11842b == params.d();
        }

        public int hashCode() {
            return A.c.b(Float.valueOf(this.f11841a.getTextSize()), Float.valueOf(this.f11841a.getTextScaleX()), Float.valueOf(this.f11841a.getTextSkewX()), Float.valueOf(this.f11841a.getLetterSpacing()), Integer.valueOf(this.f11841a.getFlags()), this.f11841a.getTextLocales(), this.f11841a.getTypeface(), Boolean.valueOf(this.f11841a.isElegantTextHeight()), this.f11842b, Integer.valueOf(this.f11843c), Integer.valueOf(this.f11844d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f11841a.getTextSize());
            sb.append(", textScaleX=" + this.f11841a.getTextScaleX());
            sb.append(", textSkewX=" + this.f11841a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f11841a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f11841a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f11841a.getTextLocales());
            sb.append(", typeface=" + this.f11841a.getTypeface());
            if (i4 >= 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", variationSettings=");
                fontVariationSettings = this.f11841a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f11842b);
            sb.append(", breakStrategy=" + this.f11843c);
            sb.append(", hyphenationFrequency=" + this.f11844d);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f11841a = textPaint;
            textDirection = params.getTextDirection();
            this.f11842b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f11843c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f11844d = hyphenationFrequency;
            this.f11845e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
