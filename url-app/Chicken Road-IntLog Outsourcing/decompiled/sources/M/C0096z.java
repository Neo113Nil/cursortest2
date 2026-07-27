package M;

import D4.C0013m;
import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096z extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f1775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096z(P p5, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1775b = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C0096z(this.f1775b, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0096z) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1774a;
        f4.v vVar = f4.v.f5689a;
        P p5 = this.f1775b;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1774a = 1;
            Object W5 = ((C0013m) p5.f1621i.f5637b).W(this);
            if (W5 != enumC1260a) {
                W5 = vVar;
            }
            if (W5 == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    e5.g.y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        G4.d b6 = G4.x.b(p5.g().f1708c, -1);
        G4.q qVar = new G4.q(1, p5);
        this.f1774a = 2;
        return b6.i(qVar, this) == enumC1260a ? enumC1260a : vVar;
    }
}
