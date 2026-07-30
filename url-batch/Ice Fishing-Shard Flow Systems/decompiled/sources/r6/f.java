package r6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7555d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7556e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f7557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, V5.b bVar) {
        super(2, bVar);
        this.f7557i = gVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        f fVar = new f(this.f7557i, bVar);
        fVar.f7556e = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((q6.e) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7555d;
        if (i2 == 0) {
            V6.b.P(obj);
            q6.e eVar = (q6.e) this.f7556e;
            this.f7555d = 1;
            if (this.f7557i.c(eVar, this) == aVar) {
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
