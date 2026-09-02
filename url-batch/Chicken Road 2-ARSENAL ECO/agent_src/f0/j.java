package f0;

import java.util.List;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4193a;

    public j(List list) {
        this.f4193a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f4193a.equals(((j) obj).f4193a);
    }

    public final int hashCode() {
        return this.f4193a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC0506j.I(this.f4193a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
