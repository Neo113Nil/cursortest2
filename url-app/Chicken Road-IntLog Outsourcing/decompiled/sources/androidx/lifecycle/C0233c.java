package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4566a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4567b;

    public C0233c(int i2, Method method) {
        this.f4566a = i2;
        this.f4567b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0233c)) {
            return false;
        }
        C0233c c0233c = (C0233c) obj;
        return this.f4566a == c0233c.f4566a && this.f4567b.getName().equals(c0233c.f4567b.getName());
    }

    public final int hashCode() {
        return this.f4567b.getName().hashCode() + (this.f4566a * 31);
    }
}
