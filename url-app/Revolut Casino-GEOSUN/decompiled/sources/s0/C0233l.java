package s0;

import M0.InterfaceC0062u;
import java.util.List;
import u0.C0247g;

/* renamed from: s0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233l extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2907j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2908k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233l(J j2, List list, w0.d dVar) {
        super(2, dVar);
        this.f2907j = j2;
        this.f2908k = list;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new C0233l(this.f2907j, this.f2908k, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0233l) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2906i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f2906i = 1;
            obj = J.k(this.f2907j, this.f2908k, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
