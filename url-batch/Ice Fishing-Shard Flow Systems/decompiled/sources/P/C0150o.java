package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150o extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f2142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150o(Q q4, V5.b bVar) {
        super(2, bVar);
        this.f2142e = q4;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new C0150o(this.f2142e, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0150o) create((q6.e) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2141d;
        if (i2 == 0) {
            V6.b.P(obj);
            this.f2141d = 1;
            if (Q.d(this.f2142e, this) == aVar) {
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
