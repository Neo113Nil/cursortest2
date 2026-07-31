package com.bytedance.adsdk.fs.zn;

import com.bytedance.adsdk.fs.rt;

/* loaded from: classes14.dex */
public class btk {
    private static final btk zmn = new btk();
    private final rt<String, com.bytedance.adsdk.fs.nps> fs = new rt<>(20);

    public static btk zmn() {
        return zmn;
    }

    btk() {
    }

    public com.bytedance.adsdk.fs.nps zmn(String str) {
        if (str == null) {
            return null;
        }
        return this.fs.zmn((rt<String, com.bytedance.adsdk.fs.nps>) str);
    }

    public void zmn(String str, com.bytedance.adsdk.fs.nps npsVar) {
        if (str == null) {
            return;
        }
        this.fs.zmn(str, npsVar);
    }
}
