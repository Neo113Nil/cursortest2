package p0;

import kotlin.jvm.functions.Function1;

/* renamed from: p0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0954O {

    /* renamed from: d, reason: collision with root package name */
    public int f9005d;

    /* renamed from: e, reason: collision with root package name */
    public int f9006e;

    /* renamed from: i, reason: collision with root package name */
    public long f9007i = u3.d.c(0, 0);

    /* renamed from: j, reason: collision with root package name */
    public long f9008j = AbstractC0956Q.f9013a;

    /* renamed from: k, reason: collision with root package name */
    public long f9009k = 0;

    public abstract int e0(C0976l c0976l);

    public int f0() {
        return (int) (this.f9007i & 4294967295L);
    }

    public int g0() {
        return (int) (this.f9007i >> 32);
    }

    public final void l0() {
        this.f9005d = kotlin.ranges.b.e((int) (this.f9007i >> 32), M0.a.k(this.f9008j), M0.a.i(this.f9008j));
        int e4 = kotlin.ranges.b.e((int) (this.f9007i & 4294967295L), M0.a.j(this.f9008j), M0.a.h(this.f9008j));
        this.f9006e = e4;
        int i2 = this.f9005d;
        long j4 = this.f9007i;
        this.f9009k = j0.c.g((i2 - ((int) (j4 >> 32))) / 2, (e4 - ((int) (j4 & 4294967295L))) / 2);
    }

    public abstract void n0(long j4, float f4, Function1 function1);

    public final void p0(long j4) {
        if (M0.j.a(this.f9007i, j4)) {
            return;
        }
        this.f9007i = j4;
        l0();
    }

    public final void q0(long j4) {
        if (M0.a.c(this.f9008j, j4)) {
            return;
        }
        this.f9008j = j4;
        l0();
    }

    public Object r() {
        return null;
    }
}
