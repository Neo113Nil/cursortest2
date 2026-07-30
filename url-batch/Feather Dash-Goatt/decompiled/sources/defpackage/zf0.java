package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zf0 implements t51, p51 {
    public final u51 d;
    public final r51 e;
    public final wn0 g;

    public zf0(t51 t51Var, Map map, r51 r51Var) {
        l lVar = new l(9, t51Var);
        ke1 ke1Var = v51.a;
        this.d = new u51(map, lVar);
        this.e = r51Var;
        wn0 wn0Var = r61.a;
        this.g = new wn0();
    }

    @Override // defpackage.p51
    public final void a(Object obj, hk hkVar, hl hlVar, int i) {
        int i2;
        hlVar.Y(-858296452);
        if ((i & 6) == 0) {
            i2 = (hlVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= hlVar.h(hkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= hlVar.h(this) ? 256 : 128;
        }
        if (hlVar.O(i2 & 1, (i2 & 147) != 146)) {
            this.e.a(obj, hkVar, hlVar, i2 & 126);
            boolean h = hlVar.h(this) | hlVar.h(obj);
            Object L = hlVar.L();
            if (h || L == bl.a) {
                L = new c(this, 10, obj);
                hlVar.h0(L);
            }
            p4.b(obj, (Function1) L, hlVar);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new fk((p51) this, obj, hkVar, i, 3);
        }
    }

    @Override // defpackage.t51
    public final boolean b(Object obj) {
        return this.d.b(obj);
    }

    @Override // defpackage.t51
    public final Map c() {
        wn0 wn0Var = this.g;
        Object[] objArr = wn0Var.b;
        long[] jArr = wn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            r51 r51Var = this.e;
                            if (r51Var.e.k(obj) == null) {
                                r51Var.d.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.d.c();
    }

    @Override // defpackage.t51
    public final Object d(String str) {
        return this.d.d(str);
    }

    @Override // defpackage.t51
    public final s51 e(String str, Function0 function0) {
        return this.d.e(str, function0);
    }
}
