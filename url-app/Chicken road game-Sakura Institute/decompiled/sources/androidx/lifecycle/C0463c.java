package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5470a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5471b;

    public C0463c(int i2, Method method) {
        this.f5470a = i2;
        this.f5471b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0463c)) {
            return false;
        }
        C0463c c0463c = (C0463c) obj;
        return this.f5470a == c0463c.f5470a && this.f5471b.getName().equals(c0463c.f5471b.getName());
    }

    public final int hashCode() {
        return this.f5471b.getName().hashCode() + (this.f5470a * 31);
    }
}
