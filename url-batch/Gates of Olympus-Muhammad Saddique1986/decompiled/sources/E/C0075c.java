package E;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075c extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0076d f949j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q.m f950k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075c(p pVar, C0076d c0076d, q.m mVar, V1.d dVar) {
        super(2, dVar);
        this.f948i = pVar;
        this.f949j = c0076d;
        this.f950k = mVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0075c) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0075c(this.f948i, this.f949j, this.f950k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f947h;
        q.m mVar = this.f950k;
        C0076d c0076d = this.f949j;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                p pVar = this.f948i;
                this.f947h = 1;
                if (pVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            c0076d.f951A.g(mVar);
            AbstractC0993f.m(c0076d);
            return R1.y.f4171a;
        } catch (Throwable th) {
            c0076d.f951A.g(mVar);
            AbstractC0993f.m(c0076d);
            throw th;
        }
    }
}
