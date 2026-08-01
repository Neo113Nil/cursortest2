package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.yiw.Jd.vG;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.dyT;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.zM;

/* loaded from: classes2.dex */
public final class PAGConfig implements InitConfig {
    private static String qh;
    private String Mxy;
    private String Wyp;
    private boolean icD;
    private String pvs;
    private boolean so;
    private int vG;
    private int Jd = -1;
    private int NB = -1;
    private int sUS = -1;
    private int yiw = 0;

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.Wyp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str) {
        this.Wyp = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.pvs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(String str) {
        this.pvs = str;
    }

    public boolean getDebugLog() {
        return this.icD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z) {
        this.icD = z;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.vG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i) {
        this.vG = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.Jd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.Jd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.NB = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.NB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.sUS = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.yiw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB(int i) {
        this.yiw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.so;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z) {
        this.so = z;
        vG.pvs(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(String str) {
        this.Mxy = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.Mxy)) {
            return qh;
        }
        return this.Mxy;
    }

    public static void setChildDirected(int i) {
        if (jlb.Mxy("setCoppa")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            dyT.pvs().icD(i);
        }
    }

    public static int getChildDirected() {
        if (jlb.Mxy("getCoppa")) {
            return dyT.pvs().icD();
        }
        return -1;
    }

    public static void setGDPRConsent(int i) {
        jlb.Mxy("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        dyT.pvs().vG(i);
    }

    public static int getGDPRConsent() {
        if (!jlb.Mxy("getGdpr")) {
            return -1;
        }
        int vG = dyT.pvs().vG();
        if (vG == 1) {
            return 0;
        }
        if (vG == 0) {
            return 1;
        }
        return vG;
    }

    public static void setDoNotSell(int i) {
        if (jlb.Mxy("setCCPA")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            dyT.pvs().Jd(i);
        }
    }

    public static int getDoNotSell() {
        if (jlb.Mxy("getCCPA")) {
            return dyT.pvs().sUS();
        }
        return -1;
    }

    public static void debugLog(boolean z) {
        if (dyT.pvs() != null) {
            if (z) {
                dyT.pvs().NB(1);
                dyT.pvs().pvs();
                return;
            }
            dyT.pvs().NB(0);
            com.bytedance.sdk.component.yiw.Jd.vG.pvs(vG.pvs.OFF);
            Ju.vG();
            com.bykv.vk.openvk.component.video.api.sUS.vG.icD();
            zM.icD();
        }
    }

    public static void setAppIconId(int i) {
        if (dyT.pvs() != null) {
            dyT.pvs().sUS(i);
        }
    }

    public static void setUserData(String str) {
        if (dyT.pvs() != null) {
            dyT.pvs().icD(str);
        }
    }

    public static void setPackageName(String str) {
        qh = str;
    }

    public static class Builder {
        private String[] Mxy;
        private String Wyp;
        private boolean icD;
        private String pvs;
        private String qh;
        private int vG;
        private int Jd = -1;
        private int NB = -1;
        private int sUS = -1;
        private int yiw = 0;
        private boolean so = false;

        public Builder useTextureView(boolean z) {
            return this;
        }

        public Builder setUserData(String str) {
            this.qh = str;
            return this;
        }

        public Builder appId(String str) {
            this.pvs = str;
            return this;
        }

        public Builder debugLog(boolean z) {
            this.icD = z;
            return this;
        }

        public Builder appIcon(int i) {
            this.vG = i;
            return this;
        }

        public Builder setChildDirected(int i) {
            this.Jd = i;
            return this;
        }

        public Builder setGDPRConsent(int i) {
            this.NB = i;
            return this;
        }

        public Builder setDoNotSell(int i) {
            this.sUS = i;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.yiw = i;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.so = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.Mxy = strArr;
            return this;
        }

        public Builder setPackageName(String str) {
            this.Wyp = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.icD(this.pvs);
            pAGConfig.icD(this.Jd);
            pAGConfig.pvs(this.vG);
            pAGConfig.NB(this.yiw);
            pAGConfig.icD(this.so);
            pAGConfig.vG(this.NB);
            pAGConfig.Jd(this.sUS);
            pAGConfig.pvs(this.icD);
            pAGConfig.vG(this.Wyp);
            pAGConfig.pvs(this.qh);
            return pAGConfig;
        }
    }
}
