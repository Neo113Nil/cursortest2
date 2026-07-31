package m1;

import I.C0112o0;
import I.S0;
import I2.l;
import L1.z;
import R1.i;
import k2.InterfaceC0550w;
import n2.InterfaceC0690O;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621a extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0690O f5915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0112o0 f5916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621a(InterfaceC0690O interfaceC0690O, C0112o0 c0112o0, P1.d dVar) {
        super(2, dVar);
        this.f5915f = interfaceC0690O;
        this.f5916g = c0112o0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0621a(this.f5915f, this.f5916g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0621a) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5914e;
        if (i3 == 0) {
            l.Q(obj);
            S0 s02 = new S0(this.f5916g, 3);
            this.f5914e = 1;
            if (this.f5915f.collect(s02, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return z.f2729a;
    }
}
