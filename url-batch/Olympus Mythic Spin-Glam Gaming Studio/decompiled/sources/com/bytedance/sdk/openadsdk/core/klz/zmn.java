package com.bytedance.sdk.openadsdk.core.klz;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class zmn {
    private volatile boolean fs;
    private PglSSManager zmn;
    private volatile boolean zn = true;
    private volatile boolean fb = false;

    public zmn() {
        zmn();
    }

    public synchronized void zmn() {
        Context zmn;
        String fb;
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return;
        }
        if (!this.fs) {
            try {
                zmn = kgc.zmn();
                fb = iv.fs().fb();
                if (TextUtils.isEmpty(fb)) {
                    fb = iv.zmn("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                iv();
                this.fs = false;
            }
            if (TextUtils.isEmpty(fb)) {
                return;
            }
            String zmn2 = mw.zmn(zmn);
            String fs = com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs();
            PglSSConfig build = PglSSConfig.builder().setAppId(fb).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(fs2)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, fs2);
            }
            Set<String> ob = rc.fs().ob();
            if (ob != null && !ob.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, ob);
            }
            String kgc = oub.kgc();
            if (!TextUtils.isEmpty(kgc)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, kgc);
            }
            if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
                Set<String> hip = rc.fs().hip();
                if (hip != null && !hip.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, hip);
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, rc.fs().eug());
            String zmn3 = btk.zmn(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(zmn3)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, zmn3);
            }
            build.setCustomInfo(hashMap);
            build.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.klz.zmn.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    fb.zmn(str, false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.klz.zmn.1.1
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                        @Nullable
                        public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                            return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(str).fs(str2);
                        }
                    });
                }
            });
            PglSSManager.init(zmn, build, null, null, zmn2, fs);
            bvs();
            this.fs = true;
            try {
                if (this.zn) {
                    zn(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                iqz.zn("mssdk", th.getMessage());
            }
        }
    }

    public boolean fs() {
        return this.fs;
    }

    private boolean zg() {
        if (!this.fs && this.zn) {
            zmn();
        }
        return this.fs;
    }

    private void bvs() {
        if (this.zmn == null) {
            this.zmn = PglSSManager.getInstance();
        }
    }

    public void zmn(String str) {
        if (zg()) {
            bvs();
            PglSSManager pglSSManager = this.zmn;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void zmn(final Map<String, Object> map) {
        if (zg()) {
            bvs();
            if (this.zmn != null) {
                cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.klz.zmn.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            zmn.this.zmn.setCustomInfo(map);
                        } catch (Throwable th) {
                            iqz.zn("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void zn() {
        if (zg()) {
            bvs();
            if (this.zmn != null) {
                cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.klz.zmn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, kgc.fb().phc());
                            zmn.this.zmn.setCustomInfo(hashMap);
                        } catch (Throwable th) {
                            iqz.zn("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void fs(String str) {
        if (zg()) {
            bvs();
            PglSSManager pglSSManager = this.zmn;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public void zmn(String str, Map<String, Object> map) {
        if (zg()) {
            bvs();
            PglSSManager pglSSManager = this.zmn;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public String fb() {
        String fs = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("sec_token", "");
        if (zg()) {
            bvs();
            PglSSManager pglSSManager = this.zmn;
            if (pglSSManager != null) {
                String token = pglSSManager.getToken();
                if (!TextUtils.isEmpty(token) && !TextUtils.equals(fs, token)) {
                    com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("sec_token", token);
                }
                return token;
            }
        }
        return fs;
    }

    public String btk() {
        if (!zg()) {
            return "";
        }
        bvs();
        PglSSManager pglSSManager = this.zmn;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public long hhw() {
        if (!zg()) {
            return 0L;
        }
        bvs();
        PglSSManager pglSSManager = this.zmn;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public void zmn(MotionEvent motionEvent) {
        if (fs()) {
            bvs();
            PglSSManager pglSSManager = this.zmn;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int nps() {
        if (this.zn) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public Map<String, String> zmn(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!zg() || (featureHash = this.zmn.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    private Class iv() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.zn = true;
        } catch (Throwable unused2) {
            this.zn = false;
            return cls;
        }
        return cls;
    }

    private void zn(final String str) {
        if (this.fb || TextUtils.isEmpty(str)) {
            return;
        }
        kgc.btk().zmn(new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.klz.zmn.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("secsdk_init_error").fs(str);
            }
        }, false);
        this.fb = true;
    }
}
