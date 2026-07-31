package o;

import java.util.concurrent.CancellationException;
import k2.InterfaceC0550w;
import m.AbstractC0595e;
import m.C0587a;
import m.C0603m;
import m.C0604n;
import m.C0611v;
import m.C0612w;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736l extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.q f6567e;

    /* renamed from: f, reason: collision with root package name */
    public C0603m f6568f;

    /* renamed from: g, reason: collision with root package name */
    public int f6569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0737m f6571i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f6572j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736l(float f3, C0737m c0737m, j0 j0Var, P1.d dVar) {
        super(2, dVar);
        this.f6570h = f3;
        this.f6571i = c0737m;
        this.f6572j = j0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0736l(this.f6570h, this.f6571i, this.f6572j, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0736l) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        float f3;
        C0603m c0603m;
        C0603m c0603m2;
        Z1.q qVar;
        C0612w c0612w;
        C0587a c0587a;
        Object obj2 = Q1.a.f3113d;
        int i3 = this.f6569g;
        if (i3 == 0) {
            I2.l.Q(obj);
            f3 = this.f6570h;
            if (Math.abs(f3) > 1.0f) {
                Z1.q qVar2 = new Z1.q();
                qVar2.f3477d = f3;
                Z1.q qVar3 = new Z1.q();
                m.y0 y0Var = m.z0.f5885a;
                C0603m c0603m3 = new C0603m(y0Var, Float.valueOf(0.0f), new C0604n(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    C0737m c0737m = this.f6571i;
                    c0612w = c0737m.f6574a;
                    c0587a = new C0587a(qVar3, this.f6572j, qVar2, c0737m, 2);
                    this.f6567e = qVar2;
                    this.f6568f = c0603m3;
                    this.f6569g = 1;
                    c0603m = c0603m3;
                } catch (CancellationException unused) {
                    c0603m = c0603m3;
                }
                try {
                    Object b2 = AbstractC0595e.b(c0603m3, new C0611v(c0612w, y0Var, c0603m3.f5803e.getValue(), c0603m3.f5804f), Long.MIN_VALUE, c0587a, this);
                    if (b2 != obj2) {
                        b2 = L1.z.f2729a;
                    }
                    if (b2 == obj2) {
                        return obj2;
                    }
                    qVar = qVar2;
                } catch (CancellationException unused2) {
                    c0603m2 = c0603m;
                    qVar = qVar2;
                    qVar.f3477d = ((Number) c0603m2.f5802d.f5884b.j(c0603m2.f5804f)).floatValue();
                    f3 = qVar.f3477d;
                    return new Float(f3);
                }
            }
            return new Float(f3);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0603m2 = this.f6568f;
        qVar = this.f6567e;
        try {
            I2.l.Q(obj);
        } catch (CancellationException unused3) {
            qVar.f3477d = ((Number) c0603m2.f5802d.f5884b.j(c0603m2.f5804f)).floatValue();
            f3 = qVar.f3477d;
            return new Float(f3);
        }
        f3 = qVar.f3477d;
        return new Float(f3);
    }
}
