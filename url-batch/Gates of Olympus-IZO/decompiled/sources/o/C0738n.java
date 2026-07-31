package o;

import I.C0102j0;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738n extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6580e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H2.h f6582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f6583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738n(H2.h hVar, Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f6582g = hVar;
        this.f6583h = eVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0738n c0738n = new C0738n(this.f6582g, this.f6583h, dVar);
        c0738n.f6581f = obj;
        return c0738n;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0738n) create((N) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6580e;
        H2.h hVar = this.f6582g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                N n3 = (N) this.f6581f;
                ((C0102j0) hVar.f1962d).setValue(Boolean.TRUE);
                Y1.e eVar = this.f6583h;
                this.f6580e = 1;
                if (eVar.g(n3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
            }
            ((C0102j0) hVar.f1962d).setValue(Boolean.FALSE);
            return L1.z.f2729a;
        } catch (Throwable th) {
            ((C0102j0) hVar.f1962d).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
