package y4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: y4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043l extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.d f8599e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043l(T.d dVar, String str, V5.b bVar) {
        super(2, bVar);
        this.f8599e = dVar;
        this.f8600i = str;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C1043l c1043l = new C1043l(this.f8599e, this.f8600i, bVar);
        c1043l.f8598d = obj;
        return c1043l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1043l) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        T.b bVar = (T.b) this.f8598d;
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        bVar.e(this.f8599e, this.f8600i);
        return Unit.f6114a;
    }
}
