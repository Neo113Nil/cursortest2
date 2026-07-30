package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tu2 {
    public static final su2 Companion = new su2();
    public final CharSequence PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final BreakIterator Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public tu2(CharSequence charSequence, int i, Locale locale) {
        this.PxuCJdSBwIXG = charSequence;
        if (charSequence.length() < 0) {
            fp0.PxuCJdSBwIXG("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            fp0.PxuCJdSBwIXG("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.Y1f8riQaR6yg = wordInstance;
        this.lS5Rgt96tfkO = Math.max(0, -50);
        this.TSizfFm2Yiuu = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new nj(charSequence, i));
    }

    public final int OPXfSBeufaJ8(int i) {
        PxuCJdSBwIXG(i);
        int preceding = this.Y1f8riQaR6yg.preceding(i);
        return (a92UlCVFR9N8(preceding) && lS5Rgt96tfkO(preceding) && !e9gEMXR7LXtO(preceding)) ? OPXfSBeufaJ8(preceding) : preceding;
    }

    public final void PxuCJdSBwIXG(int i) {
        boolean z = false;
        int i2 = this.lS5Rgt96tfkO;
        int i3 = this.TSizfFm2Yiuu;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        fp0.PxuCJdSBwIXG("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public final boolean RAsUl2FVSrh6(int i) {
        if (i >= this.TSizfFm2Yiuu || this.lS5Rgt96tfkO > i) {
            return false;
        }
        int codePointAt = Character.codePointAt(this.PxuCJdSBwIXG, i);
        Companion.getClass();
        return su2.PxuCJdSBwIXG(codePointAt);
    }

    public final boolean TSizfFm2Yiuu(int i) {
        int i2 = this.lS5Rgt96tfkO + 1;
        if (i > this.TSizfFm2Yiuu || i2 > i) {
            return false;
        }
        int codePointBefore = Character.codePointBefore(this.PxuCJdSBwIXG, i);
        Companion.getClass();
        return su2.PxuCJdSBwIXG(codePointBefore);
    }

    public final boolean Y1f8riQaR6yg(int i) {
        PxuCJdSBwIXG(i);
        if (!this.Y1f8riQaR6yg.isBoundary(i)) {
            return false;
        }
        if (a92UlCVFR9N8(i) && a92UlCVFR9N8(i - 1) && a92UlCVFR9N8(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.PxuCJdSBwIXG.length() - 1 || !(e9gEMXR7LXtO(i) || e9gEMXR7LXtO(i + 1));
    }

    public final boolean a92UlCVFR9N8(int i) {
        if (i >= this.TSizfFm2Yiuu || this.lS5Rgt96tfkO > i) {
            return false;
        }
        CharSequence charSequence = this.PxuCJdSBwIXG;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!x40.Y1f8riQaR6yg()) {
                return false;
            }
            x40 PxuCJdSBwIXG = x40.PxuCJdSBwIXG();
            if (PxuCJdSBwIXG.TSizfFm2Yiuu() != 1 || PxuCJdSBwIXG.lS5Rgt96tfkO(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean e9gEMXR7LXtO(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.PxuCJdSBwIXG;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (cs0.wdg6QnbFHrFF(of, unicodeBlock) && cs0.wdg6QnbFHrFF(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return cs0.wdg6QnbFHrFF(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && cs0.wdg6QnbFHrFF(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean lS5Rgt96tfkO(int i) {
        int i2 = this.lS5Rgt96tfkO + 1;
        if (i > this.TSizfFm2Yiuu || i2 > i) {
            return false;
        }
        CharSequence charSequence = this.PxuCJdSBwIXG;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!x40.Y1f8riQaR6yg()) {
                    return false;
                }
                x40 PxuCJdSBwIXG = x40.PxuCJdSBwIXG();
                if (PxuCJdSBwIXG.TSizfFm2Yiuu() != 1 || PxuCJdSBwIXG.lS5Rgt96tfkO(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int rtx2ld2ELZv4(int i) {
        PxuCJdSBwIXG(i);
        int following = this.Y1f8riQaR6yg.following(i);
        return (a92UlCVFR9N8(following + (-1)) && a92UlCVFR9N8(following) && !e9gEMXR7LXtO(following)) ? rtx2ld2ELZv4(following) : following;
    }
}
