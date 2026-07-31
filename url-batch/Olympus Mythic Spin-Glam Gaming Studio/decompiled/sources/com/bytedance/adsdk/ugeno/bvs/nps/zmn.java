package com.bytedance.adsdk.ugeno.bvs.nps;

import android.content.Context;

/* loaded from: classes11.dex */
public abstract class zmn extends com.bytedance.adsdk.ugeno.fs.zmn<com.bytedance.adsdk.ugeno.bvs.fs.zmn> {
    public zmn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                fs(str, str2);
                break;
        }
    }
}
