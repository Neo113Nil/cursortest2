package e1;

import java.io.Serializable;

/* renamed from: e1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341D extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public Serializable f4603e;

    /* renamed from: f, reason: collision with root package name */
    public int f4604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z1.t f4605g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4606h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z1.r f4607i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341D(Z1.t tVar, C0351N c0351n, Z1.r rVar, P1.d dVar) {
        super(1, dVar);
        this.f4605g = tVar;
        this.f4606h = c0351n;
        this.f4607i = rVar;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0341D(this.f4605g, this.f4606h, this.f4607i, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Z1.t tVar;
        Z1.r rVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4604f;
        Z1.r rVar2 = this.f4607i;
        Z1.t tVar2 = this.f4605g;
        C0351N c0351n = this.f4606h;
        try {
        } catch (C0353b unused) {
            Object obj2 = tVar2.f3480d;
            this.f4603e = rVar2;
            this.f4604f = 3;
            obj = c0351n.i(obj2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f4603e = tVar2;
            this.f4604f = 1;
            obj = c0351n.f(this);
            if (obj == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    rVar = (Z1.r) this.f4603e;
                    I2.l.Q(obj);
                    rVar.f3478d = ((Number) obj).intValue();
                    return L1.z.f2729a;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (Z1.r) this.f4603e;
                I2.l.Q(obj);
                rVar2.f3478d = ((Number) obj).intValue();
                return L1.z.f2729a;
            }
            tVar = (Z1.t) this.f4603e;
            I2.l.Q(obj);
        }
        tVar.f3480d = obj;
        X d3 = c0351n.d();
        this.f4603e = rVar2;
        this.f4604f = 2;
        obj = d3.a();
        if (obj == aVar) {
            return aVar;
        }
        rVar = rVar2;
        rVar.f3478d = ((Number) obj).intValue();
        return L1.z.f2729a;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((C0341D) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
