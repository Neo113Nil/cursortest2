package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1924a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1925b;

    public C0067b(int i, Method method) {
        this.f1924a = i;
        this.f1925b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0067b)) {
            return false;
        }
        C0067b c0067b = (C0067b) obj;
        return this.f1924a == c0067b.f1924a && this.f1925b.getName().equals(c0067b.f1925b.getName());
    }

    public final int hashCode() {
        return this.f1925b.getName().hashCode() + (this.f1924a * 31);
    }
}
