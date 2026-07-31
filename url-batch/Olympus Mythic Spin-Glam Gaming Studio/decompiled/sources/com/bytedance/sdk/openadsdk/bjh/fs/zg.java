package com.bytedance.sdk.openadsdk.bjh.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes11.dex */
public class zg extends fs {
    private int fb;

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    public int hhw() {
        return 200;
    }

    public zg(Integer num, View view, nqi nqiVar, btk.zmn zmnVar) {
        super(num, view, nqiVar, 2000, zmnVar);
        this.fb = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected boolean zn() {
        return hhw.zmn(this.zmn.get(), this.fs.sft()) && this.fb == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected void fb() {
        super.fb();
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    public void zmn() {
        if (this.fb != 1) {
            return;
        }
        super.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected void fs(int i) {
        if (bvs()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.fb = 0;
            zg();
        }
        if (i == 3 || i == 2) {
            this.fb = 2;
            zg();
        }
        if (this.fb == 1 || i != 0) {
            return;
        }
        this.fb = 1;
        zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    public boolean klz() {
        int i = this.fb;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.zn.set(false);
        }
        return !z || super.klz();
    }
}
