package b0;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n0.d2;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f905e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f906i;

    public /* synthetic */ u(x0.d dVar, w wVar) {
        this.f904d = 1;
        this.f905e = dVar;
        this.f906i = wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f904d) {
            case 0:
                a2.a1 a1Var = (a2.a1) obj;
                x2.a aVar = (x2.a) obj2;
                break;
            case 1:
                x0.d dVar = (x0.d) this.f905e;
                w wVar = (w) this.f906i;
                n0.i0 i0Var = (n0.i0) obj;
                int intValue = ((Integer) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    dVar.a(wVar, i0Var, 0);
                } else {
                    i0Var.R();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                j0.d0.a((m2.h0) this.f906i, (x0.d) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                l9.b.a((n4.x) this.f906i, (d1.l) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                c6.q qVar = (c6.q) this.f906i;
                q0.k kVar = (q0.k) this.f905e;
                int intValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof n0.i) {
                    ((o0.e) qVar.f1862f).b((n0.i) obj2);
                } else if (!(obj2 instanceof d2)) {
                    if (obj2 instanceof n0.l0) {
                        n0.h.w(kVar, intValue2, obj2);
                        qVar.d((n0.l0) obj2);
                    } else if (obj2 instanceof s1) {
                        n0.h.w(kVar, intValue2, obj2);
                        ((s1) obj2).c();
                    }
                }
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                z4.w.c((List) this.f906i, (Collection) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                a.a.f((a1.j) this.f906i, (x0.d) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                g8.b.h((Function0) this.f906i, (Function0) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                g8.b.c((Function0) this.f906i, (s9.a) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                g8.b.j((List) this.f906i, (d1.l) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                g8.b.k((j9.b) this.f906i, (d1.l) this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((v.z0) this.f906i).a(this.f905e, (n0.i0) obj, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ u(int i3, Object obj, Object obj2) {
        this.f904d = i3;
        this.f906i = obj;
        this.f905e = obj2;
    }

    public /* synthetic */ u(int i3, int i10, Object obj, Object obj2) {
        this.f904d = i10;
        this.f906i = obj;
        this.f905e = obj2;
    }
}
