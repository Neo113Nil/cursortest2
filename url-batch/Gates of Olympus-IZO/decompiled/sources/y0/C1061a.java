package y0;

import L1.z;
import k2.InterfaceC0550w;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061a extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f8783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Runnable f8784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1061a(f fVar, Runnable runnable, P1.d dVar) {
        super(2, dVar);
        this.f8783f = fVar;
        this.f8784g = runnable;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C1061a(this.f8783f, this.f8784g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C1061a) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8782e;
        z zVar = z.f2729a;
        f fVar = this.f8783f;
        if (i3 == 0) {
            I2.l.Q(obj);
            j jVar = fVar.f8810e;
            this.f8782e = 1;
            Object a3 = jVar.a(0.0f - jVar.f8819c, this);
            if (a3 != aVar) {
                a3 = zVar;
            }
            if (a3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        l lVar = fVar.f8808c;
        lVar.f8821a.setValue(Boolean.FALSE);
        this.f8784g.run();
        return zVar;
    }
}
