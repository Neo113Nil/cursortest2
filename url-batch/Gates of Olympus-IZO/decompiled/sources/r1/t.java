package r1;

import E.C0025g;
import I.C0094f0;
import I.InterfaceC0088c0;
import java.util.List;
import java.util.concurrent.CancellationException;
import n2.InterfaceC0700f;
import q1.C0784h;

/* loaded from: classes.dex */
public final class t extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f7261e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0857i f7263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0094f0 f7264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7265i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7266j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0857i c0857i, C0094f0 c0094f0, InterfaceC0088c0 interfaceC0088c0, InterfaceC0088c0 interfaceC0088c02, P1.d dVar) {
        super(2, dVar);
        this.f7263g = c0857i;
        this.f7264h = c0094f0;
        this.f7265i = interfaceC0088c0;
        this.f7266j = interfaceC0088c02;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        t tVar = new t(this.f7263g, this.f7264h, this.f7265i, this.f7266j, dVar);
        tVar.f7262f = obj;
        return tVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((t) create((InterfaceC0700f) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        C0784h c0784h;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f7261e;
        C0857i c0857i = this.f7263g;
        InterfaceC0088c0 interfaceC0088c0 = this.f7266j;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                InterfaceC0700f interfaceC0700f = (InterfaceC0700f) this.f7262f;
                C0094f0 c0094f0 = this.f7264h;
                c0094f0.h(0.0f);
                InterfaceC0088c0 interfaceC0088c02 = this.f7265i;
                C0784h c0784h2 = (C0784h) M1.l.t0((List) interfaceC0088c02.getValue());
                Z1.i.c(c0784h2);
                c0857i.g(c0784h2);
                c0857i.g((C0784h) ((List) interfaceC0088c02.getValue()).get(((List) interfaceC0088c02.getValue()).size() - 2));
                C0025g c0025g = new C0025g(interfaceC0088c0, 5, c0094f0);
                this.f7262f = c0784h2;
                this.f7261e = 1;
                if (interfaceC0700f.collect(c0025g, this) == aVar) {
                    return aVar;
                }
                c0784h = c0784h2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0784h = (C0784h) this.f7262f;
                I2.l.Q(obj);
            }
            interfaceC0088c0.setValue(Boolean.FALSE);
            c0857i.e(c0784h, false);
        } catch (CancellationException unused) {
            interfaceC0088c0.setValue(Boolean.FALSE);
        }
        return L1.z.f2729a;
    }
}
