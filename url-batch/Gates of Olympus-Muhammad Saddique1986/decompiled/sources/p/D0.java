package p;

import a0.C0238c;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import n0.C0700A;
import n0.EnumC0712j;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class D0 extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7497f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f7499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X1.i f7500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2.k f7501j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f7502k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D0(InterfaceC0835w interfaceC0835w, InterfaceC0427f interfaceC0427f, InterfaceC0424c interfaceC0424c, T t3, V1.d dVar) {
        super(2, dVar);
        this.f7499h = interfaceC0835w;
        this.f7500i = (X1.i) interfaceC0427f;
        this.f7501j = (f2.k) interfaceC0424c;
        this.f7502k = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((D0) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X1.i, e2.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e2.c, f2.k] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        ?? r3 = this.f7501j;
        T t3 = this.f7502k;
        D0 d02 = new D0(this.f7499h, this.f7500i, r3, t3, dVar);
        d02.f7498g = obj;
        return d02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /* JADX WARN: Type inference failed for: r0v2, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X1.i, e2.f] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        n0.s sVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7497f;
        T t3 = this.f7502k;
        InterfaceC0835w interfaceC0835w = this.f7499h;
        if (i3 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f7498g;
            AbstractC0837y.r(interfaceC0835w, null, null, new z0(t3, null), 3);
            this.f7498g = c0700a;
            this.f7497f = 1;
            obj = U0.b(c0700a, (r3 & 1) != 0, EnumC0712j.f7296e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                sVar = (n0.s) obj;
                if (sVar != null) {
                    AbstractC0837y.r(interfaceC0835w, null, null, new B0(t3, null), 3);
                } else {
                    sVar.a();
                    AbstractC0837y.r(interfaceC0835w, null, null, new C0(t3, null), 3);
                    this.f7501j.n(new C0238c(sVar.f7310c));
                }
                return R1.y.f4171a;
            }
            c0700a = (C0700A) this.f7498g;
            R1.a.e(obj);
        }
        n0.s sVar2 = (n0.s) obj;
        sVar2.a();
        L l3 = U0.f7613a;
        ?? r8 = this.f7500i;
        if (r8 != l3) {
            AbstractC0837y.r(interfaceC0835w, null, null, new A0(r8, t3, sVar2, null), 3);
        }
        this.f7498g = null;
        this.f7497f = 2;
        obj = U0.d(c0700a, EnumC0712j.f7296e, this);
        if (obj == aVar) {
            return aVar;
        }
        sVar = (n0.s) obj;
        if (sVar != null) {
        }
        return R1.y.f4171a;
    }
}
