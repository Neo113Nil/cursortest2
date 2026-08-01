package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1479b;

    public C0070c(int i, Method method) {
        this.f1478a = i;
        this.f1479b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0070c)) {
            return false;
        }
        C0070c c0070c = (C0070c) obj;
        return this.f1478a == c0070c.f1478a && this.f1479b.getName().equals(c0070c.f1479b.getName());
    }

    public final int hashCode() {
        return this.f1479b.getName().hashCode() + (this.f1478a * 31);
    }
}
