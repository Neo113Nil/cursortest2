package j0;

import a2.c1;
import a2.h0;
import c2.o0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.k0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends d1.k implements c2.h, c2.v {
    public LinkedHashMap C;

    @Override // c2.v
    public final h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        float f3 = ((x2.f) c2.k.h(this, o.f4883c)).f10322d;
        float f10 = 0;
        if (f3 < f10) {
            f3 = f10;
        }
        a2.o0 c10 = f0Var.c(j);
        boolean z10 = this.B && !Float.isNaN(f3) && x2.f.a(f3, f10) > 0;
        int y3 = !Float.isNaN(f3) ? o0Var.y(f3) : 0;
        int i3 = c10.f131d;
        if (z10) {
            i3 = Math.max(i3, y3);
        }
        int i10 = i3;
        int i11 = c10.f132e;
        if (z10) {
            i11 = Math.max(i11, y3);
        }
        int i12 = i11;
        if (z10) {
            LinkedHashMap linkedHashMap = this.C;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.C = linkedHashMap;
            }
            c1 c1Var = o.f4882b;
            int round = Math.round((y3 - c10.f131d) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(c1Var, Integer.valueOf(round));
            a2.i iVar = o.f4881a;
            int round2 = Math.round((y3 - c10.f132e) / 2.0f);
            linkedHashMap.put(iVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.C;
        if (map == null) {
            map = k0.f5575d;
            map.getClass();
        }
        return o0Var.x(i10, i12, map, null, new b0.g0(i10, c10, i12));
    }
}
