package i3;

import a4.e0;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2073f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2074g;

    public f(int i) {
        this.f2073f = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                d.d(compile, "compile(...)");
                this.f2074g = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f2073f) {
            case 0:
                return String.valueOf((e0) this.f2074g);
            default:
                String pattern = ((Pattern) this.f2074g).toString();
                d.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
