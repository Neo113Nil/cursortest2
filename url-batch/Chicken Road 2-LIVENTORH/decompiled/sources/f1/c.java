package f1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f1326a = 0;

    /* renamed from: b, reason: collision with root package name */
    public c f1327b;

    public final void a(int i) {
        if (i < 64) {
            this.f1326a &= ~(1 << i);
            return;
        }
        c cVar = this.f1327b;
        if (cVar != null) {
            cVar.a(i - 64);
        }
    }

    public final int b(int i) {
        c cVar = this.f1327b;
        if (cVar == null) {
            return i >= 64 ? Long.bitCount(this.f1326a) : Long.bitCount(this.f1326a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f1326a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f1326a) + cVar.b(i - 64);
    }

    public final void c() {
        if (this.f1327b == null) {
            this.f1327b = new c();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f1326a & (1 << i)) != 0;
        }
        c();
        return this.f1327b.d(i - 64);
    }

    public final void e(int i, boolean z3) {
        if (i >= 64) {
            c();
            this.f1327b.e(i - 64, z3);
            return;
        }
        long j4 = this.f1326a;
        boolean z4 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i) - 1;
        this.f1326a = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z3) {
            h(i);
        } else {
            a(i);
        }
        if (z4 || this.f1327b != null) {
            c();
            this.f1327b.e(0, z4);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f1327b.f(i - 64);
        }
        long j4 = 1 << i;
        long j5 = this.f1326a;
        boolean z3 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f1326a = j6;
        long j7 = j4 - 1;
        this.f1326a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        c cVar = this.f1327b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f1327b.f(0);
        }
        return z3;
    }

    public final void g() {
        this.f1326a = 0L;
        c cVar = this.f1327b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f1326a |= 1 << i;
        } else {
            c();
            this.f1327b.h(i - 64);
        }
    }

    public final String toString() {
        if (this.f1327b == null) {
            return Long.toBinaryString(this.f1326a);
        }
        return this.f1327b.toString() + "xx" + Long.toBinaryString(this.f1326a);
    }
}
