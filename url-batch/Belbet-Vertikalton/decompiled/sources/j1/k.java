package j1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3184a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f3185b;

    public /* synthetic */ k() {
    }

    public final String toString() {
        switch (this.f3184a) {
            case 0:
                return String.valueOf(this.f3185b);
            default:
                String pattern = ((Pattern) this.f3185b).toString();
                h.d(pattern, "toString(...)");
                return pattern;
        }
    }

    public k(String str) {
        Pattern compile = Pattern.compile(str);
        h.d(compile, "compile(...)");
        this.f3185b = compile;
    }
}
