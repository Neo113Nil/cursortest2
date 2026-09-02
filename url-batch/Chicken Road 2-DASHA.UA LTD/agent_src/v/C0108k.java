package v;

import java.util.Collection;
import java.util.List;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1290a;

    public C0108k(List list) {
        this.f1290a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0108k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1290a.equals(((C0108k) obj).f1290a);
    }

    public final int hashCode() {
        return this.f1290a.hashCode();
    }

    public final String toString() {
        return V.e.G((Collection) this.f1290a, "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
