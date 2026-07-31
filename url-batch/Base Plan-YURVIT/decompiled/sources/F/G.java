package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class G extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f252i;

    /* renamed from: j, reason: collision with root package name */
    public int f253j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f254k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p2, int i2, G0.d dVar) {
        super(2, dVar);
        this.f255l = p2;
        this.f256m = i2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        G g2 = new G(this.f255l, this.f256m, dVar);
        g2.f254k = ((Boolean) obj).booleanValue();
        return g2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) b((G0.d) obj2, bool)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        boolean z2;
        Object obj2;
        int i2;
        int i3 = this.f253j;
        P p2 = this.f255l;
        H0.a aVar = H0.a.f511e;
        if (i3 == 0) {
            AbstractC0086a.I(obj);
            z2 = this.f254k;
            this.f254k = z2;
            this.f253j = 1;
            obj = p2.i(this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f252i;
                AbstractC0086a.I(obj);
                i2 = ((Number) obj).intValue();
                return new C0022d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z2 = this.f254k;
            AbstractC0086a.I(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f256m;
            return new C0022d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        k0 g2 = p2.g();
        this.f252i = obj;
        this.f253j = 2;
        Integer a2 = g2.a();
        if (a2 != aVar) {
            obj2 = obj;
            obj = a2;
            i2 = ((Number) obj).intValue();
            return new C0022d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        return aVar;
    }
}
