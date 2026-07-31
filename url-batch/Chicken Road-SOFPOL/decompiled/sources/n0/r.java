package n0;

import m0.b2;
import m0.i2;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f5290d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f5291e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f5292f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f5293g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5294c;

    static {
        int i = 1;
        f5290d = new r(i, 2, 0);
        int i8 = 1;
        f5291e = new r(i8, i8, 1);
        f5292f = new r(i, 2, 2);
        int i9 = 1;
        f5293g = new r(i9, i9, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i8, int i9) {
        super(i, i8);
        this.f5294c = i9;
    }

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        switch (this.f5294c) {
            case 0:
                Object b8 = ((p6.a) kVar.c(0)).b();
                m0.a aVar = (m0.a) kVar.c(1);
                int b9 = kVar.b(0);
                aVar.getClass();
                i2Var.T(i2Var.c(aVar), b8);
                cVar.f(b9, b8);
                cVar.d(b8);
                break;
            case 1:
                m0.a aVar2 = (m0.a) kVar.c(0);
                int b10 = kVar.b(0);
                cVar.n();
                aVar2.getClass();
                cVar.b(b10, i2Var.C(i2Var.c(aVar2)));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                Object c8 = kVar.c(0);
                m0.a aVar3 = (m0.a) kVar.c(1);
                int b11 = kVar.b(0);
                if (c8 instanceof b2) {
                    b2 b2Var = (b2) c8;
                    iVar.f7158e.b(b2Var);
                    iVar.f7157d.a(b2Var);
                }
                Object J = i2Var.J(i2Var.c(aVar3), b11, c8);
                if (!(J instanceof b2)) {
                    if (J instanceof t1) {
                        ((t1) J).d();
                        break;
                    }
                } else {
                    iVar.e((b2) J);
                    break;
                }
                break;
            default:
                Object c9 = kVar.c(0);
                int b12 = kVar.b(0);
                if (c9 instanceof b2) {
                    b2 b2Var2 = (b2) c9;
                    iVar.f7158e.b(b2Var2);
                    iVar.f7157d.a(b2Var2);
                }
                Object J2 = i2Var.J(i2Var.f4970t, b12, c9);
                if (!(J2 instanceof b2)) {
                    if (J2 instanceof t1) {
                        ((t1) J2).d();
                        break;
                    }
                } else {
                    iVar.e((b2) J2);
                    break;
                }
                break;
        }
    }

    @Override // n0.j0
    public m0.a b(androidx.datastore.preferences.protobuf.k kVar) {
        switch (this.f5294c) {
            case 0:
                return (m0.a) kVar.c(1);
            case 1:
                return (m0.a) kVar.c(0);
            default:
                return super.b(kVar);
        }
    }
}
