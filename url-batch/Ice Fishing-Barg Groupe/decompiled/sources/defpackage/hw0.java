package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hw0 {
    public final CharSequence PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public BoringLayout.Metrics a92UlCVFR9N8;
    public final TextPaint lS5Rgt96tfkO;
    public CharSequence rtx2ld2ELZv4;
    public float Y1f8riQaR6yg = Float.NaN;
    public float e9gEMXR7LXtO = Float.NaN;

    public hw0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.PxuCJdSBwIXG = charSequence;
        this.lS5Rgt96tfkO = textPaint;
        this.TSizfFm2Yiuu = i;
    }

    public final BoringLayout.Metrics PxuCJdSBwIXG() {
        if (!this.RAsUl2FVSrh6) {
            TextDirectionHeuristic lS5Rgt96tfkO = li2.lS5Rgt96tfkO(this.TSizfFm2Yiuu);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.PxuCJdSBwIXG;
            TextPaint textPaint = this.lS5Rgt96tfkO;
            this.a92UlCVFR9N8 = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, lS5Rgt96tfkO, true, null) : !lS5Rgt96tfkO.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.RAsUl2FVSrh6 = true;
        }
        return this.a92UlCVFR9N8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.vi0.BjEWd04qc7Mw(r2, defpackage.a01.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float TSizfFm2Yiuu() {
        if (!Float.isNaN(this.Y1f8riQaR6yg)) {
            return this.Y1f8riQaR6yg;
        }
        BoringLayout.Metrics PxuCJdSBwIXG = PxuCJdSBwIXG();
        float f = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.width : -1;
        TextPaint textPaint = this.lS5Rgt96tfkO;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(lS5Rgt96tfkO(), 0, lS5Rgt96tfkO().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.PxuCJdSBwIXG;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!vi0.BjEWd04qc7Mw(spanned, b01.class)) {
                }
                f += 0.5f;
            }
        }
        this.Y1f8riQaR6yg = f;
        return f;
    }

    public final CharSequence lS5Rgt96tfkO() {
        CharSequence charSequence = this.rtx2ld2ELZv4;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.PxuCJdSBwIXG;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (vi0.BjEWd04qc7Mw(spanned, CharacterStyle.class)) {
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
        this.rtx2ld2ELZv4 = charSequence2;
        return charSequence2;
    }
}
