package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class za1 {
    public static final xa1 Companion = new xa1();
    public final cb1 OPXfSBeufaJ8;
    public final s82 dgRBjINgWbAK;
    public final String rtx2ld2ELZv4;
    public eb1 wdg6QnbFHrFF;

    static {
        new LinkedHashMap();
    }

    public za1(tc1 tc1Var) {
        tc1Var.getClass();
        uc1 uc1Var = vc1.Companion;
        Class<?> cls = tc1Var.getClass();
        uc1Var.getClass();
        this.rtx2ld2ELZv4 = uc1.PxuCJdSBwIXG(cls);
        this.OPXfSBeufaJ8 = new cb1(this);
        this.dgRBjINgWbAK = new s82();
    }

    public final Bundle PxuCJdSBwIXG(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.OPXfSBeufaJ8.e9gEMXR7LXtO;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((v91) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            ZbWwgt3aGe7A.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                v91 v91Var = (v91) entry2.getValue();
                boolean z = v91Var.Y1f8riQaR6yg;
                dc1 dc1Var = v91Var.PxuCJdSBwIXG;
                if (!z) {
                    str2.getClass();
                    if (v91Var.lS5Rgt96tfkO || !ZbWwgt3aGe7A.containsKey(str2) || !vi0.EpkonXwzFgDB(str2, ZbWwgt3aGe7A)) {
                        try {
                            dc1Var.PxuCJdSBwIXG(str2, ZbWwgt3aGe7A);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    u9.cpQdD2nAriOS("Wrong argument type for '", str2, "' in argument savedState. ", dc1Var.lS5Rgt96tfkO(), " expected.");
                    return null;
                }
            }
        }
        return ZbWwgt3aGe7A;
    }

    public final Map TSizfFm2Yiuu() {
        return w41.wLFCmsViZrNT((LinkedHashMap) this.OPXfSBeufaJ8.e9gEMXR7LXtO);
    }

    public ya1 Y1f8riQaR6yg(m9 m9Var) {
        boolean TSizfFm2Yiuu;
        eu1 eu1Var;
        e0 lS5Rgt96tfkO;
        cb1 cb1Var = this.OPXfSBeufaJ8;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cb1Var.e9gEMXR7LXtO;
        Uri uri = (Uri) m9Var.OPXfSBeufaJ8;
        ArrayList arrayList = (ArrayList) cb1Var.Y1f8riQaR6yg;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        ya1 ya1Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ta1 ta1Var = (ta1) obj;
            ta1Var.getClass();
            qc2 qc2Var = ta1Var.Y1f8riQaR6yg;
            if (((eu1) qc2Var.getValue()) == null) {
                TSizfFm2Yiuu = true;
            } else if (uri == null) {
                TSizfFm2Yiuu = false;
            } else {
                eu1 eu1Var2 = (eu1) qc2Var.getValue();
                eu1Var2.getClass();
                TSizfFm2Yiuu = eu1Var2.TSizfFm2Yiuu(uri.toString());
            }
            if (TSizfFm2Yiuu) {
                Bundle Y1f8riQaR6yg = uri != null ? ta1Var.Y1f8riQaR6yg(uri, linkedHashMap) : null;
                int lS5Rgt96tfkO2 = ta1Var.lS5Rgt96tfkO(uri);
                String str = (String) m9Var.wdg6QnbFHrFF;
                boolean z = str != null && str.equals(null);
                if (Y1f8riQaR6yg == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                        if (uri != null && (eu1Var = (eu1) qc2Var.getValue()) != null && (lS5Rgt96tfkO = eu1Var.lS5Rgt96tfkO(uri.toString())) != null) {
                            ta1Var.e9gEMXR7LXtO(lS5Rgt96tfkO, ZbWwgt3aGe7A, linkedHashMap);
                            if (((Boolean) ta1Var.e9gEMXR7LXtO.getValue()).booleanValue()) {
                                ta1Var.a92UlCVFR9N8(uri, ZbWwgt3aGe7A, linkedHashMap);
                            }
                        }
                        if (sj0.ozEBbv0hFTAB(linkedHashMap, new qa1(1, ZbWwgt3aGe7A)).isEmpty()) {
                        }
                    }
                }
                ya1 ya1Var2 = new ya1((za1) cb1Var.TSizfFm2Yiuu, Y1f8riQaR6yg, ta1Var.x50lh2ztY7Y5, lS5Rgt96tfkO2, z);
                if (ya1Var == null || ya1Var2.compareTo(ya1Var) > 0) {
                    ya1Var = ya1Var2;
                }
            }
        }
        return ya1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof za1)) {
                cb1 cb1Var = this.OPXfSBeufaJ8;
                ArrayList arrayList = (ArrayList) cb1Var.Y1f8riQaR6yg;
                za1 za1Var = (za1) obj;
                s82 s82Var = za1Var.dgRBjINgWbAK;
                cb1 cb1Var2 = za1Var.OPXfSBeufaJ8;
                boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(arrayList, (ArrayList) cb1Var2.Y1f8riQaR6yg);
                s82 s82Var2 = this.dgRBjINgWbAK;
                if (s82Var2.e9gEMXR7LXtO() == s82Var.e9gEMXR7LXtO()) {
                    Iterator it = ((pr) z32.bEKsvqmvPh2y(new t82(s82Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!cs0.wdg6QnbFHrFF(s82Var2.lS5Rgt96tfkO(intValue), s82Var.lS5Rgt96tfkO(intValue))) {
                        }
                    }
                    z = true;
                    if (TSizfFm2Yiuu().size() == za1Var.TSizfFm2Yiuu().size()) {
                        Set<Map.Entry> entrySet = TSizfFm2Yiuu().entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (za1Var.TSizfFm2Yiuu().containsKey(entry.getKey()) && cs0.wdg6QnbFHrFF(za1Var.TSizfFm2Yiuu().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (cb1Var.lS5Rgt96tfkO == cb1Var2.lS5Rgt96tfkO || !cs0.wdg6QnbFHrFF((String) cb1Var.a92UlCVFR9N8, (String) cb1Var2.a92UlCVFR9N8) || !wdg6QnbFHrFF || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (cb1Var.lS5Rgt96tfkO == cb1Var2.lS5Rgt96tfkO) {
                    }
                }
                z = false;
                if (TSizfFm2Yiuu().size() == za1Var.TSizfFm2Yiuu().size()) {
                }
                z2 = false;
                if (cb1Var.lS5Rgt96tfkO == cb1Var2.lS5Rgt96tfkO) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        cb1 cb1Var = this.OPXfSBeufaJ8;
        int i = cb1Var.lS5Rgt96tfkO * 31;
        String str = (String) cb1Var.a92UlCVFR9N8;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) cb1Var.Y1f8riQaR6yg;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((ta1) obj).PxuCJdSBwIXG.hashCode() + (hashCode * 31)) * 961;
        }
        s82 s82Var = this.dgRBjINgWbAK;
        s82Var.getClass();
        if (s82Var.e9gEMXR7LXtO() > 0) {
            s82Var.a92UlCVFR9N8(0).getClass();
            u9.VhhvGxCb8gfr();
            return 0;
        }
        for (String str2 : TSizfFm2Yiuu().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = TSizfFm2Yiuu().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public final int[] lS5Rgt96tfkO(za1 za1Var) {
        da daVar = new da();
        while (true) {
            cb1 cb1Var = this.OPXfSBeufaJ8;
            eb1 eb1Var = this.wdg6QnbFHrFF;
            if ((za1Var != null ? za1Var.wdg6QnbFHrFF : null) != null) {
                eb1 eb1Var2 = za1Var.wdg6QnbFHrFF;
                eb1Var2.getClass();
                if (eb1Var2.x50lh2ztY7Y5.wdg6QnbFHrFF(cb1Var.lS5Rgt96tfkO) == this) {
                    daVar.addFirst(this);
                    break;
                }
            }
            if (eb1Var == null || eb1Var.x50lh2ztY7Y5.lS5Rgt96tfkO != cb1Var.lS5Rgt96tfkO) {
                daVar.addFirst(this);
            }
            if (cs0.wdg6QnbFHrFF(eb1Var, za1Var) || eb1Var == null) {
                break;
            }
            this = eb1Var;
        }
        List i = zk.i(daVar);
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(i, 10));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((za1) it.next()).OPXfSBeufaJ8.lS5Rgt96tfkO));
        }
        return zk.h(arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        cb1 cb1Var = this.OPXfSBeufaJ8;
        cb1Var.getClass();
        sb.append(Integer.toHexString(cb1Var.lS5Rgt96tfkO));
        sb.append(")");
        String str = (String) cb1Var.a92UlCVFR9N8;
        if (str != null && !ia2.fRTaYY6FBZcX(str)) {
            sb.append(" route=");
            sb.append((String) cb1Var.a92UlCVFR9N8);
        }
        return sb.toString();
    }
}
