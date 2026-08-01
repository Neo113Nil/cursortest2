package X0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1013a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1014b;

    public h(int i) {
        this.f1013a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                e.d(compile, "compile(...)");
                this.f1014b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f1013a) {
            case 0:
                return String.valueOf((H.j) this.f1014b);
            default:
                String pattern = ((Pattern) this.f1014b).toString();
                e.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
