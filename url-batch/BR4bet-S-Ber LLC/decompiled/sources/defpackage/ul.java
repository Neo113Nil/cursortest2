package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ul {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        return Objects.equals(this.a, ulVar.a) && Objects.equals(this.b, ulVar.b) && Objects.equals(this.c, ulVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
