package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5211a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5212b;

    public C0274c(int i3, Method method) {
        this.f5211a = i3;
        this.f5212b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0274c)) {
            return false;
        }
        C0274c c0274c = (C0274c) obj;
        return this.f5211a == c0274c.f5211a && this.f5212b.getName().equals(c0274c.f5212b.getName());
    }

    public final int hashCode() {
        return this.f5212b.getName().hashCode() + (this.f5211a * 31);
    }
}
