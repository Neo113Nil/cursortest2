package z6;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Pattern f10131f;

    public g(String str) {
        Pattern compile = Pattern.compile(str);
        r6.k.e(compile, "compile(...)");
        this.f10131f = compile;
    }

    public final String toString() {
        String pattern = this.f10131f.toString();
        r6.k.e(pattern, "toString(...)");
        return pattern;
    }
}
