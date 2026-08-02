package B0;

import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class G extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f99i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f100j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f101k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N n2, String str, String str2, H0.d dVar) {
        super(2, dVar);
        this.f100j = n2;
        this.f101k = str;
        this.f102l = str2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new G(this.f100j, this.f101k, this.f102l, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((G) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f99i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f99i = 1;
            if (N.r(this.f100j, this.f101k, this.f102l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
