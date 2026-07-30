package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x91 implements o01, pr2, bj0, qz1 {
    public static final w91 Companion = new w91();
    public za1 OPXfSBeufaJ8;
    public final z91 QrzZRwfaDlRX = new z91(this);
    public final String cpQdD2nAriOS;
    public f01 dgRBjINgWbAK;
    public final Bundle r3s1LDPKFs1S;
    public final q3 rtx2ld2ELZv4;
    public final Bundle wdg6QnbFHrFF;
    public final na1 x50lh2ztY7Y5;

    public x91(q3 q3Var, za1 za1Var, Bundle bundle, f01 f01Var, na1 na1Var, String str, Bundle bundle2) {
        this.rtx2ld2ELZv4 = q3Var;
        this.OPXfSBeufaJ8 = za1Var;
        this.wdg6QnbFHrFF = bundle;
        this.dgRBjINgWbAK = f01Var;
        this.x50lh2ztY7Y5 = na1Var;
        this.cpQdD2nAriOS = str;
        this.r3s1LDPKFs1S = bundle2;
        new qc2(new o5(20, this));
    }

    public final void PxuCJdSBwIXG(f01 f01Var) {
        z91 z91Var = this.QrzZRwfaDlRX;
        z91Var.getClass();
        z91Var.dgRBjINgWbAK = f01Var;
        z91Var.lS5Rgt96tfkO();
    }

    @Override // defpackage.pr2
    public final or2 RAsUl2FVSrh6() {
        z91 z91Var = this.QrzZRwfaDlRX;
        if (!z91Var.OPXfSBeufaJ8) {
            u9.rtx2ld2ELZv4("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (z91Var.wdg6QnbFHrFF.rtx2ld2ELZv4 == f01.rtx2ld2ELZv4) {
            u9.rtx2ld2ELZv4("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        na1 na1Var = z91Var.e9gEMXR7LXtO;
        if (na1Var == null) {
            u9.rtx2ld2ELZv4("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = z91Var.a92UlCVFR9N8;
        str.getClass();
        LinkedHashMap linkedHashMap = na1Var.lS5Rgt96tfkO;
        or2 or2Var = (or2) linkedHashMap.get(str);
        if (or2Var != null) {
            return or2Var;
        }
        or2 or2Var2 = new or2();
        linkedHashMap.put(str, or2Var2);
        return or2Var2;
    }

    @Override // defpackage.qz1
    public final cr1 TSizfFm2Yiuu() {
        return this.QrzZRwfaDlRX.rtx2ld2ELZv4.lS5Rgt96tfkO;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // defpackage.bj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zu a92UlCVFR9N8() {
        Application application;
        Application application2;
        z91 z91Var = this.QrzZRwfaDlRX;
        z91Var.getClass();
        z71 z71Var = new z71(0);
        ib0 ib0Var = mm2.RfyTYNmI9Srp;
        x91 x91Var = z91Var.PxuCJdSBwIXG;
        LinkedHashMap linkedHashMap = z71Var.PxuCJdSBwIXG;
        linkedHashMap.put(ib0Var, x91Var);
        linkedHashMap.put(mm2.EcgxDIVH5in8, x91Var);
        Bundle PxuCJdSBwIXG = z91Var.PxuCJdSBwIXG();
        if (PxuCJdSBwIXG != null) {
            linkedHashMap.put(mm2.S9EYkSpbGuxq, PxuCJdSBwIXG);
        }
        q3 q3Var = this.rtx2ld2ELZv4;
        if (q3Var != null) {
            Context context = q3Var.PxuCJdSBwIXG;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(hr2.Y1f8riQaR6yg, application2);
                }
                return z71Var;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return z71Var;
    }

    @Override // defpackage.bj0
    public final kr2 e9gEMXR7LXtO() {
        return this.QrzZRwfaDlRX.x50lh2ztY7Y5;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof x91)) {
            x91 x91Var = (x91) obj;
            Bundle bundle = x91Var.wdg6QnbFHrFF;
            if (cs0.wdg6QnbFHrFF(this.cpQdD2nAriOS, x91Var.cpQdD2nAriOS) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, x91Var.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(this.QrzZRwfaDlRX.wdg6QnbFHrFF, x91Var.QrzZRwfaDlRX.wdg6QnbFHrFF) && cs0.wdg6QnbFHrFF(TSizfFm2Yiuu(), x91Var.TSizfFm2Yiuu())) {
                Bundle bundle2 = this.wdg6QnbFHrFF;
                if (cs0.wdg6QnbFHrFF(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!cs0.wdg6QnbFHrFF(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.OPXfSBeufaJ8.hashCode() + (this.cpQdD2nAriOS.hashCode() * 31);
        Bundle bundle = this.wdg6QnbFHrFF;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return TSizfFm2Yiuu().hashCode() + ((this.QrzZRwfaDlRX.wdg6QnbFHrFF.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        return this.QrzZRwfaDlRX.wdg6QnbFHrFF;
    }

    public final String toString() {
        return this.QrzZRwfaDlRX.toString();
    }
}
