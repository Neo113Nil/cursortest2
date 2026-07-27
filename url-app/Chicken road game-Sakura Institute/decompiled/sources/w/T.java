package w;

import W2.EnumC0303z;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class T extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11085k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11087m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C0802C c0802c, Y y4, C2.a aVar) {
        super(2, aVar);
        this.f11086l = c0802c;
        this.f11087m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((T) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        T t4 = new T(this.f11086l, this.f11087m, aVar);
        t4.f11085k = obj;
        return t4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f11085k;
        EnumC0303z enumC0303z = EnumC0303z.f4307j;
        C0802C c0802c = this.f11086l;
        Y y4 = this.f11087m;
        W2.B.m(interfaceC0302y, null, enumC0303z, new Q(c0802c, y4, null), 1);
        return W2.B.m(interfaceC0302y, null, enumC0303z, new S(c0802c, y4, null), 1);
    }
}
