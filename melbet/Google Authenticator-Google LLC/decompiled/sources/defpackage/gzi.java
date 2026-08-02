package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzi extends gyw implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public gzi(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.gyw
    public final brn a(CharSequence charSequence) {
        return new brn(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
