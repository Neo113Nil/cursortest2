package m;

import I.InterfaceC0142c0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0619d f6790j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f6791k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f6792l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621f(Object obj, C0619d c0619d, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, V1.d dVar) {
        super(2, dVar);
        this.f6789i = obj;
        this.f6790j = c0619d;
        this.f6791k = interfaceC0142c0;
        this.f6792l = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0621f) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0621f(this.f6789i, this.f6790j, this.f6791k, this.f6792l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6788h;
        C0619d c0619d = this.f6790j;
        if (i3 == 0) {
            R1.a.e(obj);
            if (!f2.j.a(this.f6789i, c0619d.f6761e.getValue())) {
                W w2 = AbstractC0623h.f6803a;
                InterfaceC0627l interfaceC0627l = (InterfaceC0627l) this.f6791k.getValue();
                this.f6788h = 1;
                if (C0619d.c(this.f6790j, this.f6789i, interfaceC0627l, null, this, 12) == aVar) {
                    return aVar;
                }
            }
            return R1.y.f4171a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        R1.a.e(obj);
        W w3 = AbstractC0623h.f6803a;
        InterfaceC0424c interfaceC0424c = (InterfaceC0424c) this.f6792l.getValue();
        if (interfaceC0424c != null) {
            interfaceC0424c.n(c0619d.d());
        }
        return R1.y.f4171a;
    }
}
