package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlinx.serialization.SerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class la1 {
    public static final ka1 Companion = new ka1();
    public f01 BRwzKIf41E4i;
    public final LinkedHashMap EcgxDIVH5in8;
    public final h52 IAToe7bXGz4N;
    public final cs1 OPXfSBeufaJ8;
    public final ga1 PxuCJdSBwIXG;
    public na1 QrzZRwfaDlRX;
    public final l92 RAsUl2FVSrh6;
    public final vc1 RfyTYNmI9Srp;
    public final LinkedHashMap S2OOm9zPNm0h;
    public le0 S9EYkSpbGuxq;
    public eb1 TSizfFm2Yiuu;
    public ia1 VhhvGxCb8gfr;
    public final ha1 XL4ISE6Oc65B;
    public Bundle Y1f8riQaR6yg;
    public int ZbWwgt3aGe7A;
    public final da a92UlCVFR9N8 = new da();
    public final LinkedHashMap cpQdD2nAriOS;
    public final LinkedHashMap dgRBjINgWbAK;
    public Bundle[] e9gEMXR7LXtO;
    public final ArrayList gPXPFXrUH4XX;
    public final da1 lS5Rgt96tfkO;
    public final ArrayList pnx5pC0XzaCw;
    public o01 r3s1LDPKFs1S;
    public final l92 rtx2ld2ELZv4;
    public final LinkedHashMap wdg6QnbFHrFF;
    public final LinkedHashMap x50lh2ztY7Y5;

    public la1(ga1 ga1Var, da1 da1Var) {
        this.PxuCJdSBwIXG = ga1Var;
        this.lS5Rgt96tfkO = da1Var;
        p50 p50Var = p50.rtx2ld2ELZv4;
        this.RAsUl2FVSrh6 = hq0.RAsUl2FVSrh6(p50Var);
        l92 RAsUl2FVSrh6 = hq0.RAsUl2FVSrh6(p50Var);
        this.rtx2ld2ELZv4 = RAsUl2FVSrh6;
        this.OPXfSBeufaJ8 = new cs1(RAsUl2FVSrh6);
        this.wdg6QnbFHrFF = new LinkedHashMap();
        this.dgRBjINgWbAK = new LinkedHashMap();
        this.x50lh2ztY7Y5 = new LinkedHashMap();
        this.cpQdD2nAriOS = new LinkedHashMap();
        this.gPXPFXrUH4XX = new ArrayList();
        this.BRwzKIf41E4i = f01.OPXfSBeufaJ8;
        this.XL4ISE6Oc65B = new ha1(0, this);
        this.RfyTYNmI9Srp = new vc1();
        this.EcgxDIVH5in8 = new LinkedHashMap();
        this.S2OOm9zPNm0h = new LinkedHashMap();
        this.pnx5pC0XzaCw = new ArrayList();
        this.IAToe7bXGz4N = b51.tmVwIGCQF4zR(2, ag.OPXfSBeufaJ8);
    }

    public static za1 Y1f8riQaR6yg(int i, za1 za1Var, za1 za1Var2, boolean z) {
        if (za1Var.OPXfSBeufaJ8.lS5Rgt96tfkO == i && (za1Var2 == null || (za1Var.equals(za1Var2) && cs0.wdg6QnbFHrFF(za1Var.wdg6QnbFHrFF, za1Var2.wdg6QnbFHrFF)))) {
            return za1Var;
        }
        eb1 eb1Var = za1Var instanceof eb1 ? (eb1) za1Var : null;
        if (eb1Var == null) {
            eb1Var = za1Var.wdg6QnbFHrFF;
            eb1Var.getClass();
        }
        return eb1Var.x50lh2ztY7Y5.x50lh2ztY7Y5(i, eb1Var, za1Var2, z);
    }

    public static /* synthetic */ void r3s1LDPKFs1S(la1 la1Var, x91 x91Var) {
        la1Var.cpQdD2nAriOS(x91Var, false, new da());
    }

    public final void BRwzKIf41E4i(x91 x91Var) {
        x91Var.getClass();
        x91 x91Var2 = (x91) this.wdg6QnbFHrFF.remove(x91Var);
        if (x91Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.dgRBjINgWbAK;
        ab abVar = (ab) linkedHashMap.get(x91Var2);
        Integer valueOf = abVar != null ? Integer.valueOf(abVar.PxuCJdSBwIXG.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            fa1 fa1Var = (fa1) this.EcgxDIVH5in8.get(this.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var2.OPXfSBeufaJ8.rtx2ld2ELZv4));
            if (fa1Var != null) {
                fa1Var.TSizfFm2Yiuu(x91Var2);
            }
            linkedHashMap.remove(x91Var2);
        }
    }

    public final eb1 OPXfSBeufaJ8() {
        za1 za1Var;
        x91 x91Var = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
        if (x91Var == null || (za1Var = x91Var.OPXfSBeufaJ8) == null) {
            za1Var = this.TSizfFm2Yiuu;
            za1Var.getClass();
        }
        eb1 eb1Var = za1Var instanceof eb1 ? (eb1) za1Var : null;
        if (eb1Var != null) {
            return eb1Var;
        }
        eb1 eb1Var2 = za1Var.wdg6QnbFHrFF;
        eb1Var2.getClass();
        return eb1Var2;
    }

    public final void PxuCJdSBwIXG(za1 za1Var, Bundle bundle, x91 x91Var, List list) {
        Bundle bundle2;
        eb1 eb1Var;
        Object obj;
        Object obj2;
        za1 za1Var2 = x91Var.OPXfSBeufaJ8;
        boolean z = za1Var2 instanceof vz;
        int i = 0;
        da daVar = this.a92UlCVFR9N8;
        if (!z) {
            while (!daVar.isEmpty() && (((x91) daVar.last()).OPXfSBeufaJ8 instanceof vz) && x50lh2ztY7Y5(((x91) daVar.last()).OPXfSBeufaJ8.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false)) {
            }
        }
        da daVar2 = new da();
        boolean z2 = za1Var instanceof eb1;
        ga1 ga1Var = this.PxuCJdSBwIXG;
        Object obj3 = null;
        if (z2) {
            za1 za1Var3 = za1Var2;
            while (true) {
                za1Var3.getClass();
                eb1 eb1Var2 = za1Var3.wdg6QnbFHrFF;
                if (eb1Var2 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (cs0.wdg6QnbFHrFF(((x91) obj2).OPXfSBeufaJ8, eb1Var2)) {
                                break;
                            }
                        }
                    }
                    x91 x91Var2 = (x91) obj2;
                    if (x91Var2 == null) {
                        bundle2 = bundle;
                        x91Var2 = w91.PxuCJdSBwIXG(x91.Companion, ga1Var.TSizfFm2Yiuu, eb1Var2, bundle2, rtx2ld2ELZv4(), this.QrzZRwfaDlRX);
                    } else {
                        bundle2 = bundle;
                    }
                    daVar2.addFirst(x91Var2);
                    if (!daVar.isEmpty() && ((x91) daVar.last()).OPXfSBeufaJ8 == eb1Var2) {
                        r3s1LDPKFs1S(this, (x91) daVar.last());
                    }
                } else {
                    bundle2 = bundle;
                }
                if (eb1Var2 == null || eb1Var2 == za1Var) {
                    break;
                } else {
                    za1Var3 = eb1Var2;
                }
            }
        } else {
            bundle2 = bundle;
        }
        za1 za1Var4 = daVar2.isEmpty() ? za1Var2 : ((x91) daVar2.first()).OPXfSBeufaJ8;
        while (za1Var4 != null && TSizfFm2Yiuu(za1Var4.OPXfSBeufaJ8.lS5Rgt96tfkO, za1Var4) != za1Var4) {
            eb1 eb1Var3 = za1Var4.wdg6QnbFHrFF;
            if (eb1Var3 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (cs0.wdg6QnbFHrFF(((x91) obj).OPXfSBeufaJ8, eb1Var3)) {
                            break;
                        }
                    }
                }
                x91 x91Var3 = (x91) obj;
                if (x91Var3 == null) {
                    eb1Var = eb1Var3;
                    x91Var3 = w91.PxuCJdSBwIXG(x91.Companion, ga1Var.TSizfFm2Yiuu, eb1Var, eb1Var3.PxuCJdSBwIXG(bundle3), rtx2ld2ELZv4(), this.QrzZRwfaDlRX);
                } else {
                    eb1Var = eb1Var3;
                }
                daVar2.addFirst(x91Var3);
            } else {
                eb1Var = eb1Var3;
            }
            za1Var4 = eb1Var;
        }
        if (!daVar2.isEmpty()) {
            za1Var2 = ((x91) daVar2.first()).OPXfSBeufaJ8;
        }
        while (!daVar.isEmpty() && (((x91) daVar.last()).OPXfSBeufaJ8 instanceof eb1)) {
            za1 za1Var5 = ((x91) daVar.last()).OPXfSBeufaJ8;
            za1Var5.getClass();
            if (((s82) ((eb1) za1Var5).x50lh2ztY7Y5.Y1f8riQaR6yg).lS5Rgt96tfkO(za1Var2.OPXfSBeufaJ8.lS5Rgt96tfkO) != null) {
                break;
            } else {
                r3s1LDPKFs1S(this, (x91) daVar.last());
            }
        }
        x91 x91Var4 = (x91) daVar.e9gEMXR7LXtO();
        if (x91Var4 == null) {
            x91Var4 = (x91) daVar2.e9gEMXR7LXtO();
        }
        if (!cs0.wdg6QnbFHrFF(x91Var4 != null ? x91Var4.OPXfSBeufaJ8 : null, this.TSizfFm2Yiuu)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                za1 za1Var6 = ((x91) previous).OPXfSBeufaJ8;
                eb1 eb1Var4 = this.TSizfFm2Yiuu;
                eb1Var4.getClass();
                if (cs0.wdg6QnbFHrFF(za1Var6, eb1Var4)) {
                    obj3 = previous;
                    break;
                }
            }
            x91 x91Var5 = (x91) obj3;
            if (x91Var5 == null) {
                w91 w91Var = x91.Companion;
                q3 q3Var = ga1Var.TSizfFm2Yiuu;
                eb1 eb1Var5 = this.TSizfFm2Yiuu;
                eb1Var5.getClass();
                eb1 eb1Var6 = this.TSizfFm2Yiuu;
                eb1Var6.getClass();
                x91Var5 = w91.PxuCJdSBwIXG(w91Var, q3Var, eb1Var5, eb1Var6.PxuCJdSBwIXG(bundle2), rtx2ld2ELZv4(), this.QrzZRwfaDlRX);
            }
            daVar2.addFirst(x91Var5);
        }
        Iterator it = daVar2.iterator();
        while (it.hasNext()) {
            x91 x91Var6 = (x91) it.next();
            Object obj4 = this.EcgxDIVH5in8.get(this.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var6.OPXfSBeufaJ8.rtx2ld2ELZv4));
            if (obj4 == null) {
                rc1.e9gEMXR7LXtO(o0.gPXPFXrUH4XX(new StringBuilder("NavigatorBackStack for "), za1Var.rtx2ld2ELZv4, " should already be created"));
                return;
            }
            ((fa1) obj4).PxuCJdSBwIXG(x91Var6);
        }
        daVar.addAll(daVar2);
        daVar.addLast(x91Var);
        ArrayList P6VAkUObIv30 = zk.P6VAkUObIv30(daVar2, x91Var);
        int size = P6VAkUObIv30.size();
        while (i < size) {
            Object obj5 = P6VAkUObIv30.get(i);
            i++;
            x91 x91Var7 = (x91) obj5;
            eb1 eb1Var7 = x91Var7.OPXfSBeufaJ8.wdg6QnbFHrFF;
            if (eb1Var7 != null) {
                wdg6QnbFHrFF(x91Var7, e9gEMXR7LXtO(eb1Var7.OPXfSBeufaJ8.lS5Rgt96tfkO));
            }
        }
    }

    public final ArrayList QrzZRwfaDlRX() {
        f01 f01Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.EcgxDIVH5in8.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f01Var = f01.dgRBjINgWbAK;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((fa1) it.next()).a92UlCVFR9N8.rtx2ld2ELZv4.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                x91 x91Var = (x91) obj;
                if (!arrayList.contains(x91Var) && x91Var.QrzZRwfaDlRX.dgRBjINgWbAK.compareTo(f01Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            el.MBpAROcyNHKN(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.a92UlCVFR9N8.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            x91 x91Var2 = (x91) next;
            if (!arrayList.contains(x91Var2) && x91Var2.QrzZRwfaDlRX.dgRBjINgWbAK.compareTo(f01Var) >= 0) {
                arrayList3.add(next);
            }
        }
        el.MBpAROcyNHKN(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((x91) obj2).OPXfSBeufaJ8 instanceof eb1)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final eb1 RAsUl2FVSrh6() {
        eb1 eb1Var = this.TSizfFm2Yiuu;
        if (eb1Var != null) {
            eb1Var.getClass();
            return eb1Var;
        }
        u9.rtx2ld2ELZv4("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final za1 TSizfFm2Yiuu(int i, za1 za1Var) {
        za1 za1Var2;
        eb1 eb1Var = this.TSizfFm2Yiuu;
        if (eb1Var == null) {
            return null;
        }
        if (eb1Var.OPXfSBeufaJ8.lS5Rgt96tfkO == i) {
            if (za1Var == null) {
                return eb1Var;
            }
            if (cs0.wdg6QnbFHrFF(eb1Var, za1Var) && za1Var.wdg6QnbFHrFF == null) {
                return this.TSizfFm2Yiuu;
            }
        }
        x91 x91Var = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
        if (x91Var == null || (za1Var2 = x91Var.OPXfSBeufaJ8) == null) {
            za1Var2 = this.TSizfFm2Yiuu;
            za1Var2.getClass();
        }
        return Y1f8riQaR6yg(i, za1Var2, za1Var, false);
    }

    public final void XL4ISE6Oc65B() {
        ab abVar;
        cs1 cs1Var;
        Set set;
        ArrayList j = zk.j(this.a92UlCVFR9N8);
        if (j.isEmpty()) {
            return;
        }
        ArrayList PsecLrZVVK61 = fx1.PsecLrZVVK61(((x91) zk.kRWHK87H9qm4(j)).OPXfSBeufaJ8);
        ArrayList arrayList = new ArrayList();
        if (zk.kRWHK87H9qm4(PsecLrZVVK61) instanceof vz) {
            Iterator it = zk.b(j).iterator();
            while (it.hasNext()) {
                za1 za1Var = ((x91) it.next()).OPXfSBeufaJ8;
                arrayList.add(za1Var);
                if (!(za1Var instanceof vz) && !(za1Var instanceof eb1)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (x91 x91Var : zk.b(j)) {
            f01 f01Var = x91Var.QrzZRwfaDlRX.dgRBjINgWbAK;
            za1 za1Var2 = x91Var.OPXfSBeufaJ8;
            za1 za1Var3 = (za1) zk.FT2GK7JK5Ma2(PsecLrZVVK61);
            f01 f01Var2 = f01.x50lh2ztY7Y5;
            f01 f01Var3 = f01.dgRBjINgWbAK;
            if (za1Var3 != null && za1Var3.OPXfSBeufaJ8.lS5Rgt96tfkO == za1Var2.OPXfSBeufaJ8.lS5Rgt96tfkO) {
                if (f01Var != f01Var2) {
                    fa1 fa1Var = (fa1) this.EcgxDIVH5in8.get(this.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var.OPXfSBeufaJ8.rtx2ld2ELZv4));
                    if (cs0.wdg6QnbFHrFF((fa1Var == null || (cs1Var = fa1Var.a92UlCVFR9N8) == null || (set = (Set) cs1Var.rtx2ld2ELZv4.getValue()) == null) ? null : Boolean.valueOf(set.contains(x91Var)), Boolean.TRUE) || ((abVar = (ab) this.dgRBjINgWbAK.get(x91Var)) != null && abVar.PxuCJdSBwIXG.get() == 0)) {
                        hashMap.put(x91Var, f01Var3);
                    } else {
                        hashMap.put(x91Var, f01Var2);
                    }
                }
                za1 za1Var4 = (za1) zk.FT2GK7JK5Ma2(arrayList);
                if (za1Var4 != null && za1Var4.OPXfSBeufaJ8.lS5Rgt96tfkO == za1Var2.OPXfSBeufaJ8.lS5Rgt96tfkO) {
                    el.EP3hG58ROvHh(arrayList);
                }
                el.EP3hG58ROvHh(PsecLrZVVK61);
                eb1 eb1Var = za1Var2.wdg6QnbFHrFF;
                if (eb1Var != null) {
                    PsecLrZVVK61.add(eb1Var);
                }
            } else if (arrayList.isEmpty() || za1Var2.OPXfSBeufaJ8.lS5Rgt96tfkO != ((za1) zk.MDTGUQSX7PXD(arrayList)).OPXfSBeufaJ8.lS5Rgt96tfkO) {
                x91Var.PxuCJdSBwIXG(f01.wdg6QnbFHrFF);
            } else {
                za1 za1Var5 = (za1) el.EP3hG58ROvHh(arrayList);
                if (f01Var == f01Var2) {
                    x91Var.PxuCJdSBwIXG(f01Var3);
                } else if (f01Var != f01Var3) {
                    hashMap.put(x91Var, f01Var3);
                }
                eb1 eb1Var2 = za1Var5.wdg6QnbFHrFF;
                if (eb1Var2 != null && !arrayList.contains(eb1Var2)) {
                    arrayList.add(eb1Var2);
                }
            }
        }
        int size = j.size();
        int i = 0;
        while (i < size) {
            Object obj = j.get(i);
            i++;
            x91 x91Var2 = (x91) obj;
            f01 f01Var4 = (f01) hashMap.get(x91Var2);
            if (f01Var4 != null) {
                x91Var2.PxuCJdSBwIXG(f01Var4);
            } else {
                x91Var2.QrzZRwfaDlRX.lS5Rgt96tfkO();
            }
        }
    }

    public final za1 a92UlCVFR9N8() {
        x91 x91Var = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
        if (x91Var != null) {
            return x91Var.OPXfSBeufaJ8;
        }
        return null;
    }

    public final void cpQdD2nAriOS(x91 x91Var, boolean z, da daVar) {
        na1 na1Var;
        cs1 cs1Var;
        Set set;
        x91Var.getClass();
        da daVar2 = this.a92UlCVFR9N8;
        x91 x91Var2 = (x91) daVar2.last();
        if (!cs0.wdg6QnbFHrFF(x91Var2, x91Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(x91Var.OPXfSBeufaJ8);
            za1 za1Var = x91Var2.OPXfSBeufaJ8;
            sb.append(", which is not the top of the back stack (");
            sb.append(za1Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        el.W7ceZOzvrRuI(daVar2);
        fa1 fa1Var = (fa1) this.EcgxDIVH5in8.get(this.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var2.OPXfSBeufaJ8.rtx2ld2ELZv4));
        boolean z2 = true;
        if ((fa1Var == null || (cs1Var = fa1Var.a92UlCVFR9N8) == null || (set = (Set) cs1Var.rtx2ld2ELZv4.getValue()) == null || !set.contains(x91Var2)) && !this.dgRBjINgWbAK.containsKey(x91Var2)) {
            z2 = false;
        }
        f01 f01Var = x91Var2.QrzZRwfaDlRX.wdg6QnbFHrFF.rtx2ld2ELZv4;
        f01 f01Var2 = f01.wdg6QnbFHrFF;
        if (f01Var.compareTo(f01Var2) >= 0) {
            if (z) {
                x91Var2.PxuCJdSBwIXG(f01Var2);
                daVar.addFirst(new aa1(x91Var2));
            }
            if (z2) {
                x91Var2.PxuCJdSBwIXG(f01Var2);
            } else {
                x91Var2.PxuCJdSBwIXG(f01.rtx2ld2ELZv4);
                BRwzKIf41E4i(x91Var2);
            }
        }
        if (z || z2 || (na1Var = this.QrzZRwfaDlRX) == null) {
            return;
        }
        String str = x91Var2.cpQdD2nAriOS;
        str.getClass();
        or2 or2Var = (or2) na1Var.lS5Rgt96tfkO.remove(str);
        if (or2Var != null) {
            or2Var.PxuCJdSBwIXG();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0226, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0126, code lost:
    
        if (r24.OPXfSBeufaJ8.lS5Rgt96tfkO == r5.OPXfSBeufaJ8.lS5Rgt96tfkO) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r13.equals(r5) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        r5 = new defpackage.da();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        if (defpackage.fx1.xbgXKYA2cIfu(r23.a92UlCVFR9N8) < r6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        r12 = (defpackage.x91) defpackage.el.W7ceZOzvrRuI(r23.a92UlCVFR9N8);
        BRwzKIf41E4i(r12);
        r13 = new defpackage.x91(r12.rtx2ld2ELZv4, r12.OPXfSBeufaJ8, r12.OPXfSBeufaJ8.PxuCJdSBwIXG(r25), r12.dgRBjINgWbAK, r12.x50lh2ztY7Y5, r12.cpQdD2nAriOS, r12.r3s1LDPKFs1S);
        r1 = r13.QrzZRwfaDlRX;
        r4 = r12.dgRBjINgWbAK;
        r1.getClass();
        r4.getClass();
        r1.Y1f8riQaR6yg = r4;
        r1 = r13.QrzZRwfaDlRX;
        r4 = r12.QrzZRwfaDlRX.dgRBjINgWbAK;
        r1.getClass();
        r4.getClass();
        r1.dgRBjINgWbAK = r4;
        r1.lS5Rgt96tfkO();
        r5.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0184, code lost:
    
        r1 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
    
        if (r1.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018e, code lost:
    
        r4 = (defpackage.x91) r1.next();
        r6 = r4.OPXfSBeufaJ8.wdg6QnbFHrFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0198, code lost:
    
        if (r6 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
    
        wdg6QnbFHrFF(r4, e9gEMXR7LXtO(r6.OPXfSBeufaJ8.lS5Rgt96tfkO));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a5, code lost:
    
        r23.a92UlCVFR9N8.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ab, code lost:
    
        r1 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b3, code lost:
    
        if (r1.hasNext() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b5, code lost:
    
        r4 = (defpackage.x91) r1.next();
        r5 = r23.RfyTYNmI9Srp.lS5Rgt96tfkO(r4.OPXfSBeufaJ8.rtx2ld2ELZv4);
        r6 = r4.OPXfSBeufaJ8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c7, code lost:
    
        if (r6 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ca, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cb, code lost:
    
        if (r6 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ce, code lost:
    
        defpackage.xi0.gGoUzNp9JO5I(new defpackage.xy0(26));
        r5.TSizfFm2Yiuu(r6);
        r5 = r5.lS5Rgt96tfkO();
        r6 = r5.PxuCJdSBwIXG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e1, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        r9 = defpackage.zk.j((java.util.Collection) r5.e9gEMXR7LXtO.rtx2ld2ELZv4.getValue());
        r11 = r9.listIterator(r9.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fc, code lost:
    
        if (r11.hasPrevious() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
    
        if (defpackage.cs0.wdg6QnbFHrFF(((defpackage.x91) r11.previous()).cpQdD2nAriOS, r4.cpQdD2nAriOS) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020e, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0216, code lost:
    
        r9.set(r11, r4);
        r4 = r5.lS5Rgt96tfkO;
        r4.getClass();
        r4.OPXfSBeufaJ8(null, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0215, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0213, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0272 A[LOOP:1: B:20:0x026c->B:22:0x0272, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dgRBjINgWbAK(za1 za1Var, Bundle bundle, xb1 xb1Var) {
        boolean z;
        boolean z2;
        ListIterator listIterator;
        int i;
        Iterator it;
        boolean x50lh2ztY7Y5;
        za1Var.getClass();
        Iterator it2 = this.EcgxDIVH5in8.values().iterator();
        while (it2.hasNext()) {
            ((fa1) it2.next()).Y1f8riQaR6yg = true;
        }
        vt1 vt1Var = new vt1();
        if (xb1Var != null) {
            eu0 eu0Var = xb1Var.rtx2ld2ELZv4;
            if (eu0Var != null) {
                x50lh2ztY7Y5 = x50lh2ztY7Y5(ni0.EcgxDIVH5in8(SerializersKt.serializer(eu0Var)), xb1Var.Y1f8riQaR6yg, xb1Var.e9gEMXR7LXtO);
            } else {
                int i2 = xb1Var.TSizfFm2Yiuu;
                if (i2 != -1) {
                    x50lh2ztY7Y5 = x50lh2ztY7Y5(i2, xb1Var.Y1f8riQaR6yg, xb1Var.e9gEMXR7LXtO);
                }
            }
            z = x50lh2ztY7Y5;
            Bundle PxuCJdSBwIXG = za1Var.PxuCJdSBwIXG(bundle);
            if (xb1Var == null && xb1Var.lS5Rgt96tfkO && this.x50lh2ztY7Y5.containsKey(Integer.valueOf(za1Var.OPXfSBeufaJ8.lS5Rgt96tfkO))) {
                vt1Var.rtx2ld2ELZv4 = gPXPFXrUH4XX(za1Var.OPXfSBeufaJ8.lS5Rgt96tfkO, PxuCJdSBwIXG, xb1Var);
                z2 = false;
            } else {
                if (xb1Var != null && xb1Var.PxuCJdSBwIXG) {
                    x91 x91Var = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
                    da daVar = this.a92UlCVFR9N8;
                    listIterator = daVar.listIterator(daVar.PxuCJdSBwIXG());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i = -1;
                            break;
                        } else if (((x91) listIterator.previous()).OPXfSBeufaJ8 == za1Var) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i != -1) {
                        if (za1Var instanceof eb1) {
                            eb1.Companion.getClass();
                            List KUoIVIumpKat = z32.KUoIVIumpKat(new hd2(z32.ngxnMNrpiKat((eb1) za1Var, new xy0(20)), new xy0(15), 1));
                            if (this.a92UlCVFR9N8.wdg6QnbFHrFF - i == KUoIVIumpKat.size()) {
                                da daVar2 = this.a92UlCVFR9N8;
                                List subList = daVar2.subList(i, daVar2.wdg6QnbFHrFF);
                                ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((x91) it3.next()).OPXfSBeufaJ8.OPXfSBeufaJ8.lS5Rgt96tfkO));
                                }
                            }
                        } else if (x91Var != null) {
                            za1 za1Var2 = x91Var.OPXfSBeufaJ8;
                            if (za1Var2 != null) {
                            }
                        }
                        if (!z2) {
                            x91 PxuCJdSBwIXG2 = w91.PxuCJdSBwIXG(x91.Companion, this.PxuCJdSBwIXG.TSizfFm2Yiuu, za1Var, PxuCJdSBwIXG, rtx2ld2ELZv4(), this.QrzZRwfaDlRX);
                            tc1 lS5Rgt96tfkO = this.RfyTYNmI9Srp.lS5Rgt96tfkO(za1Var.rtx2ld2ELZv4);
                            List jJwa0q7P5wHq = fx1.jJwa0q7P5wHq(PxuCJdSBwIXG2);
                            this.S9EYkSpbGuxq = new d7(vt1Var, this, za1Var, PxuCJdSBwIXG);
                            lS5Rgt96tfkO.Y1f8riQaR6yg(jJwa0q7P5wHq, xb1Var);
                            this.S9EYkSpbGuxq = null;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
            this.lS5Rgt96tfkO.PxuCJdSBwIXG();
            it = this.EcgxDIVH5in8.values().iterator();
            while (it.hasNext()) {
                ((fa1) it.next()).Y1f8riQaR6yg = false;
            }
            if (!z || vt1Var.rtx2ld2ELZv4 || z2) {
                lS5Rgt96tfkO();
            } else {
                XL4ISE6Oc65B();
                return;
            }
        }
        z = false;
        Bundle PxuCJdSBwIXG3 = za1Var.PxuCJdSBwIXG(bundle);
        if (xb1Var == null) {
        }
        if (xb1Var != null) {
            x91 x91Var2 = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
            da daVar3 = this.a92UlCVFR9N8;
            listIterator = daVar3.listIterator(daVar3.PxuCJdSBwIXG());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        z2 = false;
        if (!z2) {
        }
        this.lS5Rgt96tfkO.PxuCJdSBwIXG();
        it = this.EcgxDIVH5in8.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        lS5Rgt96tfkO();
    }

    public final x91 e9gEMXR7LXtO(int i) {
        Object obj;
        da daVar = this.a92UlCVFR9N8;
        ListIterator<E> listIterator = daVar.listIterator(daVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((x91) obj).OPXfSBeufaJ8.OPXfSBeufaJ8.lS5Rgt96tfkO == i) {
                break;
            }
        }
        x91 x91Var = (x91) obj;
        if (x91Var != null) {
            return x91Var;
        }
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        BRwzKIf41E4i.append(a92UlCVFR9N8());
        throw new IllegalArgumentException(BRwzKIf41E4i.toString().toString());
    }

    public final boolean gPXPFXrUH4XX(int i, Bundle bundle, xb1 xb1Var) {
        za1 RAsUl2FVSrh6;
        x91 x91Var;
        za1 za1Var;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.x50lh2ztY7Y5;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (cs0.wdg6QnbFHrFF((String) it.next(), str)) {
                it.remove();
            }
        }
        da daVar = (da) mm2.RfyTYNmI9Srp(this.cpQdD2nAriOS).remove(str);
        q3 q3Var = this.PxuCJdSBwIXG.TSizfFm2Yiuu;
        ArrayList arrayList = new ArrayList();
        x91 x91Var2 = (x91) this.a92UlCVFR9N8.RAsUl2FVSrh6();
        if (x91Var2 == null || (RAsUl2FVSrh6 = x91Var2.OPXfSBeufaJ8) == null) {
            RAsUl2FVSrh6 = RAsUl2FVSrh6();
        }
        if (daVar != null) {
            Iterator it2 = daVar.iterator();
            while (it2.hasNext()) {
                aa1 aa1Var = (aa1) it2.next();
                ca1 ca1Var = aa1Var.PxuCJdSBwIXG;
                ca1 ca1Var2 = aa1Var.PxuCJdSBwIXG;
                za1 Y1f8riQaR6yg = Y1f8riQaR6yg(ca1Var.lS5Rgt96tfkO, RAsUl2FVSrh6, null, true);
                if (Y1f8riQaR6yg == null) {
                    xa1 xa1Var = za1.Companion;
                    int i3 = ca1Var2.lS5Rgt96tfkO;
                    xa1Var.getClass();
                    rc1.wdg6QnbFHrFF("Restore State failed: destination ", xa1.PxuCJdSBwIXG(q3Var, i3), " cannot be found from the current destination ", RAsUl2FVSrh6);
                    return false;
                }
                f01 rtx2ld2ELZv4 = rtx2ld2ELZv4();
                na1 na1Var = this.QrzZRwfaDlRX;
                q3Var.getClass();
                rtx2ld2ELZv4.getClass();
                Bundle bundle3 = ca1Var2.TSizfFm2Yiuu;
                if (bundle3 != null) {
                    Context context = q3Var.PxuCJdSBwIXG;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                w91 w91Var = x91.Companion;
                String str2 = ca1Var2.PxuCJdSBwIXG;
                Bundle bundle4 = ca1Var2.Y1f8riQaR6yg;
                w91Var.getClass();
                str2.getClass();
                arrayList.add(new x91(q3Var, Y1f8riQaR6yg, bundle2, rtx2ld2ELZv4, na1Var, str2, bundle4));
                RAsUl2FVSrh6 = Y1f8riQaR6yg;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((x91) obj).OPXfSBeufaJ8 instanceof eb1)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            x91 x91Var3 = (x91) obj2;
            List list = (List) zk.BUo4iHFctTZi(arrayList2);
            if (cs0.wdg6QnbFHrFF((list == null || (x91Var = (x91) zk.kRWHK87H9qm4(list)) == null || (za1Var = x91Var.OPXfSBeufaJ8) == null) ? null : za1Var.rtx2ld2ELZv4, x91Var3.OPXfSBeufaJ8.rtx2ld2ELZv4)) {
                list.add(x91Var3);
            } else {
                arrayList2.add(fx1.PsecLrZVVK61(x91Var3));
            }
        }
        vt1 vt1Var = new vt1();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            tc1 lS5Rgt96tfkO = this.RfyTYNmI9Srp.lS5Rgt96tfkO(((x91) zk.MDTGUQSX7PXD(list2)).OPXfSBeufaJ8.rtx2ld2ELZv4);
            ArrayList arrayList4 = arrayList;
            this.S9EYkSpbGuxq = new a4(vt1Var, arrayList4, new xt1(), this, bundle, 3);
            lS5Rgt96tfkO.Y1f8riQaR6yg(list2, xb1Var);
            this.S9EYkSpbGuxq = null;
            arrayList = arrayList4;
        }
        return vt1Var.rtx2ld2ELZv4;
    }

    public final boolean lS5Rgt96tfkO() {
        da daVar;
        while (true) {
            daVar = this.a92UlCVFR9N8;
            if (daVar.isEmpty() || !(((x91) daVar.last()).OPXfSBeufaJ8 instanceof eb1)) {
                break;
            }
            r3s1LDPKFs1S(this, (x91) daVar.last());
        }
        x91 x91Var = (x91) daVar.RAsUl2FVSrh6();
        ArrayList arrayList = this.pnx5pC0XzaCw;
        if (x91Var != null) {
            arrayList.add(x91Var);
        }
        this.ZbWwgt3aGe7A++;
        XL4ISE6Oc65B();
        int i = this.ZbWwgt3aGe7A - 1;
        this.ZbWwgt3aGe7A = i;
        if (i == 0) {
            ArrayList j = zk.j(arrayList);
            arrayList.clear();
            int size = j.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = j.get(i2);
                i2++;
                x91 x91Var2 = (x91) obj;
                Iterator it = zk.i(this.gPXPFXrUH4XX).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        u9.VhhvGxCb8gfr();
                        return false;
                    }
                    za1 za1Var = x91Var2.OPXfSBeufaJ8;
                    x91Var2.QrzZRwfaDlRX.PxuCJdSBwIXG();
                    throw null;
                }
                this.IAToe7bXGz4N.BRwzKIf41E4i(x91Var2);
            }
            ArrayList arrayList2 = new ArrayList(daVar);
            l92 l92Var = this.RAsUl2FVSrh6;
            l92Var.getClass();
            l92Var.OPXfSBeufaJ8(null, arrayList2);
            ArrayList QrzZRwfaDlRX = QrzZRwfaDlRX();
            l92 l92Var2 = this.rtx2ld2ELZv4;
            l92Var2.getClass();
            l92Var2.OPXfSBeufaJ8(null, QrzZRwfaDlRX);
        }
        return x91Var != null;
    }

    public final f01 rtx2ld2ELZv4() {
        return this.r3s1LDPKFs1S == null ? f01.wdg6QnbFHrFF : this.BRwzKIf41E4i;
    }

    public final void wdg6QnbFHrFF(x91 x91Var, x91 x91Var2) {
        this.wdg6QnbFHrFF.put(x91Var, x91Var2);
        LinkedHashMap linkedHashMap = this.dgRBjINgWbAK;
        if (linkedHashMap.get(x91Var2) == null) {
            linkedHashMap.put(x91Var2, new ab());
        }
        Object obj = linkedHashMap.get(x91Var2);
        obj.getClass();
        ((ab) obj).PxuCJdSBwIXG.incrementAndGet();
    }

    public final boolean x50lh2ztY7Y5(int i, boolean z, boolean z2) {
        za1 za1Var;
        boolean z3;
        da daVar = this.a92UlCVFR9N8;
        final int i2 = 0;
        if (daVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zk.b(daVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                za1Var = null;
                break;
            }
            za1 za1Var2 = ((x91) it.next()).OPXfSBeufaJ8;
            String str = za1Var2.rtx2ld2ELZv4;
            cb1 cb1Var = za1Var2.OPXfSBeufaJ8;
            tc1 lS5Rgt96tfkO = this.RfyTYNmI9Srp.lS5Rgt96tfkO(str);
            if (z || cb1Var.lS5Rgt96tfkO != i) {
                arrayList.add(lS5Rgt96tfkO);
            }
            if (cb1Var.lS5Rgt96tfkO == i) {
                za1Var = za1Var2;
                break;
            }
        }
        if (za1Var == null) {
            xa1 xa1Var = za1.Companion;
            q3 q3Var = this.PxuCJdSBwIXG.TSizfFm2Yiuu;
            xa1Var.getClass();
            String PxuCJdSBwIXG = xa1.PxuCJdSBwIXG(q3Var, i);
            z21.Companion.getClass();
            Log.i("NavController", "Ignoring popBackStack to destination " + PxuCJdSBwIXG + " as it was not found on the current back stack");
            return false;
        }
        vt1 vt1Var = new vt1();
        da daVar2 = new da();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z3 = z2;
                break;
            }
            int i4 = i3 + 1;
            tc1 tc1Var = (tc1) arrayList.get(i3);
            vt1 vt1Var2 = new vt1();
            x91 x91Var = (x91) daVar.last();
            z3 = z2;
            ia1 ia1Var = new ia1(vt1Var2, vt1Var, this, z3, daVar2);
            tc1Var.getClass();
            x91Var.getClass();
            this.VhhvGxCb8gfr = ia1Var;
            tc1Var.e9gEMXR7LXtO(x91Var, z3);
            this.VhhvGxCb8gfr = null;
            if (!vt1Var2.rtx2ld2ELZv4) {
                break;
            }
            i3 = i4;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.x50lh2ztY7Y5;
            if (!z) {
                c80 c80Var = new c80(new hd2(z32.ngxnMNrpiKat(za1Var, new xy0(13)), new le0(this) { // from class: ja1
                    public final /* synthetic */ la1 OPXfSBeufaJ8;

                    {
                        this.OPXfSBeufaJ8 = this;
                    }

                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        boolean containsKey;
                        int i5 = i2;
                        la1 la1Var = this.OPXfSBeufaJ8;
                        za1 za1Var3 = (za1) obj;
                        switch (i5) {
                            case 0:
                                za1Var3.getClass();
                                containsKey = la1Var.x50lh2ztY7Y5.containsKey(Integer.valueOf(za1Var3.OPXfSBeufaJ8.lS5Rgt96tfkO));
                                break;
                            default:
                                za1Var3.getClass();
                                containsKey = la1Var.x50lh2ztY7Y5.containsKey(Integer.valueOf(za1Var3.OPXfSBeufaJ8.lS5Rgt96tfkO));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (c80Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((za1) c80Var.next()).OPXfSBeufaJ8.lS5Rgt96tfkO);
                    aa1 aa1Var = (aa1) daVar2.e9gEMXR7LXtO();
                    linkedHashMap.put(valueOf, aa1Var != null ? aa1Var.PxuCJdSBwIXG.PxuCJdSBwIXG : null);
                }
            }
            if (!daVar2.isEmpty()) {
                ca1 ca1Var = ((aa1) daVar2.first()).PxuCJdSBwIXG;
                final int i5 = 1;
                c80 c80Var2 = new c80(new hd2(z32.ngxnMNrpiKat(TSizfFm2Yiuu(ca1Var.lS5Rgt96tfkO, null), new xy0(14)), new le0(this) { // from class: ja1
                    public final /* synthetic */ la1 OPXfSBeufaJ8;

                    {
                        this.OPXfSBeufaJ8 = this;
                    }

                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        boolean containsKey;
                        int i52 = i5;
                        la1 la1Var = this.OPXfSBeufaJ8;
                        za1 za1Var3 = (za1) obj;
                        switch (i52) {
                            case 0:
                                za1Var3.getClass();
                                containsKey = la1Var.x50lh2ztY7Y5.containsKey(Integer.valueOf(za1Var3.OPXfSBeufaJ8.lS5Rgt96tfkO));
                                break;
                            default:
                                za1Var3.getClass();
                                containsKey = la1Var.x50lh2ztY7Y5.containsKey(Integer.valueOf(za1Var3.OPXfSBeufaJ8.lS5Rgt96tfkO));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (c80Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((za1) c80Var2.next()).OPXfSBeufaJ8.lS5Rgt96tfkO), ca1Var.PxuCJdSBwIXG);
                }
                if (linkedHashMap.values().contains(ca1Var.PxuCJdSBwIXG)) {
                    this.cpQdD2nAriOS.put(ca1Var.PxuCJdSBwIXG, daVar2);
                }
            }
        }
        this.lS5Rgt96tfkO.PxuCJdSBwIXG();
        return vt1Var.rtx2ld2ELZv4;
    }
}
