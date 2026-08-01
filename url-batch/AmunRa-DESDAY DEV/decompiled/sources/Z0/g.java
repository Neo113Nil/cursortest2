package Z0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1066a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1067b;

    public g(int i) {
        this.f1066a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                d.d(compile, "compile(...)");
                this.f1067b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f1066a) {
            case 0:
                return String.valueOf((H.j) this.f1067b);
            default:
                String pattern = ((Pattern) this.f1067b).toString();
                d.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
