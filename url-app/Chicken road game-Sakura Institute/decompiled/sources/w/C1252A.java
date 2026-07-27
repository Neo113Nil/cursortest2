package w;

import W2.EnumC0303z;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* renamed from: w.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252A extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11009k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11012n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252A(C0802C c0802c, Y y4, A.a0 a0Var, C2.a aVar) {
        super(2, aVar);
        this.f11010l = c0802c;
        this.f11011m = y4;
        this.f11012n = a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1252A) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1252A c1252a = new C1252A(this.f11010l, this.f11011m, this.f11012n, aVar);
        c1252a.f11009k = obj;
        return c1252a;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f11009k;
        EnumC0303z enumC0303z = EnumC0303z.f4307j;
        C0802C c0802c = this.f11010l;
        W2.B.m(interfaceC0302y, null, enumC0303z, new C1284y(c0802c, this.f11011m, null), 1);
        W2.B.m(interfaceC0302y, null, enumC0303z, new C1285z(c0802c, this.f11012n, null), 1);
        return Unit.f7487a;
    }
}
