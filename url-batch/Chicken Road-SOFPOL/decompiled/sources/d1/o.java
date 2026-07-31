package d1;

import a7.u;
import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import c5.x;
import f1.g0;
import java.util.HashSet;
import java.util.Iterator;
import l1.a0;
import m0.e1;
import m0.y;
import o.j0;
import q.c0;
import r.l1;
import u1.t;
import u1.w0;
import w1.d1;
import w1.f0;
import w1.s0;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(0);
        this.f2100e = i;
        this.f2101f = obj;
    }

    @Override // p6.a
    public final Object b() {
        y yVar;
        switch (this.f2100e) {
            case 0:
                ((n) this.f2101f).s0();
                return c6.m.f1757a;
            case 1:
                e2.a aVar = (e2.a) this.f2101f;
                aVar.f2476g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.b();
                    Trace.endSection();
                    return c6.m.f1757a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                Object systemService = ((k2.c) this.f2101f).f4173a.getContext().getSystemService("input_method");
                q6.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new BaseInputConnection(((k2.c) this.f2101f).f4173a, false);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                a0 a0Var = (a0) this.f2101f;
                int i = a0Var.f4732j;
                e1 e1Var = a0Var.f4730g;
                if (i == e1Var.g()) {
                    e1Var.h(e1Var.g() + 1);
                }
                return c6.m.f1757a;
            case 5:
                return (u) ((x) this.f2101f).f1740g;
            case 6:
                return ((p1.e) this.f2101f).r0();
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                l1 l1Var = (l1) this.f2101f;
                Object b8 = l1Var.f6346a.b();
                c0 c0Var = c0.f5808f;
                return Boolean.valueOf(b8 == c0Var && l1Var.f6349d.getValue() == c0Var);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                t tVar = (t) this.f2101f;
                if (!((Boolean) tVar.f7273g.getValue()).booleanValue() && (yVar = tVar.f7269c) != null) {
                    yVar.l();
                }
                return c6.m.f1757a;
            case v0.f8304b /* 9 */:
                u1.a0 a8 = ((w0) this.f2101f).a();
                f0 f0Var = a8.f7169d;
                if (a8.f7181q != ((o0.b) f0Var.n()).f5572d.f5580f) {
                    j0 j0Var = a8.i;
                    Object[] objArr = j0Var.f5484c;
                    long[] jArr = j0Var.f5482a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j7 = jArr[i8];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((255 & j7) < 128) {
                                        ((t) objArr[(i8 << 3) + i10]).f7270d = true;
                                    }
                                    j7 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length) {
                                i8++;
                            }
                        }
                    }
                    if (f0Var.f7644j != null) {
                        if (!f0Var.G.f7690e) {
                            f0.S(f0Var, false, 7);
                        }
                    } else if (!f0Var.p()) {
                        f0.U(f0Var, false, 7);
                    }
                }
                return c6.m.f1757a;
            case v0.f8306d /* 10 */:
                v1.d dVar = (v1.d) this.f2101f;
                o0.e eVar = dVar.f7452c;
                o0.e eVar2 = dVar.f7451b;
                o0.e eVar3 = dVar.f7454e;
                dVar.f7455f = false;
                HashSet hashSet = new HashSet();
                o0.e eVar4 = dVar.f7453d;
                Object[] objArr2 = eVar4.f5578d;
                int i11 = eVar4.f5580f;
                for (int i12 = 0; i12 < i11; i12++) {
                    f0 f0Var2 = (f0) objArr2[i12];
                    v1.g gVar = (v1.g) eVar3.f5578d[i12];
                    y0.l lVar = f0Var2.F.f7600f;
                    if (lVar.f8718q) {
                        v1.d.b(lVar, gVar, hashSet);
                    }
                }
                eVar4.g();
                eVar3.g();
                Object[] objArr3 = eVar2.f5578d;
                int i13 = eVar2.f5580f;
                for (int i14 = 0; i14 < i13; i14++) {
                    w1.c cVar = (w1.c) objArr3[i14];
                    v1.g gVar2 = (v1.g) eVar.f5578d[i14];
                    if (cVar.f8718q) {
                        v1.d.b(cVar, gVar2, hashSet);
                    }
                }
                eVar2.g();
                eVar.g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((w1.c) it.next()).u0();
                }
                return c6.m.f1757a;
            case 11:
                w1.j0 j0Var2 = ((f0) this.f2101f).G;
                j0Var2.f7700p.B = true;
                s0 s0Var = j0Var2.f7701q;
                if (s0Var != null) {
                    s0Var.f7774v = true;
                }
                return c6.m.f1757a;
            default:
                p6.c cVar2 = (p6.c) this.f2101f;
                g0 g0Var = d1.M;
                cVar2.i(g0Var);
                g0Var.f2658s = g0Var.f2652m.a(g0Var.f2654o, g0Var.f2656q, g0Var.f2655p);
                return c6.m.f1757a;
        }
    }
}
