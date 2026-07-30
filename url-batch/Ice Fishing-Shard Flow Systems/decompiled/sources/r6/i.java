package r6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class i extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f7560e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.e f7561i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7562l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, q6.e eVar, Object obj, V5.b bVar) {
        super(2, bVar);
        this.f7560e = mVar;
        this.f7561i = eVar;
        this.f7562l = obj;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new i(this.f7560e, this.f7561i, this.f7562l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7559d;
        if (i2 == 0) {
            V6.b.P(obj);
            q6.o oVar = this.f7560e.f7576m;
            this.f7559d = 1;
            if (oVar.invoke(this.f7561i, this.f7562l, this) == aVar) {
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
