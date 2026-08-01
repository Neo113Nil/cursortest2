package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f695a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f696b;

    public b(int i, Method method) {
        this.f695a = i;
        this.f696b = method;
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
        return this.f695a == bVar.f695a && this.f696b.getName().equals(bVar.f696b.getName());
    }

    public final int hashCode() {
        return this.f696b.getName().hashCode() + (this.f695a * 31);
    }
}
