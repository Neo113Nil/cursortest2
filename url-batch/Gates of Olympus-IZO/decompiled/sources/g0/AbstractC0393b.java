package g0;

import A2.g;
import M0.j;
import Z1.i;
import a0.f;
import b0.C0276i;
import b0.C0281n;
import d0.C0321b;
import t0.F;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0393b {

    /* renamed from: a, reason: collision with root package name */
    public C0276i f4792a;

    /* renamed from: b, reason: collision with root package name */
    public C0281n f4793b;

    /* renamed from: c, reason: collision with root package name */
    public float f4794c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public j f4795d = j.f2775d;

    public abstract void a(float f3);

    public abstract void b(C0281n c0281n);

    public final void c(F f3, long j3, float f4, C0281n c0281n) {
        if (this.f4794c != f4) {
            a(f4);
            this.f4794c = f4;
        }
        if (!i.a(this.f4793b, c0281n)) {
            b(c0281n);
            this.f4793b = c0281n;
        }
        j layoutDirection = f3.getLayoutDirection();
        if (this.f4795d != layoutDirection) {
            this.f4795d = layoutDirection;
        }
        C0321b c0321b = f3.f7748d;
        float d3 = f.d(c0321b.c()) - f.d(j3);
        float b2 = f.b(c0321b.c()) - f.b(j3);
        ((g) c0321b.f4444e.f536b).n(0.0f, 0.0f, d3, b2);
        if (f4 > 0.0f) {
            try {
                if (f.d(j3) > 0.0f && f.b(j3) > 0.0f) {
                    e(f3);
                }
            } finally {
                ((g) c0321b.f4444e.f536b).n(-0.0f, -0.0f, -d3, -b2);
            }
        }
    }

    public abstract long d();

    public abstract void e(F f3);
}
