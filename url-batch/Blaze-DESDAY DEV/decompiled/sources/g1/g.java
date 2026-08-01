package g1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2550a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2551b;

    public g(int i) {
        this.f2550a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                d.d(compile, "compile(...)");
                this.f2551b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f2550a) {
            case 0:
                return String.valueOf((H.j) this.f2551b);
            default:
                String pattern = ((Pattern) this.f2551b).toString();
                d.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
