package m;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class l0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f8136a;

    public l0(Magnifier magnifier) {
        this.f8136a = magnifier;
    }

    @Override // m.j0
    public void a(long j4, long j5, float f4) {
        this.f8136a.show(Y.c.d(j4), Y.c.e(j4));
    }

    public final void b() {
        this.f8136a.dismiss();
    }

    public final long c() {
        return u3.d.c(this.f8136a.getWidth(), this.f8136a.getHeight());
    }

    public final void d() {
        this.f8136a.update();
    }
}
