package A2;

import C2.L;
import C2.O;
import R1.y;
import e2.InterfaceC0424c;
import n.AbstractC0695v;
import n.T;
import t1.C1013A;
import t1.C1017E;
import t1.I;
import t1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0424c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f242e;

    public /* synthetic */ g(int i3, Object obj) {
        this.f241d = i3;
        this.f242e = obj;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        y yVar = y.f4171a;
        int i3 = 1;
        Object obj2 = this.f242e;
        switch (this.f241d) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                h hVar = (h) obj2;
                sb.append(hVar.f247e[intValue]);
                sb.append(": ");
                sb.append(hVar.f248f[intValue].d());
                break;
            case 1:
                f2.j.f((a) obj, "$this$buildSerialDescriptor");
                ((L) obj2).getClass();
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                int intValue2 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                O o3 = (O) obj2;
                sb2.append(o3.f713e[intValue2]);
                sb2.append(": ");
                sb2.append(o3.h(intValue2).d());
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C1017E c1017e = (C1017E) obj;
                f2.j.f(c1017e, "$this$navigate");
                int i4 = x.f8947q;
                c1017e.f8849d = AbstractC0695v.j(((C1013A) obj2).f()).f8936i;
                I i5 = new I();
                i5.f8855a = true;
                c1017e.f8850e = i5.f8855a;
                c1017e.f8847b = true;
                c1017e.f8848c = true;
                break;
            default:
                t1.y yVar2 = (t1.y) obj;
                f2.j.f(yVar2, "$this$NavHost");
                Q1.k kVar = (Q1.k) obj2;
                T.i(yVar2, M1.a.f3456g.f3462d, new Q.a(-1818236810, new M1.h(kVar, 0), true));
                T.i(yVar2, M1.a.f3457h.f3462d, new Q.a(-1826404499, new M1.h(kVar, i3), true));
                T.i(yVar2, M1.a.f3458i.f3462d, new Q.a(1900590574, new M1.h(kVar, 2), true));
                T.i(yVar2, M1.a.f3459j.f3462d, new Q.a(1332618351, new M1.h(kVar, 3), true));
                break;
        }
        return yVar;
    }
}
