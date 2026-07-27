package A;

import l.AbstractC0784j;

/* renamed from: A.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021q {

    /* renamed from: a, reason: collision with root package name */
    public final L0.h f176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177b;

    /* renamed from: c, reason: collision with root package name */
    public final long f178c;

    public C0021q(L0.h hVar, int i2, long j4) {
        this.f176a = hVar;
        this.f177b = i2;
        this.f178c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0021q)) {
            return false;
        }
        C0021q c0021q = (C0021q) obj;
        return this.f176a == c0021q.f176a && this.f177b == c0021q.f177b && this.f178c == c0021q.f178c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f178c) + AbstractC0784j.c(this.f177b, this.f176a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f176a + ", offset=" + this.f177b + ", selectableId=" + this.f178c + ')';
    }
}
