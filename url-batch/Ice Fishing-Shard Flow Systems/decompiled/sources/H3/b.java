package H3;

import P0.l;
import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class b extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f959e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Thread f960i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Throwable f961l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Thread thread, Throwable th, V5.b bVar) {
        super(2, bVar);
        this.f959e = cVar;
        this.f960i = thread;
        this.f961l = th;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new b(this.f959e, this.f960i, this.f961l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f958d;
        if (i2 == 0) {
            V6.b.P(obj);
            l lVar = this.f959e.f962a;
            this.f958d = 1;
            if (lVar.d(this.f960i, this.f961l, this) == aVar) {
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
