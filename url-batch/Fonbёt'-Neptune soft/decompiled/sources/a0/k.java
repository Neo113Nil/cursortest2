package a0;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1282a;

    public k(List list) {
        this.f1282a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1282a.equals(((k) obj).f1282a);
    }

    public final int hashCode() {
        return this.f1282a.hashCode();
    }

    public final String toString() {
        return G0.d.Q((Collection) this.f1282a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
