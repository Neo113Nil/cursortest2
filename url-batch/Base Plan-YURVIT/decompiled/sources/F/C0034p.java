package F;

import a.AbstractC0086a;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034p extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f417i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f418j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034p(P p2, G0.d dVar) {
        super(2, dVar);
        this.f418j = p2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new C0034p(this.f418j, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0034p) b((G0.d) obj2, (Z0.e) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f417i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            this.f417i = 1;
            Object c2 = P.c(this.f418j, this);
            H0.a aVar = H0.a.f511e;
            if (c2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
        }
        return D0.h.f206a;
    }
}
