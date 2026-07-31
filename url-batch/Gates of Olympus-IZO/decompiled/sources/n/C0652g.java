package n;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import q.C0771f;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652g extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0667w f6084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652g(C0667w c0667w, P1.d dVar) {
        super(2, dVar);
        this.f6084e = c0667w;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0652g(this.f6084e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0652g c0652g = (C0652g) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0652g.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0667w c0667w = this.f6084e;
        if (c0667w.D == null) {
            C0771f c0771f = new C0771f();
            q.j jVar = c0667w.f6175s;
            if (jVar != null) {
                AbstractC0552y.q(c0667w.j0(), null, null, new C0646a(jVar, c0771f, null), 3);
            }
            c0667w.D = c0771f;
        }
        return L1.z.f2729a;
    }
}
