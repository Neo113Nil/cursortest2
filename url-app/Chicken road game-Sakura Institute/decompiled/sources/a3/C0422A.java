package a3;

import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422A extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4938k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0331g f4940m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0422A(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        super(2, aVar);
        this.f4940m = interfaceC0331g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0422A) j((C2.a) obj2, obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0422A c0422a = new C0422A(this.f4940m, aVar);
        c0422a.f4939l = obj;
        return c0422a;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4938k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Object obj2 = this.f4939l;
            this.f4938k = 1;
            if (this.f4940m.d(obj2, this) == aVar) {
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
