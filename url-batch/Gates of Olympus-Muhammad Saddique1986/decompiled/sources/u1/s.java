package u1;

import B.L;
import I.C0148f0;
import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import java.util.List;
import java.util.concurrent.CancellationException;
import t1.C1028h;
import t2.InterfaceC1053f;

/* loaded from: classes.dex */
public final class s extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9631h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9632i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f9633j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0148f0 f9634k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9635l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9636m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, C0148f0 c0148f0, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, V1.d dVar) {
        super(2, dVar);
        this.f9633j = iVar;
        this.f9634k = c0148f0;
        this.f9635l = interfaceC0142c0;
        this.f9636m = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((s) o((V1.d) obj2, (InterfaceC1053f) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        s sVar = new s(this.f9633j, this.f9634k, this.f9635l, this.f9636m, dVar);
        sVar.f9632i = obj;
        return sVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        C1028h c1028h;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9631h;
        i iVar = this.f9633j;
        InterfaceC0142c0 interfaceC0142c0 = this.f9636m;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                InterfaceC1053f interfaceC1053f = (InterfaceC1053f) this.f9632i;
                C0148f0 c0148f0 = this.f9634k;
                c0148f0.h(0.0f);
                InterfaceC0142c0 interfaceC0142c02 = this.f9635l;
                C1028h c1028h2 = (C1028h) S1.l.R0((List) interfaceC0142c02.getValue());
                f2.j.c(c1028h2);
                iVar.g(c1028h2);
                iVar.g((C1028h) ((List) interfaceC0142c02.getValue()).get(((List) interfaceC0142c02.getValue()).size() - 2));
                L l3 = new L(interfaceC0142c0, 8, c0148f0);
                this.f9632i = c1028h2;
                this.f9631h = 1;
                if (interfaceC1053f.d(l3, this) == aVar) {
                    return aVar;
                }
                c1028h = c1028h2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1028h = (C1028h) this.f9632i;
                R1.a.e(obj);
            }
            interfaceC0142c0.setValue(Boolean.FALSE);
            iVar.e(c1028h, false);
        } catch (CancellationException unused) {
            interfaceC0142c0.setValue(Boolean.FALSE);
        }
        return R1.y.f4171a;
    }
}
