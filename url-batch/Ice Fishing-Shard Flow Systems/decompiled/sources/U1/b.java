package U1;

import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f2714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, V5.b bVar) {
        super(2, bVar);
        this.f2714e = function1;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        b bVar2 = new b(this.f2714e, bVar);
        bVar2.f2713d = obj;
        return bVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        this.f2714e.invoke((T.b) this.f2713d);
        return Unit.f6114a;
    }
}
