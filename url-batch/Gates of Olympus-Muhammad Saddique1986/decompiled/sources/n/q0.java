package n;

import a0.C0238c;

/* loaded from: classes.dex */
public final class q0 extends o0 {
    @Override // n.o0, n.m0
    public final void a(long j3, long j4, float f3) {
        if (!Float.isNaN(f3)) {
            this.f7181a.setZoom(f3);
        }
        if (l0.c.D(j4)) {
            this.f7181a.show(C0238c.d(j3), C0238c.e(j3), C0238c.d(j4), C0238c.e(j4));
        } else {
            this.f7181a.show(C0238c.d(j3), C0238c.e(j3));
        }
    }
}
