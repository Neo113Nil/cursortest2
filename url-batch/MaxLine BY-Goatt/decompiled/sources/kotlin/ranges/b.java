package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b extends kotlin.ranges.a {
    public static final a q = new a(null);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        char c = this.m;
        char c2 = this.n;
        if (Intrinsics.c(c, c2) > 0) {
            b bVar = (b) obj;
            if (Intrinsics.c(bVar.m, bVar.n) > 0) {
                return true;
            }
        }
        b bVar2 = (b) obj;
        return c == bVar2.m && c2 == bVar2.n;
    }

    public final int hashCode() {
        char c = this.m;
        char c2 = this.n;
        if (Intrinsics.c(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.m + ".." + this.n;
    }
}
