package m;

import e2.InterfaceC0424c;
import java.util.concurrent.CancellationException;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617b extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public C0628m f6720h;

    /* renamed from: i, reason: collision with root package name */
    public f2.q f6721i;

    /* renamed from: j, reason: collision with root package name */
    public int f6722j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0619d f6723k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f6725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f6727o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617b(C0619d c0619d, Object obj, d0 d0Var, long j3, InterfaceC0424c interfaceC0424c, V1.d dVar) {
        super(1, dVar);
        this.f6723k = c0619d;
        this.f6724l = obj;
        this.f6725m = d0Var;
        this.f6726n = j3;
        this.f6727o = interfaceC0424c;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        d0 d0Var = this.f6725m;
        return new C0617b(this.f6723k, this.f6724l, d0Var, this.f6726n, this.f6727o, (V1.d) obj).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        f2.q qVar;
        C0628m c0628m;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6722j;
        int i4 = 1;
        C0619d c0619d = this.f6723k;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                c0619d.f6759c.f6850f = (r) c0619d.f6757a.f6889a.n(this.f6724l);
                d0 d0Var = this.f6725m;
                c0619d.f6761e.setValue(d0Var.f6769c);
                c0619d.f6760d.setValue(Boolean.TRUE);
                C0628m c0628m2 = c0619d.f6759c;
                C0628m c0628m3 = new C0628m(c0628m2.f6848d, c0628m2.f6849e.getValue(), AbstractC0620e.f(c0628m2.f6850f), c0628m2.f6851g, Long.MIN_VALUE, c0628m2.f6853i);
                f2.q qVar2 = new f2.q();
                long j3 = this.f6726n;
                C0616a c0616a = new C0616a(c0619d, c0628m3, this.f6727o, qVar2, 0);
                this.f6720h = c0628m3;
                this.f6721i = qVar2;
                this.f6722j = 1;
                if (AbstractC0620e.b(c0628m3, d0Var, j3, c0616a, this) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                c0628m = c0628m3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = this.f6721i;
                c0628m = this.f6720h;
                R1.a.e(obj);
            }
            if (!qVar.f5828d) {
                i4 = 2;
            }
            C0619d.b(c0619d);
            return new K2.m(i4, 4, c0628m);
        } catch (CancellationException e3) {
            C0619d.b(c0619d);
            throw e3;
        }
    }
}
