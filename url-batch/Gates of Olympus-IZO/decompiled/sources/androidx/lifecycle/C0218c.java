package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4010a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4011b;

    public C0218c(int i3, Method method) {
        this.f4010a = i3;
        this.f4011b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0218c)) {
            return false;
        }
        C0218c c0218c = (C0218c) obj;
        return this.f4010a == c0218c.f4010a && this.f4011b.getName().equals(c0218c.f4011b.getName());
    }

    public final int hashCode() {
        return this.f4011b.getName().hashCode() + (this.f4010a * 31);
    }
}
