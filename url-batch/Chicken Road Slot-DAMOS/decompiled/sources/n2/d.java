package n2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6996a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f6997b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6998c;

    /* renamed from: d, reason: collision with root package name */
    public float f6999d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f7000e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f7001f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f7002h;

    public d(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f6996a = charSequence;
        this.f6997b = textPaint;
        this.f6998c = i3;
    }

    public final BoringLayout.Metrics a() {
        if (!this.g) {
            TextDirectionHeuristic b10 = i.b(this.f6998c);
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f6996a;
            TextPaint textPaint = this.f6997b;
            this.f7001f = i3 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, b10, true, null) : !b10.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.g = true;
        }
        return this.f7001f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f7002h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f6996a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (e.c(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f7002h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (n2.e.c(r2, o2.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f6999d)) {
            return this.f6999d;
        }
        BoringLayout.Metrics a9 = a();
        float f3 = a9 != null ? a9.width : -1;
        TextPaint textPaint = this.f6997b;
        if (f3 < 0.0f) {
            f3 = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f3 != 0.0f) {
            CharSequence charSequence = this.f6996a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!e.c(spanned, o2.f.class)) {
                }
                f3 += 0.5f;
            }
        }
        this.f6999d = f3;
        return f3;
    }
}
