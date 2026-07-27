package W;

import A.f0;
import M0.k;
import M2.p;
import S.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.G;
import r0.InterfaceC1074o;
import r0.c0;
import w2.C1294c;

/* loaded from: classes.dex */
public final class b extends n implements c0, a, InterfaceC1074o {

    /* renamed from: t, reason: collision with root package name */
    public final c f4189t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4190u;

    /* renamed from: v, reason: collision with root package name */
    public i f4191v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f4192w;

    public b(c cVar, Function1 function1) {
        this.f4189t = cVar;
        this.f4192w = function1;
        cVar.f4193d = this;
        new A3.e(11, this);
    }

    public final void B0() {
        i iVar = this.f4191v;
        if (iVar != null) {
            iVar.c();
        }
        this.f4190u = false;
        this.f4189t.f4194e = null;
        AbstractC1065f.n(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // r0.InterfaceC1074o
    public final void a(G g4) {
        boolean z4 = this.f4190u;
        c cVar = this.f4189t;
        if (!z4) {
            cVar.f4194e = null;
            AbstractC1065f.s(this, new f0(this, 2, cVar));
            if (cVar.f4194e == null) {
                AbstractC0864b.E("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f4190u = true;
        }
        C1294c c1294c = cVar.f4194e;
        Intrinsics.c(c1294c);
        ((p) c1294c.f11388d).invoke(g4);
    }

    @Override // W.a
    public final M0.b e() {
        return AbstractC1065f.v(this).f9610w;
    }

    @Override // r0.InterfaceC1074o
    public final void f0() {
        B0();
    }

    @Override // W.a
    public final k getLayoutDirection() {
        return AbstractC1065f.v(this).f9611x;
    }

    @Override // W.a
    public final long h() {
        return u3.d.U(AbstractC1065f.t(this, 128).f9007i);
    }

    @Override // r0.c0
    public final void l0() {
        B0();
    }

    @Override // S.n
    public final void u0() {
        i iVar = this.f4191v;
        if (iVar != null) {
            iVar.c();
        }
    }
}
