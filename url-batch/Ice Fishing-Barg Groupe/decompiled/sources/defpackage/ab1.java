package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ab1 {
    public final tc1 PxuCJdSBwIXG;
    public final String TSizfFm2Yiuu;
    public final LinkedHashMap Y1f8riQaR6yg;
    public final LinkedHashMap a92UlCVFR9N8;
    public final ArrayList e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;

    public ab1(tc1 tc1Var, ck ckVar, Map map) {
        String str;
        KSerializer serializer;
        KSerializer serializer2;
        map.getClass();
        int EcgxDIVH5in8 = (ckVar == null || (serializer2 = SerializersKt.serializer(ckVar)) == null) ? -1 : ni0.EcgxDIVH5in8(serializer2);
        int i = 0;
        if (ckVar == null || (serializer = SerializersKt.serializer(ckVar)) == null) {
            str = null;
        } else {
            if (serializer instanceof ko1) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                eu0 wLFCmsViZrNT = b51.wLFCmsViZrNT(((ko1) serializer).getDescriptor());
                throw new IllegalArgumentException(o0.gPXPFXrUH4XX(sb, wLFCmsViZrNT != null ? ((ck) wLFCmsViZrNT).TSizfFm2Yiuu() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            e0 e0Var = new e0(serializer);
            ai aiVar = new ai(8, e0Var);
            int Y1f8riQaR6yg = serializer.getDescriptor().Y1f8riQaR6yg();
            for (int i2 = 0; i2 < Y1f8riQaR6yg; i2++) {
                String e9gEMXR7LXtO = serializer.getDescriptor().e9gEMXR7LXtO(i2);
                dc1 cpQdD2nAriOS = ni0.cpQdD2nAriOS(serializer.getDescriptor().wdg6QnbFHrFF(i2), map);
                if (cpQdD2nAriOS == null) {
                    u9.XL4ISE6Oc65B(ni0.IXK6ba3ucyzm(e9gEMXR7LXtO, serializer.getDescriptor().wdg6QnbFHrFF(i2).lS5Rgt96tfkO(), serializer.getDescriptor().lS5Rgt96tfkO(), map.toString()));
                    throw null;
                }
                aiVar.a92UlCVFR9N8(Integer.valueOf(i2), e9gEMXR7LXtO, cpQdD2nAriOS);
            }
            str = ((String) e0Var.wdg6QnbFHrFF) + ((String) e0Var.dgRBjINgWbAK) + ((String) e0Var.x50lh2ztY7Y5);
        }
        this.PxuCJdSBwIXG = tc1Var;
        this.lS5Rgt96tfkO = EcgxDIVH5in8;
        this.TSizfFm2Yiuu = str;
        this.Y1f8riQaR6yg = new LinkedHashMap();
        this.e9gEMXR7LXtO = new ArrayList();
        this.a92UlCVFR9N8 = new LinkedHashMap();
        if (ckVar != null) {
            KSerializer serializer3 = SerializersKt.serializer(ckVar);
            serializer3.getClass();
            if (serializer3 instanceof ko1) {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + serializer3 + ". Arguments can only be generated from concrete classes or objects.");
            }
            int Y1f8riQaR6yg2 = serializer3.getDescriptor().Y1f8riQaR6yg();
            ArrayList arrayList = new ArrayList(Y1f8riQaR6yg2);
            for (int i3 = 0; i3 < Y1f8riQaR6yg2; i3++) {
                String e9gEMXR7LXtO2 = serializer3.getDescriptor().e9gEMXR7LXtO(i3);
                e9gEMXR7LXtO2.getClass();
                SerialDescriptor wdg6QnbFHrFF = serializer3.getDescriptor().wdg6QnbFHrFF(i3);
                boolean rtx2ld2ELZv4 = wdg6QnbFHrFF.rtx2ld2ELZv4();
                dc1 cpQdD2nAriOS2 = ni0.cpQdD2nAriOS(wdg6QnbFHrFF, map);
                if (cpQdD2nAriOS2 == null) {
                    u9.XL4ISE6Oc65B(ni0.IXK6ba3ucyzm(e9gEMXR7LXtO2, wdg6QnbFHrFF.lS5Rgt96tfkO(), serializer3.getDescriptor().lS5Rgt96tfkO(), map.toString()));
                    throw null;
                }
                arrayList.add(new t91(e9gEMXR7LXtO2, new v91(cpQdD2nAriOS2, rtx2ld2ELZv4, serializer3.getDescriptor().dgRBjINgWbAK(i3))));
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t91 t91Var = (t91) obj;
                this.Y1f8riQaR6yg.put(t91Var.PxuCJdSBwIXG, t91Var.lS5Rgt96tfkO);
            }
        }
    }

    public za1 PxuCJdSBwIXG() {
        za1 lS5Rgt96tfkO = lS5Rgt96tfkO();
        lS5Rgt96tfkO.getClass();
        cb1 cb1Var = lS5Rgt96tfkO.OPXfSBeufaJ8;
        for (Map.Entry entry : this.Y1f8riQaR6yg.entrySet()) {
            String str = (String) entry.getKey();
            v91 v91Var = (v91) entry.getValue();
            str.getClass();
            v91Var.getClass();
            cb1Var.getClass();
            ((LinkedHashMap) cb1Var.e9gEMXR7LXtO).put(str, v91Var);
        }
        ArrayList arrayList = this.e9gEMXR7LXtO;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final ta1 ta1Var = (ta1) obj;
            ta1Var.getClass();
            cb1Var.getClass();
            ArrayList ozEBbv0hFTAB = sj0.ozEBbv0hFTAB((LinkedHashMap) cb1Var.e9gEMXR7LXtO, new le0() { // from class: bb1
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj2) {
                    boolean contains;
                    int i3 = i;
                    ta1 ta1Var2 = ta1Var;
                    String str2 = (String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            contains = ta1Var2.TSizfFm2Yiuu().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = ta1Var2.TSizfFm2Yiuu().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!ozEBbv0hFTAB.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + ta1Var.PxuCJdSBwIXG + " can't be used to open destination " + ((za1) cb1Var.TSizfFm2Yiuu) + ".\nFollowing required arguments are missing: " + ozEBbv0hFTAB).toString());
            }
            ((ArrayList) cb1Var.Y1f8riQaR6yg).add(ta1Var);
        }
        Iterator it = this.a92UlCVFR9N8.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            u9.VhhvGxCb8gfr();
            return null;
        }
        String str2 = this.TSizfFm2Yiuu;
        if (str2 != null) {
            cb1Var.getClass();
            if (ia2.fRTaYY6FBZcX(str2)) {
                u9.XL4ISE6Oc65B("Cannot have an empty route");
                return null;
            }
            za1.Companion.getClass();
            String concat = "android-app://androidx.navigation/".concat(str2);
            final ta1 ta1Var2 = new ta1(concat);
            final int i3 = 1;
            ArrayList ozEBbv0hFTAB2 = sj0.ozEBbv0hFTAB((LinkedHashMap) cb1Var.e9gEMXR7LXtO, new le0() { // from class: bb1
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj2) {
                    boolean contains;
                    int i32 = i3;
                    ta1 ta1Var22 = ta1Var2;
                    String str22 = (String) obj2;
                    switch (i32) {
                        case 0:
                            str22.getClass();
                            contains = ta1Var22.TSizfFm2Yiuu().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = ta1Var22.TSizfFm2Yiuu().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!ozEBbv0hFTAB2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((za1) cb1Var.TSizfFm2Yiuu) + ". Following required arguments are missing: " + ozEBbv0hFTAB2).toString());
            }
            cb1Var.RAsUl2FVSrh6 = new qc2(new o5(21, concat));
            cb1Var.lS5Rgt96tfkO = concat.hashCode();
            cb1Var.a92UlCVFR9N8 = str2;
        }
        int i4 = this.lS5Rgt96tfkO;
        if (i4 != -1) {
            cb1Var.lS5Rgt96tfkO = i4;
        }
        return lS5Rgt96tfkO;
    }

    public za1 lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG();
    }
}
