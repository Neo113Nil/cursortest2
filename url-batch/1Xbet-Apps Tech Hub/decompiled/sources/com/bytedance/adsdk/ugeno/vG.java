package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.Jd;
import com.bytedance.adsdk.ugeno.core.NB;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenoEnv.java */
/* loaded from: classes.dex */
public class vG {
    private static volatile vG pvs;
    private pvs Jd;
    private List<com.bytedance.adsdk.ugeno.core.icD> icD;
    private com.bytedance.adsdk.ugeno.core.vG vG;

    public static vG pvs() {
        if (pvs == null) {
            synchronized (vG.class) {
                if (pvs == null) {
                    pvs = new vG();
                }
            }
        }
        return pvs;
    }

    private vG() {
    }

    public void pvs(Context context, com.bytedance.adsdk.ugeno.core.vG vGVar, pvs pvsVar) {
        this.vG = vGVar;
        this.Jd = pvsVar;
        vG();
    }

    public pvs icD() {
        return this.Jd;
    }

    private void vG() {
        this.icD = new ArrayList();
        this.icD.addAll(new NB().pvs());
        com.bytedance.adsdk.ugeno.core.vG vGVar = this.vG;
        if (vGVar != null) {
            this.icD.addAll(vGVar.pvs());
        }
        Jd.pvs(this.icD);
    }
}
