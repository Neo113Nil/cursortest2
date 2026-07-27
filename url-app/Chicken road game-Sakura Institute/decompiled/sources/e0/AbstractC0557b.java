package e0;

import M0.k;
import Y.f;
import Z.C0311h;
import Z.C0316m;
import b0.C0494b;
import kotlin.jvm.internal.Intrinsics;
import r0.G;
import w2.C1294c;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0557b {

    /* renamed from: a, reason: collision with root package name */
    public C0311h f6158a;

    /* renamed from: b, reason: collision with root package name */
    public C0316m f6159b;

    /* renamed from: c, reason: collision with root package name */
    public float f6160c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public k f6161d = k.f3555d;

    public abstract void a(float f4);

    public abstract void b(C0316m c0316m);

    public final void c(G g4, long j4, float f4, C0316m c0316m) {
        if (this.f6160c != f4) {
            a(f4);
            this.f6160c = f4;
        }
        if (!Intrinsics.a(this.f6159b, c0316m)) {
            b(c0316m);
            this.f6159b = c0316m;
        }
        k layoutDirection = g4.getLayoutDirection();
        if (this.f6161d != layoutDirection) {
            this.f6161d = layoutDirection;
        }
        C0494b c0494b = g4.f9624d;
        float d4 = f.d(c0494b.h()) - f.d(j4);
        float b4 = f.b(c0494b.h()) - f.b(j4);
        ((C1294c) c0494b.f5603e.f987e).h(0.0f, 0.0f, d4, b4);
        if (f4 > 0.0f) {
            try {
                if (f.d(j4) > 0.0f && f.b(j4) > 0.0f) {
                    e(g4);
                }
            } finally {
                ((C1294c) c0494b.f5603e.f987e).h(-0.0f, -0.0f, -d4, -b4);
            }
        }
    }

    public abstract long d();

    public abstract void e(G g4);
}
