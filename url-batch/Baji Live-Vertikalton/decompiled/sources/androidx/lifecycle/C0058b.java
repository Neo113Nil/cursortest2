package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1348b;

    public C0058b(int i, Method method) {
        this.f1347a = i;
        this.f1348b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0058b)) {
            return false;
        }
        C0058b c0058b = (C0058b) obj;
        return this.f1347a == c0058b.f1347a && this.f1348b.getName().equals(c0058b.f1348b.getName());
    }

    public final int hashCode() {
        return this.f1348b.getName().hashCode() + (this.f1347a * 31);
    }
}
