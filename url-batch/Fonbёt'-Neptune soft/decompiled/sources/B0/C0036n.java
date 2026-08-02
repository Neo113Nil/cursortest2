package B0;

import Y0.InterfaceC0126u;
import java.util.List;

/* renamed from: B0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036n extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f167i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f168j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f169k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036n(N n2, List list, H0.d dVar) {
        super(2, dVar);
        this.f168j = n2;
        this.f169k = list;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new C0036n(this.f168j, this.f169k, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0036n) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f167i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f167i = 1;
            obj = N.s(this.f168j, this.f169k, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return obj;
    }
}
