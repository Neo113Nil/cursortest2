package m;

import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class n0 extends l0 {
    @Override // m.l0, m.j0
    public final void a(long j4, long j5, float f4) {
        if (!Float.isNaN(f4)) {
            this.f8136a.setZoom(f4);
        }
        if (AbstractC0345a.z(j5)) {
            this.f8136a.show(Y.c.d(j4), Y.c.e(j4), Y.c.d(j5), Y.c.e(j5));
        } else {
            this.f8136a.show(Y.c.d(j4), Y.c.e(j4));
        }
    }
}
