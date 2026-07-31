package n;

import F.C0047j0;
import k2.AbstractC0552y;
import o.v0;
import o.x0;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654i extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6091e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0667w f6093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0654i(C0667w c0667w, P1.d dVar) {
        super(2, dVar);
        this.f6093g = c0667w;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0654i c0654i = new C0654i(this.f6093g, dVar);
        c0654i.f6092f = obj;
        return c0654i;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0654i) create((n0.v) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6091e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            n0.v vVar = (n0.v) this.f6092f;
            this.f6091e = 1;
            C0667w c0667w = this.f6093g;
            c0667w.getClass();
            C0666v c0666v = new C0666v(c0667w, null);
            C0047j0 c0047j0 = new C0047j0(21, c0667w);
            o.F f3 = x0.f6662a;
            Object d3 = AbstractC0552y.d(new v0(vVar, c0666v, c0047j0, new o.M(vVar), null), this);
            if (d3 != aVar) {
                d3 = zVar;
            }
            if (d3 != aVar) {
                d3 = zVar;
            }
            if (d3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
