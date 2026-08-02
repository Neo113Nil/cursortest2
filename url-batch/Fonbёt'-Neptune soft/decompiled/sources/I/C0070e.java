package I;

import a.AbstractC0132a;
import java.util.List;

/* renamed from: I.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070e extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f626i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f627j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f628k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070e(List list, H0.d dVar) {
        super(2, dVar);
        this.f628k = list;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0070e c0070e = new C0070e(this.f628k, dVar);
        c0070e.f627j = obj;
        return c0070e;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0070e) b((H0.d) obj2, (C0077l) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f626i;
        if (i2 == 0) {
            i1.a.G(obj);
            C0077l c0077l = (C0077l) this.f627j;
            this.f626i = 1;
            if (AbstractC0132a.a(this.f628k, c0077l, this) == aVar) {
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
