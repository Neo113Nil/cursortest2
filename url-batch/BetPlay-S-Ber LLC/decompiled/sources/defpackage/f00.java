package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f00 implements Serializable {
    public final /* synthetic */ int f;
    public Object g;

    public f00(int i) {
        this.f = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                compile.getClass();
                this.g = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return String.valueOf((v2) this.g);
            default:
                String pattern = ((Pattern) this.g).toString();
                pattern.getClass();
                return pattern;
        }
    }
}
