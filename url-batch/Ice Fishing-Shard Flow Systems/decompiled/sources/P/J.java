package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class J extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f1990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X5.j f1991e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0139d f1992i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(Function2 function2, C0139d c0139d, V5.b bVar) {
        super(2, bVar);
        this.f1991e = (X5.j) function2;
        this.f1992i = c0139d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new J(this.f1991e, this.f1992i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1990d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        Object obj2 = this.f1992i.f2066b;
        this.f1990d = 1;
        Object invoke = this.f1991e.invoke(obj2, this);
        return invoke == aVar ? aVar : invoke;
    }
}
