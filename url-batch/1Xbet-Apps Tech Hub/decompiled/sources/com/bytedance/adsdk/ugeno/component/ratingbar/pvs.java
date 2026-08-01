package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.icD;

/* compiled from: UGRatingBarWidget.java */
/* loaded from: classes.dex */
public class pvs extends icD<UGRatingBar> {
    private int CjQ;
    private float ZsW;
    private int ea;
    private int pvs;

    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public UGRatingBar vG() {
        UGRatingBar uGRatingBar = new UGRatingBar(this.icD);
        uGRatingBar.pvs(this);
        return uGRatingBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((UGRatingBar) this.NB).pvs(this.ZsW, this.pvs, this.CjQ, 5);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
                this.pvs = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "lowLightColor":
                this.ea = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "size":
                try {
                    this.CjQ = Integer.parseInt(str2);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case "score":
                try {
                    this.ZsW = Float.parseFloat(str2);
                    break;
                } catch (NumberFormatException unused2) {
                    this.ZsW = 5.0f;
                    return;
                }
        }
    }
}
