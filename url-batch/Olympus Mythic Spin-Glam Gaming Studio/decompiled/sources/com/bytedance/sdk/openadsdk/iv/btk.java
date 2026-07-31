package com.bytedance.sdk.openadsdk.iv;

import com.bytedance.sdk.component.btk.bvs;
import com.bytedance.sdk.component.btk.kw;

/* loaded from: classes8.dex */
public class btk implements kw {
    private static int zmn;
    private final String btk;
    private boolean fb;
    private long fs = 0;
    private long zn;

    private String zn(String str, bvs bvsVar) {
        return str;
    }

    public btk() {
        zmn++;
        this.btk = "image_request_" + zmn;
    }

    @Override // com.bytedance.sdk.component.btk.kw
    public void zmn(String str, bvs bvsVar) {
        if (!this.fb) {
            bvsVar.zmn();
            bvsVar.fs();
            bvsVar.zn();
            this.fb = true;
        }
        this.fs = System.currentTimeMillis();
        zn(str, bvsVar);
    }

    @Override // com.bytedance.sdk.component.btk.kw
    public void fs(String str, bvs bvsVar) {
        this.zn += System.currentTimeMillis() - this.fs;
        zn(str, bvsVar);
    }
}
