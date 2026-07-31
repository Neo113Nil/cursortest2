package m;

import D1.C0014b;
import I.C0102j0;
import I.InterfaceC0088c0;
import I.X0;
import android.os.Bundle;
import h1.C0438i;
import k2.InterfaceC0550w;
import o.C0737m;
import q1.C0775D;
import q1.C0784h;
import u.C0925G;
import u.C0951t;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587a extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587a(Z1.p pVar, C0775D c0775d, q1.w wVar, Bundle bundle) {
        super(1);
        this.f5675e = 3;
        this.f5679i = pVar;
        this.f5676f = c0775d;
        this.f5677g = wVar;
        this.f5678h = bundle;
    }

    /* JADX WARN: Type inference failed for: r14v22, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r14v3, types: [Y1.a, Z1.j] */
    @Override // Y1.c
    public final Object j(Object obj) {
        boolean z3;
        switch (this.f5675e) {
            case 0:
                C0601k c0601k = (C0601k) obj;
                C0593d c0593d = (C0593d) this.f5676f;
                AbstractC0595e.j(c0601k, c0593d.f5704c);
                C0102j0 c0102j0 = c0601k.f5790e;
                Object a3 = C0593d.a(c0593d, c0102j0.getValue());
                boolean a4 = Z1.i.a(a3, c0102j0.getValue());
                Y1.c cVar = (Y1.c) this.f5678h;
                if (!a4) {
                    c0593d.f5704c.f5803e.setValue(a3);
                    ((C0603m) this.f5677g).f5803e.setValue(a3);
                    if (cVar != null) {
                        cVar.j(c0593d);
                    }
                    c0601k.f5794i.setValue(Boolean.FALSE);
                    c0601k.f5789d.b();
                    ((Z1.p) this.f5679i).f3476d = true;
                } else if (cVar != null) {
                    cVar.j(c0593d);
                }
                return L1.z.f2729a;
            case 1:
                long longValue = ((Number) obj).longValue();
                X0 x02 = (X0) ((InterfaceC0088c0) this.f5676f).getValue();
                long longValue2 = x02 != null ? ((Number) x02.getValue()).longValue() : longValue;
                C0583H c0583h = (C0583H) this.f5677g;
                long j3 = c0583h.f5584c;
                K.d dVar = c0583h.f5582a;
                InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f5679i;
                int i3 = 0;
                Z1.q qVar = (Z1.q) this.f5678h;
                if (j3 == Long.MIN_VALUE || qVar.f3477d != AbstractC0595e.g(interfaceC0550w.u())) {
                    c0583h.f5584c = longValue;
                    int i4 = dVar.f2642f;
                    if (i4 > 0) {
                        Object[] objArr = dVar.f2640d;
                        int i5 = 0;
                        do {
                            ((C0580E) objArr[i5]).f5573i = true;
                            i5++;
                        } while (i5 < i4);
                    }
                    qVar.f3477d = AbstractC0595e.g(interfaceC0550w.u());
                }
                float f3 = qVar.f3477d;
                if (f3 == 0.0f) {
                    int i6 = dVar.f2642f;
                    if (i6 > 0) {
                        Object[] objArr2 = dVar.f2640d;
                        do {
                            C0580E c0580e = (C0580E) objArr2[i3];
                            c0580e.f5570f.setValue(c0580e.f5571g.f5779c);
                            c0580e.f5573i = true;
                            i3++;
                        } while (i3 < i6);
                    }
                } else {
                    long j4 = (long) ((longValue2 - c0583h.f5584c) / f3);
                    int i7 = dVar.f2642f;
                    if (i7 > 0) {
                        Object[] objArr3 = dVar.f2640d;
                        z3 = true;
                        int i8 = 0;
                        do {
                            C0580E c0580e2 = (C0580E) objArr3[i8];
                            if (!c0580e2.f5572h) {
                                c0580e2.f5575k.f5583b.setValue(Boolean.FALSE);
                                if (c0580e2.f5573i) {
                                    c0580e2.f5573i = false;
                                    c0580e2.f5574j = j4;
                                }
                                long j5 = j4 - c0580e2.f5574j;
                                c0580e2.f5570f.setValue(c0580e2.f5571g.b(j5));
                                c0580e2.f5572h = c0580e2.f5571g.f(j5);
                            }
                            if (!c0580e2.f5572h) {
                                z3 = false;
                            }
                            i8++;
                        } while (i8 < i7);
                    } else {
                        z3 = true;
                    }
                    c0583h.f5585d.setValue(Boolean.valueOf(!z3));
                }
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0601k c0601k2 = (C0601k) obj;
                float floatValue = ((Number) c0601k2.f5790e.getValue()).floatValue();
                Z1.q qVar2 = (Z1.q) this.f5676f;
                float f4 = floatValue - qVar2.f3477d;
                float a5 = ((o.j0) this.f5677g).a(f4);
                qVar2.f3477d = ((Number) c0601k2.f5790e.getValue()).floatValue();
                ((Z1.q) this.f5678h).f3477d = ((Number) c0601k2.f5786a.f5884b.j(c0601k2.f5791f)).floatValue();
                if (Math.abs(f4 - a5) > 0.5f) {
                    c0601k2.f5794i.setValue(Boolean.FALSE);
                    c0601k2.f5789d.b();
                }
                ((C0737m) this.f5679i).getClass();
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                C0784h c0784h = (C0784h) obj;
                Z1.i.f(c0784h, "it");
                ((Z1.p) this.f5679i).f3476d = true;
                ((C0775D) this.f5676f).a((q1.w) this.f5677g, (Bundle) this.f5678h, c0784h, M1.u.f2803d);
                return L1.z.f2729a;
            default:
                C0014b c0014b = new C0014b((C0951t) this.f5677g, (r0.P) this.f5678h, (u.T) this.f5679i, 14);
                C0925G c0925g = (C0925G) this.f5676f;
                c0925g.f8010c = c0014b;
                return new P0.a(4, c0925g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0587a(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        super(1);
        this.f5675e = i3;
        this.f5676f = obj;
        this.f5677g = obj2;
        this.f5678h = obj3;
        this.f5679i = obj4;
    }
}
