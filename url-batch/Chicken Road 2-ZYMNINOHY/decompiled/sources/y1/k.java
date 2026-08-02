package y1;

import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16255a;

    public k(List list) {
        this.f16255a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f16255a.equals(((k) obj).f16255a);
    }

    public final int hashCode() {
        return this.f16255a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return d3.i.g0(this.f16255a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
