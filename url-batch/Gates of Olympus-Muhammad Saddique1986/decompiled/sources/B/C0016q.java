package B;

/* renamed from: B.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q {

    /* renamed from: a, reason: collision with root package name */
    public final C0015p f435a;

    /* renamed from: b, reason: collision with root package name */
    public final C0015p f436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437c;

    public C0016q(C0015p c0015p, C0015p c0015p2, boolean z3) {
        this.f435a = c0015p;
        this.f436b = c0015p2;
        this.f437c = z3;
    }

    public static C0016q a(C0016q c0016q, C0015p c0015p, C0015p c0015p2, boolean z3, int i3) {
        if ((i3 & 1) != 0) {
            c0015p = c0016q.f435a;
        }
        if ((i3 & 2) != 0) {
            c0015p2 = c0016q.f436b;
        }
        c0016q.getClass();
        return new C0016q(c0015p, c0015p2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0016q)) {
            return false;
        }
        C0016q c0016q = (C0016q) obj;
        return f2.j.a(this.f435a, c0016q.f435a) && f2.j.a(this.f436b, c0016q.f436b) && this.f437c == c0016q.f437c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f437c) + ((this.f436b.hashCode() + (this.f435a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f435a + ", end=" + this.f436b + ", handlesCrossed=" + this.f437c + ')';
    }
}
