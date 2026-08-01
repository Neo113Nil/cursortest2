package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qz implements Serializable {
    public final /* synthetic */ int f;
    public Object g;

    public qz(int i) {
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
                return String.valueOf((or) this.g);
            default:
                String pattern = ((Pattern) this.g).toString();
                pattern.getClass();
                return pattern;
        }
    }
}
