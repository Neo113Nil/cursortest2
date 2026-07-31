package m;

import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import s2.C0969c;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0969c f6796h;

    /* renamed from: i, reason: collision with root package name */
    public int f6797i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6798j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2.k f6799k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0619d f6800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f6801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f6802n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622g(s2.k kVar, C0619d c0619d, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, V1.d dVar) {
        super(2, dVar);
        this.f6799k = kVar;
        this.f6800l = c0619d;
        this.f6801m = interfaceC0142c0;
        this.f6802n = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0622g) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0622g c0622g = new C0622g(this.f6799k, this.f6800l, this.f6801m, this.f6802n, dVar);
        c0622g.f6798j = obj;
        return c0622g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0969c it;
        InterfaceC0835w interfaceC0835w;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6797i;
        s2.k kVar = this.f6799k;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w2 = (InterfaceC0835w) this.f6798j;
            it = kVar.iterator();
            interfaceC0835w = interfaceC0835w2;
            this.f6798j = interfaceC0835w;
            this.f6796h = it;
            this.f6797i = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f6796h;
            interfaceC0835w = (InterfaceC0835w) this.f6798j;
            R1.a.e(obj);
            if (((Boolean) obj).booleanValue()) {
                Object c2 = it.c();
                Object a3 = s2.n.a(kVar.o());
                Object obj2 = a3 == null ? c2 : a3;
                AbstractC0837y.r(interfaceC0835w, null, null, new C0621f(obj2, this.f6800l, this.f6801m, this.f6802n, null), 3);
                this.f6798j = interfaceC0835w;
                this.f6796h = it;
                this.f6797i = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return R1.y.f4171a;
                }
            }
        }
    }
}
