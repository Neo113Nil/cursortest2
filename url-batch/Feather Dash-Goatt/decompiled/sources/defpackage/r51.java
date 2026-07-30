package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r51 implements p51 {
    public static final c51 i = new c51(new e9(13, 0), 3, new q1(28));
    public final Map d;
    public final vn0 e;
    public t51 g;
    public final l h;

    public r51(Map map) {
        this.d = map;
        long[] jArr = q61.a;
        this.e = new vn0();
        this.h = new l(18, this);
    }

    @Override // defpackage.p51
    public final void a(Object obj, hk hkVar, hl hlVar, int i2) {
        int i3;
        hlVar.Y(533563200);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(hkVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(this) ? 256 : 128;
        }
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            hlVar.Z(obj);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (L == j41Var) {
                l lVar = this.h;
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    dd0.k("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.d.get(obj);
                ke1 ke1Var = v51.a;
                w51 w51Var = new w51(new u51(map, lVar));
                hlVar.h0(w51Var);
                L = w51Var;
            }
            w51 w51Var2 = (w51) L;
            op.b(new n01[]{v51.a.a(w51Var2), ji0.a.a(w51Var2)}, hkVar, hlVar, (i3 & 112) | 8);
            Unit unit = Unit.a;
            boolean h = hlVar.h(this) | hlVar.h(obj) | hlVar.h(w51Var2);
            Object L2 = hlVar.L();
            if (h || L2 == j41Var) {
                L2 = new tm(this, obj, w51Var2, 3);
                hlVar.h0(L2);
            }
            p4.b(unit, (Function1) L2, hlVar);
            if (hlVar.y && hlVar.G.i == hlVar.z) {
                hlVar.z = -1;
                hlVar.y = false;
            }
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new fk((p51) this, obj, hkVar, i2, 4);
        }
    }
}
