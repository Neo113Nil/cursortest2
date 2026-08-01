package com.bytedance.sdk.openadsdk.core.NB;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.Wyp.pvs.Jd;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MSSdkImpl.java */
/* loaded from: classes2.dex */
class pvs {
    private volatile boolean icD;
    private PglSSManager pvs;
    private volatile boolean vG = true;
    private volatile boolean Jd = false;

    public pvs() {
        pvs();
    }

    public synchronized void pvs() {
        Context pvs;
        String Jd;
        if (!this.icD) {
            try {
                pvs = mnm.pvs();
                Jd = so.icD().Jd();
                if (TextUtils.isEmpty(Jd)) {
                    Jd = so.pvs("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                Mxy();
                this.icD = false;
            }
            if (TextUtils.isEmpty(Jd)) {
                return;
            }
            PglSSManager.init(pvs, PglSSConfig.builder().setAppId(Jd).setOVRegionType(0).setAdsdkVersionCode(BuildConfig.VERSION_CODE).build(), null, null, qh.pvs(pvs), com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
            so();
            this.icD = true;
            try {
                if (this.vG) {
                    Jd(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                zM.icD("mssdk", th.getMessage());
            }
        }
    }

    public boolean icD() {
        return this.icD;
    }

    private boolean yiw() {
        if (!this.icD && this.vG) {
            pvs();
        }
        return this.icD;
    }

    private void so() {
        if (this.pvs == null) {
            this.pvs = PglSSManager.getInstance();
        }
    }

    public void pvs(String str) {
        if (yiw()) {
            so();
            PglSSManager pglSSManager = this.pvs;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void vG() {
        if (yiw()) {
            so();
            if (this.pvs != null) {
                Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NB.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, mnm.Jd().Tdd());
                            pvs.this.pvs.setCustomInfo(hashMap);
                            Object[] objArr = new Object[2];
                        } catch (Throwable th) {
                            zM.icD("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void icD(final String str) {
        if (yiw()) {
            so();
            if (this.pvs != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ae.icD(new com.bytedance.sdk.component.so.so("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.NB.pvs.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (pvs.this.pvs != null) {
                                pvs.this.pvs.setDeviceId(str);
                            }
                        }
                    });
                } else {
                    this.pvs.setDeviceId(str);
                }
            }
        }
    }

    public void vG(String str) {
        if (yiw()) {
            so();
            PglSSManager pglSSManager = this.pvs;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str);
            }
        }
    }

    public String Jd() {
        if (!yiw()) {
            return "";
        }
        so();
        PglSSManager pglSSManager = this.pvs;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public String NB() {
        if (!yiw()) {
            return "";
        }
        so();
        PglSSManager pglSSManager = this.pvs;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void pvs(MotionEvent motionEvent) {
        if (icD()) {
            so();
            PglSSManager pglSSManager = this.pvs;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int sUS() {
        if (this.vG) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public Map<String, String> pvs(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!yiw() || (featureHash = this.pvs.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    private Class Mxy() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.vG = true;
        } catch (Throwable unused2) {
            this.vG = false;
            return cls;
        }
        return cls;
    }

    private void Jd(final String str) {
        if (this.Jd || TextUtils.isEmpty(str)) {
            return;
        }
        mnm.NB().pvs(new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.NB.pvs.3
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return Jd.icD().pvs("secsdk_init_error").icD(str);
            }
        }, false);
        this.Jd = true;
    }
}
