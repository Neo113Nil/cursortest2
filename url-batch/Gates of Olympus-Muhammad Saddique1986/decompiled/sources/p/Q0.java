package p;

import a0.C0238c;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n0.C0700A;
import n0.EnumC0712j;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class Q0 extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7575f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f7577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7579j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2.u f7580k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f7581l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(InterfaceC0835w interfaceC0835w, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, f2.u uVar, T t3, V1.d dVar) {
        super(2, dVar);
        this.f7577h = interfaceC0835w;
        this.f7578i = interfaceC0424c;
        this.f7579j = interfaceC0424c2;
        this.f7580k = uVar;
        this.f7581l = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((Q0) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        Q0 q0 = new Q0(this.f7577h, this.f7578i, this.f7579j, this.f7580k, this.f7581l, dVar);
        q0.f7576g = obj;
        return q0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7575f;
        if (i3 == 0) {
            R1.a.e(obj);
            C0700A c0700a = (C0700A) this.f7576g;
            this.f7575f = 1;
            obj = U0.d(c0700a, EnumC0712j.f7296e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        n0.s sVar = (n0.s) obj;
        R1.y yVar = R1.y.f4171a;
        T t3 = this.f7581l;
        InterfaceC0835w interfaceC0835w = this.f7577h;
        if (sVar != null) {
            sVar.a();
            AbstractC0837y.r(interfaceC0835w, null, null, new O0(t3, null), 3);
            this.f7578i.n(new C0238c(sVar.f7310c));
            return yVar;
        }
        AbstractC0837y.r(interfaceC0835w, null, null, new P0(t3, null), 3);
        InterfaceC0424c interfaceC0424c = this.f7579j;
        if (interfaceC0424c == null) {
            return null;
        }
        interfaceC0424c.n(new C0238c(((n0.s) this.f7580k.f5832d).f7310c));
        return yVar;
    }
}
