package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7485d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7486e;

    public Pair(Object obj, Object obj2) {
        this.f7485d = obj;
        this.f7486e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.a(this.f7485d, pair.f7485d) && Intrinsics.a(this.f7486e, pair.f7486e);
    }

    public final int hashCode() {
        Object obj = this.f7485d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7486e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f7485d + ", " + this.f7486e + ')';
    }
}
