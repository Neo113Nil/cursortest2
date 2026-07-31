package V0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Pattern f869e;

    public b() {
        Pattern compile = Pattern.compile("^.+:.+/");
        P0.h.d(compile, "compile(...)");
        this.f869e = compile;
    }

    public final String toString() {
        String pattern = this.f869e.toString();
        P0.h.d(pattern, "toString(...)");
        return pattern;
    }
}
