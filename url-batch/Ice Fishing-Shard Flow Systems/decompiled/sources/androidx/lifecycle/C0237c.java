package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3895a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3896b;

    public C0237c(int i2, Method method) {
        this.f3895a = i2;
        this.f3896b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0237c)) {
            return false;
        }
        C0237c c0237c = (C0237c) obj;
        return this.f3895a == c0237c.f3895a && this.f3896b.getName().equals(c0237c.f3896b.getName());
    }

    public final int hashCode() {
        return this.f3896b.getName().hashCode() + (this.f3895a * 31);
    }
}
