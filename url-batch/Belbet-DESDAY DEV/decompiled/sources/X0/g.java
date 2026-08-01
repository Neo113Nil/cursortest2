package X0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1017a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1018b;

    public g(int i) {
        this.f1017a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                d.d(compile, "compile(...)");
                this.f1018b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f1017a) {
            case 0:
                return String.valueOf((H.j) this.f1018b);
            default:
                String pattern = ((Pattern) this.f1018b).toString();
                d.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
