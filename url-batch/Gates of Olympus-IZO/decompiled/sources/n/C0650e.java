package n;

import k2.InterfaceC0550w;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650e extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0667w f6078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.l f6079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650e(C0667w c0667w, q.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f6078f = c0667w;
        this.f6079g = lVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0650e(this.f6078f, this.f6079g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0650e) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6077e;
        if (i3 == 0) {
            I2.l.Q(obj);
            q.j jVar = this.f6078f.f6175s;
            if (jVar != null) {
                this.f6077e = 1;
                if (jVar.b(this.f6079g, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
