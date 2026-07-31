package com.bytedance.sdk.component.btk.fs.zn;

import android.content.Context;
import com.bytedance.sdk.component.btk.iqz;
import com.bytedance.sdk.component.btk.kgc;
import com.bytedance.sdk.component.btk.klz;
import com.bytedance.sdk.component.btk.mw;
import com.bytedance.sdk.component.btk.olo;
import com.bytedance.sdk.component.btk.phc;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public class btk implements mw {
    private kgc btk;
    private phc bvs;
    private olo fb;
    private ExecutorService fs;
    private com.bytedance.sdk.component.btk.zn hhw;
    private boolean iv;
    private com.bytedance.sdk.component.btk.fs nps;
    private iqz zg;
    private klz zmn;
    private com.bytedance.sdk.component.btk.fb zn;

    private btk(zmn zmnVar) {
        this.zmn = zmnVar.zmn;
        this.fs = zmnVar.fs;
        this.zn = zmnVar.zn;
        this.fb = zmnVar.fb;
        this.btk = zmnVar.btk;
        this.hhw = zmnVar.hhw;
        this.nps = zmnVar.nps;
        this.zg = zmnVar.zg;
        this.bvs = zmnVar.bvs;
        this.iv = zmnVar.iv;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public ExecutorService zmn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public com.bytedance.sdk.component.btk.fb zn() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public com.bytedance.sdk.component.btk.zn fb() {
        return this.hhw;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public iqz fs() {
        return this.zg;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public com.bytedance.sdk.component.btk.fs btk() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public phc hhw() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.component.btk.mw
    public boolean nps() {
        return this.iv;
    }

    public static btk zmn(Context context) {
        return new zmn().zmn();
    }

    public static class zmn {
        private kgc btk;
        private phc bvs;
        private olo fb;
        private ExecutorService fs;
        private com.bytedance.sdk.component.btk.zn hhw;
        private boolean iv;
        private com.bytedance.sdk.component.btk.fs nps;
        private iqz zg;
        private klz zmn;
        private com.bytedance.sdk.component.btk.fb zn;

        public zmn zmn(com.bytedance.sdk.component.btk.fs fsVar) {
            this.nps = fsVar;
            return this;
        }

        public zmn zmn(boolean z) {
            this.iv = z;
            return this;
        }

        public zmn zmn(phc phcVar) {
            this.bvs = phcVar;
            return this;
        }

        public zmn zmn(iqz iqzVar) {
            this.zg = iqzVar;
            return this;
        }

        public zmn zmn(com.bytedance.sdk.component.btk.fb fbVar) {
            this.zn = fbVar;
            return this;
        }

        public btk zmn() {
            return new btk(this);
        }
    }
}
