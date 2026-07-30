package y4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class G extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f8552e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8553i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f8554l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k7, String str, String str2, V5.b bVar) {
        super(2, bVar);
        this.f8552e = k7;
        this.f8553i = str;
        this.f8554l = str2;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new G(this.f8552e, this.f8553i, this.f8554l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8551d;
        if (i2 == 0) {
            V6.b.P(obj);
            this.f8551d = 1;
            if (K.a(this.f8552e, this.f8553i, this.f8554l, this) == aVar) {
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
