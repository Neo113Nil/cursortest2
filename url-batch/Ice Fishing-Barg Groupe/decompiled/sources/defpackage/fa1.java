package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fa1 {
    public final ib0 PxuCJdSBwIXG;
    public final tc1 RAsUl2FVSrh6;
    public final l92 TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public final cs1 a92UlCVFR9N8;
    public final cs1 e9gEMXR7LXtO;
    public final l92 lS5Rgt96tfkO;
    public final /* synthetic */ ga1 rtx2ld2ELZv4;

    public fa1(ga1 ga1Var, tc1 tc1Var) {
        tc1Var.getClass();
        this.rtx2ld2ELZv4 = ga1Var;
        this.PxuCJdSBwIXG = new ib0(17);
        l92 RAsUl2FVSrh6 = hq0.RAsUl2FVSrh6(p50.rtx2ld2ELZv4);
        this.lS5Rgt96tfkO = RAsUl2FVSrh6;
        l92 RAsUl2FVSrh62 = hq0.RAsUl2FVSrh6(t50.rtx2ld2ELZv4);
        this.TSizfFm2Yiuu = RAsUl2FVSrh62;
        this.e9gEMXR7LXtO = new cs1(RAsUl2FVSrh6);
        this.a92UlCVFR9N8 = new cs1(RAsUl2FVSrh62);
        this.RAsUl2FVSrh6 = tc1Var;
    }

    public final void PxuCJdSBwIXG(x91 x91Var) {
        x91Var.getClass();
        synchronized (this.PxuCJdSBwIXG) {
            l92 l92Var = this.lS5Rgt96tfkO;
            l92Var.OPXfSBeufaJ8(null, zk.P6VAkUObIv30((Collection) l92Var.getValue(), x91Var));
        }
    }

    public final void TSizfFm2Yiuu(x91 x91Var) {
        na1 na1Var;
        x91Var.getClass();
        la1 la1Var = this.rtx2ld2ELZv4.lS5Rgt96tfkO;
        l92 l92Var = la1Var.rtx2ld2ELZv4;
        String str = x91Var.cpQdD2nAriOS;
        LinkedHashMap linkedHashMap = la1Var.S2OOm9zPNm0h;
        boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(linkedHashMap.get(x91Var), Boolean.TRUE);
        l92 l92Var2 = this.TSizfFm2Yiuu;
        Set set = (Set) l92Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(w41.i68hK7ahKtgp(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && cs0.wdg6QnbFHrFF(obj, x91Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        l92Var2.OPXfSBeufaJ8(null, linkedHashSet);
        linkedHashMap.remove(x91Var);
        da daVar = la1Var.a92UlCVFR9N8;
        if (daVar.contains(x91Var)) {
            if (this.Y1f8riQaR6yg) {
                return;
            }
            la1Var.XL4ISE6Oc65B();
            l92 l92Var3 = la1Var.RAsUl2FVSrh6;
            ArrayList arrayList = new ArrayList(daVar);
            l92Var3.getClass();
            l92Var3.OPXfSBeufaJ8(null, arrayList);
            ArrayList QrzZRwfaDlRX = la1Var.QrzZRwfaDlRX();
            l92Var.getClass();
            l92Var.OPXfSBeufaJ8(null, QrzZRwfaDlRX);
            return;
        }
        la1Var.BRwzKIf41E4i(x91Var);
        if (x91Var.QrzZRwfaDlRX.wdg6QnbFHrFF.rtx2ld2ELZv4.compareTo(f01.wdg6QnbFHrFF) >= 0) {
            x91Var.PxuCJdSBwIXG(f01.rtx2ld2ELZv4);
        }
        if (!daVar.isEmpty()) {
            Iterator it = daVar.iterator();
            while (it.hasNext()) {
                if (cs0.wdg6QnbFHrFF(((x91) it.next()).cpQdD2nAriOS, str)) {
                    break;
                }
            }
        }
        if (!wdg6QnbFHrFF && (na1Var = la1Var.QrzZRwfaDlRX) != null) {
            str.getClass();
            or2 or2Var = (or2) na1Var.lS5Rgt96tfkO.remove(str);
            if (or2Var != null) {
                or2Var.PxuCJdSBwIXG();
            }
        }
        la1Var.XL4ISE6Oc65B();
        ArrayList QrzZRwfaDlRX2 = la1Var.QrzZRwfaDlRX();
        l92Var.getClass();
        l92Var.OPXfSBeufaJ8(null, QrzZRwfaDlRX2);
    }

    public final void Y1f8riQaR6yg(x91 x91Var, boolean z) {
        x91Var.getClass();
        la1 la1Var = this.rtx2ld2ELZv4.lS5Rgt96tfkO;
        e6 e6Var = new e6(this, x91Var, z);
        la1Var.getClass();
        tc1 lS5Rgt96tfkO = la1Var.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var.OPXfSBeufaJ8.rtx2ld2ELZv4);
        la1Var.S2OOm9zPNm0h.put(x91Var, Boolean.valueOf(z));
        if (!lS5Rgt96tfkO.equals(this.RAsUl2FVSrh6)) {
            Object obj = la1Var.EcgxDIVH5in8.get(lS5Rgt96tfkO);
            obj.getClass();
            ((fa1) obj).Y1f8riQaR6yg(x91Var, z);
            return;
        }
        ia1 ia1Var = la1Var.VhhvGxCb8gfr;
        if (ia1Var != null) {
            ia1Var.OPXfSBeufaJ8(x91Var);
            e6Var.PxuCJdSBwIXG();
            return;
        }
        da daVar = la1Var.a92UlCVFR9N8;
        int indexOf = daVar.indexOf(x91Var);
        if (indexOf < 0) {
            z21.Companion.getClass();
            Log.i("NavController", "Ignoring pop of " + x91Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != daVar.wdg6QnbFHrFF) {
            la1Var.x50lh2ztY7Y5(((x91) daVar.get(i)).OPXfSBeufaJ8.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false);
        }
        la1.r3s1LDPKFs1S(la1Var, x91Var);
        e6Var.PxuCJdSBwIXG();
        la1Var.lS5Rgt96tfkO.PxuCJdSBwIXG();
        la1Var.lS5Rgt96tfkO();
    }

    public final void a92UlCVFR9N8(x91 x91Var) {
        x91Var.getClass();
        la1 la1Var = this.rtx2ld2ELZv4.lS5Rgt96tfkO;
        la1Var.getClass();
        tc1 lS5Rgt96tfkO = la1Var.RfyTYNmI9Srp.lS5Rgt96tfkO(x91Var.OPXfSBeufaJ8.rtx2ld2ELZv4);
        if (!lS5Rgt96tfkO.equals(this.RAsUl2FVSrh6)) {
            Object obj = la1Var.EcgxDIVH5in8.get(lS5Rgt96tfkO);
            if (obj != null) {
                ((fa1) obj).a92UlCVFR9N8(x91Var);
                return;
            } else {
                rc1.e9gEMXR7LXtO(o0.gPXPFXrUH4XX(new StringBuilder("NavigatorBackStack for "), x91Var.OPXfSBeufaJ8.rtx2ld2ELZv4, " should already be created"));
                return;
            }
        }
        le0 le0Var = la1Var.S9EYkSpbGuxq;
        if (le0Var != null) {
            le0Var.OPXfSBeufaJ8(x91Var);
            PxuCJdSBwIXG(x91Var);
            return;
        }
        y21 y21Var = z21.Companion;
        String str = "Ignoring add of destination " + x91Var.OPXfSBeufaJ8 + " outside of the call to navigate(). ";
        y21Var.getClass();
        Log.i("NavController", str);
    }

    public final void e9gEMXR7LXtO(x91 x91Var, boolean z) {
        Object obj;
        x91Var.getClass();
        l92 l92Var = this.TSizfFm2Yiuu;
        Iterable iterable = (Iterable) l92Var.getValue();
        boolean z2 = iterable instanceof Collection;
        cs1 cs1Var = this.e9gEMXR7LXtO;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((x91) it.next()) == x91Var) {
                    Iterable iterable2 = (Iterable) cs1Var.rtx2ld2ELZv4.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((x91) it2.next()) == x91Var) {
                        }
                    }
                    return;
                }
            }
        }
        l92Var.OPXfSBeufaJ8(null, r42.Pf0ThKz3j5YS((Set) l92Var.getValue(), x91Var));
        l92 l92Var2 = cs1Var.rtx2ld2ELZv4;
        l92 l92Var3 = cs1Var.rtx2ld2ELZv4;
        List list = (List) l92Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            x91 x91Var2 = (x91) obj;
            if (!cs0.wdg6QnbFHrFF(x91Var2, x91Var) && ((List) l92Var3.getValue()).lastIndexOf(x91Var2) < ((List) l92Var3.getValue()).lastIndexOf(x91Var)) {
                break;
            }
        }
        x91 x91Var3 = (x91) obj;
        if (x91Var3 != null) {
            l92Var.OPXfSBeufaJ8(null, r42.Pf0ThKz3j5YS((Set) l92Var.getValue(), x91Var3));
        }
        Y1f8riQaR6yg(x91Var, z);
    }

    public final x91 lS5Rgt96tfkO(za1 za1Var, Bundle bundle) {
        la1 la1Var = this.rtx2ld2ELZv4.lS5Rgt96tfkO;
        la1Var.getClass();
        return w91.PxuCJdSBwIXG(x91.Companion, la1Var.PxuCJdSBwIXG.TSizfFm2Yiuu, za1Var, bundle, la1Var.rtx2ld2ELZv4(), la1Var.QrzZRwfaDlRX);
    }
}
