package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 implements re.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9384a;

    /* renamed from: b, reason: collision with root package name */
    public final re.d f9385b;

    public h1(String str, re.d dVar) {
        this.f9384a = str;
        this.f9385b = dVar;
    }

    @Override // re.e
    public final String a() {
        return this.f9384a;
    }

    @Override // re.e
    public final i7.a b() {
        return this.f9385b;
    }

    @Override // re.e
    public final int c() {
        return 0;
    }

    @Override // re.e
    public final String d(int i3) {
        f();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f9384a.equals(h1Var.f9384a) && this.f9385b.equals(h1Var.f9385b);
    }

    public final void f() {
        throw new IllegalStateException(v4.a.o(new StringBuilder("Primitive descriptor "), this.f9384a, " does not have elements"));
    }

    @Override // re.e
    public final re.e h(int i3) {
        f();
        throw null;
    }

    public final int hashCode() {
        return (this.f9385b.hashCode() * 31) + this.f9384a.hashCode();
    }

    @Override // re.e
    public final boolean i(int i3) {
        f();
        throw null;
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("PrimitiveDescriptor("), this.f9384a, ')');
    }
}
