package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f568a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f569b;

    public b(int i4, Method method) {
        this.f568a = i4;
        this.f569b = method;
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
        return this.f568a == bVar.f568a && this.f569b.getName().equals(bVar.f569b.getName());
    }

    public final int hashCode() {
        return this.f569b.getName().hashCode() + (this.f568a * 31);
    }
}
