package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class eu1 implements Serializable {
    public static final du1 Companion = new du1();
    public final Pattern rtx2ld2ELZv4;

    public eu1(String str, int i) {
        str.getClass();
        Companion.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.rtx2ld2ELZv4 = compile;
    }

    public final e0 PxuCJdSBwIXG(String str, int i) {
        str.getClass();
        Matcher region = this.rtx2ld2ELZv4.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new e0(region, str);
        }
        return null;
    }

    public final boolean TSizfFm2Yiuu(CharSequence charSequence) {
        charSequence.getClass();
        return this.rtx2ld2ELZv4.matcher(charSequence).matches();
    }

    public final e0 lS5Rgt96tfkO(String str) {
        str.getClass();
        Matcher matcher = this.rtx2ld2ELZv4.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new e0(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.rtx2ld2ELZv4.toString();
        pattern.getClass();
        return pattern;
    }

    public eu1(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.rtx2ld2ELZv4 = compile;
    }
}
