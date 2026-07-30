package U1;

import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.d f2724e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f2725i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(T.d dVar, Long l7, V5.b bVar) {
        super(2, bVar);
        this.f2724e = dVar;
        this.f2725i = l7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        f fVar = new f(this.f2724e, this.f2725i, bVar);
        fVar.f2723d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        ((T.b) this.f2723d).e(this.f2724e, this.f2725i);
        return Unit.f6114a;
    }
}
