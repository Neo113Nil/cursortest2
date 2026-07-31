package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.zmn.nps.zn;
import com.bytedance.sdk.component.nps.zn.fb;
import com.bytedance.sdk.component.utils.cn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.ev;
import com.bytedance.sdk.openadsdk.utils.oub;

/* loaded from: classes5.dex */
public final class PAGConfig implements InitConfig {
    private static String nps;
    private String btk;
    private boolean fs;
    private String hhw;
    private String zg;
    private String zmn;
    private int zn = -1;
    private int fb = 0;

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.hhw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str) {
        this.hhw = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.zmn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(String str) {
        this.zmn = str;
    }

    public boolean getDebugLog() {
        return this.fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z) {
        this.fs = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i) {
        this.zn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.fb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(int i) {
        this.fb = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String str) {
        this.btk = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.btk)) {
            return nps;
        }
        return this.btk;
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (oub.rc("setPAConsent")) {
            if (i == 1 || i == 0) {
                ev.zmn().fb(i);
            } else {
                ev.zmn().fb(-2);
            }
        }
    }

    public static int getPAConsent() {
        if (oub.rc("getPAConsent")) {
            return ev.zmn().btk();
        }
        return -1;
    }

    public static void debugLog(boolean z) {
        if (ev.zmn() != null) {
            if (z) {
                ev.zmn().fs(1);
                ev.zmn().fs();
                return;
            }
            ev.zmn().fs(0);
            fb.zmn(fb.zmn.OFF);
            cn.fs();
            zn.fs();
            iqz.fs();
        }
    }

    public static void setAppIconId(int i) {
        if (ev.zmn() != null) {
            ev.zmn().zn(i);
        }
    }

    public static void setUserData(String str) {
        if (ev.zmn() != null) {
            ev.zmn().fs(str);
        }
    }

    public static void setPackageName(String str) {
        nps = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.zg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb(String str) {
        this.zg = str;
    }

    public static class Builder {
        private String[] btk;
        private boolean fs;
        private String hhw;
        private String nps;
        private String zmn;
        private int zn = -1;
        private int fb = 0;
        private String zg = "";

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }

        public Builder setUserData(String str) {
            this.nps = str;
            return this;
        }

        public Builder appId(String str) {
            this.zmn = str;
            return this;
        }

        public Builder debugLog(boolean z) {
            this.fs = z;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i) {
            if (i == 0 || i == 1) {
                this.zn = i;
            } else {
                this.zn = -2;
            }
            return this;
        }

        public Builder setAdxId(String str) {
            this.zg = str;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.fb = i;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.btk = strArr;
            return this;
        }

        public Builder setPackageName(String str) {
            this.hhw = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.fs(this.zmn);
            pAGConfig.fs(this.fb);
            pAGConfig.zmn(this.zn);
            pAGConfig.zmn(this.fs);
            pAGConfig.zn(this.hhw);
            pAGConfig.zmn(this.nps);
            pAGConfig.fb(this.zg);
            return pAGConfig;
        }
    }
}
