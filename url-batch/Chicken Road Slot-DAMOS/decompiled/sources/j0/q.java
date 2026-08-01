package j0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4891e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4892i;

    public /* synthetic */ q(int i3, Object obj, Object obj2) {
        this.f4890d = i3;
        this.f4891e = obj;
        this.f4892i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4890d) {
            case 0:
                i0 i0Var = (i0) obj;
                int intValue = ((Number) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    d0.a(((f0) this.f4891e).j, (x0.d) this.f4892i, i0Var, 0);
                } else {
                    i0Var.R();
                }
                break;
            case 1:
                i0 i0Var2 = (i0) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && i0Var2.A()) {
                    i0Var2.R();
                } else {
                    ((o4.n) this.f4891e).f7491u.a((n4.h) this.f4892i, i0Var2, 0);
                }
                break;
            case 2:
                i0 i0Var3 = (i0) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && i0Var3.A()) {
                    i0Var3.R();
                } else {
                    a.a.f((a1.j) this.f4891e, (x0.d) this.f4892i, i0Var3, 0);
                }
                break;
            default:
                i0 i0Var4 = (i0) obj;
                int intValue2 = ((Number) obj2).intValue();
                n4.h hVar = (n4.h) this.f4891e;
                if ((intValue2 & 3) == 2 && i0Var4.A()) {
                    i0Var4.R();
                } else {
                    n4.s sVar = hVar.f7063e;
                    sVar.getClass();
                    ((o4.h) sVar).f7476t.c((u.i) this.f4892i, hVar, i0Var4, 0);
                }
                break;
        }
        return Unit.f5554a;
    }
}
