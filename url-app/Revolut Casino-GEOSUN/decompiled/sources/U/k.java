package U;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1021a;

    public k(List list) {
        this.f1021a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1021a.equals(((k) obj).f1021a);
    }

    public final int hashCode() {
        return this.f1021a.hashCode();
    }

    public final String toString() {
        return v0.d.D((Collection) this.f1021a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
