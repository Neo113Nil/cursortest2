package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class eb1 extends za1 implements Iterable, fu0 {
    public static final db1 Companion = new db1();
    public final id0 x50lh2ztY7Y5;

    public eb1(kb1 kb1Var) {
        super(kb1Var);
        this.x50lh2ztY7Y5 = new id0(this);
    }

    @Override // defpackage.za1
    public final ya1 Y1f8riQaR6yg(m9 m9Var) {
        ya1 Y1f8riQaR6yg = super.Y1f8riQaR6yg(m9Var);
        id0 id0Var = this.x50lh2ztY7Y5;
        id0Var.getClass();
        return id0Var.QrzZRwfaDlRX(Y1f8riQaR6yg, m9Var, false, (eb1) id0Var.TSizfFm2Yiuu);
    }

    public final ya1 a92UlCVFR9N8(String str, boolean z, za1 za1Var) {
        ya1 ya1Var;
        id0 id0Var = this.x50lh2ztY7Y5;
        id0Var.getClass();
        eb1 eb1Var = (eb1) id0Var.TSizfFm2Yiuu;
        ya1 r3s1LDPKFs1S = eb1Var.OPXfSBeufaJ8.r3s1LDPKFs1S(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = eb1Var.iterator();
        while (true) {
            gb1 gb1Var = (gb1) it;
            ya1Var = null;
            if (!gb1Var.hasNext()) {
                break;
            }
            za1 za1Var2 = (za1) gb1Var.next();
            if (!cs0.wdg6QnbFHrFF(za1Var2, za1Var)) {
                if (za1Var2 instanceof eb1) {
                    ya1Var = ((eb1) za1Var2).a92UlCVFR9N8(str, false, eb1Var);
                } else {
                    za1Var2.getClass();
                    ya1Var = za1Var2.OPXfSBeufaJ8.r3s1LDPKFs1S(str);
                }
            }
            if (ya1Var != null) {
                arrayList.add(ya1Var);
            }
        }
        ya1 ya1Var2 = (ya1) zk.HiC8volkyM7b(arrayList);
        eb1 eb1Var2 = eb1Var.wdg6QnbFHrFF;
        if (eb1Var2 != null && z && !eb1Var2.equals(za1Var)) {
            ya1Var = eb1Var2.a92UlCVFR9N8(str, true, eb1Var);
        }
        return (ya1) zk.HiC8volkyM7b(na.uURZJOrwXbxn(new ya1[]{r3s1LDPKFs1S, ya1Var2, ya1Var}));
    }

    public final ya1 e9gEMXR7LXtO(m9 m9Var, za1 za1Var) {
        return this.x50lh2ztY7Y5.QrzZRwfaDlRX(super.Y1f8riQaR6yg(m9Var), m9Var, true, za1Var);
    }

    @Override // defpackage.za1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eb1) || !super.equals(obj)) {
            return false;
        }
        id0 id0Var = this.x50lh2ztY7Y5;
        int e9gEMXR7LXtO = ((s82) id0Var.Y1f8riQaR6yg).e9gEMXR7LXtO();
        id0 id0Var2 = ((eb1) obj).x50lh2ztY7Y5;
        if (e9gEMXR7LXtO != ((s82) id0Var2.Y1f8riQaR6yg).e9gEMXR7LXtO() || id0Var.lS5Rgt96tfkO != id0Var2.lS5Rgt96tfkO) {
            return false;
        }
        s82 s82Var = (s82) id0Var.Y1f8riQaR6yg;
        s82Var.getClass();
        Iterator it = ((pr) z32.bEKsvqmvPh2y(new ZbWwgt3aGe7A(3, s82Var))).iterator();
        while (it.hasNext()) {
            za1 za1Var = (za1) it.next();
            if (!za1Var.equals(((s82) id0Var2.Y1f8riQaR6yg).lS5Rgt96tfkO(za1Var.OPXfSBeufaJ8.lS5Rgt96tfkO))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.za1
    public final int hashCode() {
        id0 id0Var = this.x50lh2ztY7Y5;
        int i = id0Var.lS5Rgt96tfkO;
        s82 s82Var = (s82) id0Var.Y1f8riQaR6yg;
        int e9gEMXR7LXtO = s82Var.e9gEMXR7LXtO();
        for (int i2 = 0; i2 < e9gEMXR7LXtO; i2++) {
            i = (((i * 31) + s82Var.TSizfFm2Yiuu(i2)) * 31) + ((za1) s82Var.a92UlCVFR9N8(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        id0 id0Var = this.x50lh2ztY7Y5;
        id0Var.getClass();
        return new gb1(id0Var);
    }

    @Override // defpackage.za1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        id0 id0Var = this.x50lh2ztY7Y5;
        String str = (String) id0Var.a92UlCVFR9N8;
        id0Var.getClass();
        za1 dgRBjINgWbAK = (str == null || ia2.fRTaYY6FBZcX(str)) ? null : id0Var.dgRBjINgWbAK(str, true);
        if (dgRBjINgWbAK == null) {
            dgRBjINgWbAK = id0Var.wdg6QnbFHrFF(id0Var.lS5Rgt96tfkO);
        }
        sb.append(" startDestination=");
        if (dgRBjINgWbAK == null) {
            String str2 = (String) id0Var.a92UlCVFR9N8;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) id0Var.e9gEMXR7LXtO;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(id0Var.lS5Rgt96tfkO));
                }
            }
        } else {
            sb.append("{");
            sb.append(dgRBjINgWbAK.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
