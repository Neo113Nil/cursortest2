package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b3 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ ArrayList wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i, ArrayList arrayList) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = arrayList;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ArrayList arrayList = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                dm1 dm1Var = (dm1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dm1.wdg6QnbFHrFF(dm1Var, (em1) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                dm1 dm1Var2 = (dm1) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        dm1.wdg6QnbFHrFF(dm1Var2, (em1) arrayList.get(i3), 0, 0);
                        if (i3 == size2) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                dm1 dm1Var3 = (dm1) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    dm1.RAsUl2FVSrh6(dm1Var3, (em1) arrayList.get(i4), 0, 0);
                }
                break;
            default:
                dm1 dm1Var4 = (dm1) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    dm1.dgRBjINgWbAK(dm1Var4, (em1) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return no2Var;
    }
}
