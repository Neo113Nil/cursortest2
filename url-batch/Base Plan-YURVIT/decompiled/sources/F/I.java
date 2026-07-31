package F;

import W0.InterfaceC0080u;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class I extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f264j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p2, G0.d dVar) {
        super(2, dVar);
        this.f264j = p2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new I(this.f264j, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((I) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.h(r6) == r5) goto L22;
     */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        P p2 = this.f264j;
        B0.E e2 = p2.f295l;
        int i2 = this.f263i;
        H0.a aVar = H0.a.f511e;
        try {
            if (i2 == 0) {
                AbstractC0086a.I(obj);
                if (e2.z() instanceof b0) {
                    return e2.z();
                }
                this.f263i = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0086a.I(obj);
                    return (l0) obj;
                }
                AbstractC0086a.I(obj);
            }
            this.f263i = 2;
            obj = P.d(p2, false, this);
        } catch (Throwable th) {
            return new d0(th, -1);
        }
    }
}
