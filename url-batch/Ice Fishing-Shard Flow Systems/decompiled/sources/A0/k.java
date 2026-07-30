package A0;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p6.q;

/* loaded from: classes.dex */
public final class k extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f76d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f77e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f78i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f79l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, V5.b bVar2) {
        super(2, bVar2);
        this.f78i = bVar;
        this.f79l = activity;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        k kVar = new k(this.f78i, this.f79l, bVar);
        kVar.f77e = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((q) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f76d;
        if (i2 == 0) {
            V6.b.P(obj);
            q qVar = (q) this.f77e;
            i iVar = new i(0, qVar);
            b bVar = this.f78i;
            ((B0.a) bVar.f57e).b(this.f79l, new e0.c(0), iVar);
            j jVar = new j(bVar, 0, iVar);
            this.f76d = 1;
            if (p6.j.b(qVar, jVar, this) == aVar) {
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
