package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class d90 implements Serializable {
    public final Pattern f;

    public d90() {
        Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        compile.getClass();
        this.f = compile;
    }

    public final String toString() {
        String pattern = this.f.toString();
        pattern.getClass();
        return pattern;
    }
}
