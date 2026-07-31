package g0;

import B.Y;
import O0.k;
import a0.C0241f;
import b0.C0339h;
import b0.C0344m;
import d0.C0401b;
import f2.j;
import t0.G;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0437b {

    /* renamed from: a, reason: collision with root package name */
    public C0339h f5841a;

    /* renamed from: b, reason: collision with root package name */
    public C0344m f5842b;

    /* renamed from: c, reason: collision with root package name */
    public float f5843c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public k f5844d = k.f3741d;

    public abstract void a(float f3);

    public abstract void b(C0344m c0344m);

    public final void c(G g3, long j3, float f3, C0344m c0344m) {
        if (this.f5843c != f3) {
            a(f3);
            this.f5843c = f3;
        }
        if (!j.a(this.f5842b, c0344m)) {
            b(c0344m);
            this.f5842b = c0344m;
        }
        k layoutDirection = g3.getLayoutDirection();
        if (this.f5844d != layoutDirection) {
            this.f5844d = layoutDirection;
        }
        C0401b c0401b = g3.f8573d;
        float d3 = C0241f.d(c0401b.d()) - C0241f.d(j3);
        float b3 = C0241f.b(c0401b.d()) - C0241f.b(j3);
        ((Y) c0401b.f5649e.f2116b).i(0.0f, 0.0f, d3, b3);
        if (f3 > 0.0f) {
            try {
                if (C0241f.d(j3) > 0.0f && C0241f.b(j3) > 0.0f) {
                    e(g3);
                }
            } finally {
                ((Y) c0401b.f5649e.f2116b).i(-0.0f, -0.0f, -d3, -b3);
            }
        }
    }

    public abstract long d();

    public abstract void e(G g3);
}
