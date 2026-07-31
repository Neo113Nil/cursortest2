package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 implements g6.g, n2 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v0 f5132e = new v0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f5133f = new v0(1);

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f5134g = new v0(2);

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f5135h = new v0(3);
    public static final v0 i = new v0(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5136d;

    public /* synthetic */ v0(int i8) {
        this.f5136d = i8;
    }

    public static final void b(v0 v0Var) {
        d7.n0 n0Var;
        Object obj;
        s0.b bVar;
        d7.n0 n0Var2 = y1.f5186y;
        do {
            n0Var = y1.f5186y;
            obj = (p0.b) n0Var.getValue();
            bVar = (s0.b) obj;
            r0.b bVar2 = bVar.f6689f;
            s0.a aVar = (s0.a) bVar2.get(v0Var);
            if (aVar != null) {
                Object obj2 = aVar.f6684a;
                Object obj3 = aVar.f6685b;
                r0.j jVar = bVar2.f6474d;
                r0.j v7 = jVar.v(v0Var != null ? v0Var.hashCode() : 0, 0, v0Var);
                if (jVar != v7) {
                    bVar2 = v7 == null ? r0.b.f6473f : new r0.b(v7, bVar2.f6475e - 1);
                }
                t0.b bVar3 = t0.b.f6894a;
                if (obj2 != bVar3) {
                    Object obj4 = bVar2.get(obj2);
                    q6.i.b(obj4);
                    bVar2 = bVar2.a(obj2, new s0.a(((s0.a) obj4).f6684a, obj3));
                }
                if (obj3 != bVar3) {
                    Object obj5 = bVar2.get(obj3);
                    q6.i.b(obj5);
                    bVar2 = bVar2.a(obj3, new s0.a(obj2, ((s0.a) obj5).f6685b));
                }
                Object obj6 = obj2 != bVar3 ? bVar.f6687d : obj3;
                if (obj3 != bVar3) {
                    obj2 = bVar.f6688e;
                }
                bVar = new s0.b(obj6, obj2, bVar2);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = e7.c.f2544b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!n0Var.j(obj, bVar));
    }

    @Override // m0.n2
    public boolean a(Object obj, Object obj2) {
        switch (this.f5136d) {
            case 1:
                return false;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return obj == obj2;
            default:
                return q6.i.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f5136d) {
            case 1:
                return "NeverEqualPolicy";
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "ReferentialEqualityPolicy";
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            default:
                return super.toString();
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
