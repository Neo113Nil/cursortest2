package n;

import b0.C0275h;
import b0.C0281n;
import d0.C0321b;
import d0.InterfaceC0323d;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.d f6145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z1.t f6146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6147g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0281n f6148h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0.d dVar, Z1.t tVar, long j3, C0281n c0281n) {
        super(1);
        this.f6145e = dVar;
        this.f6146f = tVar;
        this.f6147g = j3;
        this.f6148h = c0281n;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        t0.F f3 = (t0.F) obj;
        f3.b();
        a0.d dVar = this.f6145e;
        Z1.t tVar = this.f6146f;
        long j3 = this.f6147g;
        C0281n c0281n = this.f6148h;
        C0321b c0321b = f3.f7748d;
        A2.g gVar = (A2.g) c0321b.f4444e.f536b;
        float f4 = dVar.f3491a;
        float f5 = dVar.f3492b;
        gVar.u(f4, f5);
        try {
            InterfaceC0323d.o(f3, (C0275h) tVar.f3480d, 0L, j3, 0L, 0.0f, c0281n, 0, 890);
            ((A2.g) c0321b.f4444e.f536b).u(-f4, -f5);
            return L1.z.f2729a;
        } catch (Throwable th) {
            ((A2.g) c0321b.f4444e.f536b).u(-f4, -f5);
            throw th;
        }
    }
}
