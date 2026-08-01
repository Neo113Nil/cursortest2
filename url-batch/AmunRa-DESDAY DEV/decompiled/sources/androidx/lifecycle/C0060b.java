package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1387b;

    public C0060b(int i, Method method) {
        this.f1386a = i;
        this.f1387b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0060b)) {
            return false;
        }
        C0060b c0060b = (C0060b) obj;
        return this.f1386a == c0060b.f1386a && this.f1387b.getName().equals(c0060b.f1387b.getName());
    }

    public final int hashCode() {
        return this.f1387b.getName().hashCode() + (this.f1386a * 31);
    }
}
