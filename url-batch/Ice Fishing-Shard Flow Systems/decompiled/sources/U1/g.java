package U1;

import P.InterfaceC0144i;
import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class g extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2727e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.d f2728i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f2729l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, T.d dVar, Long l7, V5.b bVar) {
        super(2, bVar);
        this.f2727e = hVar;
        this.f2728i = dVar;
        this.f2729l = l7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new g(this.f2727e, this.f2728i, this.f2729l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2726d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        InterfaceC0144i interfaceC0144i = this.f2727e.f2733c;
        f fVar = new f(this.f2728i, this.f2729l, null);
        this.f2726d = 1;
        Object m2 = d4.c.m(interfaceC0144i, fVar, this);
        return m2 == aVar ? aVar : m2;
    }
}
