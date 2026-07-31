package F;

import k2.InterfaceC0550w;
import m.C0593d;
import q.C0767b;
import q.C0769d;
import q.C0771f;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0593d f1401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0073x f1404i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.h f1405j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0071w(C0593d c0593d, float f3, boolean z3, C0073x c0073x, q.h hVar, P1.d dVar) {
        super(2, dVar);
        this.f1401f = c0593d;
        this.f1402g = f3;
        this.f1403h = z3;
        this.f1404i = c0073x;
        this.f1405j = hVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0071w(this.f1401f, this.f1402g, this.f1403h, this.f1404i, this.f1405j, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0071w) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1400e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0593d c0593d = this.f1401f;
            float f3 = ((M0.e) c0593d.f5706e.getValue()).f2766d;
            float f4 = this.f1402g;
            if (!M0.e.a(f3, f4)) {
                if (this.f1403h) {
                    float f5 = ((M0.e) c0593d.f5706e.getValue()).f2766d;
                    C0073x c0073x = this.f1404i;
                    q.h lVar = M0.e.a(f5, c0073x.f1413b) ? new q.l(0L) : M0.e.a(f5, c0073x.f1415d) ? new C0771f() : M0.e.a(f5, c0073x.f1414c) ? new C0769d() : M0.e.a(f5, c0073x.f1416e) ? new C0767b() : null;
                    this.f1400e = 2;
                    if (G.b.a(c0593d, f4, lVar, this.f1405j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    M0.e eVar = new M0.e(f4);
                    this.f1400e = 1;
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
