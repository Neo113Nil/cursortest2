package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n12 {
    public int m;
    public int n;
    public long o = 0;
    public long p = o12.a;
    public long q = 0;

    public int d0() {
        return (int) (this.o & 4294967295L);
    }

    public int e0() {
        return (int) (this.o >> 32);
    }

    public final void h0() {
        this.m = d.c((int) (this.o >> 32), u10.j(this.p), u10.h(this.p));
        this.n = d.c((int) (this.o & 4294967295L), u10.i(this.p), u10.g(this.p));
        int i = this.m;
        long j = this.o;
        this.q = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public Object i() {
        return null;
    }

    public abstract void i0(long j, float f, Function1 function1);

    public final void j0(long j) {
        if (x31.a(this.o, j)) {
            return;
        }
        this.o = j;
        h0();
    }

    public final void k0(long j) {
        if (u10.b(this.p, j)) {
            return;
        }
        this.p = j;
        h0();
    }
}
