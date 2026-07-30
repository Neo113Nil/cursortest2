package D;

import M0.InterfaceC0062u;
import u0.C0247g;

/* loaded from: classes.dex */
public final class J extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f101j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s2, w0.d dVar) {
        super(2, dVar);
        this.f101j = s2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new J(this.f101j, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((J) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f100i;
        S s2 = this.f101j;
        try {
            if (i2 == 0) {
                o.g.z(obj);
                if (s2.f133l.x() instanceof d0) {
                    return s2.f133l.x();
                }
                this.f100i = 1;
                if (s2.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                    return (m0) obj;
                }
                o.g.z(obj);
            }
            this.f100i = 2;
            obj = S.d(s2, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (m0) obj;
        } catch (Throwable th) {
            return new f0(th, -1);
        }
    }
}
