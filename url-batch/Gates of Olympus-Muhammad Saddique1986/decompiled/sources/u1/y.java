package u1;

import F.C0087c;
import I.C0167p;
import I.InterfaceC0142c0;
import I.W0;
import e2.InterfaceC0428g;
import java.util.List;
import java.util.ListIterator;
import l.C0582h;
import n.AbstractC0695v;
import t1.C1028h;

/* loaded from: classes.dex */
public final class y extends f2.k implements InterfaceC0428g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.i f9661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W0 f9663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(R.i iVar, InterfaceC0142c0 interfaceC0142c0, W0 w02) {
        super(4);
        this.f9661e = iVar;
        this.f9662f = interfaceC0142c0;
        this.f9663g = w02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        C1028h c1028h;
        C0582h c0582h = (C0582h) obj;
        C1028h c1028h2 = (C1028h) obj2;
        C0167p c0167p = (C0167p) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.f9662f.getValue()).booleanValue()) {
            List list = (List) this.f9663g.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c1028h = 0;
                    break;
                }
                c1028h = listIterator.previous();
                if (f2.j.a(c1028h2, (C1028h) c1028h)) {
                    break;
                }
            }
            c1028h2 = c1028h;
        }
        if (c1028h2 != null) {
            AbstractC0695v.c(c1028h2, this.f9661e, Q.f.b(-1263531443, new C0087c(c1028h2, 14, c0582h), c0167p), c0167p, 384);
        }
        return R1.y.f4171a;
    }
}
