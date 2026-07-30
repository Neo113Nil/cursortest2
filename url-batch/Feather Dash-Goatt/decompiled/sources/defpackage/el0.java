package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class el0 implements t30 {
    public final /* synthetic */ List d;

    public el0(List list) {
        this.d = list;
    }

    @Override // defpackage.t30
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        de0 de0Var = (de0) obj;
        int intValue = ((Number) obj2).intValue();
        hl hlVar = (hl) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (hlVar.f(de0Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= hlVar.d(intValue) ? 32 : 16;
        }
        if (hlVar.O(i & 1, (i & 147) != 146)) {
            ia iaVar = (ia) this.d.get(intValue);
            hlVar.W(1188331427);
            yr1.r(iaVar, hlVar, 0);
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        return Unit.a;
    }
}
