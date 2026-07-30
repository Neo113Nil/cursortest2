package U1;

import X5.j;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;
import q6.w;

/* loaded from: classes.dex */
public final class d extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, V5.b bVar) {
        super(2, bVar);
        this.f2719e = hVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new d(this.f2719e, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Map a7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2718d;
        if (i2 == 0) {
            V6.b.P(obj);
            q6.d data = this.f2719e.f2733c.getData();
            this.f2718d = 1;
            obj = w.d(data, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        T.b bVar = (T.b) obj;
        return (bVar == null || (a7 = bVar.a()) == null) ? I.c() : a7;
    }
}
