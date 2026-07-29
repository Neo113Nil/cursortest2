package X0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1014a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1015b;

    public h(int i) {
        this.f1014a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                e.d(compile, "compile(...)");
                this.f1015b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f1014a) {
            case 0:
                return String.valueOf((H.j) this.f1015b);
            default:
                String pattern = ((Pattern) this.f1015b).toString();
                e.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
