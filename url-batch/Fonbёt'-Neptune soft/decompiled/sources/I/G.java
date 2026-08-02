package I;

/* loaded from: classes.dex */
public final class G extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f534i;

    /* renamed from: j, reason: collision with root package name */
    public int f535j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f536k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f538m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p2, int i2, H0.d dVar) {
        super(2, dVar);
        this.f537l = p2;
        this.f538m = i2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        G g2 = new G(this.f537l, this.f538m, dVar);
        g2.f536k = ((Boolean) obj).booleanValue();
        return g2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) b((H0.d) obj2, bool)).l(F0.h.f469a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        boolean z2;
        Object obj2;
        int i2;
        I0.a aVar = I0.a.f733e;
        int i3 = this.f535j;
        P p2 = this.f537l;
        if (i3 == 0) {
            i1.a.G(obj);
            z2 = this.f536k;
            this.f536k = z2;
            this.f535j = 1;
            obj = p2.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f534i;
                i1.a.G(obj);
                i2 = ((Number) obj).intValue();
                return new C0069d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z2 = this.f536k;
            i1.a.G(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f538m;
            return new C0069d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        j0 g2 = p2.g();
        this.f534i = obj;
        this.f535j = 2;
        Integer a2 = g2.a();
        if (a2 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a2;
        i2 = ((Number) obj).intValue();
        return new C0069d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
    }
}
