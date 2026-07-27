package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6461c;

    public z(String str, long j2, int i2) {
        this.f6459a = str;
        this.f6460b = j2;
        this.f6461c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.i.a(this.f6459a, zVar.f6459a) && this.f6460b == zVar.f6460b && this.f6461c == zVar.f6461c;
    }

    public final int hashCode() {
        return v.a(this.f6461c) + ((Long.hashCode(this.f6460b) + (this.f6459a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f6459a + ", lastAttempt=" + this.f6460b + ", lastAttemptResult=" + u.b(this.f6461c) + ')';
    }
}
