package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1562a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1563b;

    public C0068b(int i, Method method) {
        this.f1562a = i;
        this.f1563b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0068b)) {
            return false;
        }
        C0068b c0068b = (C0068b) obj;
        return this.f1562a == c0068b.f1562a && this.f1563b.getName().equals(c0068b.f1563b.getName());
    }

    public final int hashCode() {
        return this.f1563b.getName().hashCode() + (this.f1562a * 31);
    }
}
