package P;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class r extends X5.j implements e6.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2151d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f2152e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2153i;

    public /* synthetic */ r(int i2, V5.b bVar) {
        super(i2, bVar);
    }

    @Override // e6.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2151d) {
            case 0:
                return new r((Q) this.f2153i, (V5.b) obj3).invokeSuspend(Unit.f6114a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (V5.b) obj3);
                rVar.f2153i = (T) obj;
                return rVar.invokeSuspend(Unit.f6114a);
        }
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2151d) {
            case 0:
                W5.a aVar = W5.a.f2787d;
                int i2 = this.f2152e;
                if (i2 == 0) {
                    V6.b.P(obj);
                    Q q4 = (Q) this.f2153i;
                    this.f2152e = 1;
                    if (Q.b(q4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Unit.f6114a;
            default:
                W5.a aVar2 = W5.a.f2787d;
                int i5 = this.f2152e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return obj;
                }
                V6.b.P(obj);
                T t6 = (T) this.f2153i;
                this.f2152e = 1;
                t6.getClass();
                Object a7 = T.a(t6, this);
                return a7 == aVar2 ? aVar2 : a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q q4, V5.b bVar) {
        super(3, bVar);
        this.f2153i = q4;
    }
}
