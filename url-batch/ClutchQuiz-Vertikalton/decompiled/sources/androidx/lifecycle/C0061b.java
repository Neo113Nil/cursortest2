package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1493a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1494b;

    public C0061b(int i, Method method) {
        this.f1493a = i;
        this.f1494b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0061b)) {
            return false;
        }
        C0061b c0061b = (C0061b) obj;
        return this.f1493a == c0061b.f1493a && this.f1494b.getName().equals(c0061b.f1494b.getName());
    }

    public final int hashCode() {
        return this.f1494b.getName().hashCode() + (this.f1493a * 31);
    }
}
