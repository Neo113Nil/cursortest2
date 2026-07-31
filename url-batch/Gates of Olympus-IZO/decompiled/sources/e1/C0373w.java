package e1;

import k2.AbstractC0552y;
import n2.C0692Q;
import n2.C0694T;
import n2.InterfaceC0701g;

/* renamed from: e1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0354c f4748e;

    /* renamed from: f, reason: collision with root package name */
    public int f4749f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0373w(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4751h = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0373w c0373w = new C0373w(this.f4751h, dVar);
        c0373w.f4750g = obj;
        return c0373w;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0373w) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0701g interfaceC0701g;
        Y y3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4749f;
        L1.z zVar = L1.z.f2729a;
        C0351N c0351n = this.f4751h;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0701g interfaceC0701g2 = (InterfaceC0701g) this.f4750g;
            this.f4750g = interfaceC0701g2;
            this.f4749f = 1;
            Object y4 = AbstractC0552y.y(c0351n.f4641c.u(), new C0342E(c0351n, null), this);
            if (y4 == aVar) {
                return aVar;
            }
            interfaceC0701g = interfaceC0701g2;
            obj = y4;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        I2.l.Q(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y3 = this.f4748e;
                interfaceC0701g = (InterfaceC0701g) this.f4750g;
                I2.l.Q(obj);
                G.d dVar = new G.d((C0692Q) c0351n.f4645g.f83b, 3, new C0370t(2, null));
                C0371u c0371u = new C0371u(y3, null);
                this.f4750g = null;
                this.f4748e = null;
                this.f4749f = 3;
                if (!(interfaceC0701g instanceof C0694T)) {
                    throw ((C0694T) interfaceC0701g).f6323d;
                }
                Object collect = dVar.collect(new l.q(new Z1.p(), new G1.o(4, interfaceC0701g), c0371u), this);
                if (collect != aVar) {
                    collect = zVar;
                }
                if (collect != aVar) {
                    collect = zVar;
                }
                if (collect != aVar) {
                    collect = zVar;
                }
                return collect == aVar ? aVar : zVar;
            }
            InterfaceC0701g interfaceC0701g3 = (InterfaceC0701g) this.f4750g;
            I2.l.Q(obj);
            interfaceC0701g = interfaceC0701g3;
        }
        y3 = (Y) obj;
        if (y3 instanceof C0354c) {
            Object obj2 = ((C0354c) y3).f4682b;
            this.f4750g = interfaceC0701g;
            this.f4748e = (C0354c) y3;
            this.f4749f = 2;
            if (interfaceC0701g.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (y3 instanceof a0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (y3 instanceof Q) {
                throw ((Q) y3).f4655b;
            }
            if (y3 instanceof O) {
                return zVar;
            }
        }
        G.d dVar2 = new G.d((C0692Q) c0351n.f4645g.f83b, 3, new C0370t(2, null));
        C0371u c0371u2 = new C0371u(y3, null);
        this.f4750g = null;
        this.f4748e = null;
        this.f4749f = 3;
        if (!(interfaceC0701g instanceof C0694T)) {
        }
    }
}
