package M;

import D4.AbstractC0024y;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091u extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public C0075d f1752a;

    /* renamed from: b, reason: collision with root package name */
    public int f1753b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091u(P p5, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1755d = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0091u c0091u = new C0091u(this.f1755d, interfaceC1218d);
        c0091u.f1754c = obj;
        return c0091u;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0091u) create((G4.e) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        G4.e eVar;
        k0 k0Var;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1753b;
        f4.v vVar = f4.v.f5689a;
        P p5 = this.f1755d;
        if (i2 == 0) {
            e5.g.y(obj);
            G4.e eVar2 = (G4.e) this.f1754c;
            this.f1754c = eVar2;
            this.f1753b = 1;
            Object w3 = AbstractC0024y.w(p5.f1615c.g(), new H(p5, null), this);
            if (w3 == enumC1260a) {
                return enumC1260a;
            }
            eVar = eVar2;
            obj = w3;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        e5.g.y(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = this.f1752a;
                eVar = (G4.e) this.f1754c;
                e5.g.y(obj);
                G4.i iVar = new G4.i(new B1.g(22, new B0.e(new B0.l(new B0.c(new C0086o(p5, null), 4, (G4.w) p5.f1620h.f5783b), 4, new C0087p(2, null)), 4, new C0088q(k0Var, null))), new r(p5, (InterfaceC1218d) null));
                this.f1754c = null;
                this.f1752a = null;
                this.f1753b = 3;
                if (!(eVar instanceof G4.z)) {
                    throw ((G4.z) eVar).f1119a;
                }
                Object i3 = iVar.i(eVar, this);
                if (i3 != enumC1260a) {
                    i3 = vVar;
                }
                return i3 == enumC1260a ? enumC1260a : vVar;
            }
            G4.e eVar3 = (G4.e) this.f1754c;
            e5.g.y(obj);
            eVar = eVar3;
        }
        k0Var = (k0) obj;
        if (k0Var instanceof C0075d) {
            Object obj2 = ((C0075d) k0Var).f1667b;
            this.f1754c = eVar;
            this.f1752a = (C0075d) k0Var;
            this.f1753b = 2;
            if (eVar.b(obj2, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (k0Var instanceof l0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (k0Var instanceof d0) {
                throw ((d0) k0Var).f1669b;
            }
            if (k0Var instanceof b0) {
                return vVar;
            }
        }
        G4.i iVar2 = new G4.i(new B1.g(22, new B0.e(new B0.l(new B0.c(new C0086o(p5, null), 4, (G4.w) p5.f1620h.f5783b), 4, new C0087p(2, null)), 4, new C0088q(k0Var, null))), new r(p5, (InterfaceC1218d) null));
        this.f1754c = null;
        this.f1752a = null;
        this.f1753b = 3;
        if (!(eVar instanceof G4.z)) {
        }
    }
}
