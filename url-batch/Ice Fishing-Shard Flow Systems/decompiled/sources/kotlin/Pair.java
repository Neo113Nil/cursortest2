package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6112d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6113e;

    public Pair(Object obj, Object obj2) {
        this.f6112d = obj;
        this.f6113e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.a(this.f6112d, pair.f6112d) && Intrinsics.a(this.f6113e, pair.f6113e);
    }

    public final int hashCode() {
        Object obj = this.f6112d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6113e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f6112d + ", " + this.f6113e + ')';
    }
}
