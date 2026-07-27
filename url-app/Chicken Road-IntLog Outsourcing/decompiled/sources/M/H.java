package M;

import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class H extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f1585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P p5, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1585b = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new H(this.f1585b, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1584a;
        P p5 = this.f1585b;
        try {
            if (i2 == 0) {
                e5.g.y(obj);
                if (p5.f1620h.f() instanceof b0) {
                    return p5.f1620h.f();
                }
                this.f1584a = 1;
                if (p5.h(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e5.g.y(obj);
                    return (k0) obj;
                }
                e5.g.y(obj);
            }
            this.f1584a = 2;
            obj = P.e(p5, false, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
            return (k0) obj;
        } catch (Throwable th) {
            return new d0(-1, th);
        }
    }
}
