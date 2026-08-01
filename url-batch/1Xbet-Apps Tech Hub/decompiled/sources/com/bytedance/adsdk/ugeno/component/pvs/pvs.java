package com.bytedance.adsdk.ugeno.component.pvs;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGenVideoWidget.java */
/* loaded from: classes.dex */
public abstract class pvs extends com.bytedance.adsdk.ugeno.component.pvs<UGFrameLayout> {
    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs, com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                icD(str, str2);
                break;
        }
    }
}
