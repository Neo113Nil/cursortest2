package h1;

import F.C0090d0;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import t2.C1045P;
import t2.C1047S;
import t2.InterfaceC1054g;

/* renamed from: h1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504w extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0485c f6201h;

    /* renamed from: i, reason: collision with root package name */
    public int f6202i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6203j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f6204k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504w(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6204k = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0504w) o((V1.d) obj2, (InterfaceC1054g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0504w c0504w = new C0504w(this.f6204k, dVar);
        c0504w.f6203j = obj;
        return c0504w;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC1054g interfaceC1054g;
        X x3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6202i;
        R1.y yVar = R1.y.f4171a;
        M m3 = this.f6204k;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC1054g interfaceC1054g2 = (InterfaceC1054g) this.f6203j;
            this.f6203j = interfaceC1054g2;
            this.f6202i = 1;
            Object z3 = AbstractC0837y.z(m3.f6094f.q(), new C0481E(m3, null), this);
            if (z3 == aVar) {
                return aVar;
            }
            interfaceC1054g = interfaceC1054g2;
            obj = z3;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        R1.a.e(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x3 = this.f6201h;
                interfaceC1054g = (InterfaceC1054g) this.f6203j;
                R1.a.e(obj);
                G.h hVar = new G.h((C1045P) m3.f6098j.f334d, 4, new C0501t(2, null));
                C0502u c0502u = new C0502u(x3, null);
                this.f6203j = null;
                this.f6201h = null;
                this.f6202i = 3;
                if (!(interfaceC1054g instanceof C1047S)) {
                    throw ((C1047S) interfaceC1054g).f9006d;
                }
                Object d3 = hVar.d(new C0090d0(new f2.q(), new H1.b(interfaceC1054g, 3), c0502u), this);
                if (d3 != aVar) {
                    d3 = yVar;
                }
                if (d3 != aVar) {
                    d3 = yVar;
                }
                if (d3 != aVar) {
                    d3 = yVar;
                }
                return d3 == aVar ? aVar : yVar;
            }
            InterfaceC1054g interfaceC1054g3 = (InterfaceC1054g) this.f6203j;
            R1.a.e(obj);
            interfaceC1054g = interfaceC1054g3;
        }
        x3 = (X) obj;
        if (x3 instanceof C0485c) {
            Object obj2 = ((C0485c) x3).f6137b;
            this.f6203j = interfaceC1054g;
            this.f6201h = (C0485c) x3;
            this.f6202i = 2;
            if (interfaceC1054g.e(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (x3 instanceof Z) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (x3 instanceof P) {
                throw ((P) x3).f6108b;
            }
            if (x3 instanceof N) {
                return yVar;
            }
        }
        G.h hVar2 = new G.h((C1045P) m3.f6098j.f334d, 4, new C0501t(2, null));
        C0502u c0502u2 = new C0502u(x3, null);
        this.f6203j = null;
        this.f6201h = null;
        this.f6202i = 3;
        if (!(interfaceC1054g instanceof C1047S)) {
        }
    }
}
