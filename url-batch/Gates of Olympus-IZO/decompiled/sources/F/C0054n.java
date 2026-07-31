package F;

import k2.InterfaceC0550w;
import m.C0593d;
import q.C0769d;
import q.C0771f;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054n extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0593d f1305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0056o f1308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.h f1309j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054n(C0593d c0593d, float f3, boolean z3, C0056o c0056o, q.h hVar, P1.d dVar) {
        super(2, dVar);
        this.f1305f = c0593d;
        this.f1306g = f3;
        this.f1307h = z3;
        this.f1308i = c0056o;
        this.f1309j = hVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0054n(this.f1305f, this.f1306g, this.f1307h, this.f1308i, this.f1309j, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0054n) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1304e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0593d c0593d = this.f1305f;
            float f3 = ((M0.e) c0593d.f5706e.getValue()).f2766d;
            float f4 = this.f1306g;
            if (!M0.e.a(f3, f4)) {
                if (this.f1307h) {
                    float f5 = ((M0.e) c0593d.f5706e.getValue()).f2766d;
                    C0056o c0056o = this.f1308i;
                    q.h lVar = M0.e.a(f5, c0056o.f1314b) ? new q.l(0L) : M0.e.a(f5, c0056o.f1316d) ? new C0771f() : M0.e.a(f5, c0056o.f1315c) ? new C0769d() : null;
                    this.f1304e = 2;
                    if (G.b.a(c0593d, f4, lVar, this.f1309j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    M0.e eVar = new M0.e(f4);
                    this.f1304e = 1;
                    if (c0593d.e(eVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
