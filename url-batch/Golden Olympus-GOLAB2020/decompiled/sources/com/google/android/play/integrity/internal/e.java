package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final int f13637a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13638b;

    e(int i4, long j4) {
        this.f13637a = i4;
        this.f13638b = j4;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f13637a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f13638b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f13637a == fVar.a() && this.f13638b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f13638b;
        return ((int) (j4 ^ (j4 >>> 32))) ^ ((this.f13637a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f13637a + ", eventTimestamp=" + this.f13638b + "}";
    }
}
