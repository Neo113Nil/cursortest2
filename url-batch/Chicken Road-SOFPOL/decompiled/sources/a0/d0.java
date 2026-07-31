package a0;

import android.os.Bundle;
import b6.t1;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f42f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f43g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f44h;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f40d = i;
        this.f41e = obj;
        this.f42f = obj2;
        this.f43g = obj3;
        this.f44h = obj4;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f40d) {
            case 0:
                n0 n0Var = (n0) this.f41e;
                n0Var.f119c = new f1((x) this.f42f, (u1.w0) this.f43g, (h1) this.f44h);
                break;
            case 1:
                r.c cVar = (r.c) this.f41e;
                r.k kVar = (r.k) this.f42f;
                p6.c cVar2 = (p6.c) this.f43g;
                q6.o oVar = (q6.o) this.f44h;
                r.i iVar = (r.i) obj;
                r.d.n(iVar, cVar.f6235c);
                m0.h1 h1Var = iVar.f6307e;
                Object a8 = r.c.a(cVar, h1Var.getValue());
                if (!q6.i.a(a8, h1Var.getValue())) {
                    cVar.f6235c.f6331e.setValue(a8);
                    kVar.f6331e.setValue(a8);
                    if (cVar2 != null) {
                        cVar2.i(cVar);
                    }
                    iVar.i.setValue(Boolean.FALSE);
                    iVar.f6306d.b();
                    oVar.f6201d = true;
                } else if (cVar2 != null) {
                    cVar2.i(cVar);
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.z0 z0Var = (m0.z0) this.f41e;
                r.c0 c0Var = (r.c0) this.f42f;
                q6.p pVar = (q6.p) this.f43g;
                a7.u uVar = (a7.u) this.f44h;
                long longValue = ((Long) obj).longValue();
                t2 t2Var = (t2) z0Var.getValue();
                long longValue2 = t2Var != null ? ((Number) t2Var.getValue()).longValue() : longValue;
                long j7 = c0Var.f6244c;
                o0.e eVar = c0Var.f6242a;
                if (j7 == Long.MIN_VALUE || pVar.f6202d != r.d.i(uVar.h())) {
                    c0Var.f6244c = longValue;
                    Object[] objArr = eVar.f5578d;
                    int i = eVar.f5580f;
                    for (int i8 = 0; i8 < i; i8++) {
                        ((r.a0) objArr[i8]).i = true;
                    }
                    pVar.f6202d = r.d.i(uVar.h());
                }
                float f6 = pVar.f6202d;
                if (f6 == 0.0f) {
                    Object[] objArr2 = eVar.f5578d;
                    int i9 = eVar.f5580f;
                    for (int i10 = 0; i10 < i9; i10++) {
                        r.a0 a0Var = (r.a0) objArr2[i10];
                        a0Var.f6216f.setValue(a0Var.f6217g.f6248c);
                        a0Var.i = true;
                    }
                } else {
                    long j8 = (long) ((longValue2 - c0Var.f6244c) / f6);
                    Object[] objArr3 = eVar.f5578d;
                    int i11 = eVar.f5580f;
                    boolean z3 = true;
                    for (int i12 = 0; i12 < i11; i12++) {
                        r.a0 a0Var2 = (r.a0) objArr3[i12];
                        if (!a0Var2.f6218h) {
                            a0Var2.f6220k.f6243b.setValue(Boolean.FALSE);
                            if (a0Var2.i) {
                                a0Var2.i = false;
                                a0Var2.f6219j = j8;
                            }
                            long j9 = j8 - a0Var2.f6219j;
                            a0Var2.f6216f.setValue(a0Var2.f6217g.b(j9));
                            a0Var2.f6218h = a0Var2.f6217g.g(j9);
                        }
                        if (!a0Var2.f6218h) {
                            z3 = false;
                        }
                    }
                    c0Var.f6245d.setValue(Boolean.valueOf(!z3));
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                q6.o oVar2 = (q6.o) this.f41e;
                r4.g gVar = (r4.g) this.f42f;
                o4.o oVar3 = (o4.o) this.f43g;
                Bundle bundle = (Bundle) this.f44h;
                o4.d dVar = (o4.d) obj;
                q6.i.e(dVar, "it");
                oVar2.f6201d = true;
                gVar.a(oVar3, bundle, dVar, d6.u.f2326d);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                q6.p pVar2 = (q6.p) this.f41e;
                u.a1 a1Var = (u.a1) this.f42f;
                q6.p pVar3 = (q6.p) this.f43g;
                u.i iVar2 = (u.i) this.f44h;
                r.i iVar3 = (r.i) obj;
                float floatValue = ((Number) iVar3.f6307e.getValue()).floatValue() - pVar2.f6202d;
                float a9 = a1Var.a(floatValue);
                pVar2.f6202d = ((Number) iVar3.f6307e.getValue()).floatValue();
                pVar3.f6202d = ((Number) iVar3.f6303a.f6414b.i(iVar3.f6308f)).floatValue();
                if (Math.abs(floatValue - a9) > 0.5f) {
                    iVar3.i.setValue(Boolean.FALSE);
                    iVar3.f6306d.b();
                }
                iVar2.getClass();
                break;
            default:
                q6.p pVar4 = (q6.p) this.f41e;
                u.i0 i0Var = (u.i0) this.f42f;
                u.c1 c1Var = (u.c1) this.f43g;
                t1 t1Var = (t1) this.f44h;
                r.i iVar4 = (r.i) obj;
                m0.h1 h1Var2 = iVar4.f6307e;
                p6.a aVar = iVar4.f6306d;
                m0.h1 h1Var3 = iVar4.i;
                float floatValue2 = ((Number) h1Var2.getValue()).floatValue() - pVar4.f6202d;
                if (!u.c0.a(floatValue2)) {
                    if (!u.c0.a(floatValue2 - i0Var.c(c1Var, floatValue2))) {
                        h1Var3.setValue(Boolean.FALSE);
                        aVar.b();
                        break;
                    } else {
                        pVar4.f6202d += floatValue2;
                    }
                }
                if (((Boolean) t1Var.i(Float.valueOf(pVar4.f6202d))).booleanValue()) {
                    h1Var3.setValue(Boolean.FALSE);
                    aVar.b();
                }
        }
        return c6.m.f1757a;
    }
}
