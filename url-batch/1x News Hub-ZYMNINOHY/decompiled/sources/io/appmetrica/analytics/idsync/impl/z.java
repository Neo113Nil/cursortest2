package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f5687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5688b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5689c;

    public z(String str, long j3, int i3) {
        this.f5687a = str;
        this.f5688b = j3;
        this.f5689c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.j.a(this.f5687a, zVar.f5687a) && this.f5688b == zVar.f5688b && this.f5689c == zVar.f5689c;
    }

    public final int hashCode() {
        return v.a(this.f5689c) + ((Long.hashCode(this.f5688b) + (this.f5687a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f5687a + ", lastAttempt=" + this.f5688b + ", lastAttemptResult=" + u.b(this.f5689c) + ')';
    }
}
