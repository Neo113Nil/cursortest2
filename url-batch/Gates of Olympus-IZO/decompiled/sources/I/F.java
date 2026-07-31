package I;

import h1.C0438i;
import j.C0503u;
import java.io.Serializable;
import r.C0800L;
import r.C0802N;
import r0.InterfaceC0831d;

/* loaded from: classes.dex */
public final class F extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g3, Q.b bVar, C0503u c0503u, int i3) {
        super(1);
        this.f2096e = 0;
        this.f2098g = g3;
        this.f2099h = bVar;
        this.f2100i = c0503u;
        this.f2097f = i3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f2096e) {
            case 0:
                if (obj == ((G) this.f2098g)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof S.x) {
                    int i3 = ((Q.b) this.f2099h).f3081a - this.f2097f;
                    C0503u c0503u = (C0503u) this.f2100i;
                    int c3 = c0503u.c(obj);
                    c0503u.f(Math.min(i3, c3 >= 0 ? c0503u.f5214c[c3] : Integer.MAX_VALUE), obj);
                }
                return L1.z.f2729a;
            case 1:
                InterfaceC0831d interfaceC0831d = (InterfaceC0831d) obj;
                boolean H3 = Z.c.H((Z.q) this.f2098g, (Z.q) this.f2099h, this.f2097f, (R.h) this.f2100i);
                Boolean valueOf = Boolean.valueOf(H3);
                if (H3 || !interfaceC0831d.a()) {
                    return valueOf;
                }
                return null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0831d interfaceC0831d2 = (InterfaceC0831d) obj;
                boolean G3 = Z.c.G(this.f2097f, (R.h) this.f2100i, (Z.q) this.f2098g, (a0.d) this.f2099h);
                Boolean valueOf2 = Boolean.valueOf(G3);
                if (G3 || !interfaceC0831d2.a()) {
                    return valueOf2;
                }
                return null;
            default:
                r0.G g3 = (r0.G) obj;
                r0.H[] hArr = (r0.H[]) this.f2098g;
                int length = hArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    r0.H h3 = hArr[i4];
                    Z1.i.c(h3);
                    boolean z3 = h3.r() instanceof C0800L;
                    C0802N c0802n = (C0802N) this.f2099h;
                    c0802n.getClass();
                    r0.G.d(g3, h3, ((int[]) this.f2100i)[i5], c0802n.f7015b.a(0, this.f2097f - h3.f7115e));
                    i4++;
                    i5++;
                }
                return L1.z.f2729a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(Object obj, Object obj2, int i3, Serializable serializable, int i4) {
        super(1);
        this.f2096e = i4;
        this.f2098g = obj;
        this.f2099h = obj2;
        this.f2097f = i3;
        this.f2100i = serializable;
    }
}
