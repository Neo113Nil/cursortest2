package com.bytedance.sdk.openadsdk.core.mw.fs;

import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes3.dex */
public class fs extends com.bytedance.adsdk.ugeno.bvs.hhw.fs {
    private String rsi;
    private String tev;

    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        if (TextUtils.isEmpty(this.rsi) || TextUtils.equals(this.rsi, POBCommonConstants.NULL_VALUE)) {
            this.rsi = "";
        }
        if (TextUtils.isEmpty(this.tev) || TextUtils.equals(this.tev, POBCommonConstants.NULL_VALUE)) {
            this.tev = "";
        }
        String str = this.tev + this.rsi;
        ((com.bytedance.adsdk.ugeno.bvs.hhw.fs) this).zmn = str;
        ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setText(str);
        ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs
    public void rt(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, POBCommonConstants.NULL_VALUE)) {
            str = "";
        }
        if (TextUtils.isEmpty(this.rsi) || TextUtils.equals(this.rsi, POBCommonConstants.NULL_VALUE)) {
            this.rsi = "";
        }
        if (TextUtils.isEmpty(this.tev) || TextUtils.equals(this.tev, POBCommonConstants.NULL_VALUE)) {
            this.tev = "";
        }
        String str2 = this.tev + str + this.rsi;
        ((com.bytedance.adsdk.ugeno.bvs.hhw.fs) this).zmn = str2;
        ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setText(str2);
        try {
            float f = this.ev ? this.kjb : this.rp;
            float f2 = this.tf ? this.zak : this.rp;
            float measureText = ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).getPaint().measureText(((com.bytedance.adsdk.ugeno.bvs.hhw.fs) this).zmn);
            if (measureText >= 0.0f) {
                btk((int) (f + measureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs, com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        if (str.equals("before")) {
            this.tev = str2;
        } else if (str.equals("after")) {
            this.rsi = str2;
        }
    }

    public int fb() {
        return this.cd;
    }
}
