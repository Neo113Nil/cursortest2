package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.component.icD;
import com.bytedance.adsdk.ugeno.icD.so;

/* compiled from: UGDislikeWidget.java */
/* loaded from: classes.dex */
public class pvs extends icD<DislikeView> {
    private int ZsW;
    private int ea;
    private int pvs;

    public pvs(Context context) {
        super(context);
        this.pvs = 0;
        this.ZsW = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public DislikeView vG() {
        DislikeView dislikeView = new DislikeView(this.icD);
        dislikeView.pvs(this);
        return dislikeView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((DislikeView) this.NB).setRadius(this.gA);
        ((DislikeView) this.NB).setStrokeWidth((int) this.sP);
        ((DislikeView) this.NB).setDislikeColor(this.pvs);
        ((DislikeView) this.NB).setStrokeColor(this.gSd);
        ((DislikeView) this.NB).setDislikeWidth(this.ea);
        ((DislikeView) this.NB).setBgColor(this.ZsW);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "dislikeColor":
                this.pvs = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "dislikeWidth":
                this.ea = (int) so.pvs(this.icD, Integer.parseInt(str2));
                break;
            case "dislikeFillColor":
                this.ZsW = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
        }
    }
}
