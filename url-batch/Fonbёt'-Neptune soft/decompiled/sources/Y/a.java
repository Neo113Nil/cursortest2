package Y;

import F0.h;
import I.C0090z;
import J0.g;
import P0.p;
import Y0.InterfaceC0126u;
import a0.i;
import b1.d;

/* loaded from: classes.dex */
public final class a extends g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f1155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f1156j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f1157k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, i iVar, H0.d dVar2) {
        super(2, dVar2);
        this.f1156j = dVar;
        this.f1157k = iVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new a(this.f1156j, this.f1157k, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((a) b((H0.d) obj2, (InterfaceC0126u) obj)).l(h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f1155i;
        if (i2 == 0) {
            i1.a.G(obj);
            C0090z c0090z = new C0090z(1, this.f1157k);
            this.f1155i = 1;
            if (this.f1156j.k(c0090z, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return h.f469a;
    }
}
