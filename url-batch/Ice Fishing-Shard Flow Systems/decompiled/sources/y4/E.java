package y4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class E extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.d f8545e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f8546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(T.d dVar, double d7, V5.b bVar) {
        super(2, bVar);
        this.f8545e = dVar;
        this.f8546i = d7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        E e7 = new E(this.f8545e, this.f8546i, bVar);
        e7.f8544d = obj;
        return e7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        T.b bVar = (T.b) this.f8544d;
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        bVar.e(this.f8545e, new Double(this.f8546i));
        return Unit.f6114a;
    }
}
