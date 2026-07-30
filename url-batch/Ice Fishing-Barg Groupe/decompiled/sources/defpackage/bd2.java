package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bd2 {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r0 = defpackage.ng0.a92UlCVFR9N8(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        defpackage.cs0.r3s1LDPKFs1S(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fd2 PxuCJdSBwIXG(fy1 fy1Var, String str) {
        long j;
        Map lS5Rgt96tfkO;
        n42 n42Var;
        fy1Var.getClass();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                int cpQdD2nAriOS = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "name");
                int cpQdD2nAriOS2 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "type");
                int cpQdD2nAriOS3 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "notnull");
                int cpQdD2nAriOS4 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "pk");
                int cpQdD2nAriOS5 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "dflt_value");
                o41 o41Var = new o41();
                while (true) {
                    String dgRBjINgWbAK = amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS);
                    j = j2;
                    o41Var.put(dgRBjINgWbAK, new ad2(dgRBjINgWbAK, amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS2), amuv7NJvPxHu.getLong(cpQdD2nAriOS3) != j2, (int) amuv7NJvPxHu.getLong(cpQdD2nAriOS4), amuv7NJvPxHu.isNull(cpQdD2nAriOS5) ? null : amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS5), 2));
                    if (!amuv7NJvPxHu.tmVwIGCQF4zR()) {
                        break;
                    }
                    j2 = j;
                }
                lS5Rgt96tfkO = o41Var.lS5Rgt96tfkO();
                cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            } else {
                lS5Rgt96tfkO = q50.rtx2ld2ELZv4;
                cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                j = 0;
            }
            amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int cpQdD2nAriOS6 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "id");
                int cpQdD2nAriOS7 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "seq");
                int cpQdD2nAriOS8 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "table");
                int cpQdD2nAriOS9 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "on_delete");
                int cpQdD2nAriOS10 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "on_update");
                List kpCQ9veP6n3I = jh0.kpCQ9veP6n3I(amuv7NJvPxHu);
                amuv7NJvPxHu.reset();
                n42 n42Var2 = new n42();
                while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                    if (amuv7NJvPxHu.getLong(cpQdD2nAriOS7) == j) {
                        int i = (int) amuv7NJvPxHu.getLong(cpQdD2nAriOS6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = cpQdD2nAriOS6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : kpCQ9veP6n3I) {
                            int i3 = cpQdD2nAriOS7;
                            List list = kpCQ9veP6n3I;
                            if (((cd0) obj).rtx2ld2ELZv4 == i) {
                                arrayList3.add(obj);
                            }
                            cpQdD2nAriOS7 = i3;
                            kpCQ9veP6n3I = list;
                        }
                        int i4 = cpQdD2nAriOS7;
                        List list2 = kpCQ9veP6n3I;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            cd0 cd0Var = (cd0) obj2;
                            arrayList.add(cd0Var.wdg6QnbFHrFF);
                            arrayList2.add(cd0Var.dgRBjINgWbAK);
                            arrayList3 = arrayList3;
                        }
                        n42Var2.add(new cd2(amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS8), amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS9), amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS10), arrayList, arrayList2));
                        cpQdD2nAriOS6 = i2;
                        cpQdD2nAriOS7 = i4;
                        kpCQ9veP6n3I = list2;
                    }
                }
                n42 a92UlCVFR9N8 = ng0.a92UlCVFR9N8(n42Var2);
                cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA index_list(`" + str + "`)");
                try {
                    int cpQdD2nAriOS11 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "name");
                    int cpQdD2nAriOS12 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "origin");
                    int cpQdD2nAriOS13 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "unique");
                    if (cpQdD2nAriOS11 == -1 || cpQdD2nAriOS12 == -1 || cpQdD2nAriOS13 == -1) {
                        cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                        n42Var = null;
                    } else {
                        n42 n42Var3 = new n42();
                        while (true) {
                            if (!amuv7NJvPxHu.tmVwIGCQF4zR()) {
                                break;
                            }
                            if ("c".equals(amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS12))) {
                                ed2 rZjpSjn4zoMv = jh0.rZjpSjn4zoMv(fy1Var, amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS11), amuv7NJvPxHu.getLong(cpQdD2nAriOS13) == 1);
                                if (rZjpSjn4zoMv == null) {
                                    cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                                    n42Var = null;
                                    break;
                                }
                                n42Var3.add(rZjpSjn4zoMv);
                            }
                        }
                    }
                    return new fd2(str, lS5Rgt96tfkO, a92UlCVFR9N8, n42Var);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
