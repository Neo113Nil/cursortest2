package defpackage;

import com.facebook.internal.Utility;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ia2 implements ca0 {
    public int A;
    public bx1 B;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public long u;
    public fk2 v;
    public boolean w;
    public long x;
    public ca0 y;
    public u81 z;

    public final void a(float f) {
        if (this.p == f) {
            return;
        }
        this.m |= 4;
        this.p = f;
    }

    public final void b(long j) {
        if (aw.c(this.r, j)) {
            return;
        }
        this.m |= 64;
        this.r = j;
    }

    public final void c(boolean z) {
        if (this.w != z) {
            this.m |= 16384;
            this.w = z;
        }
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.y.d();
    }

    public final void e(float f) {
        if (this.n == f) {
            return;
        }
        this.m |= 1;
        this.n = f;
    }

    public final void g(float f) {
        if (this.o == f) {
            return;
        }
        this.m |= 2;
        this.o = f;
    }

    public final void h(float f) {
        if (this.q == f) {
            return;
        }
        this.m |= 32;
        this.q = f;
    }

    public final void i(fk2 fk2Var) {
        if (Intrinsics.b(this.v, fk2Var)) {
            return;
        }
        this.m |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
        this.v = fk2Var;
    }

    public final void j(long j) {
        if (aw.c(this.s, j)) {
            return;
        }
        this.m |= 128;
        this.s = j;
    }

    public final void l(long j) {
        if (wy2.a(this.u, j)) {
            return;
        }
        this.m |= 4096;
        this.u = j;
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.y.p();
    }
}
