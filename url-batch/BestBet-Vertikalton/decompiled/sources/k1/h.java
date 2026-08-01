package k1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3244a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3245b;

    public h(int i) {
        this.f3244a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                e.d(compile, "compile(...)");
                this.f3245b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f3244a) {
            case 0:
                return String.valueOf(this.f3245b);
            default:
                String pattern = ((Pattern) this.f3245b).toString();
                e.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
