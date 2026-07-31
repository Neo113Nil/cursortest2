package h2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f3093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3094c;

    /* renamed from: d, reason: collision with root package name */
    public float f3095d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f3096e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f3097f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3098g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3099h;

    public e(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f3092a = charSequence;
        this.f3093b = textPaint;
        this.f3094c = i;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f3098g) {
            TextDirectionHeuristic a8 = k.a(this.f3094c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f3092a;
            TextPaint textPaint = this.f3093b;
            this.f3097f = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, a8, true, null) : !a8.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f3098g = true;
        }
        return this.f3097f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f3099h;
        if (charSequence == null) {
            charSequence = this.f3092a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (g.c(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    d6.b h8 = q6.i.h(characterStyleArr);
                    SpannableString spannableString = null;
                    while (h8.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) h8.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f3099h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (h2.g.c(r2, i2.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f3095d)) {
            return this.f3095d;
        }
        BoringLayout.Metrics a8 = a();
        float f6 = a8 != null ? a8.width : -1;
        TextPaint textPaint = this.f3093b;
        if (f6 < 0.0f) {
            f6 = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f6 != 0.0f) {
            CharSequence charSequence = this.f3092a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!g.c(spanned, i2.f.class)) {
                }
                f6 += 0.5f;
            }
        }
        this.f3095d = f6;
        return f6;
    }
}
