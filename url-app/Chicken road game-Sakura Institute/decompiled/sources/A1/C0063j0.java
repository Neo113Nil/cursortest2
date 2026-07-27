package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: A1.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063j0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f618e;

    public /* synthetic */ C0063j0(int i2, int i4) {
        this.f617d = i4;
        this.f618e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f617d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b(String.valueOf(this.f618e + 1), null, 0L, u3.l.k0(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131062);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    N1.b(String.valueOf(this.f618e), null, 0L, 0L, null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 196608, 0, 130974);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    N1.b(AbstractC0017m.g(this.f618e + 1, "Pick athlete for leg "), null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 196608, 0, 130974);
                }
                break;
        }
        return Unit.f7487a;
    }
}
