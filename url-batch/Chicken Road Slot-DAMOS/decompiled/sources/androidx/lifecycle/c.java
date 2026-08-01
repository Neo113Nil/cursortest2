package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f673a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f674b;

    public c(int i3, Method method) {
        this.f673a = i3;
        this.f674b = method;
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
        return this.f673a == cVar.f673a && this.f674b.getName().equals(cVar.f674b.getName());
    }

    public final int hashCode() {
        return this.f674b.getName().hashCode() + (this.f673a * 31);
    }
}
