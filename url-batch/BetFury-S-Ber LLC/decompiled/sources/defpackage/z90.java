package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class z90 implements Serializable {
    public final Throwable f;

    public z90(Throwable th) {
        th.getClass();
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z90) {
            return mv.c(this.f, ((z90) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
