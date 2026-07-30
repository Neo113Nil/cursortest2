package s0;

import M0.InterfaceC0062u;
import java.util.List;
import u0.C0247g;

/* loaded from: classes.dex */
public final class u extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2940j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(J j2, List list, w0.d dVar) {
        super(2, dVar);
        this.f2940j = j2;
        this.f2941k = list;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new u(this.f2940j, this.f2941k, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((u) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2939i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f2939i = 1;
            obj = J.k(this.f2940j, this.f2941k, this);
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
