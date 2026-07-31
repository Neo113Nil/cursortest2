package b0;

import a7.x;
import c6.m;
import i6.i;
import u.g;
import u1.p;
import w1.d1;
import w1.u;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends l implements a2.a, u {

    /* renamed from: r, reason: collision with root package name */
    public g f1044r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1045s;

    public static final e1.c r0(f fVar, d1 d1Var, a2.b bVar) {
        e1.c cVar;
        if (fVar.f8718q && fVar.f1045s) {
            d1 t3 = w1.f.t(fVar);
            if (!d1Var.E0().f8718q) {
                d1Var = null;
            }
            if (d1Var != null && (cVar = (e1.c) bVar.b()) != null) {
                float f6 = t3.K(d1Var, false).f2457a;
                return cVar.e((Float.floatToRawIntBits(r4.f2458b) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
            }
        }
        return null;
    }

    @Override // a2.a
    public final Object G(d1 d1Var, a2.b bVar, i iVar) {
        Object b8 = x.b(new e(this, d1Var, bVar, new a(this, d1Var, bVar, 0), null), iVar);
        return b8 == h6.a.f3204d ? b8 : m.f1757a;
    }

    @Override // w1.u
    public final void P(p pVar) {
        this.f1045s = true;
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }
}
