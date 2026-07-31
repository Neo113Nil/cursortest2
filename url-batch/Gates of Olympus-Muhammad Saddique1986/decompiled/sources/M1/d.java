package M1;

import F.AbstractC0132z;
import F.x1;
import F.z1;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;
import f2.j;
import java.util.Iterator;
import n.r;
import t1.u;

/* loaded from: classes.dex */
public final class d implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3470e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f3469d = i3;
        this.f3470e = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        Object obj3;
        int ordinal;
        y yVar = y.f4171a;
        Object obj4 = this.f3470e;
        switch (this.f3469d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    x1.b((String) obj4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p, 0, 0, 131070);
                }
                return yVar;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    Iterator it = a.f3461l.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            a aVar = (a) obj3;
                            u uVar = (u) obj4;
                            if (uVar != null) {
                                int i3 = u.f8930l;
                                Iterator it2 = r.m(uVar).iterator();
                                while (it2.hasNext()) {
                                    if (j.a(((u) it2.next()).f8937j, aVar.f3462d)) {
                                    }
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    a aVar2 = (a) obj3;
                    String str = "Snipora Chair";
                    if (aVar2 != null && (ordinal = aVar2.ordinal()) != 0) {
                        if (ordinal == 1) {
                            str = "Clients";
                        } else if (ordinal == 2) {
                            str = "Haircut Log";
                        } else {
                            if (ordinal != 3) {
                                throw new C1.c();
                            }
                            str = "Earnings";
                        }
                    }
                    AbstractC0132z.a(Q.f.b(-906101127, new d(0, str), c0167p2), null, null, null, 0.0f, null, z1.a(c0167p2), c0167p2, 6);
                }
                return yVar;
        }
    }
}
