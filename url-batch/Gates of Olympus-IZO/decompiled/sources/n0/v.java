package n0;

import I.W;
import java.util.ArrayList;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.EnumC0551x;
import k2.m0;
import t0.AbstractC0898f;
import t0.l0;

/* loaded from: classes.dex */
public final class v extends U.k implements M0.b, l0 {

    /* renamed from: q, reason: collision with root package name */
    public Object f6261q;

    /* renamed from: r, reason: collision with root package name */
    public Object f6262r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f6263s;

    /* renamed from: t, reason: collision with root package name */
    public R1.i f6264t;

    /* renamed from: u, reason: collision with root package name */
    public m0 f6265u;

    /* renamed from: y, reason: collision with root package name */
    public g f6269y;

    /* renamed from: v, reason: collision with root package name */
    public g f6266v = r.f6252a;

    /* renamed from: w, reason: collision with root package name */
    public final K.d f6267w = new K.d(new t[16]);

    /* renamed from: x, reason: collision with root package name */
    public final K.d f6268x = new K.d(new t[16]);

    /* renamed from: z, reason: collision with root package name */
    public long f6270z = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, Object obj2, Object[] objArr, Y1.e eVar) {
        this.f6261q = obj;
        this.f6262r = obj2;
        this.f6263s = objArr;
        this.f6264t = (R1.i) eVar;
    }

    @Override // t0.l0
    public final void E() {
        w0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.l0
    public final void K() {
        g gVar = this.f6269y;
        if (gVar == null) {
            return;
        }
        ?? r12 = gVar.f6214a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((m) r12.get(i3)).f6226d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    m mVar = (m) r12.get(i4);
                    long j3 = mVar.f6223a;
                    boolean z3 = mVar.f6226d;
                    long j4 = mVar.f6224b;
                    long j5 = mVar.f6225c;
                    arrayList.add(new m(j3, j4, j5, false, mVar.f6227e, j4, j5, z3, z3, 1, 0L));
                }
                g gVar2 = new g(arrayList, null);
                this.f6266v = gVar2;
                v0(gVar2, h.f6216d);
                v0(gVar2, h.f6217e);
                v0(gVar2, h.f6218f);
                this.f6269y = null;
                return;
            }
        }
    }

    @Override // M0.b
    public final float a() {
        return AbstractC0898f.t(this).f7730s.a();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.l0
    public final void f0(g gVar, h hVar, long j3) {
        this.f6270z = j3;
        if (hVar == h.f6216d) {
            this.f6266v = gVar;
        }
        if (this.f6265u == null) {
            this.f6265u = AbstractC0552y.q(j0(), null, EnumC0551x.f5398g, new u(this, null), 1);
        }
        v0(gVar, hVar);
        ?? r5 = gVar.f6214a;
        int size = r5.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                gVar = null;
                break;
            } else if (!s.b((m) r5.get(i3))) {
                break;
            } else {
                i3++;
            }
        }
        this.f6269y = gVar;
    }

    @Override // t0.l0
    public final void m() {
        w0();
    }

    @Override // U.k
    public final void o0() {
        w0();
    }

    @Override // M0.b
    public final float p() {
        return AbstractC0898f.t(this).f7730s.p();
    }

    public final void v0(g gVar, h hVar) {
        C0536h c0536h;
        C0536h c0536h2;
        synchronized (this.f6267w) {
            K.d dVar = this.f6268x;
            dVar.c(dVar.f2642f, this.f6267w);
        }
        try {
            int ordinal = hVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    K.d dVar2 = this.f6268x;
                    int i3 = dVar2.f2642f;
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        Object[] objArr = dVar2.f2640d;
                        do {
                            t tVar = (t) objArr[i4];
                            if (hVar == tVar.f6257g && (c0536h2 = tVar.f6256f) != null) {
                                tVar.f6256f = null;
                                c0536h2.resumeWith(gVar);
                            }
                            i4--;
                        } while (i4 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            K.d dVar3 = this.f6268x;
            int i5 = dVar3.f2642f;
            if (i5 > 0) {
                Object[] objArr2 = dVar3.f2640d;
                int i6 = 0;
                do {
                    t tVar2 = (t) objArr2[i6];
                    if (hVar == tVar2.f6257g && (c0536h = tVar2.f6256f) != null) {
                        tVar2.f6256f = null;
                        c0536h.resumeWith(gVar);
                    }
                    i6++;
                } while (i6 < i5);
            }
        } finally {
            this.f6268x.h();
        }
    }

    public final void w0() {
        m0 m0Var = this.f6265u;
        if (m0Var != null) {
            m0Var.w(new W("Pointer input was reset", 4));
            this.f6265u = null;
        }
    }
}
