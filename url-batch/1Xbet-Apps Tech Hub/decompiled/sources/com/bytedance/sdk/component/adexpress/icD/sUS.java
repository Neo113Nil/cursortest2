package com.bytedance.sdk.component.adexpress.icD;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.icD.Wyp;

/* compiled from: NativeRenderInterceptor.java */
/* loaded from: classes.dex */
public class sUS implements Wyp {
    private pvs icD;
    private Context pvs;
    private Ju vG;

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public void pvs() {
    }

    public sUS(Context context, Ju ju, pvs pvsVar) {
        this.pvs = context;
        this.icD = pvsVar;
        this.vG = ju;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public boolean pvs(final Wyp.pvs pvsVar) {
        this.vG.NB().sUS();
        this.icD.pvs(new yiw() { // from class: com.bytedance.sdk.component.adexpress.icD.sUS.1
            @Override // com.bytedance.sdk.component.adexpress.icD.yiw
            public void pvs(View view, IP ip) {
                if (pvsVar.vG()) {
                    return;
                }
                bNS icD = pvsVar.icD();
                if (icD != null) {
                    icD.pvs(sUS.this.icD, ip);
                }
                pvsVar.pvs(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.icD.yiw
            public void pvs(int i, String str) {
                bNS icD = pvsVar.icD();
                if (icD != null) {
                    icD.a_(i);
                }
            }
        });
        return true;
    }

    public void pvs(vG vGVar) {
        this.icD.pvs(vGVar);
    }
}
