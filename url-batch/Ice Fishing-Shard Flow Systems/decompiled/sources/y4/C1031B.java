package y4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: y4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031B extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.d f8534e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8535i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031B(T.d dVar, boolean z7, V5.b bVar) {
        super(2, bVar);
        this.f8534e = dVar;
        this.f8535i = z7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C1031B c1031b = new C1031B(this.f8534e, this.f8535i, bVar);
        c1031b.f8533d = obj;
        return c1031b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1031B) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        T.b bVar = (T.b) this.f8533d;
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        bVar.e(this.f8534e, Boolean.valueOf(this.f8535i));
        return Unit.f6114a;
    }
}
