package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1411a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1412b;

    public C0062b(int i, Method method) {
        this.f1411a = i;
        this.f1412b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0062b)) {
            return false;
        }
        C0062b c0062b = (C0062b) obj;
        return this.f1411a == c0062b.f1411a && this.f1412b.getName().equals(c0062b.f1412b.getName());
    }

    public final int hashCode() {
        return this.f1412b.getName().hashCode() + (this.f1411a * 31);
    }
}
