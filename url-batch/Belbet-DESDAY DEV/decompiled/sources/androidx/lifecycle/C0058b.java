package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1351a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1352b;

    public C0058b(int i, Method method) {
        this.f1351a = i;
        this.f1352b = method;
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
        return this.f1351a == c0058b.f1351a && this.f1352b.getName().equals(c0058b.f1352b.getName());
    }

    public final int hashCode() {
        return this.f1352b.getName().hashCode() + (this.f1351a * 31);
    }
}
