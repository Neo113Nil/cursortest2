package m;

import Z.AbstractC0319p;
import Z.C0313j;
import Z.C0323u;
import a.AbstractC0345a;
import b0.C0494b;
import b0.C0499g;
import b0.InterfaceC0496d;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.InterfaceC1074o;
import y2.C1338m;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843p extends S.n implements InterfaceC1074o, r0.c0 {

    /* renamed from: A, reason: collision with root package name */
    public Z.P f8152A;

    /* renamed from: t, reason: collision with root package name */
    public long f8153t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0319p f8154u;

    /* renamed from: v, reason: collision with root package name */
    public float f8155v;

    /* renamed from: w, reason: collision with root package name */
    public Z.P f8156w;

    /* renamed from: x, reason: collision with root package name */
    public long f8157x;

    /* renamed from: y, reason: collision with root package name */
    public M0.k f8158y;

    /* renamed from: z, reason: collision with root package name */
    public Z.I f8159z;

    @Override // r0.InterfaceC1074o
    public final void a(r0.G g4) {
        C0313j c0313j;
        if (this.f8156w == Z.K.f4461a) {
            if (!C0323u.c(this.f8153t, C0323u.f4547g)) {
                g4.B(this.f8153t, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(g4.h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
            }
            AbstractC0319p abstractC0319p = this.f8154u;
            if (abstractC0319p != null) {
                InterfaceC0496d.R(g4, abstractC0319p, 0L, 0L, this.f8155v, null, 118);
            }
        } else {
            M2.E e4 = new M2.E();
            C0494b c0494b = g4.f9624d;
            if (Y.f.a(c0494b.h(), this.f8157x) && g4.getLayoutDirection() == this.f8158y && Intrinsics.a(this.f8152A, this.f8156w)) {
                Z.I i2 = this.f8159z;
                Intrinsics.c(i2);
                e4.f3580d = i2;
            } else {
                AbstractC1065f.s(this, new C0842o(e4, this, g4, 0));
            }
            this.f8159z = (Z.I) e4.f3580d;
            this.f8157x = c0494b.h();
            this.f8158y = g4.getLayoutDirection();
            this.f8152A = this.f8156w;
            Object obj = e4.f3580d;
            Intrinsics.c(obj);
            Z.I i4 = (Z.I) obj;
            if (!C0323u.c(this.f8153t, C0323u.f4547g)) {
                Z.K.m(g4, i4, this.f8153t);
            }
            AbstractC0319p abstractC0319p2 = this.f8154u;
            if (abstractC0319p2 != null) {
                float f4 = this.f8155v;
                C0499g c0499g = C0499g.f5607a;
                if (i4 instanceof Z.G) {
                    Y.d dVar = ((Z.G) i4).f4458a;
                    g4.c(abstractC0319p2, AbstractC0345a.c(dVar.f4374a, dVar.f4375b), u3.l.N(dVar.c(), dVar.b()), f4, c0499g, null, 3);
                } else {
                    if (i4 instanceof Z.H) {
                        Z.H h4 = (Z.H) i4;
                        c0313j = h4.f4460b;
                        if (c0313j == null) {
                            Y.e eVar = h4.f4459a;
                            float b4 = Y.a.b(eVar.f4385h);
                            g4.d(abstractC0319p2, AbstractC0345a.c(eVar.f4378a, eVar.f4379b), u3.l.N(eVar.b(), eVar.a()), u3.l.I(b4, b4), f4, c0499g, null, 3);
                        }
                    } else {
                        if (!(i4 instanceof Z.F)) {
                            throw new C1338m();
                        }
                        c0313j = ((Z.F) i4).f4457a;
                    }
                    g4.m0(c0313j, abstractC0319p2, f4, c0499g, null, 3);
                }
            }
        }
        g4.a();
    }

    @Override // r0.c0
    public final void l0() {
        this.f8157x = 9205357640488583168L;
        this.f8158y = null;
        this.f8159z = null;
        this.f8152A = null;
        AbstractC1065f.n(this);
    }
}
