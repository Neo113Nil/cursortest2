package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7023a;

    /* renamed from: b, reason: collision with root package name */
    public long f7024b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7025c;

    public i1() {
        this.f7023a = 1;
        this.f7024b = 0L;
    }

    public long a(q1.k kVar, float f6) {
        long e8 = e1.b.e(this.f7024b, e1.b.d(kVar.f5996c, kVar.f6000g));
        this.f7024b = e8;
        j0 j0Var = (j0) this.f7025c;
        if ((j0Var == null ? e1.b.c(e8) : Math.abs(g(e8))) < f6) {
            return 9205357640488583168L;
        }
        if (j0Var == null) {
            long j7 = this.f7024b;
            float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / e1.b.c(j7);
            return e1.b.d(this.f7024b, e1.b.f((4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) / r9)) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f6));
        }
        float g3 = g(this.f7024b) - (Math.signum(g(this.f7024b)) * f6);
        long j8 = this.f7024b;
        j0 j0Var2 = j0.f7028e;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j0Var == j0Var2 ? j8 & 4294967295L : j8 >> 32));
        if (j0Var == j0Var2) {
            return (Float.floatToRawIntBits(g3) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        }
        return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (4294967295L & Float.floatToRawIntBits(g3));
    }

    public void b(int i) {
        if (i < 64) {
            this.f7024b &= ~(1 << i);
            return;
        }
        i1 i1Var = (i1) this.f7025c;
        if (i1Var != null) {
            i1Var.b(i - 64);
        }
    }

    public int c(int i) {
        i1 i1Var = (i1) this.f7025c;
        if (i1Var == null) {
            return i >= 64 ? Long.bitCount(this.f7024b) : Long.bitCount(this.f7024b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f7024b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f7024b) + i1Var.c(i - 64);
    }

    public void d() {
        if (((i1) this.f7025c) == null) {
            this.f7025c = new i1();
        }
    }

    public boolean e(int i) {
        if (i < 64) {
            return (this.f7024b & (1 << i)) != 0;
        }
        d();
        return ((i1) this.f7025c).e(i - 64);
    }

    public void f(int i, boolean z3) {
        if (i >= 64) {
            d();
            ((i1) this.f7025c).f(i - 64, z3);
            return;
        }
        long j7 = this.f7024b;
        boolean z7 = (Long.MIN_VALUE & j7) != 0;
        long j8 = (1 << i) - 1;
        this.f7024b = ((j7 & (~j8)) << 1) | (j7 & j8);
        if (z3) {
            j(i);
        } else {
            b(i);
        }
        if (z7 || ((i1) this.f7025c) != null) {
            d();
            ((i1) this.f7025c).f(0, z7);
        }
    }

    public float g(long j7) {
        return Float.intBitsToFloat((int) (((j0) this.f7025c) == j0.f7028e ? j7 >> 32 : j7 & 4294967295L));
    }

    public boolean h(int i) {
        if (i >= 64) {
            d();
            return ((i1) this.f7025c).h(i - 64);
        }
        long j7 = 1 << i;
        long j8 = this.f7024b;
        boolean z3 = (j8 & j7) != 0;
        long j9 = j8 & (~j7);
        this.f7024b = j9;
        long j10 = j7 - 1;
        this.f7024b = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        i1 i1Var = (i1) this.f7025c;
        if (i1Var != null) {
            if (i1Var.e(0)) {
                j(63);
            }
            ((i1) this.f7025c).h(0);
        }
        return z3;
    }

    public void i() {
        this.f7024b = 0L;
        i1 i1Var = (i1) this.f7025c;
        if (i1Var != null) {
            i1Var.i();
        }
    }

    public void j(int i) {
        if (i < 64) {
            this.f7024b |= 1 << i;
        } else {
            d();
            ((i1) this.f7025c).j(i - 64);
        }
    }

    public String toString() {
        switch (this.f7023a) {
            case 1:
                if (((i1) this.f7025c) == null) {
                    return Long.toBinaryString(this.f7024b);
                }
                return ((i1) this.f7025c).toString() + "xx" + Long.toBinaryString(this.f7024b);
            default:
                return super.toString();
        }
    }

    public i1(long j7, j0 j0Var) {
        this.f7023a = 0;
        this.f7025c = j0Var;
        this.f7024b = j7;
    }
}
