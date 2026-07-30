package S;

import D.A;
import E0.p;
import M0.InterfaceC0062u;
import P0.d;
import U.i;
import o.g;
import u0.C0247g;
import y0.f;

/* loaded from: classes.dex */
public final class a extends f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f946i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f947j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f948k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, i iVar, w0.d dVar2) {
        super(2, dVar2);
        this.f947j = dVar;
        this.f948k = iVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new a(this.f947j, this.f948k, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((a) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f946i;
        if (i2 == 0) {
            g.z(obj);
            A a2 = new A(2, this.f948k);
            this.f946i = 1;
            if (this.f947j.d(a2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.z(obj);
        }
        return C0247g.f3005a;
    }
}
