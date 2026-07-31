package h0;

import B.Y;
import I.C0143d;
import I.C0150g0;
import I.C0156j0;
import I.W;
import a0.C0241f;
import b0.C0344m;
import d0.C0401b;
import g0.AbstractC0437b;

/* renamed from: h0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456I extends AbstractC0437b {

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f5882e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f5883f;

    /* renamed from: g, reason: collision with root package name */
    public final C0452E f5884g;

    /* renamed from: h, reason: collision with root package name */
    public final C0150g0 f5885h;

    /* renamed from: i, reason: collision with root package name */
    public float f5886i;

    /* renamed from: j, reason: collision with root package name */
    public C0344m f5887j;

    /* renamed from: k, reason: collision with root package name */
    public int f5888k;

    public C0456I(C0460c c0460c) {
        C0241f c0241f = new C0241f(0L);
        W w2 = W.f2783i;
        this.f5882e = C0143d.K(c0241f, w2);
        this.f5883f = C0143d.K(Boolean.FALSE, w2);
        C0452E c0452e = new C0452E(c0460c);
        c0452e.f5863f = new A.h(19, this);
        this.f5884g = c0452e;
        this.f5885h = C0143d.J(0);
        this.f5886i = 1.0f;
        this.f5888k = -1;
    }

    @Override // g0.AbstractC0437b
    public final void a(float f3) {
        this.f5886i = f3;
    }

    @Override // g0.AbstractC0437b
    public final void b(C0344m c0344m) {
        this.f5887j = c0344m;
    }

    @Override // g0.AbstractC0437b
    public final long d() {
        return ((C0241f) this.f5882e.getValue()).f4736a;
    }

    @Override // g0.AbstractC0437b
    public final void e(t0.G g3) {
        C0344m c0344m = this.f5887j;
        C0452E c0452e = this.f5884g;
        if (c0344m == null) {
            c0344m = (C0344m) c0452e.f5864g.getValue();
        }
        if (((Boolean) this.f5883f.getValue()).booleanValue() && g3.getLayoutDirection() == O0.k.f3742e) {
            C0401b c0401b = g3.f8573d;
            long y3 = c0401b.y();
            G1.m mVar = c0401b.f5649e;
            long n3 = mVar.n();
            mVar.h().f();
            try {
                ((Y) mVar.f2116b).o(-1.0f, 1.0f, y3);
                c0452e.e(g3, this.f5886i, c0344m);
            } finally {
                A.k.q(mVar, n3);
            }
        } else {
            c0452e.e(g3, this.f5886i, c0344m);
        }
        this.f5888k = this.f5885h.g();
    }
}
