package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1480b;

    public C0070c(int i, Method method) {
        this.f1479a = i;
        this.f1480b = method;
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
        return this.f1479a == c0070c.f1479a && this.f1480b.getName().equals(c0070c.f1480b.getName());
    }

    public final int hashCode() {
        return this.f1480b.getName().hashCode() + (this.f1479a * 31);
    }
}
