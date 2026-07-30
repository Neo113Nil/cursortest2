package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ix1 extends sw0 {
    public static final ix1 TSizfFm2Yiuu = new ix1("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix1(String str, int i) {
        super(str);
        this.lS5Rgt96tfkO = i;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                int size = list.size();
                q50 q50Var = q50.rtx2ld2ELZv4;
                if (size == 0) {
                    return l51Var.jJwa0q7P5wHq(rr.wdg6QnbFHrFF(j), rr.OPXfSBeufaJ8(j), q50Var, gi1.gPXPFXrUH4XX);
                }
                if (size == 1) {
                    em1 e9gEMXR7LXtO = ((e51) list.get(0)).e9gEMXR7LXtO(j);
                    return l51Var.jJwa0q7P5wHq(sr.RAsUl2FVSrh6(e9gEMXR7LXtO.rtx2ld2ELZv4, j), sr.a92UlCVFR9N8(e9gEMXR7LXtO.OPXfSBeufaJ8, j), q50Var, new d1(e9gEMXR7LXtO, 5));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    em1 e9gEMXR7LXtO2 = ((e51) list.get(i3)).e9gEMXR7LXtO(j);
                    i = Math.max(e9gEMXR7LXtO2.rtx2ld2ELZv4, i);
                    i2 = Math.max(e9gEMXR7LXtO2.OPXfSBeufaJ8, i2);
                    arrayList.add(e9gEMXR7LXtO2);
                }
                return l51Var.jJwa0q7P5wHq(sr.RAsUl2FVSrh6(i, j), sr.a92UlCVFR9N8(i2, j), q50Var, new b3(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
