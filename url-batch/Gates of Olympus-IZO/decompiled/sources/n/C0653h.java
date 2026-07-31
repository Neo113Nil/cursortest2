package n;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import q.C0771f;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653h extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0667w f6087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0653h(C0667w c0667w, P1.d dVar) {
        super(2, dVar);
        this.f6087e = c0667w;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0653h(this.f6087e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0653h c0653h = (C0653h) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0653h.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0667w c0667w = this.f6087e;
        C0771f c0771f = c0667w.D;
        if (c0771f != null) {
            q.g gVar = new q.g(c0771f);
            q.j jVar = c0667w.f6175s;
            if (jVar != null) {
                AbstractC0552y.q(c0667w.j0(), null, null, new C0647b(jVar, gVar, null), 3);
            }
            c0667w.D = null;
        }
        return L1.z.f2729a;
    }
}
