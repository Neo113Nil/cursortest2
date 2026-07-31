package l;

import F.D0;
import I.C0105l;
import I.C0113p;
import r.C0790B;
import r.C0825w;
import r.U;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558c extends Z1.j implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0558c(int i3, Object obj) {
        super(3);
        this.f5454e = i3;
        this.f5455f = obj;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.f5454e) {
            case 0:
                r0.H b2 = ((r0.z) obj2).b(((M0.a) obj3).f2760a);
                return ((r0.C) obj).Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new D0(b2, 12, (w) this.f5455f));
            case 1:
                C0113p c0113p = (C0113p) obj2;
                ((Number) obj3).intValue();
                c0113p.Q(-1608161351);
                Y1.c cVar = (Y1.c) this.f5455f;
                boolean f3 = c0113p.f(cVar);
                Object G3 = c0113p.G();
                if (f3 || G3 == C0105l.f2272a) {
                    G3 = new C0825w(cVar);
                    c0113p.a0(G3);
                }
                C0825w c0825w = (C0825w) G3;
                c0113p.p(false);
                return c0825w;
            default:
                C0113p c0113p2 = (C0113p) obj2;
                ((Number) obj3).intValue();
                c0113p2.Q(-1415685722);
                U u3 = (U) this.f5455f;
                boolean f4 = c0113p2.f(u3);
                Object G4 = c0113p2.G();
                if (f4 || G4 == C0105l.f2272a) {
                    G4 = new C0790B(u3);
                    c0113p2.a0(G4);
                }
                C0790B c0790b = (C0790B) G4;
                c0113p2.p(false);
                return c0790b;
        }
    }
}
