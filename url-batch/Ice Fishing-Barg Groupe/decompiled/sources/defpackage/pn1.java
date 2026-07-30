package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class pn1 implements SerialDescriptor, kh {
    public final nx0 OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final boolean[] RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public int Y1f8riQaR6yg = -1;
    public final List[] a92UlCVFR9N8;
    public final nx0 dgRBjINgWbAK;
    public final String[] e9gEMXR7LXtO;
    public final kg0 lS5Rgt96tfkO;
    public Map rtx2ld2ELZv4;
    public final nx0 wdg6QnbFHrFF;

    public pn1(String str, kg0 kg0Var, int i) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = kg0Var;
        this.TSizfFm2Yiuu = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e9gEMXR7LXtO = strArr;
        int i4 = this.TSizfFm2Yiuu;
        this.a92UlCVFR9N8 = new List[i4];
        this.RAsUl2FVSrh6 = new boolean[i4];
        this.rtx2ld2ELZv4 = q50.rtx2ld2ELZv4;
        ae0 ae0Var = new ae0(this) { // from class: on1
            public final /* synthetic */ pn1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i5 = i2;
                pn1 pn1Var = this.OPXfSBeufaJ8;
                switch (i5) {
                    case 0:
                        kg0 kg0Var2 = pn1Var.lS5Rgt96tfkO;
                        return (kg0Var2 == null || (childSerializers = kg0Var2.childSerializers()) == null) ? mm2.XL4ISE6Oc65B : childSerializers;
                    case 1:
                        kg0 kg0Var3 = pn1Var.lS5Rgt96tfkO;
                        if (kg0Var3 == null || (typeParametersSerializers = kg0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return fx1.jyegZNwi31qc(arrayList);
                    default:
                        return Integer.valueOf(ki0.nLZGh9p8gVSu(pn1Var, (SerialDescriptor[]) pn1Var.wdg6QnbFHrFF.getValue()));
                }
            }
        };
        pz0 pz0Var = pz0.rtx2ld2ELZv4;
        this.OPXfSBeufaJ8 = vi0.ryVscX7ZL4Ux(pz0Var, ae0Var);
        final int i5 = 1;
        this.wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: on1
            public final /* synthetic */ pn1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i5;
                pn1 pn1Var = this.OPXfSBeufaJ8;
                switch (i52) {
                    case 0:
                        kg0 kg0Var2 = pn1Var.lS5Rgt96tfkO;
                        return (kg0Var2 == null || (childSerializers = kg0Var2.childSerializers()) == null) ? mm2.XL4ISE6Oc65B : childSerializers;
                    case 1:
                        kg0 kg0Var3 = pn1Var.lS5Rgt96tfkO;
                        if (kg0Var3 == null || (typeParametersSerializers = kg0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return fx1.jyegZNwi31qc(arrayList);
                    default:
                        return Integer.valueOf(ki0.nLZGh9p8gVSu(pn1Var, (SerialDescriptor[]) pn1Var.wdg6QnbFHrFF.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.dgRBjINgWbAK = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: on1
            public final /* synthetic */ pn1 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i6;
                pn1 pn1Var = this.OPXfSBeufaJ8;
                switch (i52) {
                    case 0:
                        kg0 kg0Var2 = pn1Var.lS5Rgt96tfkO;
                        return (kg0Var2 == null || (childSerializers = kg0Var2.childSerializers()) == null) ? mm2.XL4ISE6Oc65B : childSerializers;
                    case 1:
                        kg0 kg0Var3 = pn1Var.lS5Rgt96tfkO;
                        if (kg0Var3 == null || (typeParametersSerializers = kg0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return fx1.jyegZNwi31qc(arrayList);
                    default:
                        return Integer.valueOf(ki0.nLZGh9p8gVSu(pn1Var, (SerialDescriptor[]) pn1Var.wdg6QnbFHrFF.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        List list = this.a92UlCVFR9N8[i];
        return list == null ? p50.rtx2ld2ELZv4 : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        Integer num = (Integer) this.rtx2ld2ELZv4.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.kh
    public final Set RAsUl2FVSrh6() {
        return this.rtx2ld2ELZv4.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public sj0 TSizfFm2Yiuu() {
        return wa2.e9gEMXR7LXtO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return this.TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        return this.RAsUl2FVSrh6[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        return this.e9gEMXR7LXtO[i];
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof pn1) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.PxuCJdSBwIXG.equals(serialDescriptor.lS5Rgt96tfkO()) && Arrays.equals((SerialDescriptor[]) this.wdg6QnbFHrFF.getValue(), (SerialDescriptor[]) ((pn1) obj).wdg6QnbFHrFF.getValue())) {
                int Y1f8riQaR6yg = serialDescriptor.Y1f8riQaR6yg();
                int i2 = this.TSizfFm2Yiuu;
                if (i2 == Y1f8riQaR6yg) {
                    for (0; i < i2; i + 1) {
                        i = (cs0.wdg6QnbFHrFF(wdg6QnbFHrFF(i).lS5Rgt96tfkO(), serialDescriptor.wdg6QnbFHrFF(i).lS5Rgt96tfkO()) && cs0.wdg6QnbFHrFF(wdg6QnbFHrFF(i).TSizfFm2Yiuu(), serialDescriptor.wdg6QnbFHrFF(i).TSizfFm2Yiuu())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return p50.rtx2ld2ELZv4;
    }

    public int hashCode() {
        return ((Number) this.dgRBjINgWbAK.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }

    public String toString() {
        return ki0.IXK6ba3ucyzm(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor wdg6QnbFHrFF(int i) {
        return ((KSerializer[]) this.OPXfSBeufaJ8.getValue())[i].getDescriptor();
    }

    public final void x50lh2ztY7Y5(String str, boolean z) {
        str.getClass();
        int i = this.Y1f8riQaR6yg + 1;
        this.Y1f8riQaR6yg = i;
        String[] strArr = this.e9gEMXR7LXtO;
        strArr[i] = str;
        this.RAsUl2FVSrh6[i] = z;
        this.a92UlCVFR9N8[i] = null;
        if (i == this.TSizfFm2Yiuu - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.rtx2ld2ELZv4 = hashMap;
        }
    }
}
