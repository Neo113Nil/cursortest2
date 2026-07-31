package e1;

/* renamed from: e1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340C extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Object f4598e;

    /* renamed from: f, reason: collision with root package name */
    public int f4599f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f4600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4602i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340C(C0351N c0351n, int i3, P1.d dVar) {
        super(2, dVar);
        this.f4601h = c0351n;
        this.f4602i = i3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0340C c0340c = new C0340C(this.f4601h, this.f4602i, dVar);
        c0340c.f4600g = ((Boolean) obj).booleanValue();
        return c0340c;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0340C) create(bool, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        Object obj2;
        int i3;
        Q1.a aVar = Q1.a.f3113d;
        int i4 = this.f4599f;
        C0351N c0351n = this.f4601h;
        if (i4 == 0) {
            I2.l.Q(obj);
            z3 = this.f4600g;
            this.f4600g = z3;
            this.f4599f = 1;
            obj = c0351n.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f4598e;
                I2.l.Q(obj);
                i3 = ((Number) obj).intValue();
                return new C0354c(obj2, obj2 != null ? obj2.hashCode() : 0, i3);
            }
            z3 = this.f4600g;
            I2.l.Q(obj);
        }
        if (!z3) {
            obj2 = obj;
            i3 = this.f4602i;
            return new C0354c(obj2, obj2 != null ? obj2.hashCode() : 0, i3);
        }
        X d3 = c0351n.d();
        this.f4598e = obj;
        this.f4599f = 2;
        Integer a3 = d3.a();
        if (a3 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a3;
        i3 = ((Number) obj).intValue();
        return new C0354c(obj2, obj2 != null ? obj2.hashCode() : 0, i3);
    }
}
