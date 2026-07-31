package m1;

import I.C0112o0;
import I.S0;
import I2.l;
import L1.z;
import P1.j;
import R1.i;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n2.InterfaceC0690O;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622b extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P1.i f5918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0690O f5919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0112o0 f5920h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622b(P1.i iVar, InterfaceC0690O interfaceC0690O, C0112o0 c0112o0, P1.d dVar) {
        super(2, dVar);
        this.f5918f = iVar;
        this.f5919g = interfaceC0690O;
        this.f5920h = c0112o0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0622b(this.f5918f, this.f5919g, this.f5920h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0622b) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5917e;
        if (i3 == 0) {
            l.Q(obj);
            j jVar = j.f3073d;
            P1.i iVar = this.f5918f;
            boolean a3 = Z1.i.a(iVar, jVar);
            C0112o0 c0112o0 = this.f5920h;
            InterfaceC0690O interfaceC0690O = this.f5919g;
            if (a3) {
                S0 s02 = new S0(c0112o0, 2);
                this.f5917e = 1;
                if (interfaceC0690O.collect(s02, this) == aVar) {
                    return aVar;
                }
            } else {
                C0621a c0621a = new C0621a(interfaceC0690O, c0112o0, null);
                this.f5917e = 2;
                if (AbstractC0552y.y(iVar, c0621a, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return z.f2729a;
    }
}
