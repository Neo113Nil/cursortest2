package m;

import W2.InterfaceC0302y;
import Z2.InterfaceC0330f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825A extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7994k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0826B f7995l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825A(C0826B c0826b, C2.a aVar) {
        super(2, aVar);
        this.f7995l = c0826b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0825A) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0825A(this.f7995l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7994k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            M2.C c4 = new M2.C();
            M2.C c5 = new M2.C();
            M2.C c6 = new M2.C();
            C0826B c0826b = this.f7995l;
            InterfaceC0330f a4 = c0826b.f7996t.a();
            a3.m mVar = new a3.m(c4, c5, c6, c0826b, 1);
            this.f7994k = 1;
            if (a4.e(mVar, this) == aVar) {
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
