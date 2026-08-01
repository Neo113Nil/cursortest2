package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lj {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj)) {
            return false;
        }
        lj ljVar = (lj) obj;
        return Objects.equals(this.a, ljVar.a) && Objects.equals(this.b, ljVar.b) && Objects.equals(this.c, ljVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
