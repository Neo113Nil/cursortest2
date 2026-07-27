package H4;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class e extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1169a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1171c = fVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        e eVar = new e(this.f1171c, interfaceC1218d);
        eVar.f1170b = obj;
        return eVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F4.q) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1169a;
        if (i2 == 0) {
            e5.g.y(obj);
            F4.q qVar = (F4.q) this.f1170b;
            this.f1169a = 1;
            if (this.f1171c.b(qVar, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return f4.v.f5689a;
    }
}
