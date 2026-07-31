package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f810a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f811b;

    public c(int i, Method method) {
        this.f810a = i;
        this.f811b = method;
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
        return this.f810a == cVar.f810a && this.f811b.getName().equals(cVar.f811b.getName());
    }

    public final int hashCode() {
        return this.f811b.getName().hashCode() + (this.f810a * 31);
    }
}
