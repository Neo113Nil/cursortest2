package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r51 extends jc2 implements qe0 {
    public /* synthetic */ List cpQdD2nAriOS;
    public /* synthetic */ String r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r51(int i, bt btVar, int i2) {
        super(i, btVar);
        this.x50lh2ztY7Y5 = i2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        ArrayList arrayList;
        switch (this.x50lh2ztY7Y5) {
            case 0:
                List list = this.cpQdD2nAriOS;
                String str = this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                if (!ia2.fRTaYY6FBZcX(str)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        qs0 qs0Var = (qs0) obj2;
                        if (ia2.jJwa0q7P5wHq(qs0Var.lS5Rgt96tfkO, str, true) || ia2.jJwa0q7P5wHq(qs0Var.Y1f8riQaR6yg, str, true)) {
                            arrayList2.add(obj2);
                        }
                    }
                    list = arrayList2;
                }
                return zk.d(list, new db0(9));
            default:
                List list2 = this.cpQdD2nAriOS;
                String str2 = this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                switch (str2.hashCode()) {
                    case 49730:
                        if (!str2.equals("25%")) {
                            return list2;
                        }
                        arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            if (((qs0) obj3).TSizfFm2Yiuu >= 25) {
                                arrayList.add(obj3);
                            }
                        }
                        break;
                    case 52458:
                        if (!str2.equals("50%")) {
                            return list2;
                        }
                        arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            if (((qs0) obj4).TSizfFm2Yiuu >= 50) {
                                arrayList.add(obj4);
                            }
                        }
                        break;
                    case 54535:
                        if (!str2.equals("75%")) {
                            return list2;
                        }
                        arrayList = new ArrayList();
                        for (Object obj5 : list2) {
                            if (((qs0) obj5).TSizfFm2Yiuu >= 75) {
                                arrayList.add(obj5);
                            }
                        }
                        break;
                    case 65921:
                        str2.equals("All");
                        return list2;
                    default:
                        return list2;
                }
                return arrayList;
        }
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        int i2 = 3;
        List list = (List) obj;
        String str = (String) obj2;
        bt btVar = (bt) obj3;
        switch (i) {
            case 0:
                r51 r51Var = new r51(i2, btVar, 0);
                r51Var.cpQdD2nAriOS = list;
                r51Var.r3s1LDPKFs1S = str;
                return r51Var.RfyTYNmI9Srp(no2Var);
            default:
                r51 r51Var2 = new r51(i2, btVar, 1);
                r51Var2.cpQdD2nAriOS = list;
                r51Var2.r3s1LDPKFs1S = str;
                return r51Var2.RfyTYNmI9Srp(no2Var);
        }
    }
}
