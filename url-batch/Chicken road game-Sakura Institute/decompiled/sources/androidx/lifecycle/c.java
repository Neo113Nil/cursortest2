package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f950a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f951b;

    public c(int i7, Method method) {
        this.f950a = i7;
        this.f951b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f950a == cVar.f950a && this.f951b.getName().equals(cVar.f951b.getName());
    }

    public final int hashCode() {
        return this.f951b.getName().hashCode() + (this.f950a * 31);
    }
}
