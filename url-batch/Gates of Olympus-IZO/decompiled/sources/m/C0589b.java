package m;

import java.util.concurrent.CancellationException;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589b extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public C0603m f5687e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.p f5688f;

    /* renamed from: g, reason: collision with root package name */
    public int f5689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0593d f5690h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5691i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f5692j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5693k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y1.c f5694l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589b(C0593d c0593d, Object obj, j0 j0Var, long j3, Y1.c cVar, P1.d dVar) {
        super(1, dVar);
        this.f5690h = c0593d;
        this.f5691i = obj;
        this.f5692j = j0Var;
        this.f5693k = j3;
        this.f5694l = cVar;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0589b(this.f5690h, this.f5691i, this.f5692j, this.f5693k, this.f5694l, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Z1.p pVar;
        C0603m c0603m;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5689g;
        int i4 = 1;
        C0593d c0593d = this.f5690h;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                c0593d.f5704c.f5804f = (r) c0593d.f5702a.f5883a.j(this.f5691i);
                j0 j0Var = this.f5692j;
                c0593d.f5706e.setValue(j0Var.f5779c);
                c0593d.f5705d.setValue(Boolean.TRUE);
                C0603m c0603m2 = c0593d.f5704c;
                C0603m c0603m3 = new C0603m(c0603m2.f5802d, c0603m2.f5803e.getValue(), AbstractC0595e.e(c0603m2.f5804f), c0603m2.f5805g, Long.MIN_VALUE, c0603m2.f5807i);
                Z1.p pVar2 = new Z1.p();
                long j3 = this.f5693k;
                C0587a c0587a = new C0587a(c0593d, c0603m3, this.f5694l, pVar2, 0);
                this.f5687e = c0603m3;
                this.f5688f = pVar2;
                this.f5689g = 1;
                if (AbstractC0595e.b(c0603m3, j0Var, j3, c0587a, this) == aVar) {
                    return aVar;
                }
                pVar = pVar2;
                c0603m = c0603m3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = this.f5688f;
                c0603m = this.f5687e;
                I2.l.Q(obj);
            }
            if (!pVar.f3476d) {
                i4 = 2;
            }
            C0593d.b(c0593d);
            return new E2.n(c0603m, i4, 4);
        } catch (CancellationException e3) {
            C0593d.b(c0593d);
            throw e3;
        }
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((C0589b) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
