package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 implements re.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9344a;

    /* renamed from: b, reason: collision with root package name */
    public final re.e f9345b;

    /* renamed from: c, reason: collision with root package name */
    public final re.e f9346c;

    public c0(String str, re.e eVar, re.e eVar2) {
        this.f9344a = str;
        this.f9345b = eVar;
        this.f9346c = eVar2;
    }

    @Override // re.e
    public final String a() {
        return this.f9344a;
    }

    @Override // re.e
    public final i7.a b() {
        return re.h.f8255i;
    }

    @Override // re.e
    public final int c() {
        return 2;
    }

    @Override // re.e
    public final String d(int i3) {
        return String.valueOf(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f9344a.equals(c0Var.f9344a) && this.f9345b.equals(c0Var.f9345b) && this.f9346c.equals(c0Var.f9346c);
    }

    @Override // re.e
    public final re.e h(int i3) {
        if (i3 < 0) {
            a2.r.h(v4.a.o(n0.l.i(i3, "Illegal index ", ", "), this.f9344a, " expects only non-negative indices"));
            return null;
        }
        int i10 = i3 % 2;
        if (i10 == 0) {
            return this.f9345b;
        }
        if (i10 == 1) {
            return this.f9346c;
        }
        kotlin.collections.i0.l("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.f9346c.hashCode() + ((this.f9345b.hashCode() + (this.f9344a.hashCode() * 31)) * 31);
    }

    @Override // re.e
    public final boolean i(int i3) {
        if (i3 >= 0) {
            return false;
        }
        a2.r.h(v4.a.o(n0.l.i(i3, "Illegal index ", ", "), this.f9344a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.f9344a + '(' + this.f9345b + ", " + this.f9346c + ')';
    }
}
