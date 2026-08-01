package b3;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f974f;
    public Object g;

    public d(int i4) {
        this.f974f = i4;
        switch (i4) {
            case 1:
                break;
            default:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                u2.c.d(compile, "compile(...)");
                this.g = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f974f) {
            case 0:
                String pattern = ((Pattern) this.g).toString();
                u2.c.d(pattern, "toString(...)");
                return pattern;
            default:
                return String.valueOf((f.f) this.g);
        }
    }
}
