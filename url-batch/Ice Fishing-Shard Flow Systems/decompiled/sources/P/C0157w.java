package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: P.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157w extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f2168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f2169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157w(H h7, V5.b bVar) {
        super(1, bVar);
        this.f2169e = h7;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new C0157w(this.f2169e, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0157w) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2168d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        this.f2168d = 1;
        Object invoke = this.f2169e.invoke(this);
        return invoke == aVar ? aVar : invoke;
    }
}
