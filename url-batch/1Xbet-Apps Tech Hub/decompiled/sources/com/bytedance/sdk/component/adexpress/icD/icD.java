package com.bytedance.sdk.component.adexpress.icD;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.icD.Wyp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: DynamicRenderInterceptor.java */
/* loaded from: classes.dex */
public class icD implements Wyp {
    private so Jd;
    private Ju NB;
    private com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs icD;
    private Context pvs;
    private int sUS;
    private ThemeStatusBroadcastReceiver vG;

    public icD(Context context, Ju ju, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Jd.so soVar, so soVar2, com.bytedance.sdk.component.adexpress.dynamic.NB.pvs pvsVar, com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs pvsVar2) {
        this.pvs = context;
        this.NB = ju;
        this.vG = themeStatusBroadcastReceiver;
        this.Jd = soVar2;
        if (pvsVar2 != null) {
            this.icD = pvsVar2;
        } else {
            this.icD = new com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs(this.pvs, this.vG, z, soVar, this.NB, pvsVar);
        }
        this.icD.pvs(this.Jd);
        if (soVar instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw) {
            this.sUS = 3;
        } else {
            this.sUS = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public boolean pvs(final Wyp.pvs pvsVar) {
        this.NB.NB().pvs(this.sUS);
        this.icD.pvs(new yiw() { // from class: com.bytedance.sdk.component.adexpress.icD.icD.1
            @Override // com.bytedance.sdk.component.adexpress.icD.yiw
            public void pvs(View view, IP ip) {
                if (pvsVar.vG()) {
                    return;
                }
                icD.this.NB.NB().NB(icD.this.sUS);
                icD.this.NB.NB().sUS(icD.this.sUS);
                icD.this.NB.NB().Wyp();
                bNS icD = pvsVar.icD();
                if (icD == null) {
                    return;
                }
                icD.pvs(icD.this.icD, ip);
                pvsVar.pvs(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.icD.yiw
            public void pvs(int i, String str) {
                icD.this.NB.NB().pvs(icD.this.sUS, i, str, pvsVar.icD(icD.this));
                if (pvsVar.icD(icD.this)) {
                    pvsVar.pvs(icD.this);
                    return;
                }
                bNS icD = pvsVar.icD();
                if (icD == null) {
                    return;
                }
                icD.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public void pvs() {
        com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs pvsVar = this.icD;
        if (pvsVar != null) {
            pvsVar.icD();
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Jd icD() {
        com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs pvsVar = this.icD;
        if (pvsVar != null) {
            return pvsVar.Jd();
        }
        return null;
    }
}
