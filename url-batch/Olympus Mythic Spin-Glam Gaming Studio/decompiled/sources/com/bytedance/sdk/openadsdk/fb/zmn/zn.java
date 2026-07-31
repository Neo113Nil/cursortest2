package com.bytedance.sdk.openadsdk.fb.zmn;

/* loaded from: classes11.dex */
public class zn implements com.bytedance.sdk.component.hhw.zmn.btk.zn {
    private final com.bytedance.sdk.component.nps.fs.fs zmn;

    public zn() {
        com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
        this.zmn = zn;
        zn.zmn(7);
        zn.fs("track_url");
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk.zn
    public void zmn(String str) {
        this.zmn.zn(str);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk.zn
    public void zmn(String str, String str2) {
        this.zmn.fs(str, str2);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk.zn
    public com.bytedance.sdk.component.hhw.zmn.btk.fb zmn() {
        return new btk(this.zmn.btk());
    }
}
