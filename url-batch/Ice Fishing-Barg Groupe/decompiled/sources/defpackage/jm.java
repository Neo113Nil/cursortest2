package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class jm implements pe0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0589, code lost:
    
        if (r3 == defpackage.fp.lS5Rgt96tfkO) goto L168;
     */
    @Override // defpackage.pe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        km kmVar;
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Bundle bundle = null;
        switch (i) {
            case 0:
                String str = (String) obj;
                fu fuVar = (fu) obj2;
                str.getClass();
                fuVar.getClass();
                if (str.length() == 0) {
                    return fuVar.toString();
                }
                return str + ", " + fuVar;
            case 1:
                hp hpVar = (hp) obj;
                int intValue = ((Integer) obj2).intValue();
                tf0 tf0Var = (tf0) hpVar;
                if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    Context context = (Context) tf0Var.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
                    Object[] copyOf = Arrays.copyOf(new tc1[0], 0);
                    int i2 = 22;
                    cr1 cr1Var = new cr1(5, new jm(10, r5 ? (byte) 1 : (byte) 0), new r3s1LDPKFs1S(i2, context));
                    boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(context);
                    Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv4) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu = new o5(i2, context);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                    ki0.Y1f8riQaR6yg((lb1) sj0.amuv7NJvPxHu(copyOf, cr1Var, (ae0) nLZGh9p8gVSu, tf0Var, 0, 4), tf0Var, 0);
                } else {
                    tf0Var.i68hK7ahKtgp();
                }
                return no2Var;
            case 2:
                hp hpVar2 = (hp) obj;
                int intValue2 = ((Integer) obj2).intValue();
                tf0 tf0Var2 = (tf0) hpVar2;
                if (tf0Var2.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    kj2.PxuCJdSBwIXG(6, tf0Var2);
                } else {
                    tf0Var2.i68hK7ahKtgp();
                }
                return no2Var;
            case 3:
                hu huVar = (hu) obj;
                fu fuVar2 = (fu) obj2;
                huVar.getClass();
                fuVar2.getClass();
                hu kpCQ9veP6n3I = huVar.kpCQ9veP6n3I(fuVar2.getKey());
                n50 n50Var = n50.rtx2ld2ELZv4;
                if (kpCQ9veP6n3I == n50Var) {
                    return fuVar2;
                }
                ih0 ih0Var = ih0.x50lh2ztY7Y5;
                ju juVar = (ju) kpCQ9veP6n3I.S2OOm9zPNm0h(ih0Var);
                if (juVar == null) {
                    kmVar = new km(fuVar2, kpCQ9veP6n3I);
                } else {
                    hu kpCQ9veP6n3I2 = kpCQ9veP6n3I.kpCQ9veP6n3I(ih0Var);
                    if (kpCQ9veP6n3I2 == n50Var) {
                        return new km(juVar, fuVar2);
                    }
                    kmVar = new km(juVar, new km(fuVar2, kpCQ9veP6n3I2));
                }
                return kmVar;
            case 4:
                return ((hu) obj).RfyTYNmI9Srp((fu) obj2);
            case 5:
                return ((hu) obj).RfyTYNmI9Srp((fu) obj2);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 7:
                ((Integer) obj2).getClass();
                qv0.a92UlCVFR9N8(ki0.bEKsvqmvPh2y(1), (hp) obj);
                return no2Var;
            case 8:
                jz0 jz0Var = (jz0) obj2;
                return fx1.D0aTLcX6Uhyo(Integer.valueOf(((hj1) jz0Var.e9gEMXR7LXtO.lS5Rgt96tfkO).rtx2ld2ELZv4()), Integer.valueOf(((hj1) jz0Var.e9gEMXR7LXtO.TSizfFm2Yiuu).rtx2ld2ELZv4()));
            case 9:
                Map e9gEMXR7LXtO = ((nz0) obj2).e9gEMXR7LXtO();
                if (e9gEMXR7LXtO.isEmpty()) {
                    return null;
                }
                return e9gEMXR7LXtO;
            case 10:
                lb1 lb1Var = (lb1) obj2;
                la1 la1Var = lb1Var.lS5Rgt96tfkO;
                LinkedHashMap linkedHashMap = la1Var.cpQdD2nAriOS;
                da daVar = la1Var.a92UlCVFR9N8;
                LinkedHashMap linkedHashMap2 = la1Var.x50lh2ztY7Y5;
                ArrayList arrayList = new ArrayList();
                Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                for (Map.Entry entry : w41.wLFCmsViZrNT(la1Var.RfyTYNmI9Srp.PxuCJdSBwIXG).entrySet()) {
                    ((tc1) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    kj0.nLZGh9p8gVSu(ZbWwgt3aGe7A, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", ZbWwgt3aGe7A);
                }
                if (!daVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = daVar.iterator();
                    while (it.hasNext()) {
                        x91 x91Var = (x91) it.next();
                        x91Var.getClass();
                        int i3 = x91Var.OPXfSBeufaJ8.OPXfSBeufaJ8.lS5Rgt96tfkO;
                        String str2 = x91Var.cpQdD2nAriOS;
                        z91 z91Var = x91Var.QrzZRwfaDlRX;
                        Bundle PxuCJdSBwIXG = z91Var.PxuCJdSBwIXG();
                        Bundle ZbWwgt3aGe7A2 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                        z91Var.rtx2ld2ELZv4.TSizfFm2Yiuu(ZbWwgt3aGe7A2);
                        Bundle ZbWwgt3aGe7A3 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                        str2.getClass();
                        ZbWwgt3aGe7A3.putString("nav-entry-state:id", str2);
                        ZbWwgt3aGe7A3.putInt("nav-entry-state:destination-id", i3);
                        if (PxuCJdSBwIXG == null) {
                            PxuCJdSBwIXG = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                        }
                        ZbWwgt3aGe7A3.putBundle("nav-entry-state:args", PxuCJdSBwIXG);
                        ZbWwgt3aGe7A3.putBundle("nav-entry-state:saved-state", ZbWwgt3aGe7A2);
                        arrayList2.add(ZbWwgt3aGe7A3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue3 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = intValue3;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i4 = i5;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    kj0.nLZGh9p8gVSu(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        da daVar2 = (da) entry3.getValue();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = daVar2.iterator();
                        while (it2.hasNext()) {
                            ca1 ca1Var = ((aa1) it2.next()).PxuCJdSBwIXG;
                            ca1Var.getClass();
                            Bundle ZbWwgt3aGe7A4 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                            String str5 = ca1Var.PxuCJdSBwIXG;
                            str5.getClass();
                            ZbWwgt3aGe7A4.putString("nav-entry-state:id", str5);
                            ZbWwgt3aGe7A4.putInt("nav-entry-state:destination-id", ca1Var.lS5Rgt96tfkO);
                            Bundle bundle2 = ca1Var.TSizfFm2Yiuu;
                            if (bundle2 == null) {
                                bundle2 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                            }
                            ZbWwgt3aGe7A4.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = ca1Var.Y1f8riQaR6yg;
                            bundle3.getClass();
                            ZbWwgt3aGe7A4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(ZbWwgt3aGe7A4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    kj0.nLZGh9p8gVSu(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (lb1Var.e9gEMXR7LXtO) {
                    if (bundle == null) {
                        bundle = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", lb1Var.e9gEMXR7LXtO);
                }
                return bundle;
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                yy1 yy1Var = (yy1) obj2;
                Map map = yy1Var.rtx2ld2ELZv4;
                v81 v81Var = yy1Var.OPXfSBeufaJ8;
                Object[] objArr = v81Var.lS5Rgt96tfkO;
                Object[] objArr2 = v81Var.TSizfFm2Yiuu;
                long[] jArr = v81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj3 = objArr[i9];
                                    Map e9gEMXR7LXtO2 = ((zy1) objArr2[i9]).e9gEMXR7LXtO();
                                    if (e9gEMXR7LXtO2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, e9gEMXR7LXtO2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 13:
                return obj2;
            case 14:
                v8 v8Var = (v8) obj2;
                return fx1.S9EYkSpbGuxq(v8Var.OPXfSBeufaJ8, zz1.PxuCJdSBwIXG(v8Var.rtx2ld2ELZv4, zz1.PxuCJdSBwIXG, (vy1) obj));
            case 15:
                return Integer.valueOf(((if2) obj2).PxuCJdSBwIXG);
            case 16:
                th2 th2Var = (th2) obj2;
                return fx1.S9EYkSpbGuxq(Float.valueOf(th2Var.PxuCJdSBwIXG), Float.valueOf(th2Var.lS5Rgt96tfkO));
            case 17:
                vy1 vy1Var = (vy1) obj;
                zh2 zh2Var = (zh2) obj2;
                hj2 hj2Var = new hj2(zh2Var.PxuCJdSBwIXG);
                yz1 yz1Var = zz1.VhhvGxCb8gfr;
                return fx1.S9EYkSpbGuxq(zz1.PxuCJdSBwIXG(hj2Var, yz1Var, vy1Var), zz1.PxuCJdSBwIXG(new hj2(zh2Var.lS5Rgt96tfkO), yz1Var, vy1Var));
            case 18:
                return Integer.valueOf(((xc0) obj2).rtx2ld2ELZv4);
            case 19:
                u11 u11Var = (u11) obj2;
                return fx1.S9EYkSpbGuxq(u11Var.PxuCJdSBwIXG, zz1.PxuCJdSBwIXG(u11Var.lS5Rgt96tfkO, zz1.OPXfSBeufaJ8, (vy1) obj));
            case 20:
                return Float.valueOf(((uc) obj2).PxuCJdSBwIXG);
            case 21:
                vy1 vy1Var2 = (vy1) obj;
                List list = (List) obj2;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList6.add(zz1.PxuCJdSBwIXG((u8) list.get(i10), zz1.lS5Rgt96tfkO, vy1Var2));
                }
                return arrayList6;
            case 22:
                vi2 vi2Var = (vi2) obj2;
                return fx1.S9EYkSpbGuxq(Integer.valueOf((int) (vi2Var.PxuCJdSBwIXG >> 32)), Integer.valueOf((int) (vi2Var.PxuCJdSBwIXG & 4294967295L)));
            case 23:
                vy1 vy1Var3 = (vy1) obj;
                w42 w42Var = (w42) obj2;
                return fx1.S9EYkSpbGuxq(zz1.PxuCJdSBwIXG(new hl(w42Var.PxuCJdSBwIXG), zz1.gPXPFXrUH4XX, vy1Var3), zz1.PxuCJdSBwIXG(new bf1(w42Var.lS5Rgt96tfkO), zz1.ZbWwgt3aGe7A, vy1Var3), Float.valueOf(w42Var.TSizfFm2Yiuu));
            case 24:
                return Integer.valueOf(((he2) obj2).PxuCJdSBwIXG);
            case 25:
                return Integer.valueOf(((nf2) obj2).PxuCJdSBwIXG);
            case 26:
                return Integer.valueOf(((om0) obj2).PxuCJdSBwIXG);
            case 27:
                return Integer.valueOf(((rc0) obj2).PxuCJdSBwIXG);
            case 28:
                return Integer.valueOf(((tc0) obj2).PxuCJdSBwIXG);
            default:
                vy1 vy1Var4 = (vy1) obj;
                hj2 hj2Var2 = (hj2) obj2;
                hj2.Companion.getClass();
                return hj2Var2 != null ? hj2.PxuCJdSBwIXG(hj2Var2.PxuCJdSBwIXG, hj2.TSizfFm2Yiuu) : false ? Boolean.FALSE : fx1.S9EYkSpbGuxq(Float.valueOf(hj2.TSizfFm2Yiuu(hj2Var2.PxuCJdSBwIXG)), zz1.PxuCJdSBwIXG(new jj2(hj2.lS5Rgt96tfkO(hj2Var2.PxuCJdSBwIXG)), zz1.S2OOm9zPNm0h, vy1Var4));
        }
    }

    public /* synthetic */ jm(int i, byte b) {
        this.rtx2ld2ELZv4 = i;
    }
}
