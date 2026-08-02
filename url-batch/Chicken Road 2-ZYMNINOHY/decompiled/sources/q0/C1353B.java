package q0;

/* renamed from: q0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14814c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14815d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14816e;

    public C1353B(Object obj) {
        this(-1L, obj);
    }

    public final C1353B a(Object obj) {
        if (this.f14812a.equals(obj)) {
            return this;
        }
        return new C1353B(obj, this.f14813b, this.f14814c, this.f14815d, this.f14816e);
    }

    public final boolean b() {
        return this.f14813b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353B)) {
            return false;
        }
        C1353B c1353b = (C1353B) obj;
        return this.f14812a.equals(c1353b.f14812a) && this.f14813b == c1353b.f14813b && this.f14814c == c1353b.f14814c && this.f14815d == c1353b.f14815d && this.f14816e == c1353b.f14816e;
    }

    public final int hashCode() {
        return ((((((((this.f14812a.hashCode() + 527) * 31) + this.f14813b) * 31) + this.f14814c) * 31) + ((int) this.f14815d)) * 31) + this.f14816e;
    }

    public C1353B(long j4, Object obj) {
        this(obj, -1, -1, j4, -1);
    }

    public C1353B(Object obj, long j4, int i4) {
        this(obj, -1, -1, j4, i4);
    }

    public C1353B(Object obj, int i4, int i5, long j4, int i6) {
        this.f14812a = obj;
        this.f14813b = i4;
        this.f14814c = i5;
        this.f14815d = j4;
        this.f14816e = i6;
    }
}
