package com.bytedance.sdk.component.pvs;

import android.net.Uri;
import com.bytedance.sdk.component.pvs.OT;
import com.bytedance.sdk.component.pvs.qh;
import com.bytedance.sdk.component.pvs.rCZ;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PermissionChecker.java */
/* loaded from: classes.dex */
class uc {
    private final rCZ Jd;
    private qh.pvs NB;
    private final Set<String> icD;
    private final Set<String> pvs;
    private final OT vG = vA.pvs;

    uc(rCZ rcz, Set<String> set, Set<String> set2) {
        this.Jd = rcz;
        if (set == null || set.isEmpty()) {
            this.pvs = new LinkedHashSet();
        } else {
            this.pvs = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.icD = new LinkedHashSet();
        } else {
            this.icD = new LinkedHashSet(set2);
        }
    }

    final synchronized ny pvs(boolean z, String str, icD icd) throws rCZ.pvs {
        ny icD;
        qh.pvs pvsVar;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        ny nyVar = this.icD.contains(icd.pvs()) ? ny.PUBLIC : null;
        for (String str2 : this.pvs) {
            if (parse.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                nyVar = ny.PRIVATE;
                break;
            }
        }
        if (nyVar == null && (pvsVar = this.NB) != null && pvsVar.pvs(str)) {
            if (this.NB.pvs(str, icd.pvs())) {
                return null;
            }
            nyVar = ny.PRIVATE;
        }
        if (z) {
            icD = pvs(str, icd);
        } else {
            icD = icD(str, icd);
        }
        return icD != null ? icD : nyVar;
    }

    final synchronized ny pvs(String str, icD icd) throws rCZ.pvs {
        return pvs(str, icd, true);
    }

    final synchronized ny icD(String str, icD icd) {
        return pvs(str, icd, false);
    }

    void pvs(qh.pvs pvsVar) {
        this.NB = pvsVar;
    }

    void pvs(OT.pvs pvsVar) {
        if (this.vG != null) {
            throw null;
        }
    }

    void icD(OT.pvs pvsVar) {
        if (this.vG != null) {
            throw null;
        }
    }

    private ny pvs(String str, icD icd, boolean z) {
        if (!z || this.Jd == null) {
            return null;
        }
        throw null;
    }
}
