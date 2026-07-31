package m;

import I.C0089d;
import I.InterfaceC0088c0;
import I.V0;
import k2.InterfaceC0550w;
import n2.AbstractC0682G;
import n2.C0677B;
import u0.C0981k0;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582G extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.q f5577e;

    /* renamed from: f, reason: collision with root package name */
    public int f5578f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0583H f5581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0582G(InterfaceC0088c0 interfaceC0088c0, C0583H c0583h, P1.d dVar) {
        super(2, dVar);
        this.f5580h = interfaceC0088c0;
        this.f5581i = c0583h;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0582G c0582g = new C0582G(this.f5580h, this.f5581i, dVar);
        c0582g.f5579g = obj;
        return c0582g;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((C0582G) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
        return Q1.a.f3113d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:6:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0090 -> B:6:0x003a). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0550w interfaceC0550w;
        Z1.q qVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5578f;
        if (i3 == 0) {
            I2.l.Q(obj);
            interfaceC0550w = (InterfaceC0550w) this.f5579g;
            qVar = new Z1.q();
            qVar.f3477d = 1.0f;
        } else if (i3 == 1) {
            qVar = this.f5577e;
            InterfaceC0550w interfaceC0550w2 = (InterfaceC0550w) this.f5579g;
            I2.l.Q(obj);
            interfaceC0550w = interfaceC0550w2;
            if (qVar.f3477d == 0.0f) {
                C0677B c0677b = new C0677B(new V0(new A2.l(21, interfaceC0550w), null));
                C0581F c0581f = new C0581F(2, null);
                this.f5579g = interfaceC0550w;
                this.f5577e = qVar;
                this.f5578f = 2;
                if (AbstractC0682G.j(c0677b, c0581f, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.f5577e;
            InterfaceC0550w interfaceC0550w3 = (InterfaceC0550w) this.f5579g;
            I2.l.Q(obj);
            interfaceC0550w = interfaceC0550w3;
        }
        C0587a c0587a = new C0587a(this.f5580h, this.f5581i, qVar, interfaceC0550w, 1);
        this.f5579g = interfaceC0550w;
        this.f5577e = qVar;
        this.f5578f = 1;
        if (getContext().k(C0981k0.f8358d) != null) {
            throw new ClassCastException();
        }
        if (C0089d.F(getContext()).j(c0587a, this) == aVar) {
            return aVar;
        }
        if (qVar.f3477d == 0.0f) {
        }
        C0587a c0587a2 = new C0587a(this.f5580h, this.f5581i, qVar, interfaceC0550w, 1);
        this.f5579g = interfaceC0550w;
        this.f5577e = qVar;
        this.f5578f = 1;
        if (getContext().k(C0981k0.f8358d) != null) {
        }
    }
}
