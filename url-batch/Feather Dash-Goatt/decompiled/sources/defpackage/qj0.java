package defpackage;

import java.util.HashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qj0 extends yr1 {
    public final j2 t;

    public qj0(j2 j2Var) {
        this.t = j2Var;
    }

    public final void k0(Object obj) {
        Unit unit;
        k2 k2Var = this.t.a;
        if (k2Var != null) {
            uq1 uq1Var = k2Var.u;
            rj rjVar = k2Var.v;
            HashMap hashMap = rjVar.b;
            String str = k2Var.t;
            Integer num = (Integer) hashMap.get(str);
            if (num == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + uq1Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
            rjVar.d.add(str);
            try {
                rjVar.b(num.intValue(), uq1Var, obj);
                unit = Unit.a;
            } catch (Exception e) {
                rjVar.d.remove(str);
                throw e;
            }
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        dd0.j("Launcher has not been initialized");
    }
}
