package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1456a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1457b;

    public C0059b(int i, Method method) {
        this.f1456a = i;
        this.f1457b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0059b)) {
            return false;
        }
        C0059b c0059b = (C0059b) obj;
        return this.f1456a == c0059b.f1456a && this.f1457b.getName().equals(c0059b.f1457b.getName());
    }

    public final int hashCode() {
        return this.f1457b.getName().hashCode() + (this.f1456a * 31);
    }
}
