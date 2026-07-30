package D;

import u0.C0247g;

/* loaded from: classes.dex */
public final class H extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f89i;

    /* renamed from: j, reason: collision with root package name */
    public int f90j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f91k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f92l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f93m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S s2, int i2, w0.d dVar) {
        super(2, dVar);
        this.f92l = s2;
        this.f93m = i2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        H h2 = new H(this.f92l, this.f93m, dVar);
        h2.f91k = ((Boolean) obj).booleanValue();
        return h2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((H) b(bool, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // y0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        boolean z2;
        Object obj2;
        int i2;
        x0.a aVar = x0.a.f3094e;
        int i3 = this.f90j;
        S s2 = this.f92l;
        if (i3 == 0) {
            o.g.z(obj);
            z2 = this.f91k;
            this.f91k = z2;
            this.f90j = 1;
            obj = s2.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f89i;
                o.g.z(obj);
                i2 = ((Number) obj).intValue();
                return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z2 = this.f91k;
            o.g.z(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f93m;
            return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        l0 g2 = s2.g();
        this.f89i = obj;
        this.f90j = 2;
        Integer a2 = g2.a();
        if (a2 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a2;
        i2 = ((Number) obj).intValue();
        return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
    }
}
