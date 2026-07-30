package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 implements h6.h, f2 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t0 f3899g = new t0(0);

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f3900h = new t0(1);

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f3901i = new t0(2);

    /* renamed from: j, reason: collision with root package name */
    public static final t0 f3902j = new t0(3);

    /* renamed from: k, reason: collision with root package name */
    public static final t0 f3903k = new t0(4);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3904f;

    public /* synthetic */ t0(int i7) {
        this.f3904f = i7;
    }

    public static final void b(t0 t0Var) {
        f7.q0 q0Var;
        Object obj;
        m0.b bVar;
        f7.q0 q0Var2 = t1.f3905v;
        do {
            q0Var = t1.f3905v;
            obj = (j0.b) q0Var.getValue();
            bVar = (m0.b) obj;
            l0.c cVar = bVar.f6294h;
            m0.a aVar = (m0.a) cVar.get(t0Var);
            if (aVar != null) {
                Object obj2 = aVar.f6289a;
                Object obj3 = aVar.f6290b;
                l0.k kVar = cVar.f5747f;
                l0.k v5 = kVar.v(t0Var != null ? t0Var.hashCode() : 0, 0, t0Var);
                if (kVar != v5) {
                    cVar = v5 == null ? l0.c.f5746h : new l0.c(v5, cVar.f5748g - 1);
                }
                n0.b bVar2 = n0.b.f6497a;
                if (obj2 != bVar2) {
                    Object obj4 = cVar.get(obj2);
                    r6.k.c(obj4);
                    cVar = cVar.a(obj2, new m0.a(((m0.a) obj4).f6289a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    r6.k.c(obj5);
                    cVar = cVar.a(obj3, new m0.a(obj2, ((m0.a) obj5).f6290b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f6292f : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f6293g;
                }
                bVar = new m0.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = g7.c.f4481b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!q0Var.l(obj, bVar));
    }

    @Override // g0.f2
    public boolean a(Object obj, Object obj2) {
        switch (this.f3904f) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return r6.k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f3904f) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
