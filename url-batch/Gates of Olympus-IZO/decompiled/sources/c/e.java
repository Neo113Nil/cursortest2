package c;

import I2.l;
import L1.z;
import R1.i;
import Z.r;
import Z1.p;
import k2.InterfaceC0550w;
import n2.C0696b;
import n2.C0705k;

/* loaded from: classes.dex */
public final class e extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public p f4326e;

    /* renamed from: f, reason: collision with root package name */
    public int f4327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f4328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f4329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f4330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Y1.e eVar, r rVar, P1.d dVar) {
        super(2, dVar);
        this.f4328g = fVar;
        this.f4329h = eVar;
        this.f4330i = rVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new e(this.f4328g, this.f4329h, this.f4330i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((e) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4327f;
        boolean z3 = true;
        if (i3 == 0) {
            l.Q(obj);
            if (this.f4328g.f4200a) {
                p pVar2 = new p();
                C0705k c0705k = new C0705k(new C0696b((m2.e) this.f4330i.f3454b, z3), new d(pVar2, null, 0));
                this.f4326e = pVar2;
                this.f4327f = 1;
                if (this.f4329h.g(c0705k, this) == aVar) {
                    return aVar;
                }
                pVar = pVar2;
            }
            return z.f2729a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pVar = this.f4326e;
        l.Q(obj);
        if (!pVar.f3476d) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return z.f2729a;
    }
}
