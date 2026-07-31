package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.zmn;

/* loaded from: classes4.dex */
public class rt {
    private boolean btk;
    private final zmn.fs fb;
    private final String fs;
    private cyb hhw;
    private zmn.InterfaceC0146zmn nps;
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
    private final Runnable zn;

    public static class zmn {
        private final zmn.fs fb;
        private final String fs;
        private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
        private final Runnable zn;
        private boolean btk = false;
        private cyb hhw = null;
        private zmn.InterfaceC0146zmn nps = null;

        public zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, String str, Runnable runnable, zmn.fs fsVar2) {
            this.zmn = fsVar;
            this.fs = str;
            this.zn = runnable;
            this.fb = fsVar2;
        }

        public zmn zmn(boolean z) {
            this.btk = z;
            return this;
        }

        public zmn zmn(cyb cybVar) {
            this.hhw = cybVar;
            return this;
        }

        public zmn zmn(zmn.InterfaceC0146zmn interfaceC0146zmn) {
            this.nps = interfaceC0146zmn;
            return this;
        }

        public rt zmn() {
            if (this.zmn == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.zn == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.fb == null) {
                throw new IllegalArgumentException("SkipResultHandler cannot be null");
            }
            return new rt(this);
        }
    }

    private rt(zmn zmnVar) {
        this.zmn = zmnVar.zmn;
        this.fs = zmnVar.fs;
        this.zn = zmnVar.zn;
        this.fb = zmnVar.fb;
        this.btk = zmnVar.btk;
        this.hhw = zmnVar.hhw;
        this.nps = zmnVar.nps;
    }

    public com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public Runnable zn() {
        return this.zn;
    }

    public zmn.fs fb() {
        return this.fb;
    }

    public boolean btk() {
        return this.btk;
    }

    public cyb hhw() {
        return this.hhw;
    }

    public zmn.InterfaceC0146zmn nps() {
        return this.nps;
    }
}
