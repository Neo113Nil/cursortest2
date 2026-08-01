package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f590a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f591b;

    public b(int i, Method method) {
        this.f590a = i;
        this.f591b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f590a == bVar.f590a && this.f591b.getName().equals(bVar.f591b.getName());
    }

    public final int hashCode() {
        return this.f591b.getName().hashCode() + (this.f590a * 31);
    }
}
