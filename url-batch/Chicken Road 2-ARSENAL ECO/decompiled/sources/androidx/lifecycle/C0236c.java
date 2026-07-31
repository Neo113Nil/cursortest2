package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3501a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3502b;

    public C0236c(int i7, Method method) {
        this.f3501a = i7;
        this.f3502b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0236c)) {
            return false;
        }
        C0236c c0236c = (C0236c) obj;
        return this.f3501a == c0236c.f3501a && this.f3502b.getName().equals(c0236c.f3502b.getName());
    }

    public final int hashCode() {
        return this.f3502b.getName().hashCode() + (this.f3501a * 31);
    }
}
