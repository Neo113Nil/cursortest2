package p;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class J extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public f2.u f7538h;

    /* renamed from: i, reason: collision with root package name */
    public int f7539i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7540j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2.u f7541k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7542l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(f2.u uVar, C0776m0 c0776m0, V1.d dVar) {
        super(2, dVar);
        this.f7541k = uVar;
        this.f7542l = c0776m0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((J) o((V1.d) obj2, (InterfaceC0424c) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        J j3 = new J(this.f7541k, this.f7542l, dVar);
        j3.f7540j = obj;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC0424c interfaceC0424c;
        Object obj2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7539i;
        if (i3 == 0) {
            R1.a.e(obj);
            interfaceC0424c = (InterfaceC0424c) this.f7540j;
            r1 = this.f7541k;
            obj2 = r1.f5832d;
            if (obj2 instanceof C0790u) {
            }
            return R1.y.f4171a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f2.u uVar = this.f7538h;
        interfaceC0424c = (InterfaceC0424c) this.f7540j;
        R1.a.e(obj);
        AbstractC0792v abstractC0792v = (AbstractC0792v) obj;
        uVar.f5832d = abstractC0792v;
        uVar = this.f7541k;
        obj2 = uVar.f5832d;
        if (!(obj2 instanceof C0790u) || (obj2 instanceof r)) {
            return R1.y.f4171a;
        }
        abstractC0792v = null;
        C0786s c0786s = obj2 instanceof C0786s ? (C0786s) obj2 : null;
        if (c0786s != null) {
            interfaceC0424c.n(c0786s);
        }
        s2.g gVar = this.f7542l.f7730w;
        if (gVar != null) {
            this.f7540j = interfaceC0424c;
            this.f7538h = uVar;
            this.f7539i = 1;
            obj = gVar.i(this);
            if (obj == aVar) {
                return aVar;
            }
            AbstractC0792v abstractC0792v2 = (AbstractC0792v) obj;
        }
        uVar.f5832d = abstractC0792v2;
        uVar = this.f7541k;
        obj2 = uVar.f5832d;
        if (obj2 instanceof C0790u) {
        }
        return R1.y.f4171a;
    }
}
