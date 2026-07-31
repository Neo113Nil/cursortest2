package n;

import a0.C0238c;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public class o0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f7181a;

    public o0(Magnifier magnifier) {
        this.f7181a = magnifier;
    }

    @Override // n.m0
    public void a(long j3, long j4, float f3) {
        this.f7181a.show(C0238c.d(j3), C0238c.e(j3));
    }

    public final void b() {
        this.f7181a.dismiss();
    }

    public final long c() {
        return O2.d.d(this.f7181a.getWidth(), this.f7181a.getHeight());
    }

    public final void d() {
        this.f7181a.update();
    }
}
