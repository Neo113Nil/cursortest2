package n;

import k2.InterfaceC0550w;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651f extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0667w f6081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.l f6082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651f(C0667w c0667w, q.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f6081f = c0667w;
        this.f6082g = lVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0651f(this.f6081f, this.f6082g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0651f) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6080e;
        if (i3 == 0) {
            I2.l.Q(obj);
            q.j jVar = this.f6081f.f6175s;
            if (jVar != null) {
                q.m mVar = new q.m(this.f6082g);
                this.f6080e = 1;
                if (jVar.b(mVar, this) == aVar) {
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
