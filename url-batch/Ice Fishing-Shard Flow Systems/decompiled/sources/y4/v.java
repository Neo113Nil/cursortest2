package y4;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class v extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f8635e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f8636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(K k7, List list, V5.b bVar) {
        super(2, bVar);
        this.f8635e = k7;
        this.f8636i = list;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new v(this.f8635e, this.f8636i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8634d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        this.f8634d = 1;
        Object g7 = K.g(this.f8635e, this.f8636i, this);
        return g7 == aVar ? aVar : g7;
    }
}
