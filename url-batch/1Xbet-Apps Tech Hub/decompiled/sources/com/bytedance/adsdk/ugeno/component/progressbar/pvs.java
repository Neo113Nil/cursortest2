package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.icD;
import com.bytedance.adsdk.ugeno.icD.so;
import com.bytedance.adsdk.ugeno.icD.vG;

/* compiled from: UGProgressButtonWidget.java */
/* loaded from: classes.dex */
public class pvs extends icD<UGProgressBar> {
    private float BSi;
    private int CjQ;
    private String ZsW;
    private float cnN;
    private int ea;
    private int pvs;

    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public UGProgressBar vG() {
        UGProgressBar uGProgressBar = new UGProgressBar(this.icD);
        uGProgressBar.pvs(this);
        return uGProgressBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((UGProgressBar) this.NB).setBackgroundColor(this.ea);
        ((UGProgressBar) this.NB).setText(this.ZsW);
        ((UGProgressBar) this.NB).setProgressBgColor(this.ea);
        ((UGProgressBar) this.NB).setProgressColor(this.pvs);
        ((UGProgressBar) this.NB).setTextColor(this.CjQ);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBgColor":
                this.ea = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "textColor":
                this.CjQ = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "textSize":
                this.BSi = so.pvs(this.icD, str2);
                break;
            case "progress":
                this.cnN = vG.pvs(str2, 0.0f);
                break;
            case "text":
                this.ZsW = str2;
                break;
            case "progressColor":
                this.pvs = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
        }
    }
}
