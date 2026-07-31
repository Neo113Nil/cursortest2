package v0;

import a0.a0;
import a0.t;
import a0.y;
import b6.c0;
import c6.m;
import g2.v;
import java.util.Map;
import l.q;
import m0.n;
import m0.s;
import m0.t1;
import m0.u2;
import m0.v0;
import o.j0;
import o.r0;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f7434h = new a0(21, new v(12), new s1(19));

    /* renamed from: d, reason: collision with root package name */
    public final Map f7435d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f7436e;

    /* renamed from: f, reason: collision with root package name */
    public e f7437f;

    /* renamed from: g, reason: collision with root package name */
    public final t f7438g;

    public d(Map map) {
        this.f7435d = map;
        long[] jArr = r0.f5528a;
        this.f7436e = new j0();
        this.f7438g = new t(25, this);
    }

    @Override // v0.c
    public final void a(Object obj) {
        if (this.f7436e.k(obj) == null) {
            this.f7435d.remove(obj);
        }
    }

    @Override // v0.c
    public final void b(Object obj, u0.c cVar, s sVar, int i) {
        int i8;
        sVar.W(533563200);
        if ((i & 6) == 0) {
            i8 = (sVar.h(obj) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            sVar.X(obj);
            Object K = sVar.K();
            v0 v0Var = n.f5019a;
            if (K == v0Var) {
                t tVar = this.f7438g;
                if (!((Boolean) tVar.i(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f7435d.get(obj);
                u2 u2Var = g.f7442a;
                h hVar = new h(new f(map, tVar));
                sVar.f0(hVar);
                K = hVar;
            }
            h hVar2 = (h) K;
            m0.b.b(new q[]{g.f7442a.a(hVar2), y4.a.f8975a.a(hVar2)}, cVar, sVar, (i8 & 112) | 8);
            boolean h8 = sVar.h(this) | sVar.h(obj) | sVar.h(hVar2);
            Object K2 = sVar.K();
            if (h8 || K2 == v0Var) {
                K2 = new c0(this, obj, hVar2, 7);
                sVar.f0(K2);
            }
            m0.b.d(m.f1757a, (p6.c) K2, sVar);
            if (sVar.f5096y && sVar.G.i == sVar.f5097z) {
                sVar.f5097z = -1;
                sVar.f5096y = false;
            }
            sVar.p(false);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new y(this, obj, cVar, i, 6);
        }
    }
}
