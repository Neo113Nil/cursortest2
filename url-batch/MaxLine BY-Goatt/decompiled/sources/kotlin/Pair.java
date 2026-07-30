package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {
    public final Object m;
    public final Object n;

    public Pair(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.b(this.m, pair.m) && Intrinsics.b(this.n, pair.n);
    }

    public final int hashCode() {
        Object obj = this.m;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.n;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.m + ", " + this.n + ')';
    }
}
