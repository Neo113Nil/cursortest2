package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f9885a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9887c;

    public E(String str, long j4, int i4) {
        this.f9885a = str;
        this.f9886b = j4;
        this.f9887c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        return kotlin.jvm.internal.i.a(this.f9885a, e4.f9885a) && this.f9886b == e4.f9886b && this.f9887c == e4.f9887c;
    }

    public final int hashCode() {
        return A.a(this.f9887c) + ((Long.hashCode(this.f9886b) + (this.f9885a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f9885a + ", lastAttempt=" + this.f9886b + ", lastAttemptResult=" + z.b(this.f9887c) + ')';
    }
}
