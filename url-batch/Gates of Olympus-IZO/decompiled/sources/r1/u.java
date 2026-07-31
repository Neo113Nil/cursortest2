package r1;

import I.C0094f0;
import I.InterfaceC0088c0;
import java.util.List;
import k2.InterfaceC0550w;
import m.Z;
import q1.C0784h;

/* loaded from: classes.dex */
public final class u extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f7267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f7268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0094f0 f7270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Z z3, InterfaceC0088c0 interfaceC0088c0, C0094f0 c0094f0, P1.d dVar) {
        super(2, dVar);
        this.f7268f = z3;
        this.f7269g = interfaceC0088c0;
        this.f7270h = c0094f0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new u(this.f7268f, this.f7269g, this.f7270h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((u) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f7267e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0784h c0784h = (C0784h) ((List) this.f7269g.getValue()).get(((List) r4.getValue()).size() - 2);
            float g3 = this.f7270h.g();
            this.f7267e = 1;
            if (this.f7268f.m(g3, c0784h, this) == aVar) {
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
