package m;

import Z.C0323u;
import b0.C0494b;
import b0.C0499g;
import b0.InterfaceC0496d;
import p.InterfaceC0934j;
import r0.InterfaceC1074o;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826B extends S.n implements InterfaceC1074o {

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0934j f7996t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7997u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7998v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7999w;

    public C0826B(InterfaceC0934j interfaceC0934j) {
        this.f7996t = interfaceC0934j;
    }

    @Override // r0.InterfaceC1074o
    public final void a(r0.G g4) {
        g4.a();
        boolean z4 = this.f7997u;
        C0494b c0494b = g4.f9624d;
        if (z4) {
            g4.B(C0323u.b(0.3f, C0323u.f4542b), 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(g4.h(), 0L) : c0494b.h(), 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
        } else if (this.f7998v || this.f7999w) {
            g4.B(C0323u.b(0.1f, C0323u.f4542b), 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(g4.h(), 0L) : c0494b.h(), 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // S.n
    public final void t0() {
        W2.B.m(p0(), null, null, new C0825A(this, null), 3);
    }
}
