package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t20 implements Serializable {
    public final /* synthetic */ int f;
    public Object g;

    public t20(int i) {
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
                return String.valueOf(this.g);
            default:
                String pattern = ((Pattern) this.g).toString();
                pattern.getClass();
                return pattern;
        }
    }
}
