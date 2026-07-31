package a0;

import java.util.Map;
import m0.t1;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y0 implements v0.e, v0.c {

    /* renamed from: d, reason: collision with root package name */
    public final v0.f f178d;

    /* renamed from: e, reason: collision with root package name */
    public final v0.c f179e;

    /* renamed from: f, reason: collision with root package name */
    public final o.k0 f180f;

    public y0(v0.e eVar, Map map, v0.c cVar) {
        t tVar = new t(2, eVar);
        u2 u2Var = v0.g.f7442a;
        this.f178d = new v0.f(map, tVar);
        this.f179e = cVar;
        o.k0 k0Var = o.s0.f5536a;
        this.f180f = new o.k0();
    }

    @Override // v0.c
    public final void a(Object obj) {
        this.f179e.a(obj);
    }

    @Override // v0.c
    public final void b(Object obj, u0.c cVar, m0.s sVar, int i) {
        int i8;
        sVar.W(-858296452);
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
            this.f179e.b(obj, cVar, sVar, i8 & 126);
            boolean h8 = sVar.h(this) | sVar.h(obj);
            Object K = sVar.K();
            if (h8 || K == m0.n.f5019a) {
                K = new v0(0, this, obj);
                sVar.f0(K);
            }
            m0.b.d(obj, (p6.c) K, sVar);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new y(this, obj, cVar, i, 1);
        }
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return this.f178d.c(obj);
    }

    @Override // v0.e
    public final Map d() {
        o.k0 k0Var = this.f180f;
        Object[] objArr = k0Var.f5490b;
        long[] jArr = k0Var.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            this.f179e.a(objArr[(i << 3) + i9]);
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.f178d.d();
    }

    @Override // v0.e
    public final Object e(String str) {
        return this.f178d.e(str);
    }

    @Override // v0.e
    public final g1 f(String str, p6.a aVar) {
        return this.f178d.f(str, aVar);
    }
}
