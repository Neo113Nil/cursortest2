package o2;

import k2.InterfaceC0550w;
import n.C0670z;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class m extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6723e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f6725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f6726h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0701g interfaceC0701g, P1.d dVar) {
        super(2, dVar);
        this.f6725g = nVar;
        this.f6726h = interfaceC0701g;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        m mVar = new m(this.f6725g, this.f6726h, dVar);
        mVar.f6724f = obj;
        return mVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((m) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6723e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f6724f;
            Z1.t tVar = new Z1.t();
            n nVar = this.f6725g;
            InterfaceC0700f interfaceC0700f = nVar.f6713g;
            C0670z c0670z = new C0670z(tVar, interfaceC0550w, nVar, this.f6726h, 1);
            this.f6723e = 1;
            if (interfaceC0700f.collect(c0670z, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
