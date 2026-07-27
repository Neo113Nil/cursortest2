package A1;

import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.EnumC1375a;
import z1.EnumC1387m;
import z1.EnumC1388n;

/* loaded from: classes.dex */
public final class P implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Enum f524e;

    public /* synthetic */ P(Enum r12, int i2) {
        this.f523d = i2;
        this.f524e = r12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f523d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b(((EnumC1387m) this.f524e).name(), null, 0L, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131062);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    N1.b(((EnumC1375a) this.f524e).name(), null, 0L, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 3072, 0, 131062);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    N1.b(((EnumC1388n) this.f524e).name(), null, 0L, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 131062);
                }
                break;
        }
        return Unit.f7487a;
    }
}
