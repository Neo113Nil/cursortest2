package r6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class l extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7572d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7573e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f7574i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.e f7575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, q6.e eVar, V5.b bVar) {
        super(2, bVar);
        this.f7574i = mVar;
        this.f7575l = eVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        l lVar = new l(this.f7574i, this.f7575l, bVar);
        lVar.f7573e = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7572d;
        if (i2 == 0) {
            V6.b.P(obj);
            InterfaceC0789w interfaceC0789w = (InterfaceC0789w) this.f7573e;
            D d7 = new D();
            m mVar = this.f7574i;
            q6.d dVar = mVar.f7558l;
            k kVar = new k(d7, interfaceC0789w, mVar, this.f7575l);
            this.f7572d = 1;
            if (dVar.e(kVar, this) == aVar) {
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
