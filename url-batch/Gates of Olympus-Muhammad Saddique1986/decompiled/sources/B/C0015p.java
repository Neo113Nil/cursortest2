package B;

import m.AbstractC0625j;

/* renamed from: B.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p {

    /* renamed from: a, reason: collision with root package name */
    public final N0.h f432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433b;

    /* renamed from: c, reason: collision with root package name */
    public final long f434c;

    public C0015p(N0.h hVar, int i3, long j3) {
        this.f432a = hVar;
        this.f433b = i3;
        this.f434c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0015p)) {
            return false;
        }
        C0015p c0015p = (C0015p) obj;
        return this.f432a == c0015p.f432a && this.f433b == c0015p.f433b && this.f434c == c0015p.f434c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f434c) + AbstractC0625j.a(this.f433b, this.f432a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f432a + ", offset=" + this.f433b + ", selectableId=" + this.f434c + ')';
    }
}
