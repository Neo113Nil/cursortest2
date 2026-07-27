package f0;

import B1.C0097d;
import G.C0192d;
import G.C0199g0;
import G.C0205j0;
import G.W;
import Z.C0316m;
import b0.C0494b;
import e0.AbstractC0557b;
import w2.C1294c;

/* renamed from: f0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578I extends AbstractC0557b {

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f6306e;

    /* renamed from: f, reason: collision with root package name */
    public final C0205j0 f6307f;

    /* renamed from: g, reason: collision with root package name */
    public final C0574E f6308g;

    /* renamed from: h, reason: collision with root package name */
    public final C0199g0 f6309h;

    /* renamed from: i, reason: collision with root package name */
    public float f6310i;

    /* renamed from: j, reason: collision with root package name */
    public C0316m f6311j;

    /* renamed from: k, reason: collision with root package name */
    public int f6312k;

    public C0578I(C0582c c0582c) {
        Y.f fVar = new Y.f(0L);
        W w4 = W.f2779l;
        this.f6306e = C0192d.K(fVar, w4);
        this.f6307f = C0192d.K(Boolean.FALSE, w4);
        C0574E c0574e = new C0574E(c0582c);
        c0574e.f6287f = new A3.e(13, this);
        this.f6308g = c0574e;
        this.f6309h = C0192d.J(0);
        this.f6310i = 1.0f;
        this.f6312k = -1;
    }

    @Override // e0.AbstractC0557b
    public final void a(float f4) {
        this.f6310i = f4;
    }

    @Override // e0.AbstractC0557b
    public final void b(C0316m c0316m) {
        this.f6311j = c0316m;
    }

    @Override // e0.AbstractC0557b
    public final long d() {
        return ((Y.f) this.f6306e.getValue()).f4386a;
    }

    @Override // e0.AbstractC0557b
    public final void e(r0.G g4) {
        C0316m c0316m = this.f6311j;
        C0574E c0574e = this.f6308g;
        if (c0316m == null) {
            c0316m = (C0316m) c0574e.f6288g.getValue();
        }
        if (((Boolean) this.f6307f.getValue()).booleanValue() && g4.getLayoutDirection() == M0.k.f3556e) {
            C0494b c0494b = g4.f9624d;
            long w4 = c0494b.w();
            C0097d c0097d = c0494b.f5603e;
            long s4 = c0097d.s();
            c0097d.k().g();
            try {
                ((C1294c) c0097d.f987e).n(-1.0f, 1.0f, w4);
                c0574e.e(g4, this.f6310i, c0316m);
            } finally {
                c0097d.k().b();
                c0097d.G(s4);
            }
        } else {
            c0574e.e(g4, this.f6310i, c0316m);
        }
        this.f6312k = this.f6309h.d();
    }
}
