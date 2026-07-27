package s;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m.b0;
import y2.AbstractC1343r;

/* renamed from: s.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088D extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f9880k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1089E f9881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1088D(C1089E c1089e, int i2, C2.a aVar) {
        super(2, aVar);
        this.f9881l = c1089e;
        this.f9882m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1088D) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1088D(this.f9881l, this.f9882m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f9880k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            r.d dVar = this.f9881l.f9885u;
            this.f9880k = 1;
            dVar.getClass();
            y.t tVar = r.v.f9550w;
            r.v vVar = dVar.f9450a;
            vVar.getClass();
            Object e4 = vVar.e(b0.f8079d, new r.s(vVar, this.f9882m, 0, null), this);
            if (e4 != aVar) {
                e4 = Unit.f7487a;
            }
            if (e4 != aVar) {
                e4 = Unit.f7487a;
            }
            if (e4 == aVar) {
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
