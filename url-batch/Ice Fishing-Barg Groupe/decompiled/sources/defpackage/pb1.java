package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class pb1 implements ae0 {
    public final /* synthetic */ i92 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ pb1(i92 i92Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i92Var;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        i92 i92Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                List list = (List) i92Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (cs0.wdg6QnbFHrFF(((x91) obj).OPXfSBeufaJ8.rtx2ld2ELZv4, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new bf1(((bf1) i92Var.getValue()).PxuCJdSBwIXG);
            case 2:
                l8 l8Var = w22.PxuCJdSBwIXG;
                return new bf1(((bf1) i92Var.getValue()).PxuCJdSBwIXG);
            case 3:
                return Boolean.valueOf(((Number) i92Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) i92Var.getValue()).floatValue() > 0.0f);
        }
    }
}
