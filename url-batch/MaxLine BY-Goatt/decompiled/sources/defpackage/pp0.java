package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pp0 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        return Objects.equals(this.a, pp0Var.a) && Objects.equals(this.b, pp0Var.b) && Objects.equals(this.c, pp0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
