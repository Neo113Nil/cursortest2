package n;

import k2.AbstractC0552y;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666v extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public int f6164e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ o.M f6165f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long f6166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0667w f6167h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666v(C0667w c0667w, P1.d dVar) {
        super(3, dVar);
        this.f6167h = c0667w;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        long j3 = ((a0.c) obj2).f3489a;
        C0666v c0666v = new C0666v(this.f6167h, (P1.d) obj3);
        c0666v.f6165f = (o.M) obj;
        c0666v.f6166g = j3;
        return c0666v.invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6164e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            o.M m3 = this.f6165f;
            long j3 = this.f6166g;
            C0667w c0667w = this.f6167h;
            if (c0667w.f6179w) {
                this.f6164e = 1;
                q.j jVar = c0667w.f6175s;
                if (jVar == null || (obj2 = AbstractC0552y.d(new C0649d(m3, j3, jVar, c0667w, null), this)) != aVar) {
                    obj2 = zVar;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
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
