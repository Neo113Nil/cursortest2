package y4;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* renamed from: y4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044m extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f8602e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f8603i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044m(K k7, List list, V5.b bVar) {
        super(2, bVar);
        this.f8602e = k7;
        this.f8603i = list;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new C1044m(this.f8602e, this.f8603i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1044m) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8601d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        this.f8601d = 1;
        Object g7 = K.g(this.f8602e, this.f8603i, this);
        return g7 == aVar ? aVar : g7;
    }
}
