package r6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7594d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7595e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.e f7596i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q6.e eVar, V5.b bVar) {
        super(2, bVar);
        this.f7596i = eVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        z zVar = new z(this.f7596i, bVar);
        zVar.f7595e = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create(obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7594d;
        if (i2 == 0) {
            V6.b.P(obj);
            Object obj2 = this.f7595e;
            this.f7594d = 1;
            if (this.f7596i.a(obj2, this) == aVar) {
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
