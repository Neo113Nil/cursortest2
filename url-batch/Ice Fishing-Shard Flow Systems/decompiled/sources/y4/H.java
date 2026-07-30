package y4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class H extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.d f8556e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(T.d dVar, long j, V5.b bVar) {
        super(2, bVar);
        this.f8556e = dVar;
        this.f8557i = j;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        H h7 = new H(this.f8556e, this.f8557i, bVar);
        h7.f8555d = obj;
        return h7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        T.b bVar = (T.b) this.f8555d;
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        bVar.e(this.f8556e, new Long(this.f8557i));
        return Unit.f6114a;
    }
}
