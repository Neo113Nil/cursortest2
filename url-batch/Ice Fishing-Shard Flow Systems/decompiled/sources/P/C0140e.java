package P;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140e extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2072d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2073e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2074i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140e(List list, V5.b bVar) {
        super(2, bVar);
        this.f2074i = list;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0140e c0140e = new C0140e(this.f2074i, bVar);
        c0140e.f2073e = obj;
        return c0140e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0140e) create((C0147l) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2072d;
        if (i2 == 0) {
            V6.b.P(obj);
            C0147l c0147l = (C0147l) this.f2073e;
            this.f2072d = 1;
            if (d4.c.e(this.f2074i, c0147l, this) == aVar) {
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
