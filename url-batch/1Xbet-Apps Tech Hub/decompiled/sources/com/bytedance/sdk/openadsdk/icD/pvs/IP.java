package com.bytedance.sdk.openadsdk.icD.pvs;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TrackUrlStrategy.java */
/* loaded from: classes2.dex */
public class IP {
    public static IP pvs = new IP();
    private volatile boolean Jd;
    private pvs icD;
    private final Map<String, pvs> vG = new HashMap();

    private int icD() {
        pvs pvsVar = this.icD;
        if (pvsVar != null) {
            return pvsVar.pvs();
        }
        return 3;
    }

    private int vG() {
        pvs pvsVar = this.icD;
        if (pvsVar != null) {
            return pvsVar.icD();
        }
        return 30;
    }

    public void pvs(pvs pvsVar) {
        this.icD = pvsVar;
    }

    public void pvs(String str, pvs pvsVar) {
        if (TextUtils.isEmpty(str) || pvsVar == null) {
            return;
        }
        this.vG.put(str, pvsVar);
    }

    public int pvs(String str) {
        if (!pvs()) {
            return 4;
        }
        pvs pvsVar = this.vG.get(str);
        if (pvsVar == null) {
            return icD();
        }
        return pvsVar.pvs();
    }

    public int icD(String str) {
        pvs pvsVar = this.vG.get(str);
        if (pvsVar == null) {
            return vG();
        }
        return pvsVar.icD();
    }

    public boolean pvs() {
        return this.Jd;
    }

    public void pvs(boolean z) {
        this.Jd = z;
    }

    /* compiled from: TrackUrlStrategy.java */
    public static class pvs {
        private final int icD;
        private final int pvs;

        public pvs(int i, int i2) {
            this.pvs = (i < 0 || i > 5) ? 3 : i;
            this.icD = i2 < 10 ? 30 : i2;
        }

        public int pvs() {
            return this.pvs;
        }

        public int icD() {
            return this.icD;
        }
    }
}
