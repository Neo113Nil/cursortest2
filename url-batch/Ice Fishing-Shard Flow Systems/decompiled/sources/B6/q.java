package B6;

import R5.AbstractC0162b;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class q extends X5.i implements e6.n {

    /* renamed from: e, reason: collision with root package name */
    public int f235e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ AbstractC0162b f236i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, V5.b bVar) {
        super(bVar);
        this.f237l = pVar;
    }

    @Override // e6.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f237l, (V5.b) obj3);
        qVar.f236i = (AbstractC0162b) obj;
        return qVar.invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        p pVar = this.f237l;
        v vVar = (v) pVar.f234c;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f235e;
        if (i2 == 0) {
            V6.b.P(obj);
            AbstractC0162b abstractC0162b = this.f236i;
            byte p7 = vVar.p();
            if (p7 == 1) {
                return pVar.g(true);
            }
            if (p7 == 0) {
                return pVar.g(false);
            }
            if (p7 != 6) {
                if (p7 == 8) {
                    return pVar.f();
                }
                v.m(vVar, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f235e = 1;
            obj = p.a(pVar, abstractC0162b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return (A6.l) obj;
    }
}
