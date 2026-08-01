package X0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f873a;

    /* renamed from: b, reason: collision with root package name */
    public Object f874b;

    public i(int i) {
        this.f873a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                f.d(compile, "compile(...)");
                this.f874b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f873a) {
            case 0:
                return String.valueOf((H.j) this.f874b);
            default:
                String pattern = ((Pattern) this.f874b).toString();
                f.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
