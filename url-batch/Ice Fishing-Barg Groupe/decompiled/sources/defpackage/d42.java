package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d42 implements SerialDescriptor, kh {
    public final boolean[] OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final SerialDescriptor[] RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final List Y1f8riQaR6yg;
    public final String[] a92UlCVFR9N8;
    public final SerialDescriptor[] dgRBjINgWbAK;
    public final HashSet e9gEMXR7LXtO;
    public final sj0 lS5Rgt96tfkO;
    public final List[] rtx2ld2ELZv4;
    public final Map wdg6QnbFHrFF;
    public final qc2 x50lh2ztY7Y5;

    public d42(String str, sj0 sj0Var, int i, List list, dk dkVar) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = sj0Var;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = dkVar.lS5Rgt96tfkO;
        ArrayList arrayList = dkVar.TSizfFm2Yiuu;
        arrayList.getClass();
        HashSet hashSet = new HashSet(w41.i68hK7ahKtgp(al.KZw9XyiywG4x(arrayList, 12)));
        zk.g(arrayList, hashSet);
        this.e9gEMXR7LXtO = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a92UlCVFR9N8 = strArr;
        this.RAsUl2FVSrh6 = fx1.jyegZNwi31qc(dkVar.e9gEMXR7LXtO);
        this.rtx2ld2ELZv4 = (List[]) dkVar.a92UlCVFR9N8.toArray(new List[0]);
        this.OPXfSBeufaJ8 = zk.f(dkVar.RAsUl2FVSrh6);
        strArr.getClass();
        un0 un0Var = new un0(0, new o5(3, strArr));
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(un0Var, 10));
        Iterator it = un0Var.iterator();
        while (true) {
            q30 q30Var = (q30) it;
            if (!q30Var.OPXfSBeufaJ8.hasNext()) {
                this.wdg6QnbFHrFF = w41.zf8DYfih6EZu(arrayList2);
                this.dgRBjINgWbAK = fx1.jyegZNwi31qc(list);
                this.x50lh2ztY7Y5 = new qc2(new uy1(7, this));
                return;
            }
            tn0 tn0Var = (tn0) q30Var.next();
            arrayList2.add(new vi1(tn0Var.lS5Rgt96tfkO, Integer.valueOf(tn0Var.PxuCJdSBwIXG)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        return this.rtx2ld2ELZv4[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        Integer num = (Integer) this.wdg6QnbFHrFF.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.kh
    public final Set RAsUl2FVSrh6() {
        return this.e9gEMXR7LXtO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return this.lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return this.TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        return this.OPXfSBeufaJ8[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        return this.a92UlCVFR9N8[i];
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d42) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.PxuCJdSBwIXG.equals(serialDescriptor.lS5Rgt96tfkO()) && Arrays.equals(this.dgRBjINgWbAK, ((d42) obj).dgRBjINgWbAK)) {
                int Y1f8riQaR6yg = serialDescriptor.Y1f8riQaR6yg();
                int i2 = this.TSizfFm2Yiuu;
                if (i2 == Y1f8riQaR6yg) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.RAsUl2FVSrh6;
                        i = (cs0.wdg6QnbFHrFF(serialDescriptorArr[i].lS5Rgt96tfkO(), serialDescriptor.wdg6QnbFHrFF(i).lS5Rgt96tfkO()) && cs0.wdg6QnbFHrFF(serialDescriptorArr[i].TSizfFm2Yiuu(), serialDescriptor.wdg6QnbFHrFF(i).TSizfFm2Yiuu())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return ((Number) this.x50lh2ztY7Y5.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return ki0.IXK6ba3ucyzm(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        return this.RAsUl2FVSrh6[i];
    }
}
