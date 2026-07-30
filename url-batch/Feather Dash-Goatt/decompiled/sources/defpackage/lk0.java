package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lk0 implements Function2 {
    public final /* synthetic */ fk1 d;
    public final /* synthetic */ hk e;

    public lk0(fk1 fk1Var, hk hkVar) {
        this.d = fk1Var;
        this.e = hkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        hl hlVar = (hl) obj;
        int intValue = ((Number) obj2).intValue();
        if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
            eh1.a(this.d.j, this.e, hlVar, 0);
        } else {
            hlVar.R();
        }
        return Unit.a;
    }
}
