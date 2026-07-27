package p;

import A.M;
import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import Z2.InterfaceC0330f;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930f extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8968k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0934j f8969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f8970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0930f(InterfaceC0934j interfaceC0934j, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f8969l = interfaceC0934j;
        this.f8970m = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0930f) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0930f(this.f8969l, this.f8970m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8968k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC0330f a4 = this.f8969l.a();
            M m4 = new M(arrayList, 7, this.f8970m);
            this.f8968k = 1;
            if (a4.e(m4, this) == aVar) {
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
