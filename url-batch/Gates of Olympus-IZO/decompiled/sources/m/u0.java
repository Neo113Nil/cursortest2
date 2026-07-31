package m;

import k2.C0536h;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class u0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public s2.a f5862e;

    /* renamed from: f, reason: collision with root package name */
    public Z f5863f;

    /* renamed from: g, reason: collision with root package name */
    public int f5864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z f5865h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Z z3, P1.d dVar) {
        super(2, dVar);
        this.f5865h = z3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new u0(this.f5865h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((u0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [L1.g, java.lang.Object] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Z z3;
        Object obj2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5864g;
        if (i3 == 0) {
            I2.l.Q(obj);
            Z z4 = this.f5865h;
            z4.getClass();
            ((S.w) v0.f5874a.getValue()).b(z4, i0.f5757h, z4.f5665g);
            s2.c cVar = z4.f5668j;
            this.f5862e = cVar;
            this.f5863f = z4;
            this.f5864g = 1;
            if (cVar.c(null, this) == aVar) {
                return aVar;
            }
            z3 = z4;
            obj2 = cVar;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = this.f5863f;
            Object obj3 = this.f5862e;
            I2.l.Q(obj);
            obj2 = obj3;
        }
        try {
            z3.f5662d = z3.b();
            C0536h c0536h = z3.f5667i;
            if (c0536h != null) {
                c0536h.resumeWith(z3.b());
            }
            z3.f5667i = null;
            ((s2.c) obj2).e(null);
            return L1.z.f2729a;
        } catch (Throwable th) {
            ((s2.c) obj2).e(null);
            throw th;
        }
    }
}
