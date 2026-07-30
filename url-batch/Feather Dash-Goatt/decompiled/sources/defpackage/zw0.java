package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class zw0 {
    public int d;
    public int e;
    public long g = 0;
    public long h = ax0.a;
    public long i = 0;

    public int S() {
        return (int) (this.g & 4294967295L);
    }

    public int W() {
        return (int) (this.g >> 32);
    }

    public final void X() {
        this.d = b11.c((int) (this.g >> 32), mm.j(this.h), mm.h(this.h));
        this.e = b11.c((int) (this.g & 4294967295L), mm.i(this.h), mm.g(this.h));
        int i = this.d;
        long j = this.g;
        this.i = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void Y(long j, float f, Function1 function1);

    public final void Z(long j) {
        if (ba0.a(this.g, j)) {
            return;
        }
        this.g = j;
        X();
    }

    public final void c0(long j) {
        if (mm.b(this.h, j)) {
            return;
        }
        this.h = j;
        X();
    }

    public abstract Object h();
}
