package r6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856d extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7549d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7550e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f7551i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0856d(e eVar, V5.b bVar) {
        super(2, bVar);
        this.f7551i = eVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0856d c0856d = new C0856d(this.f7551i, bVar);
        c0856d.f7550e = obj;
        return c0856d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0856d) create((p6.q) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7549d;
        if (i2 == 0) {
            V6.b.P(obj);
            p6.q qVar = (p6.q) this.f7550e;
            this.f7549d = 1;
            if (this.f7551i.a(qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return Unit.f6114a;
    }
}
