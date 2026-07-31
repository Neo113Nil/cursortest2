package o;

import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734j extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6542e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0735k f6544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A0 f6545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0728d f6546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734j(C0735k c0735k, A0 a02, InterfaceC0728d interfaceC0728d, P1.d dVar) {
        super(2, dVar);
        this.f6544g = c0735k;
        this.f6545h = a02;
        this.f6546i = interfaceC0728d;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0734j c0734j = new C0734j(this.f6544g, this.f6545h, this.f6546i, dVar);
        c0734j.f6543f = obj;
        return c0734j;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0734j) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6542e;
        C0735k c0735k = this.f6544g;
        try {
            try {
                if (i3 == 0) {
                    I2.l.Q(obj);
                    k2.X j3 = AbstractC0552y.j(((InterfaceC0550w) this.f6543f).u());
                    c0735k.f6558z = true;
                    o0 o0Var = c0735k.f6550r;
                    n.X x3 = n.X.f6036d;
                    C0733i c0733i = new C0733i(this.f6545h, c0735k, this.f6546i, j3, null);
                    this.f6542e = 1;
                    if (o0Var.e(x3, c0733i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I2.l.Q(obj);
                }
                c0735k.f6553u.e();
                c0735k.f6558z = false;
                c0735k.f6553u.b(null);
                c0735k.f6556x = false;
                return L1.z.f2729a;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            c0735k.f6558z = false;
            c0735k.f6553u.b(null);
            c0735k.f6556x = false;
            throw th;
        }
    }
}
