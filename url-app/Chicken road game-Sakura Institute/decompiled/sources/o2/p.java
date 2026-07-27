package o2;

import j2.AbstractC0720j;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: i, reason: collision with root package name */
    public final long f8947i;

    public p(Long l4, s sVar) {
        super(sVar);
        this.f8947i = l4.longValue();
    }

    @Override // o2.o
    public final int e(o oVar) {
        long j4 = ((p) oVar).f8947i;
        char[] cArr = AbstractC0720j.f7166a;
        long j5 = this.f8947i;
        if (j5 < j4) {
            return -1;
        }
        return j5 == j4 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8947i == pVar.f8947i && this.f8945d.equals(pVar.f8945d);
    }

    @Override // o2.s
    public final s f(s sVar) {
        return new p(Long.valueOf(this.f8947i), sVar);
    }

    @Override // o2.s
    public final Object getValue() {
        return Long.valueOf(this.f8947i);
    }

    @Override // o2.o
    public final int h() {
        return 3;
    }

    public final int hashCode() {
        long j4 = this.f8947i;
        return this.f8945d.hashCode() + ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // o2.s
    public final String u(int i2) {
        return (j(i2) + "number:") + AbstractC0720j.a(this.f8947i);
    }
}
