package m;

import android.widget.Magnifier;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class z0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f6288a;

    public z0(Magnifier magnifier) {
        this.f6288a = magnifier;
    }

    @Override // m.x0
    public void a(long j8, long j9) {
        this.f6288a.show(y0.c.d(j8), y0.c.e(j8));
    }

    public final void b() {
        this.f6288a.dismiss();
    }

    public final long c() {
        return j1.c.G(this.f6288a.getWidth(), this.f6288a.getHeight());
    }

    public final void d() {
        this.f6288a.update();
    }
}
