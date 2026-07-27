package A;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0021q f179a;

    /* renamed from: b, reason: collision with root package name */
    public final C0021q f180b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181c;

    public r(C0021q c0021q, C0021q c0021q2, boolean z4) {
        this.f179a = c0021q;
        this.f180b = c0021q2;
        this.f181c = z4;
    }

    public static r a(r rVar, C0021q c0021q, C0021q c0021q2, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            c0021q = rVar.f179a;
        }
        if ((i2 & 2) != 0) {
            c0021q2 = rVar.f180b;
        }
        rVar.getClass();
        return new r(c0021q, c0021q2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.a(this.f179a, rVar.f179a) && Intrinsics.a(this.f180b, rVar.f180b) && this.f181c == rVar.f181c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181c) + ((this.f180b.hashCode() + (this.f179a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f179a + ", end=" + this.f180b + ", handlesCrossed=" + this.f181c + ')';
    }
}
