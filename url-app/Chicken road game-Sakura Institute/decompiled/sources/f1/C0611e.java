package f1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6568k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f6570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611e(List list, C2.a aVar) {
        super(2, aVar);
        this.f6570m = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0611e) j((C2.a) obj2, (C0618l) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0611e c0611e = new C0611e(this.f6570m, aVar);
        c0611e.f6569l = obj;
        return c0611e;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6568k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0618l c0618l = (C0618l) this.f6569l;
            this.f6568k = 1;
            if (j0.c.k(this.f6570m, c0618l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
