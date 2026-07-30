package y0;

import P.C0160z;
import V5.b;
import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;
import q6.d;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022a extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f8526e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H.a f8527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022a(d dVar, H.a aVar, b bVar) {
        super(2, bVar);
        this.f8526e = dVar;
        this.f8527i = aVar;
    }

    @Override // X5.a
    public final b create(Object obj, b bVar) {
        return new C1022a(this.f8526e, this.f8527i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1022a) create((InterfaceC0789w) obj, (b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8525d;
        if (i2 == 0) {
            V6.b.P(obj);
            C0160z c0160z = new C0160z(2, this.f8527i);
            this.f8525d = 1;
            if (this.f8526e.e(c0160z, this) == aVar) {
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
