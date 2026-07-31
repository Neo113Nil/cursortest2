package com.bytedance.sdk.openadsdk.core.rc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.iv.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.uqh.btk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class fs {
    public static final Long zmn = 0L;
    private AtomicBoolean fs;

    private static final class zmn {
        static final fs zmn = new fs();
    }

    public static fs zmn() {
        return zmn.zmn;
    }

    private fs() {
        this.fs = new AtomicBoolean(false);
    }

    public void zmn(int i) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "app_reg", Integer.valueOf(i));
    }

    public void fs() {
        String yo = rc.fs().yo();
        if (TextUtils.isEmpty(yo)) {
            return;
        }
        if (TextUtils.equals("true", yo)) {
            zmn(1);
        } else if (TextUtils.equals("false", yo)) {
            zmn(0);
        }
    }

    public int zn() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "app_reg", -1);
    }

    public boolean fb() {
        long mw = mw();
        return klz() && mw != 0 && System.currentTimeMillis() < mw;
    }

    public boolean btk() {
        return (!fb() && hhw() && bvs()) ? false : true;
    }

    public boolean hhw() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "app_reg", -1) == 1;
    }

    public boolean nps() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "app_reg", -1) == -1;
    }

    public void fs(int i) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", Integer.valueOf(i));
    }

    public int zg() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", -1);
    }

    public boolean bvs() {
        int zmn2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", -1);
        return zmn2 == 1 || zmn2 == 2;
    }

    public boolean iv() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    public boolean rc() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public boolean klz() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public void zmn(long j) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "allow_req_time", Long.valueOf(j));
    }

    public long mw() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "allow_req_time", zmn.longValue());
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public void zmn(final fb fbVar, final boolean z) {
        zn znVar = new zn();
        znVar.zmn(new fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.fs.1
            @Override // com.bytedance.sdk.openadsdk.core.rc.fb
            public void zmn(boolean z2) {
                if (!z2) {
                    fbVar.zmn(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.rc.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.rc.zmn(z);
                zmnVar.zmn(new fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.fs.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.rc.fb
                    public void zmn(boolean z3) {
                        fbVar.zmn(z3);
                    }
                });
                zmnVar.zmn();
            }
        });
        znVar.zmn();
    }

    public void rt() {
        zmn().fs();
    }

    public void cn() {
        cyb();
    }

    private void cyb() {
        if (zmn().btk() || this.fs.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        btk.fs();
        mw.fs();
        com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().fs();
    }
}
