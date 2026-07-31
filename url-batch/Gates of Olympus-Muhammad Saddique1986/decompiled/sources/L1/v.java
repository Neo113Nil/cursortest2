package L1;

import e2.InterfaceC0426e;
import l1.C0593b;
import l1.C0595d;

/* loaded from: classes.dex */
public final class v extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f3393i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3394j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3395k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A a3, String str, String str2, V1.d dVar) {
        super(2, dVar);
        this.f3393i = a3;
        this.f3394j = str;
        this.f3395k = str2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        v vVar = (v) o((V1.d) obj2, (C0593b) obj);
        R1.y yVar = R1.y.f4171a;
        vVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        v vVar = new v(this.f3393i, this.f3394j, this.f3395k, dVar);
        vVar.f3392h = obj;
        return vVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0593b c0593b = (C0593b) this.f3392h;
        A a3 = this.f3393i;
        C0595d c0595d = a3.f3344b;
        String str = this.f3394j;
        c0593b.getClass();
        f2.j.f(c0595d, "key");
        c0593b.c(c0595d, str);
        String str2 = this.f3395k;
        if (str2 != null && str2.length() != 0) {
            C0595d c0595d2 = a3.f3345c;
            f2.j.f(c0595d2, "key");
            c0593b.c(c0595d2, str2);
        }
        return R1.y.f4171a;
    }
}
